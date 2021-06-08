package msazonov.hw_03

import scala.util.Random

/**
 * 1. Write a code snippet that sets a to an array of n random integers between 0 (inclusive) and n (exclusive).
 **/
object Task01 {
    def main(args: Array[String]): Unit = {
        val n:Int = 10
        val a = new Array[Int](n)
        for (i <- 0 until a.length) a(i) = Random.nextInt(n)
        print(a.mkString("[", ",", "]"))
    }
}
