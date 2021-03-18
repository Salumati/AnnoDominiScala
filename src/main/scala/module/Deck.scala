package module

case class Deck(cards: List[Card]) {
  def getCard: (Card, List[Card]) = (cards.head, cards.tail)
}
