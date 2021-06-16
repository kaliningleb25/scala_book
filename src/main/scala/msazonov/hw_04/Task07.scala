package msazonov.hw_04

import scala.jdk.CollectionConverters._

/**
 * 7. Print a table of all Java properties reported by the getProperties method of the
java.lang.System class, like this:
 */
object Task07 {
    def main(args: Array[String]): Unit = {

        val props = System.getProperties().asScala
        val longestKey = props.keysIterator.reduceLeft((x,y) => if (x.length > y.length) x else y)
        print(longestKey)
        for ((k,v) <- props) {
            print(k + (" " * (longestKey.length - k.length)) + "| " + v + '\n')
        }
    }
}
