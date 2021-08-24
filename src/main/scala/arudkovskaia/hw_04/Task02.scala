package arudkovskaia.hw_04

import scala.io.Source

/**
 * Write a program that reads words from a file. Use a mutable map to count how often each word
 * appears. To
 */
object Task02 {

  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("src/main/scala/arudkovskaia/hw_04/myfile.txt", "UTF-8")
    val wordsCount = scala.collection.mutable.Map[String, Int]()
    val text = source.getLines().mkString(" ")

    text.split(" ").foreach(word => if (wordsCount.contains(word)) {
      wordsCount(word) += 1
    } else {
      wordsCount += ((word, 1))
    })
    wordsCount.foreach(println)
  }
}
