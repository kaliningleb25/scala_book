package msazonov.hw_07

/***
 * 7. In the preceding exercise, move all imports into the innermost scope possible.
 */
object Task07 {
    def main(args: Array[String]): Unit = {
        object javaToHashMap{
            import java.util.{HashMap => JavaHashMap}

            def apply[A, B](hm: JavaHashMap[A, B]) = {

                import scala.collection.mutable.HashMap
                val shm = new HashMap[A, B]()

                val it = hm.entrySet().iterator()
                while (it.hasNext()) {
                    val pairs = it.next()
                    shm += (pairs.getKey() -> pairs.getValue())
                }
                shm
            }
        }
        val hm = new java.util.HashMap[String, String]()
        hm.put("1", "John")
        hm.put("2", "Paul")

        javaToHashMap(hm).foreach(println)

    }
}
