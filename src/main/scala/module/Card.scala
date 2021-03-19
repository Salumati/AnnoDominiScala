package module

case class Card(text: String, year: Int) {
  def reveal:String = "year: " + year.toString + "\nCardText: " + text

  override def toString: String =
    "year: "  + year.toString + " text: " + text
}