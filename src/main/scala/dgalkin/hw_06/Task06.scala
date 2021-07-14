object Task06 {
  def main(args: Array[String]): Unit = {
    val example = CardSuit
    println(example.Hearts)
    println(example.Diamonds)
    println(example.Clubs)
    println(example.Spades)
  }
}

object CardSuit extends Enumeration {
  type CardSuit = Value
  val Hearts = Value("♥")
  val Diamonds = Value("♦")
  val Clubs = Value("♣")
  val Spades = Value("♠")
}

