package msazonov.hw_02

import java.time.LocalDate
import scala.collection.mutable.ArrayBuffer

object Task01 {
    def main(args: Array[String]): Unit = {
        // 1.The signum of a number is 1 if the number is positive, –1 if it is negative, and 0 if it is zero.
        // Write a function that computes this value.

        def signum(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
        val a = 0
        println(signum(a))

        //2. What is the value of an empty block expression {}? What is its type?

        //Значение будет равно (), тип Unit

        //3. Come up with one situation where the assignment x = y = 1 is valid in Scala.
        // (Hint: Pick a suitable type for x.)

        var x = {}
        var y = 0
        x = y = 1

        println("x = " + x + ", y = " + y)

        // 4. Write a Scala equivalent for the Java loop Click here to view code image
        // for (int i = 10; i >= 0; i--) System.out.println(i);

        for (i <- 10 to 0 by -1) println(i)

        // 5. Write a procedure countdown(n: Int) that prints the numbers from n to 0.

        def countdown(n: Int): Unit = {
            for (n <- n to 0 by -1) println(n)
        }
        countdown(5)

        // 6. Write a for loop for computing the product of the Unicode codes of all letters in a string. For example,
        // the product of the characters in "Hello" is 9415087488L.

        var product: Long = 1
        for(ch <- "Hello") {
            product *= ch
        }
        println(product)

        // 7. Solve the preceding exercise without writing a loop. (Hint: Look at the StringOps Scaladoc.)

        println("Hello".map(_.toLong).product)

        // 8. Write a function product(s : String) that computes the product, as described in the preceding exercises.

        def productFunc(s: String): Long = {
            var prod: Long = 1
            for(ch <- s) prod *= ch
            prod
        }
        println(productFunc("Hello"))

        // 9. Make the function of the preceding exercise a recursive function.

        def productFuncRec(s: String): Long = {
            var prod: Long = s.head.toLong
            if (s.tail.length > 0)
                prod *= productFuncRec(s.tail)
            prod
        }
        println(productFuncRec("Hello"))

        // 10. Write a function that computes xn, where n is an integer. Use the following recursive
        //     definition:
        // •xn =y·yifnisevenandpositive,wherey=xn/2. •xn =x·xn–1ifnisoddandpositive.
        // • x0 = 1.
        // •xn =1/x–nifnisnegative. Don’t use a return statement.

        def task10(x: Double, n: Int): Double = {
            if ((n % 2 == 0) && (n > 0)) {
                task10(x, n/2) * task10(x, n/2)
            } else if ((n % 2 != 0) && (n > 0)){
                x * task10(x, n-1)
            } else if (n == 0){
                1
            } else {
                1 / task10(x, -n)
            }
        }

        println(task10(2, 2)) // 4
        println(task10(2, 3)) // 8
        println(task10(2, 0)) // 1
        println(task10(2, -2)) //0.25

        // 11. Define a string interpolator date so that you can define a java.time.LocalDate as date"$year-$month-$day".
        // You need to define an “implicit” class with a date method, like this:
        // implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
        //     def date(args: Any*): LocalDate = . . .
        // }
        // args(i) is the value of the ith expression. Convert each to a string and then to an integer, and pass them to
        // the LocalDate.of method. If you already know some Scala, add error handling. Throw an exception if there
        // aren’t three arguments, or if they aren’t integers, or if they aren’t separated by dashes.
        // (You get the strings in between the expressions as sc.parts.)

        val year = "2021"
        val month = "11"
        val day = "02"
        println(date"$year-$month-$day")
    }

    implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
        def date(args: Any*): LocalDate = {
            val year = args(0).toString.toInt
            val month = args(1).toString.toInt
            val day = args(2).toString.toInt
            LocalDate.of(year, month, day)
        }
    }
}
