package module
import scala.util.Random

case class Deck(cards:List[Card]=Nil) {
  def drawCard: (Card, List[Card]) = (cards.head, cards.tail)
  def drawCard(n: Int) : (List[Card], List[Card]) = cards.splitAt(n)
  def shuffle: Deck = Deck(Random.shuffle(cards))

  override def toString: String = cards.map(c => c.toString + "\n").toString()
}
