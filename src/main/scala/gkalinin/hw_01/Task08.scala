package gkalinin.hw_01

import scala.util.Random

/**
 * One way to create random file or directory names is to produce a random BigInt and convert it to base 36,
 * yielding a string such as "qsnvbevtomcj38o06kul". Poke around Scaladoc to find a way of doing this in Scala.
 */
object Task08 {
  def main(args: Array[String]): Unit = {
    val randomNumber = BigInt(36, Random)

    println(s"Random file name is: ${randomNumber.toString(36)}")
  }
}
