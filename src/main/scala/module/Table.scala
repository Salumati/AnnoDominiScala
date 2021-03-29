package module

case class Table(players:List[Player], table:List[Card], deck:Deck){
  def showTable: String = "The bord:\n" + table.toString() + "\n"
  def showAllPlayers: String = players.toString() // might not be needed, the other players cards should not be visible
  def showCurrentPlayer: String = currentPlayer.toString
  def showStatus: String =
    showTable + players.map(p => p.name + ": (" + p.checkNumOfCards + ")\n").toString()

  def currentPlayer: Player = players.head

  /*def placeCard(card: Card, position: Int): List[Card] = {
    table.splitAt(position)._1 :: List(card) :: table.splitAt(position)._2
  }*/
}