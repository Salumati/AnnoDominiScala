package module

import module.Deck.createRandomDeck

import scala.util.Random

case class Deck(cards:List[Card]=Nil) {
  def generateDeck: Deck = createRandomDeck()
  def drawCard: (Card, List[Card]) = (cards.head, cards.tail)
  def drawCard(n: Int) : (List[Card], List[Card]) = cards.splitAt(n-1)
  def shuffle: Deck = Deck(Random.shuffle(cards))

  override def toString: String = cards.map(c => c.toString + "\n").toString()
}

object Deck {
  def createRandomDeck(noOfCards:Int = 10): Deck ={
    var list:List[Card] = Nil
    for (i <- 1 to noOfCards) {
      list = Card("Card No. " + i, i) :: list
    }
    Deck(list)
  }
}

object Deckgenerator {
  def createRandomDeck(noOfCards:Int = 10): Deck ={
    var list:List[Card] = Nil
    for (i <- 1 to noOfCards) {
      list = Card("Card No. " + i, i) :: list
    }
    Deck(list)
  }
}