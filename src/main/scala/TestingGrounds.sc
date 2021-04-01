import module.{Deck, Deckgenerator, Player, Table}

val deckGen = new Deckgenerator

val deck = deckGen.createRandomDeck()

val p1 = Player("Player 1", deck.drawCard(3)._1)
val p2 = Player("Susi", deck.drawCard(3)._1)

p1.showHand
p2.showHand

val table = Table(List(p1,p2), List(deck.drawCard(3)._2.head), Deck(deck.drawCard(3)._2.tail))
val t = Table

table.showTable
p1.showHand
table.playerPlacesCard(2, 0)
table.playerDoubtsCards
table.getNextPlayer()


case class TableGenerator(nrOfPlayers:Int=1, nrOfCards:Int=10){

  val deckGen = new Deckgenerator

  def createTable = {
    val deck = deckGen.createRandomDeck(nrOfCards).shuffle
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


val table2 = tb.createTable

//val player = Player("Player 1", deck.head)

//case class Table(players:List[Player], deck:Deck, table:List[Card]);
