package gkalinin.hw_04

import java.io.File
import java.util.Scanner

import scala.collection.mutable

import scala.collection.JavaConversions.mapAsScalaMap

/**
 * Repeat the preceding exercise with a java.util.TreeMap that you adapt to the Scala API
 */
object Task05 {
  def main(args: Array[String]): Unit = {
    var wordsWithAmount: mutable.Map[String, Int] = new java.util.TreeMap[String, Int]().withDefaultValue(0)
    val in = new Scanner(new File("src/main/scala/gkalinin/hw_04/myfile.txt"))
    while (in.hasNext()) {
      val item = in.next()
      wordsWithAmount += (item -> (wordsWithAmount(item) + 1))
    }

    println(wordsWithAmount)
  }
}
