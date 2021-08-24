package gkalinin.hw_06

import gkalinin.hw_06.CardSuit.CardSuit
import gkalinin.hw_06.CardSuit.Clubs
import gkalinin.hw_06.CardSuit.Diamonds
import gkalinin.hw_06.CardSuit.Hearts
import gkalinin.hw_06.CardSuit.Spades

/**
 * Implement a function that checks whether a card suit value from the preceding exercise is red.
 */
object Task07 {
  def main(args: Array[String]): Unit = {
    val cardsOperationWithColorCheck = new CardsOperationWithColorCheck
    println(cardsOperationWithColorCheck.checkIfColorIsRed(CardSuit.Clubs))
    println(cardsOperationWithColorCheck.checkIfColorIsRed(CardSuit.Diamonds))
    println(cardsOperationWithColorCheck.checkIfColorIsRed(CardSuit.Hearts))
    println(cardsOperationWithColorCheck.checkIfColorIsRed(CardSuit.Spades))
  }
}

class CardsOperationWithColorCheck {
  def getSuitSymbol(cardSuit: CardSuit): String = {
    cardSuit match {
      case Clubs => "\u2663"
      case Diamonds => "\u2666"
      case Hearts => "\u2665"
      case Spades => "\u2660"
    }
  }

  def checkIfColorIsRed(cardSuit: CardSuit): Boolean = {
    cardSuit match {
      case Diamonds => true
      case Hearts => true
      case Clubs => false
      case Spades => false
    }
  }
}
