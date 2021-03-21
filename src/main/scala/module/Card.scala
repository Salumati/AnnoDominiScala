package module

case class Card(text: String, year: Int) {
  def reveal:String = "year: " + year.toString + "\nCardText: " + text

  override def toString: String =
    " text: " + text + " year: "  + year.toString
}