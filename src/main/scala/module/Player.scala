package module

case class Player(name:String = "Player", hand:List[Card]){
  def showHand: String = this.toString()
  def checkNumOfCards: Int = hand.length
  def getCard(n:Int):(Card, Player) = (hand(n), this.copy(hand=hand.diff(List(hand(n)))))

  def hasWon: Boolean = hand.isEmpty

  override def toString: String = name + ":\n" + hand.toString()
}