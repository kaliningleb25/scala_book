package gkalinin.hw_02

/**
 * Write a for loop for computing the product of the Unicode codes of all letters in a string.
 * For example, the product of the characters in "Hello" is 9415087488L.
 */
object Task06 {
  def main(args: Array[String]): Unit = {
    val testStr = "Hello"
    var acc: Long = 1L

    for (i <- 0 until testStr.length) {
      acc = acc * testStr.codePointAt(i)
    }

    println(acc)
  }
}
