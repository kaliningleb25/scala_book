package msazonov.hw_03

/**
 * 2. Write a loop that swaps adjacent elements of an array of integers. For example, Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
 **/
object Task02 {
    def main(args: Array[String]): Unit = {
        val a = Array[Int](1, 2, 3, 4, 5)
        for (i <- 0 until a.length-1)
        {
            if (i % 2 == 1) {
                var temp = a(i)
                a(i) = a(i - 1)
                a(i - 1) = temp
            }
        }
        print(a.mkString(","))
    }
}
