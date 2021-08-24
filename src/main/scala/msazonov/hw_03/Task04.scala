package msazonov.hw_03

import scala.collection.mutable.ArrayBuffer

/**
 * 4. Given an array of integers, produce a new array that contains all positive values of the original array, in their
 * original order, followed by all values that are zero or negative, in their original order.
 */
object Task04 {
    def main(args: Array[String]): Unit = {
        val a = Array[Int](-1, 0, -2, 0, 3, 4, -5)
        val pos, negzer = ArrayBuffer[Int]()
        for (i <- a.indices){
            if (a(i) > 0)
                pos += i
            else
                negzer += i
        }
        val result = ArrayBuffer[Int]()
        result ++= (for(i <- pos) yield a(i))
        result ++= (for(i <- negzer) yield a(i))

        print(result)
    }
}
