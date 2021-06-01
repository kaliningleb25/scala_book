package gkalinin.hw_01

import scala.math.BigInt.probablePrime
import scala.util.Random

/**
 * What do you need to import so that you can get a random prime as probablePrime(100, Random),
 * without any qualifiers before probablePrime and Random?
 */
object Task07 {
  def main(args: Array[String]): Unit = {
    // The answer is:
    // import scala.math.BigInt.probablePrime
    // import scala.util.Random

    probablePrime(100, Random)
  }
}
