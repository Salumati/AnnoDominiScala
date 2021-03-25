package module

case class Card(text: String, year: Int) {
  def showYear:String = year.toString
  def reveal:String = "year: " + showYear + "\nCardText: " + text

  override def toString: String = "text: " + text
}