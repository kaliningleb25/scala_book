package gkalinin.hw_03

import java.util.TimeZone.getAvailableIDs

/**
 * Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs
 * that are in America. Strip off the "America/" prefix and sort the result.
 */
object Task10 {
  def main(args: Array[String]): Unit = {
    println(getCollectionOfAmericaTimeZones().mkString("Array(", ", ", ")"))
  }

  def getCollectionOfAmericaTimeZones(): Array[String] = {
    val prefix = "America/"
    val empty = ""

    getAvailableIDs
      .filter(id => id.startsWith(prefix))
      .map(id => id.replaceAll(prefix, empty))
      .sorted
  }
}
