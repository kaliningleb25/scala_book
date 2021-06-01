package gkalinin.hw_01

/**
 * What do the take, drop, takeRight, and dropRight string functions do?
 * What advantage or disadvantage do they have over using substring?
 */
object Task10 {
  def main(args: Array[String]): Unit = {
    val testString = "testing"

    println(s"Function 'take' takes first n elements from the string '$testString': ${testString.take(3)}")
    println(s"Function 'drop' drops first n elements from the string '$testString': ${testString.drop(3)}")
    println(s"Function 'takeRight' takes n elements from the right side of the string '$testString': ${testString.takeRight(3)}")
    println(s"Function 'dropRight' drops n elements from the right side of the string '$testString': ${testString.dropRight(3)}")

    /* Advantages of these functions over substring:
     1. Readability
     2. Performance (substring validates index bounds). For example, there will be indexOutOfBoundsException
     if we would try to use substring(0, 100) for testString
     */
  }
}
