import module.{Card, Deck}


val c = Card("Card No. " + 1, 1)

def createRandomDeck(noOfCards:Int = 10): Deck ={
  var list:List[Card] = Nil
  for (i <- 1 to noOfCards) {
    list = Card("Card No. " + i, i) :: list
  }
  Deck(list)
}

val deck = createRandomDeck()

deck.drawCard
deck.drawCard(3)


case class Player(name:String = "Player", hand:List[Card])

case class Table(players:List[Player], table:List[Card], deck:Deck){

}



case class TableGenerator(nrOfPlayers:Int=1, nrOfCards:Int=10){
  def createTable = {
    val deck = createRandomDeck(nrOfCards).shuffle
    val players = genPlayers(deck)

    Table(
      players,
      List(deck.drawCard(nrOfPlayers*5)._2.head), Deck(deck.drawCard(nrOfPlayers*5)._2.tail)
    )}

  def genPlayers(deck:Deck):List[Player] = {
    var players = Nil
    for (i <- 1 to nrOfPlayers) Player("Player " + i, deck.drawCard(5)._1) :: players
    players
  }
}

val tb = TableGenerator(2)

tb.genPlayers(deck)


val table = tb.createTable

table



//val player = Player("Player 1", deck.head)

//case class Table(players:List[Player], deck:Deck, table:List[Card]);
