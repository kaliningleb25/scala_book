package msazonov.hw_04

/**
 * 8. Write a function minmax(values: Array[Int]) that returns a pair containing the smallest and the largest values in the array.
 */
object Task08 {
    def main(args: Array[String]): Unit = {
        def minmax(a: Array[Int]):(Int, Int) = (a.min, a.max)

        println(minmax(Array(1, 2, 3, 4, 5)))
    }
}
