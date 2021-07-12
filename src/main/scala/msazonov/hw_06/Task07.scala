package msazonov.hw_06

import msazonov.hw_06.CartSuit._
/***
 * 7. Implement a function that checks whether a card suit value from the preceding exercise is red.
 */
object Task07 {
    def main(args: Array[String]): Unit = {
        print(isRed(Diamond))
    }
    def isRed(card: CardSuite) = card == Diamond || card == Heart
}
