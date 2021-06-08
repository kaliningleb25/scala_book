package gkalinin.hw_03

/**
 * Given an array of integers, produce a new array that contains all positive values of the original array,
 * in their original order, followed by all values that are zero or negative, in their original order.
 */
object Task04 {
  def main(args: Array[String]): Unit = {
    println(sortByPositiveAndNegative(Array(-5, 6, 20, 77, 0)).mkString("Array(", ", ", ")"))
    println(sortByPositiveAndNegative(Array(-100, 0, 20)).mkString("Array(", ", ", ")"))
  }

  def sortByPositiveAndNegative(arr: Array[Int]): Array[Int] = {
    val arrPositive = for (elem <- arr if elem > 0) yield elem
    val arrZeroOrNegative = for (elem <- arr if elem <= 0) yield elem
    arrPositive ++ arrZeroOrNegative
  }
}
