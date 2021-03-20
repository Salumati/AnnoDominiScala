import java.util.Scanner

object AnnoDomini {

  val scanner = new Scanner(System.in)

  def main(args:Array[String]):Unit = {

    println("Willkommen bei AnnoDomini!")

    var input:String = ""
    do{
      println("test input, please enter a key, 'q' is Quit:")
      input = scanner.next()
      println("input is: " + input)

    }while(input != "q")

  }



}
