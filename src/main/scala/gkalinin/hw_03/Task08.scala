package gkalinin.hw_03

import scala.collection.mutable.ArrayBuffer

/**
 * Suppose you are given an array buffer of integers and want to remove all but the first negative number.
 * Here is a sequential solution that sets a flag when the first negative number is called,
 * then removes all elements beyond.
 *
 * This is a complex and inefficient solution.
 * Rewrite it in Scala by collecting positions of the negative elements,
 * dropping the first element, reversing the sequence, and calling a.remove(i) for each index.
 */
object Task08 {
  def main(args: Array[String]): Unit = {
    println(removeAllButFirstNegativeNumber(ArrayBuffer(1, -5, 10, -2, -7)))
    println(removeAllButFirstNegativeNumber(ArrayBuffer(1, -5, -10, 2, 7)))
  }

  def removeAllButFirstNegativeNumber(arr: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    val indicesWithNegativeValues = for (i <- arr.indices if arr(i) < 0) yield i

    indicesWithNegativeValues
      .drop(1)
      .reverse
      .foreach(x => arr.remove(x))

    arr
  }
}
