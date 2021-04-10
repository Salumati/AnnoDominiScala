package module

case class Card(text: String, year: Int) {
  def showYear:String = year.toString
  def reveal:String = "year: " + showYear + " " +  this.toString

  override def toString: String = "[" + text + "]\n"
}