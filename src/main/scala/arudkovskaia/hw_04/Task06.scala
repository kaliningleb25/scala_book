package arudkovskaia.hw_04

import java.util.Calendar

/**
 * 6. Define a linked hash map that maps "Monday" to java.util.Calendar.MONDAY, and
 * similarly for the other weekdays. Demonstrate that the elements are visited in insertion order.
 */
object Task06 {
  def main(args: Array[String]): Unit = {
    val months = scala.collection.mutable.LinkedHashMap(
      "Monday" -> Calendar.MONDAY,
      "Tuesday" -> Calendar.TUESDAY,
      "Wednesday" -> Calendar.WEDNESDAY,
      "Thursday" -> Calendar.THURSDAY,
      "Friday" -> Calendar.FRIDAY,
      "Saturday" -> Calendar.SATURDAY,
      "Sunday" -> Calendar.SUNDAY
    )
    months.foreach(println)
  }
}
