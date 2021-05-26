package arudkovskaia.hw_02

import java.time.LocalDate

object Tasks {

  def main(args: Array[String]): Unit = {
    /**
     * 1. The signum of a number is 1 if the number is positive, –1 if it is negative, and 0 if it is zero.
     * Write a function that computes this value.
     */
    println(signum(0)) // 0
    println(signum(88.8)) // 1
    println(signum(-22.2)) // -1

    /**
     * 2. What is the value of an empty block expression {}? What is its type?
     */
    val a: Unit = voidFunc() // a: "()"

    /**
     * 3. Come up with one situation where the assignment x = y = 1 is valid in Scala. (Hint: Pick a
     * suitable type for x.)
     */
    var x: Unit = {}
    var y = 1
    x = y = 1

    /**
     * 4. Write a Scala equivalent for the Java loop
     * for (int i = 10; i >= 0; i--) System.out.println(i);
     */
    for (i <- 10 to 0 by -1) {
      println(i)
    }

    /**
     * 5. Write a procedure countdown(n: Int) that prints the numbers from n to 0
     */
    countdown(5)

    /**
     * 6. Write a for loop for computing the product of the Unicode codes of all letters in a string. For
     * example, the product of the characters in "Hello" is 9415087488L.
     */
    val string = "Hello"
    var res = 1L
    for (char <- string) res *= char.toInt
    println(res)

    /**
     * 7. Solve the preceding exercise without writing a loop. (Hint: Look at the StringOps
     * Scaladoc.)
     */
    println(string.foldLeft(1L)(_ * _))

    /**
     * 8. Write a function product(s : String) that computes the product, as described in the
     * preceding exercises.
     */
    println(product(string))

    /**
     * 9. Make the function of the preceding exercise a recursive function
     */
    println(recursiveProduct(string))

    /**
     * 10. Write a function that computes xn, where n is an integer. Use the following recursive
     * definition:
     * • xn = y · y if n is even and positive, where y = xn / 2.
     * • xn = x · xn – 1 if n is odd and positive.
     * • x0 = 1.
     * • xn = 1 / x–n if n is negative.
     * Don’t use a return statement.
     */

    val b = power(5, 0) // 1.0
    val c = power(5, 1) // 5.0
    val d = power(5, -2) // 0.04
    val e = power(5, 2) // 25.0

    /**
     * 11. Define a string interpolator date so that you can define a java.time.LocalDate as
     * date"$year-$month-$day"
     */
    val year = "2021"
    val month = "11"
    val day = "02"

    println(date"$year-$month-$day")

  }

  def signum(number: Double): Int = if (number > 0) 1 else if (number == 0) 0 else -1

  def voidFunc() {} // : Unit

  def countdown(n: Int) {
    for (i <- n to 0 by -1) {
      println(i)
    }
  }

  def product(s: String): Long = {
    s.foldLeft(1L)(_ * _)
  }

  def recursiveProduct(str: String): Long = {
    if (str.length == 0) {
      1L
    } else {
      1L * str.head.toLong * recursiveProduct(str.tail)
    }
  }

  def power(x: Double, n: Int): Double = {
    if (n == 0) {
      1
    } else if (n == 1) {
      x
    } else if (n < 0) {
      1 / (x * power(x, -(n + 1)))
    } else {
      x * power(x, n - 1)
    }
  }

  implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
    def date(args: Any*): LocalDate = {
      if (args.length != 3) {
        throw new IllegalArgumentException("More than 3 arguments were provided")
      } else if (sc.parts.exists(part => part != "-" && !part.isEmpty)) {
        throw new IllegalArgumentException("Arguments are not separated by dash")
      } else {
        val year = args(0).toString.toInt
        val month = args(1).toString.toInt
        val day = args(2).toString.toInt
        LocalDate.of(year, month, day)
      }
    }
  }
}

