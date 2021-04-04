import java.util.Scanner

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

    // if only one player: switch into Singleplayer mode if

    // generate players

    do{

      // show table + current player

      // ask current player to place card

      // place card

      // check if player has won (no more cards in players hand)

      // if player has won: end game

      // if player hasn't won: next player

      println("test input, please enter a key, 'q' is Quit:")
      input = scanner.next()
      println("input is: " + input)

    }while(input != "q")

  }



}
