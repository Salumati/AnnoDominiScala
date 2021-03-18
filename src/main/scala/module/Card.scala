package module

case class Card(text: String, year: Int) {
  def reveal:String = year.toString
  def showText:String = text
  def showYear:Int = year
}
