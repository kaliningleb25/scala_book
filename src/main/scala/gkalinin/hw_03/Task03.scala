package gkalinin.hw_03

/**
 * Repeat the preceding assignment, but produce a new array with the swapped values. Use for/yield.
 */
object Task03 {
  def main(args: Array[String]): Unit = {
    println(swapAdjacentElements(Array(1, 2, 3, 4, 5)).mkString("Array(", ", ", ")"))
    println(swapAdjacentElements(Array(1, 2, 3, 4)).mkString("Array(", ", ", ")"))
  }

  def swapAdjacentElements(arr: Array[Int]): IndexedSeq[Int] = {
    for (i <- arr.indices)
      yield
        (
          if (i == arr.length - 1) arr(i)
          else if (arr(i) % 2 == 0) arr(i - 1)
          else arr(i + 1)
          )
  }
}
