// task 01
/*
The signum of a number is 1 if the number is positive, –1 if it is negative, and 0 if it is zero.Write a function that computes this value.
*/

def signum(x: Int) = if (x > 0) 1 else if (x == 0) 0 else -1
signum(1)
signum(-1)
signum(0)


// task 02
/*
What is the value of an empty block expression {}? What is its type?
*/
val test = {}
// val test: Unit = ()

// task 03
//Come up with one situation where the assignment
//x = y = 1 is valid in Scala. (Hint: Pick asuitable type for x.)

var y = 1
var x = y = 1


// task 04
//Write a Scala equivalent for the Java loop
//for (int i = 10; i >= 0; i--) System.out.println(i);

// Способ № 1
import scala.language.postfixOps

for (i <- 0 to 10 reverse) {
  println(i)
}

// Способ № 2

for (i <- 10 to 0 by -1) {
  println(i)
}

// Способ № 3

for (i <- 10 to (0, -1)){
  println(i)
}

// task 05
//Write a procedure countdown(n: Int) that prints the numbers from n to 0.

// Idea не дает обойтись без Unit
def countdown(n: Int) : Unit= {
  for (i <- n to 0 by -1) {
    println(i)
  }
}
countdown(10)

// task 06
// Write a for loop for computing the product of the Unicode codes of all letters in a string.
// For example, the product of the characters in "Hello" is 9415087488L.

var string = "Hello"
var result = 1 : Long
// Если оставить Int, результат будет другой - 825152896
for (char <- string) {
  result *= char // Убрал .toInt
}
println(result)

// task 07
//  Solve the preceding exercise without writing a loop. (Hint: Look at the StringOpsScaladoc.)

var string7 = "Hello"
string7.getBytes.map(x => x.toLong).product

// task 08
// Write a function product(s : String)
// that computes the product, as described in the preceding exercises.

def product(s: String): Long = {
  var result8 = 1: Long
  if (s.isEmpty) 1
  else {
    for (char <- s) {
      result8 *= char
    }
    result8
  }
}
product(string7)

// task 09
// Make the function of the preceding exercise a recursive function.

def product_recursion(s: String):Long ={
  if (s.isEmpty) 1
  else
    s.head * product_recursion(s.tail)
}
product_recursion(string7)

// task 10


// task 11


