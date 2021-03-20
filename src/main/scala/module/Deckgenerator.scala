package module

class Deckgenerator {
  def createRandomDeck(noOfCards:Int = 10): Deck ={
    var list:List[Card] = Nil
    for (i <- 1 to noOfCards) {
      list = Card("Card No. " + i, i) :: list
    }
    Deck(list)
  }
}