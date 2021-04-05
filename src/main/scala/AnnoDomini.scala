import java.util.Scanner
import module._
object AnnoDomini {

  val scanner = new Scanner(System.in)

  def main(args:Array[String]):Unit = {

    println("Willkommen bei AnnoDomini!")
    // create scanner for player input
    var input: String = ""

    // ask for prefered deck (start with default random deck)
    println("")

    // generate deck

    // ask for amount of players
    println("how many players?")
    val tg = TableGenerator(3, 40)
    // if only one player: switch into Singleplayer mode
    // not implemented yet

    // generate players
    var table = tg.createTable

    do{

      // show table + current player
      print(table.showTable + table.showCurrentPlayer)


      // ask current player to place card
      println("what will you do?" +
        "\n p = place card " +
        "\n d = doubt" +
        "\n q = quit game")

      input = scanner.next()
      println("input is: " + input)

      // place card
      if(input == "p") {
        println("place Card:" +
          "\n which card?" )
        input = scanner.next()

        println("You chose the Card: " +
          table.takePlayerCard(input.toInt)._1 +
          "\n where to place Card?" )
        table = table.playerPlacesCard(input.toInt, scanner.nextInt())

        println("Card has been placed:")
        println(table.showTable)
      }
      if(input == "d") {
        println("doubt:")
        table = table.playerDoubtsCards
      }
      // check if player has won (no more cards in players hand)
      if(table.playerWon) {
        println("player " + table.previousPlayer.name + " has won!")
        return
      }
    }while(input != "q")
    println("End game")
  }



}
