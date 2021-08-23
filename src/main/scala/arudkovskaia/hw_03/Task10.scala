package arudkovskaia.hw_03

import java.util.TimeZone.getAvailableIDs

/**
 * 10. Make a collection of all time zones returned by
 * java.util.TimeZone.getAvailableIDs that are in America. Strip off the
 * "America/" prefix and sort the result.
 */
object Task10 {
  def main(args: Array[String]): Unit = {
    val AmericaPrefix = "America/"
    val timezones = getAvailableIDs
      .filter(_.startsWith(AmericaPrefix))
      .map(_.stripPrefix(AmericaPrefix))
      .sorted

    timezones
  }
}
