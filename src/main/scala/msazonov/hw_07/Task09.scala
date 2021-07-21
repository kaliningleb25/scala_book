package msazonov.hw_07

import java.lang.System._

/***
 *9. Write a program that imports the java.lang.System class, reads the user name from the user.name system property,
 * reads a password from the StdIn object, and prints a message to the standard error stream if the password is not
 * "secret". Otherwise, print a greeting to the standard output stream. Do not use any other imports, and do not use
 * any qualified names (with dots).
 */
object Task09 {
    def main(args: Array[String]): Unit = {
        val userName = getProperties.getProperty("user.name")

        if (args.length > 0 && args(0) == "secret")
            println("Welcome " + userName)
        else
            println("Wrong password")
    }
}

// Task10
/**
 * Apart from StringBuilder, what other members of java.lang does the scala package override?
 *
 * Every Scala program implicitly starts with:
 * import java.lang._
 * import scala._
 * import Predef._
 *
 * Byte, Char, Double, Float, Long, Boolean
 */