package gkalinin.hw_03

import scala.collection.mutable.ArrayBuffer

/**
 * Improve the solution of the preceding exercise by collecting the positions that should be moved
 * and their target positions. Make those moves and truncate the buffer.
 * Don’t copy any elements before the first unwanted element.
 *
 */
object Task09 {
  def main(args: Array[String]): Unit = {
    println(removeAllButFirstNegativeNumber(ArrayBuffer(-100, 2, 30, -50, 7)))
  }

  def removeAllButFirstNegativeNumber(arr: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    ???
  }
}
