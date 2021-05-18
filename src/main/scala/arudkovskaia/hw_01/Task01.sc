// Task 1
// and many many others
3.ceil
3.compare(4)
3.compareTo(5)
3.isValidInt
3.isValidChar
3.isWhole
3.isInfinity

// Task 2
math.sqrt(3)
math.pow(res7, 2)
3 - res8 // 4.440892098500626E-16

// Task 3
8 * 7 // val
// res10 = 0 - error, reassignment to val

// Task 4
// Return the current string concatenated n times.
// Operation can be found in StringOps section
"crazy" * 3

// Task 5
// max belongs to RichInt
10 max 2

// Task 6
BigInt(2).pow(1024)

// Task 7
import scala.util.Random
import BigInt.probablePrime

probablePrime(100, Random)

// Task 8
probablePrime(100, Random).toString(36)

// Task 9
val str = "Sunday morning coffee"
str.head // S
str.last // e

// Task 10
// take() and drop() are more useful when you need to take or trim first/last n elements
// substring() can be useful when it is needed to extract elements from the middle of string
str.take(6) // Sunday
str.drop(7) // morning coffee
str.takeRight(6) // coffee
str.dropRight(7) // Sunday morning

str.substring(7, 14) // morning