import module.{Card, Deck}


Deck.createRandomDeck()

val c = Card("Card No. " + 1, 1)

val deck = Deck.createRandomDeck()


deck.toString()

deck.drawCard
deck.drawCard(3)
deck.shuffle

case class Player(name:String = "Player", hand:Deck)

//val player = Player("Player 1", deck.head)

//case class Table(players:List[Player], deck:Deck, table:List[Card]);
