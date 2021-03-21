package module
import scala.util.Random

case class Deck(cards:List[Card]=Nil) {
  def drawCard: (Card, List[Card]) = (cards.head, cards.tail)
  def drawCard(n: Int) : (List[Card], List[Card]) = cards.splitAt(n)
  def shuffle: Deck = Deck(Random.shuffle(cards))

  def head: Card = drawCard._1
  def tail: List[Card] = drawCard._2

  // these are for easing the creation of table class objects:
  def playCard: Card = this.head
  def playDeck: Deck = Deck(this.tail) // allows to create table object directly, w


  override def toString: String = cards.map(c => c.toString + "\n").toString()
}
