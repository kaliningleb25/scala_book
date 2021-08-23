package arudkovskaia.hw_03

import scala.collection.mutable.ArrayBuffer

/**
 * 9. Improve the solution of the preceding exercise by collecting the positions that should be moved
 * and their target positions. Make those moves and truncate the buffer. Don’t copy any elements
 * before the first unwanted element.
 */
object Task09 {
  def main(args: Array[String]): Unit = {
    // didn't quite understand the task so made just 1 transposition
    val buffer = ArrayBuffer(1, 2, 3, -4, -9, 5)
    val firstNegativeIndex = buffer.indexWhere(_ < 0)
    val temp = buffer(0)
    buffer.update(0, buffer(firstNegativeIndex))
    buffer.update(firstNegativeIndex, temp)
    val result = buffer.take(1)
    result
  }
}
