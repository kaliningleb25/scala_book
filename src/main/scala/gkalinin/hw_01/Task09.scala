package gkalinin.hw_01

/**
 * How do you get the first character of a string in Scala? The last character?
 */
object Task09 {
  def main(args: Array[String]): Unit = {
    val testString = "testing"
    val firstChar = testString.head
    val lastChar = testString.last

    println(s"The first character if $testString is: $firstChar")
    println(s"The last character if $testString is: $lastChar")
  }
}
