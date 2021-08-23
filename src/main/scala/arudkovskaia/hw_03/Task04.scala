package arudkovskaia.hw_03

/**
 * 4. Given an array of integers, produce a new array that contains all positive values of the original
 * array, in their original order, followed by all values that are zero or negative, in their original
 * order.
 */
object Task04 {
  def main(args: Array[String]): Unit = {
    val arr = rearrange(Array(0, 5, 2, -1, 0, 3, 2, 8, -9, 1))
    arr
  }

  def rearrange(arr: Array[Int]): Array[Int] = {
    val positive = for (elem <- arr if elem > 0)  yield elem
    val negative = for (elem <- arr if elem <= 0)  yield elem
    positive ++ negative
  }
}
