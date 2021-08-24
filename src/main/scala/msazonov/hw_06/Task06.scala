package msazonov.hw_06

/***
 * 6. Write an enumeration describing the four playing card suits so that the toString method returns ♣, ♦, ♥, or ♠.
 */
object Task06 {
    def main(args: Array[String]): Unit = {
        val test = CartSuit
        print(test.Club)
    }
}

object CartSuit extends Enumeration {
    type CardSuite = Value
    val Club = Value("♣")
    val Diamond = Value("♦")
    val Heart = Value("♥")
    val Spade = Value("♠")
}