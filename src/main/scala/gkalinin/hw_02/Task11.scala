package gkalinin.hw_02

import java.time.LocalDate

/**
 * Define a string interpolator date so that you can define a java.time.LocalDate as date"$year-$month-$day".
 * You need to define an “implicit” class with a date method, like this:
 * implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
 * def date(args: Any*): LocalDate = . . .
 * }
 * args(i) is the value of the ith expression.
 * Convert each to a string and then to an integer, and pass them to the LocalDate.of method.
 * If you already know some Scala, add error handling.
 * Throw an exception if there aren’t three arguments, or if they aren’t integers,
 * or if they aren’t separated by dashes.
 */
object Task11 {
  implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
    def date(args: Any*): LocalDate = {
      if (args.length != 3) {
        throw new IllegalArgumentException(s"Expected 3 arguments, but provided: ${args.length}")
      }
      if (!sc.parts(1).equals("-") || !sc.parts(2).equals("-")) {
        throw new IllegalArgumentException(s"The arguments should be separated by dashes")
      }

      try {
        val year = args(0).toString.toInt
        val month = args(1).toString.toInt
        val day = args(2).toString.toInt
        LocalDate.of(year, month, day)
      } catch {
        case _: NumberFormatException => throw new IllegalArgumentException("Some of the provided arguments are not integers")
      }
    }
  }

}
/* Will be converted into
  class DateInterpolator(val sc: StringContext) extends AnyVal {
    def date(args: Any*): LocalDate = {
      ...
    }
  implicit final def DateInterpolator(val sc: StringContext): DateInterpolator = new DateInterpolator(sc)
 }
 */


import Task11.DateInterpolator

object Task11Run {
  val year = "2021"
  val month = "05"
  val day = "26"

  def main(args: Array[String]): Unit = {
    val date: LocalDate = date"$year-$month-$day"
    println(date)
  }
}


