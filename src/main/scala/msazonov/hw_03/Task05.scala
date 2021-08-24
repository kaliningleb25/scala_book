package msazonov.hw_03

/**
 * 5. How do you compute the average of an Array[Double]?
 */
object Task05 {
    def main(args: Array[String]): Unit = {
        val a = Array[Double](1.0, 3.0, 4.5, 7.2)
        println("Average = " + a.sum/a.length)
    }
}
