package gkalinin.hw_04

import java.io.File
import java.util.Scanner

/**
 * Repeat the preceding exercise with an immutable map.
 */
object Task03 {
  def main(args: Array[String]): Unit = {
    var wordsWithAmount = Map[String, Int]().withDefaultValue(0)
    val in = new Scanner(new File("src/main/scala/gkalinin/hw_04/myfile.txt"))
    while (in.hasNext()) {
      val item = in.next()
      wordsWithAmount += (item -> (wordsWithAmount(item) + 1))
    }

    println(wordsWithAmount)
  }
}
