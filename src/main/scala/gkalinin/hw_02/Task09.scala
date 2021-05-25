package gkalinin.hw_02

/**
 * Make the function of the preceding exercise a recursive function.
 */
object Task09 {
  def main(args: Array[String]): Unit = {
    println(product("Hello", 1))
  }

  def product(s: String, acc: Long): Long = {
    if (s.isEmpty) {
      acc
    } else {
      product(s.tail, acc * s.head)
    }
  }
}
