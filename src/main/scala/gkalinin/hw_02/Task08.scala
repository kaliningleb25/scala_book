package gkalinin.hw_02

/**
 * Write a function product(s : String) that computes the product, as described in the preceding exercises.
 */
object Task08 {
  def main(args: Array[String]): Unit = {
    println(product("Hello"))
  }

  def product(s: String) = {
    var acc: Long = 1L

    for (i <- 0 until s.length) {
      acc = acc * s.codePointAt(i)
    }

    acc
  }
}
