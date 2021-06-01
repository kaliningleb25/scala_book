package gkalinin.hw_02

/**
 * Write a function that computes x^n, where n is an integer. Use the following recursive
 * definition:
 * x^n = y * y if n is even and positive, where y = x ^ (n/2)
 * x^n = x * x ^ (n-1) is odd and positive
 * x^0 = 1
 * x^n = 1 / x^n if n is negative
 * Don't use a return statement
 */
object Task10 {
  def main(args: Array[String]): Unit = {
    println(func(2, -3))
  }

  def func(x: Double, n: Int) = {
    val initialNumber = x

    def innerFunc(x: Double, n: Int): Double = {
      if (n == 1) {
        x
      } else if (n == 0) {
        1
      } else if (n < 0) {
        1/innerFunc(x * initialNumber, -n - 1)
      } else {
        innerFunc(x * initialNumber, n - 1)
      }
    }

    innerFunc(x, n)
  }

}
