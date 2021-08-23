package msazonov.hw_01

import scala.math.BigInt._
import scala.util._

object Task01{
    def main(args: Array[String]): Unit = {
        //1. In the Scala REPL, type 3. followed by the Tab key. What methods can be applied?

        // Множество различных методов, такие как .toString(), .getClass(), .equals(), .compare() и тд

        //2. In the Scala REPL, compute the square root of 3, and then square that value. By how much does the result differ
        // from 3? (Hint: The res variables are your friend.)

        math.sqrt(3)
        math.pow(res, 2)

        //Sqrt = 1.7320508075688772, Square = 2.9999999999999996

        //3. Are the res variables val or var?

        // They are val

        // 4. Scala lets you multiply a string with a number—try out "crazy" * 3 in the REPL. What does this operation do?
        // Where can you find it in Scaladoc?

        println("crazy"*3)
        //Выводит слово crazy 3 раза.
        //https://www.scala-lang.org/api/current/scala/collection/StringOps.html

        //5. What does 10 max 2 mean? In which class is the max method defined?

        println(10 max 2)
        //Возвращает наибольшее значение, класс RichInt

        //6. Using BigInt, compute 2^1024.

        val task6 = BigInt(2) pow 1024
        println(task6)

        //7. What do you need to import so that you can get a random prime as probablePrime(100, Random), without any
        // qualifiers before probablePrime and Random?

        // import.math.BigInt._ и scala.util._
        println(probablePrime(100, Random))

        //8. One way to create random file or directory names is to produce a random BigInt and convert it to base 36,
        // yielding a string such as "qsnvbevtomcj38o06kul". Poke around Scaladoc to find a way of doing this in Scala.

        // https://www.scala-lang.org/api/current/scala/math/BigInt.html метод toString(radix: Int): String
        val task8 = probablePrime(100, Random).toString(36)
        println(task8)

        //9. How do you get the first character of a string in Scala? The last character?

        val task9 = "Maksim"
        println(task9.head)
        println(task9.last)

        //10. What do the take, drop, takeRight, and dropRight string functions do? What advantage or disadvantage do they
        // have over using substring?

        //def take(n: Int): String A string containing the first n chars of this string.
        //def drop(n: Int): String The rest of the string without its n first chars.
        //def takeRight(n: Int): String A string containing the last n chars of this string.
        //def dropRight(n: Int): String The rest of the string without its n last chars.

        val task10 = "Maksim Sazonov"
        println(task10.take(2)) // "Ma"
        println(task10.drop(2)) // "ksim Sazonov"
        println(task10.takeRight(2)) // "ov"
        println(task10.dropRight(2)) // "Maksim Sazon"
        //В substring() нужно указывать начало и конец, в отличии от остальных методов

    }
}
