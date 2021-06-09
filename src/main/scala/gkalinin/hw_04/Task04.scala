package gkalinin.hw_04

import java.io.File
import java.util.Scanner

import scala.collection.SortedMap

/**
 * Repeat the preceding exercise with a sorted map, so that the words are printed in sorted order.
 */
object Task04 {
  def main(args: Array[String]): Unit = {
    var wordsWithAmount = SortedMap[String, Int]()
    val in = new Scanner(new File("src/main/scala/gkalinin/hw_04/myfile.txt"))
    while (in.hasNext()) {
      val item = in.next()
      if (wordsWithAmount.contains(item)) {
        wordsWithAmount += (item -> (wordsWithAmount(item) + 1))
      } else {
        wordsWithAmount += (item -> 1)
      }
    }

    println(wordsWithAmount)
  }
}
