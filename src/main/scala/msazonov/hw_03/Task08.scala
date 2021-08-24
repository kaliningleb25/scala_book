package msazonov.hw_03

import scala.collection.mutable.ArrayBuffer

/**
 * 8. Suppose you are given an array buffer of integers and want to remove all but the first negative number.
 * Here is a sequential solution that sets a flag when the first negative number is called, then removes all elements beyond.
 */
object Task08 {
    def main(args: Array[String]): Unit = {
        val a = ArrayBuffer[Int](2, -9, 9, 0, -1, -4, -6, 9)
        var indexs = for(i <- a.indices if a(i) < 0) yield i
        indexs = indexs.drop(1)
        for (j <- indexs.reverse) a.remove(j)
        println(a)
    }
}
