package gkalinin.hw_04

import scala.collection.JavaConversions.iterableAsScalaIterable

/**
 * Print a table of all Java properties reported by the getProperties method of the
 * java.lang.System class, like this:
 * <example>
 *
 * You need to find the length of the longest key before you can print the table.
 *
 */
object Task07 {
  def main(args: Array[String]): Unit = {
    val properties = java.lang.System.getProperties
    val keys = properties.stringPropertyNames().toList
    val longestKeyLength = keys.maxBy(key => key.length).length

    for (key <- keys) {
      print(key)
      for (_ <- key.length to longestKeyLength) {
        print(" ")
      }
      print("| ")
      print(properties.get(key))
      println()
    }
  }
}
