package controller
import module.{Table, TableGenerator}
import util.Observable

class Controller(var table:Table) extends Observable{
  def createTestTable(noOfPlayers:Int): Unit = {
    val tb = TableGenerator(noOfPlayers, 40)
    table = tb.createTable
    notifyObservers()
  }

  def tableToString: String = table.showTable + table.showCurrentPlayer

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
