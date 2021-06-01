package gkalinin.hw_02

/**
 * The signum of a number is 1 if the number is positive, –1 if it is negative, and 0 if it is zero.
 * Write a function that computes this value.
 */
object Task01 {
  def main(args: Array[String]): Unit = {
    println(s"The signum for positive number is ${getSignum(100)}")
    println(s"The signum for negative number is ${getSignum(-100)}")
    println(s"The signum for zero number is ${getSignum(0)}")
  }

  def getSignum(number: Int): Int = {
    if (number > 0) 1
    else if (number < 0) -1
    else 0
  }
}
