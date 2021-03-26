package module

import org.scalatest.wordspec.AnyWordSpec

class PlayerSpec extends AnyWordSpec{
  val deckGen:Deckgenerator = new Deckgenerator
  val deck:Deck = deckGen.createRandomDeck()
  val hand:List[Card] = deck.drawCard(5)._1
  val player:Player = Player("Player", hand)
  "A Player" should {
    "have a name" in {
      assert(player.name.isInstanceOf[String])
      assert(player.name == "Player")
    }
    "have a List of Cards named hand" in{
      assert(player.hand.isInstanceOf[List[Card]])
      assert(player.hand == hand)
    }
  }
}
