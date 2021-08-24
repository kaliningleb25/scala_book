package msazonov.hw_07

import java.util.{HashMap => JavaHashMap}
import scala.collection.mutable._

/***
 * 6. Write a program that copies all elements from a Java hash map into a Scala hash map. Use imports to rename both classes.
 */
object Task06 {
    def main(args: Array[String]): Unit = {
        val hm = new JavaHashMap[String, String]()
        hm.put("1", "John")
        hm.put("2", "Paul")

        val shm = HashMap[String, String]()

        val it = hm.entrySet().iterator()
        while (it.hasNext()) {
            val pairs = it.next()
            shm += (pairs.getKey() -> pairs.getValue())
        }

        shm.foreach(println)
    }
}
