package gkalinin.hw_03

/**
 * Write a loop that swaps adjacent elements of an array of integers.
 * For example, Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
 */
object Task02 {
  def main(args: Array[String]): Unit = {
    println(swapAdjacentElements(Array(1, 2, 3, 4, 5)).mkString("Array(", ", ", ")"))
    println(swapAdjacentElements(Array(1, 2, 3, 4)).mkString("Array(", ", ", ")"))
  }

  def swapAdjacentElements(arr: Array[Int]): Array[Int] = {
    for (i <- arr.indices by 2 if i != arr.length - 1) {
      val tmp = arr(i)
      arr(i) = arr(i + 1)
      arr(i + 1) = tmp
    }
    arr
  }
}
