package gkalinin.hw_03

/**
 * How do you compute the average of an Array[Double]?
 */
object Task05 {
  def main(args: Array[String]): Unit = {
    println(avg(Array(2.0, 4.0, 6.0)))
    println(avg(Array(5.27, 17.4, 6.0)))
  }

  def avg(arr: Array[Double]): Double = {
    arr.sum / arr.length
  }
}
