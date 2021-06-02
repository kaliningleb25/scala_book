package arudkovskaia.hw_03
import scala.util.Random

/**
 * 1. Write a code snippet that sets a to an array of n random integers between 0 (inclusive) and n
 * (exclusive).
 */
object Task01 {
  def main(args: Array[String]): Unit = {
  val arr = generateArray(10)
  }

  def generateArray(n: Int) = {
    val a = new Array[Int](n)
    a.map(_ => Random.between(1, n))
  }
}
