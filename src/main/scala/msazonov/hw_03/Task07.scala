package msazonov.hw_03

/**
 * 7. Write a code snippet that produces all values from an array with duplicates removed. (Hint: Look at Scaladoc.)
 */
object Task07 {
    def main(args: Array[String]): Unit = {
        val a = Array[Int](2, 6, 9, 0, -1, -4, -6, 9, 9)
        println(a.distinct.mkString(","))
    }
}
