import module.{Card, Deck, Deckgenerator, Player}

val deckGen = new Deckgenerator

val deck = deckGen.createRandomDeck()

val p1 = Player("Player 1", deck.drawCard(3)._1)

p1.showHand

case class Table(players:List[Player], table:List[Card], deck:Deck){
  def showTable: String = "The bord:\n" + table.toString() + "\n"
  def showAllPlayers = players.toString() // might not be needed, the other players cards should not be visible
  def showCurrentPlayer = currentPlayer.toString
  def showStatus: String =
    showTable + players.map(p => p.name + ": (" + p.checkNumOfCards + ")\n").toString()

  def currentPlayer: Player = players.head

  /*def placeCard(card: Card, position: Int): List[Card] = {
    table.splitAt(position)._1 :: List(card) :: table.splitAt(position)._2
  }*/
}

val table = Table(List(p1), List(deck.drawCard._1), Deck(deck.drawCard._2))

table.showTable
table.showCurrentPlayer
table.showStatus

table.table.splitAt(1)

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
