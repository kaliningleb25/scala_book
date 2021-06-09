package gkalinin.hw_04

/**
 * Write a function minmax(values: Array[Int]) that
 * returns a pair containing the smallest and the largest values in the array.
 */
object Task08 {
  def main(args: Array[String]): Unit = {
    println(minmax(Array(11, 100, -50)))
  }

  def minmax(values: Array[Int]): (Int, Int) = {
    (values.min, values.max)
  }
}
