package msazonov.hw_04

import java.util.Scanner
import java.io.File
import scala.collection.mutable

/**
 * 2. Write a program that reads words from a file. Use a mutable map to count how often each word
 * appears. To read the words, simply use a java.util.Scanner:
 */
object Task02 {
    def main(args: Array[String]): Unit = {
        val words = mutable.Map[String, Int]()

        val in = new Scanner(new File("src/main/scala/msazonov/hw_04/myfile.txt"))
        while (in.hasNext()) {
            val word:String = in.next()
            if (words.contains(word)) words(word) += 1
            else words(word) = 1
        }
        print(words)
    }
}
