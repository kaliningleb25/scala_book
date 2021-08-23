package arudkovskaia.hw_03

/**
 * 3. Repeat the preceding assignment, but produce a new array with the swapped values. Use
 * for/yield.
 */
object Task03 {
  def main(args: Array[String]): Unit = {
    val a = swap(Array(1, 2, 3, 4, 5))
    a
  }

  def swap(arr: Array[Int]): Array[Int] = {
    for (i <- arr.indices) yield {
      if (i % 2 == 0) {
        if (i + 1 == arr.length)  {
          arr(i)
        } else {
          arr(i + 1)
        }
      } else
        arr(i - 1)
    }
  }.toArray
}
