package module


import org.scalatest.wordspec.AnyWordSpec

class CardSpec extends AnyWordSpec {
  val card:Card = Card("A Card Text", 10)
  "A Card" should  {
    "have a year" which{
      "is an Integeger" in {
        assert(card.year.isInstanceOf[Int])
        assert(card.year == 10)
      }
      "has a String representation" in {
        assert(card.year.toString == "10")
      }
    }
    "Have a text" in{
      assert(card.text.isInstanceOf[String])
      assert(card.text == "A Card Text")
    }
    "Have a Stringreperesentation" in {
      assert(card.toString == "text: A Card Text\n")
    }
    "Have a reveal function" in {
      assert(card.reveal == "year: 10\nCardText: A Card Text")
    }
  }
}
