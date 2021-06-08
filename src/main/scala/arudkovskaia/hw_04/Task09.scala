package arudkovskaia.hw_04

/**
 * 9. Write a function lteqgt(values: Array[Int], v: Int) that returns a triple
 * containing the counts of values less than v, equal to v, and greater than v.
 */
object Task09 {
  def main(args: Array[String]): Unit = {
    val compared = lteqgt(Array(1, 5, 15, 15, 98, 72), 15)
    println(compared)
  }

  def lteqgt(values: Array[Int], v: Int) = {
    (values.count(_ < v), values.count(_ < v), values.count(_ == v))
  }
}
