package module
import scala.util.Random

case class Deck(cards:List[Card]=Nil) {
  def drawCard: (Card, List[Card]) = (cards.head, cards.tail)
  def drawCard(n: Int) : (List[Card], List[Card]) = cards.splitAt(n)
  def shuffle: Deck = Deck(Random.shuffle(cards))

  def deckHead: Card = drawCard._1
  def deckTail: List[Card] = drawCard._2

  // these are for easing the creation of table class objects:
  def playDeck: Deck = Deck(this.deckTail) // allows to create table object directly, w

  def length: Int = cards.length

  override def toString: String = cards.map(c => "\n" + c.toString).toString().replaceAll("List", "Deck").replaceAll(",", "")
}
