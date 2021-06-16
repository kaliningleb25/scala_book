package msazonov.hw_04

/**
 * 10. What happens when you zip together two strings, such as "Hello".zip("World")? Come up with a plausible use case.
 */
object Task10 {
    def main(args: Array[String]): Unit = {
        val test = "Hello".zip("World")
        // Вектор пар значений
        print(test)
    }
}
