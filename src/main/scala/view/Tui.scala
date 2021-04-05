package view

import controller.Controller
import util.Observer

class Tui(controller: Controller) extends Observer{

  controller.add(this)


  def processInputLine(input: String): Unit ={
    input match {
      case "q" => println("End game.")
      case "d" => controller.doubt()
      case "p" => controller.placeCard(0, 0)

    }
  }

  override def update(): Unit = println(controller.tableToString)



}
