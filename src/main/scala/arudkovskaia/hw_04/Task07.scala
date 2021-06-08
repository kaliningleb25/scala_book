package arudkovskaia.hw_04

import scala.jdk.CollectionConverters._
/**
 * 7. Print a table of all Java properties reported by the getProperties method of the
 * java.lang.System class
 */
object Task07 {
  def main(args: Array[String]): Unit = {
    val props: scala.collection.Map[String, String] = System.getProperties.asScala
    val maxKeyLength = props.keys.maxBy(_.length).length
    for ((key, value) <- props) println(f"$key${" " * (maxKeyLength - key.length)}| $value")
  }
}
