package msazonov.hw_04

/**
 * 9. Write a function lteqgt(values: Array[Int], v: Int) that returns a triple containing the counts of values
 * less than v, equal to v, and greater than v.
 */
object Task09 {
    def main(args: Array[String]): Unit = {
        def lteqgt(values: Array[Int], v: Int):(Int, Int, Int) = {
            (values.count(_ < v), values.count(_ == v), values.count(_ > v))
        }

        val testArray = Array(1, 1, 2, 3, 4, 0, -1, -2)

        println(lteqgt(testArray, 1))
    }
}
