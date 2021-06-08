package msazonov.hw_03

/**
 * 3. Repeat the preceding assignment, but produce a new array with the swapped values. Use for/yield.
 */
object Task03 {
    def main(args: Array[String]): Unit = {
        val a = Array[Int](1, 2, 3, 4, 5)
        val result = for (i <- 0 until a.length)
            yield if (i % 2 == 1){
                a(i-1)
            } else if(i == a.length-1) {
                a(i)
            } else
                a(i+1)

        print(result.mkString(","))
    }
}
