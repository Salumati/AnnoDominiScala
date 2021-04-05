package module

case class TableGenerator(nrOfPlayers:Int=1, nrOfCards:Int=30){
  val deckGen = new Deckgenerator

  def createTable: Table = {
    val deck = deckGen.createRandomDeck(nrOfCards).shuffle
    val players = genPlayers(nrOfPlayers, deck)
    Table(
      players,
      List(deck.drawCard(nrOfPlayers*5)._2.head), Deck(deck.drawCard(nrOfPlayers*5)._2.tail)
    )}

  def genPlayers(playerNo:Int, deck:Deck, n:Int = nrOfPlayers):List[Player] = {
    if(n == 1) List(Player("Player " + n, deck.drawCard(4)._1))
    else List(Player("Player " + n, deck.drawCard(4)._1)) ::: genPlayers(playerNo-1, Deck(deck.drawCard(4)._2), n-1)
  }
}