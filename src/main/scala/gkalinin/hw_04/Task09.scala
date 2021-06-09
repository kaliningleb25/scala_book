package gkalinin.hw_04

/**
 * Write a function lteqgt(values: Array[Int], v: Int)
 * that returns a triple containing the counts of values less than v, equal to v, and greater than v.
 */
object Task09 {
  def main(args: Array[String]): Unit = {
    println(lteggt(Array(5, 7, -3), 0))
  }

  def lteggt(values: Array[Int], v: Int): (Int, Int, Int) = {
    (values.count(value => value < v),
      values.count(value => value == v),
      values.count(value => value > v)
    )
  }
}
