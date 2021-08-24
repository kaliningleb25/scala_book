package gkalinin.hw_06




/**
 * Write an enumeration describing the four playing card suits so that the toString method returns ♣, ♦, ♥, or ♠.
 */
object Task06 {
  def main(args: Array[String]): Unit = {
    val cardsOperation = new CardsOperation
    println(cardsOperation.getSuitSymbol(CardSuit.Clubs))
    println(cardsOperation.getSuitSymbol(CardSuit.Diamonds))
    println(cardsOperation.getSuitSymbol(CardSuit.Hearts))
    println(cardsOperation.getSuitSymbol(CardSuit.Spades))
  }
}

object CardSuit extends Enumeration {
  type CardSuit = Value
  val Clubs, Diamonds, Hearts, Spades = Value
}

import gkalinin.hw_06.CardSuit._

class CardsOperation {
  def getSuitSymbol(cardSuit: CardSuit): String = {
    cardSuit match {
      case Clubs => "\u2663"
      case Diamonds => "\u2666"
      case Hearts => "\u2665"
      case Spades => "\u2660"
    }
  }
}
