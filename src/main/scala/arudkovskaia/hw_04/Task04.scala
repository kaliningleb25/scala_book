package arudkovskaia.hw_04

import scala.io.Source

/**
 * 4. Repeat the preceding exercise with a sorted map, so that the words are printed in sorted order.
 */
object Task04 {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("src/main/scala/arudkovskaia/hw_04/myfile.txt", "UTF-8")
    val wordsCount = scala.collection.mutable.SortedMap[String, Int]()
    val text = source.getLines().mkString(" ")

    text.split(" ").foreach(word => if (wordsCount.contains(word)) {
      wordsCount(word) += 1
    } else {
      wordsCount += ((word, 1))
    })
    wordsCount.foreach(println)
  }
}
