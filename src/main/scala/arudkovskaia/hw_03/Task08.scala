package arudkovskaia.hw_03

import scala.collection.mutable.ArrayBuffer

/**
 * 8. Suppose you are given an array buffer of integers and want to remove all but the first negative
 * number
 */
object Task08 {
  def main(args: Array[String]): Unit = {
    val buffer = ArrayBuffer(1, 2, 3, -4, -9, 5)
    val negativeIndices = buffer.indices.filter(buffer(_) < 0)
    negativeIndices.drop(1).reverse.foreach(index => buffer.remove(index))
    print(buffer)
  }
}
