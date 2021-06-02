package arudkovskaia.hw_03

/**
 * Write a loop that swaps adjacent elements of an array of integers. For example, Array(1,
 * 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
 */
object Task02 {
  def main(args: Array[String]): Unit = {
    val a = swap(Array(1, 2, 3, 4, 5))
    a
  }

  def swap(arr: Array[Int]): Array[Int] = {
    for (i <- 0 until arr.length - 1 by 2) {
      val temp = arr(i)
      arr(i) = arr(i + 1)
      arr(i + 1) = temp
    }
    arr
  }
}
