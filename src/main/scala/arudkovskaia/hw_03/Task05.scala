package arudkovskaia.hw_03

/**
 * 5. How do you compute the average of an Array[Double]?
 */
object Task05 {
  def main(args: Array[String]): Unit = {
    val arr = Array(1.0, 2.0, 66.6)
    val avg = arr.sum / arr.length
    avg
  }
}
