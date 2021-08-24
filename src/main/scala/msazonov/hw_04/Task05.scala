package msazonov.hw_04

import java.util.Scanner
import java.io.File
import scala.collection.convert.ImplicitConversions.`map AsScala`
import scala.collection.mutable

/**
 * 5. Repeat the preceding exercise with a java.util.TreeMap that you adapt to the Scala API.
 */
object Task05 {
    def main(args: Array[String]): Unit = {
        val words: mutable.Map[String, Int] = new java.util.TreeMap[String, Int].withDefaultValue(0)
        val in = new Scanner(new File("src/main/scala/msazonov/hw_04/myfile.txt"))

        while (in.hasNext()) {
            val word = in.next()
            words += (word -> (words(word) + 1))
        }
        print(words)
    }
}
