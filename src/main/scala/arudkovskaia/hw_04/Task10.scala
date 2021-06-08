package arudkovskaia.hw_04

/**
 * 10. What happens when you zip together two strings, such as "Hello".zip("World")? Come
 * up with a plausible use case.
 */
object Task10 {
  def main(args: Array[String]): Unit = {
    println("Hello".zip("World"))
    // get complementary pairs for DNA sequences to check their correctness
    println("ATTCCGATAA".zip("TAAGGCTATT").distinct)
  }
}
