package msazonov.hw_04

import java.util.Scanner
import java.io.File
import scala.collection.mutable

/**
 * 4. Repeat the preceding exercise with a sorted map, so that the words are printed in sorted order.
 */
object Task04 {
    def main(args: Array[String]): Unit = {
        val words = mutable.SortedMap[String, Int]().withDefaultValue(0)

        val in = new Scanner(new File("src/main/scala/msazonov/hw_04/myfile.txt"))

        while (in.hasNext()) {
            val word = in.next()
            words += (word -> (words(word) + 1))
        }
        print(words)
    }
}
