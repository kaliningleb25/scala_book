package gkalinin.hw_03

import scala.collection.mutable.ArrayBuffer

/**
 * How do you rearrange the elements of an Array[Int] so that they appear in reverse sorted
 * order? How do you do the same with an ArrayBuffer[Int]?
 */
object Task06 {
  def main(args: Array[String]): Unit = {
    println(rearrangeArray(Array(1, 2, 3)).mkString("Array(", ", ", ")"))
    println(rearrangeArrayBuffer(ArrayBuffer(10, 9, 8)))
  }

  def rearrangeArray(arr: Array[Int]): IndexedSeq[Int] = {
    for (i <- arr.length - 1 to 0 by -1) yield arr(i)
  }

  def rearrangeArrayBuffer(arr: ArrayBuffer[Int]): IndexedSeq[Int] = {
    for (i <- arr.length - 1 to 0 by -1) yield arr(i)
  }
}
