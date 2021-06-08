package arudkovskaia.hw_04

import scala.io.Source
import scala.jdk.CollectionConverters._

/**
 * 5. Repeat the preceding exercise with a java.util.TreeMap that you adapt to the Scala API.
 */
object Task05 {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("src/main/scala/arudkovskaia/hw_04/myfile.txt", "UTF-8")
    val wordsCount: scala.collection.mutable.Map[String, Int] =
      new java.util.TreeMap[String, Int].asScala
    val text = source.getLines().mkString(" ")

    text.split(" ").foreach(word => if (wordsCount.contains(word)) {
      wordsCount(word) += 1
    } else {
      wordsCount += ((word, 1))
    })
    wordsCount.foreach(println)
  }
}
