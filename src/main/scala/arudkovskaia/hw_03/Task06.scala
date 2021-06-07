package arudkovskaia.hw_03

import scala.collection.mutable.ArrayBuffer

/**
 * 6. How do you rearrange the elements of an Array[Int] so that they appear in reverse sorted
 * order? How do you do the same with an ArrayBuffer[Int]?
 */
object Task06 {
  def main(args: Array[String]): Unit = {
    val arr = Array(1.0, 2.0, 66.6)
    val sortedArr = arr.sorted.reverse
    val sortedArrToo = arr.sortWith(_ > _)

    val arrBuffer = ArrayBuffer(1.0, 2.0, 66.6)
    val sortedArrBuffer = arrBuffer.sortWith(_ > _)
    val sortedArrBufferToo = arrBuffer.sorted.reverse
  }
}
