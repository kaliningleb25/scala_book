package arudkovskaia.hw_02

object Task01 {

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
    println(product("Hello"))

    /**
     * 9. Make the function of the preceding exercise a recursive function
     */
    println(recursiveProduct("Hello"))
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

  def recursiveProduct(s: String): Long = {
    ???
    }
}

