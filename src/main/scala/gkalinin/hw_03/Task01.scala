package gkalinin.hw_03

import scala.util.Random

/**
 * Write a code snippet that sets a to an array of n random integers between 0 (inclusive) and n (exclusive).
 */
object Task01 {
  def main(args: Array[String]): Unit = {
    val a = generateRandomArray(10)
    println(a)
  }

  def generateRandomArray(n: Int): IndexedSeq[Int] = {
    for (_ <- 0 until n) yield Random.nextInt(n)
  }
}
