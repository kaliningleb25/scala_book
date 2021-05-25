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
      ???
    }
  }
}


