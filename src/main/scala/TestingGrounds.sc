

case class Cards(text:String, year:Int){
  def reveal = year.toString
  def showText = text
  def showYear = year
}

case class Deck(cards:List[Cards]){
  def getCard: (Cards, List[Cards]) = (cards.head, cards.tail)
}

val c = Cards("Card No. " + 1, 1)

def createRandomDeck(noOfCards:Int = 10): List[Cards] ={
  var list:List[Cards] = Nil
  for (i <- 1 to 10) {
    list = Cards("Card No. " + i, i) :: list
  }
  list
}

val deck = createRandomDeck()

deck.toString()

case class Player(name:String = "Player", hand:Deck)

//val player = Player("Player 1", deck.head)

case class Table(players:List[Player], deck:Deck, table:List[Cards])