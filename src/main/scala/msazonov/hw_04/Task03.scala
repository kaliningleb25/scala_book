package msazonov.hw_04

import java.util.Scanner
import java.io.File

/**
 * 3. Repeat the preceding exercise with an immutable map.
 */
object Task03 {
    def main(args: Array[String]): Unit = {
        var words = Map[String, Int]().withDefaultValue(0)

        val in = new Scanner(new File("src/main/scala/msazonov/hw_04/myfile.txt"))
        while (in.hasNext()) {
            val word = in.next()
            words += (word -> (words(word) + 1))
        }
        print(words)
    }
}
