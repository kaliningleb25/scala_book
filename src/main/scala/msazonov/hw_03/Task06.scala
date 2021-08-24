package msazonov.hw_03

import scala.collection.mutable.ArrayBuffer

/**
 * 6. How do you rearrange the elements of an Array[Int] so that they appear in reverse sorted
*order? How do you do the same with an ArrayBuffer[Int]?
 */
object Task06 {
    def main(args: Array[String]): Unit = {
        val a = Array[Int](2, 6, 9, 0, -1, -4, -6)
        val b = ArrayBuffer[Int](2, 6, 9, 0, -1, -4, -6)
        val a2 = a.sorted.reverse
        val b2 = b.sorted.reverse

        println(a2.mkString(","))
        println(b2.mkString(","))
    }
}
