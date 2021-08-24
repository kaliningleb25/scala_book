package gkalinin.hw_04

import scala.collection.mutable

/**
 * Define a linked hash map that maps "Monday" to java.util.Calendar.MONDAY, and
 * similarly for the other weekdays. Demonstrate that the elements are visited in insertion order.
 */
object Task06 {
  def main(args: Array[String]): Unit = {
    val weekdays = mutable.LinkedHashMap[String, Int](
      "Sunday" -> java.util.Calendar.SUNDAY,
      "Monday" -> java.util.Calendar.MONDAY,
      "Tuesday" -> java.util.Calendar.TUESDAY,
      "Wednesday" -> java.util.Calendar.WEDNESDAY,
      "Thursday" -> java.util.Calendar.THURSDAY,
      "Friday" -> java.util.Calendar.FRIDAY,
      "Saturday" -> java.util.Calendar.SATURDAY
    )

    println(weekdays)
  }
}
