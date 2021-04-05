package controller
import module.{Deck, Table, TableGenerator}
import util.Observable

class Controller(var table:Table) extends Observable{
  def createTestTable(noOfPlayers:Int, deck:Deck): Unit = {
    val tb = TableGenerator(noOfPlayers, 40)
    table = tb.createTable
  }

  def tableToString: String = table.toString

  def placeCard(card:Int, place:Int): Unit ={
    table = table.playerPlacesCard(card, place)
    notifyObservers()
  }

  def doubt():Unit = {
    table = table.playerDoubtsCards
    notifyObservers()
  }

  def confirmWinner: Boolean = {
    notifyObservers()
    table.playerWon
  }

}
