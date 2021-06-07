package arudkovskaia.hw_03

import scala.collection.mutable.ArrayBuffer

/**
 * 8. Suppose you are given an array buffer of integers and want to remove all but the first negative
 * number
 */
object Task08 {
  def main(args: Array[String]): Unit = {
    val buffer = ArrayBuffer(1, 2, 3, -4, -9, 5)
    val firstNegativeIndex = buffer.indexWhere(_ < 0)
    buffer.indices.reverse.map(index => if (index != firstNegativeIndex) buffer.remove(index))
    buffer
  }
}
