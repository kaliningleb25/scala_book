package gkalinin.hw_04

import java.io.File
import java.util.Scanner

import scala.collection.mutable

/**
 * Write a program that reads words from a file. Use a mutable map to count how often each word
 * appears. To read the words, simply use a java.util.Scanner:
 * <code>
 *   val in = new java.util.Scanner(new java.io.File("myfile.txt")) while (in.hasNext()) process in.next()
 * </code>
 * Or look at Chapter 9 for a Scalaesque way.
 * At the end, print out all words and their counts.
 */
object Task02 {
  def main(args: Array[String]): Unit = {
    val wordsWithAmount = mutable.Map[String, Int]().withDefaultValue(0)
    val in = new Scanner(new File("src/main/scala/gkalinin/hw_04/myfile.txt"))
    while (in.hasNext()) {
      val item = in.next()
      wordsWithAmount += (item -> (wordsWithAmount(item) + 1))
    }

    println(wordsWithAmount)
  }
}
