import module.{Deck, Deckgenerator, Player, Table}

val deckGen = new Deckgenerator

val deck = deckGen.createRandomDeck()

case class TableGenerator(nrOfPlayers:Int=1, nrOfCards:Int=10){

  val deckGen = new Deckgenerator

  def createTable = {
    val deck = deckGen.createRandomDeck(nrOfCards).shuffle
    val players = genPlayers(nrOfPlayers, deck)
    Table(
      players,
      List(deck.drawCard(nrOfPlayers*5)._2.head), Deck(deck.drawCard(nrOfPlayers*5)._2.tail)
    )}

  def genPlayers(playerNo:Int, deck:Deck, n:Int = nrOfPlayers):List[Player] = {
    if(n == 0) List(Player("Player " + n, deck.drawCard(4)._1))
    else List(Player("Player " + n, deck.drawCard(4)._1)) ::: genPlayers(playerNo-1, Deck(deck.drawCard(4)._2), n-1)
  }
}

val tb = TableGenerator(2, 20)
tb.createTable


//val player = Player("Player 1", deck.head)

//case class Table(players:List[Player], deck:Deck, table:List[Card]);
