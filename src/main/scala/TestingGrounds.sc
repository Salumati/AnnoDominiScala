import module.Deckgenerator

val deckGen = new Deckgenerator

val deck = deckGen.createRandomDeck()

def sum(x:Int, y:Int):Int = x + y

def curriedSum: Int => Int => Int = (sum _).curried

sum(3, 4)

curriedSum(3) (sum(1, 5))


//val player = Player("Player 1", deck.head)

//case class Table(players:List[Player], deck:Deck, table:List[Card]);
