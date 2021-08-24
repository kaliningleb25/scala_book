package arudkovskaia.hw_04

/**
 * 8. Write a function minmax(values: Array[Int]) that returns a pair containing the
 * smallest and the largest values in the array.
 */
object Task08 {
  def main(args: Array[String]): Unit = {
    val extremums = minmax(Array(20, 1, 90, -5))
    println(extremums)
  }
  def minmax(values: Array[Int]) = {
    (values.min, values.max)
  }
}
