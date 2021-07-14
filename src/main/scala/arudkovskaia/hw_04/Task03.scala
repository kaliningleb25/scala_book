package arudkovskaia.hw_04

import scala.io.Source

/**
 * 3. Repeat the preceding exercise with an immutable map.
 */
object Task03 {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("src/main/scala/arudkovskaia/hw_04/myfile.txt", "UTF-8")
    var wordsCount = scala.collection.immutable.Map[String, Int]().withDefaultValue(0)
    val text = source.getLines().mkString(" ")

    text.split(" ").foreach(word => {
      val temp = wordsCount(word)
      wordsCount += ((word, temp + 1))
    })
    wordsCount.foreach(println)
  }
}
