
// task 01
//Write a code snippet that sets a to an array of n random integers
// between 0 (inclusive) and n(exclusive).

val a = new Array[Int](10)
for(i <- a.indices) {
  a(i) = i
}
a

// task 02
// Write a loop that swaps adjacent elements of an array of integers.
// For example, Array(1,2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
val a = Array[Int](1,2,3,4,5)
for (i <- 0 until a.length - 1 by 2) {
  val temp = a(i)
  a(i) = a(i + 1)
  a(i + 1) = temp
}
a

// task 03
//Repeat the preceding assignment, but produce a new array with the swapped values. Usefor/yield.

val a = Array[Int](1,2,3,4,5)
for (i <- a.indices)
  yield
    if (i % 2 == 1) a(i - 1)
  else {
    if (i == a.length - 1)
      a(i)
    else a(i + 1)
  }

// task 04
// Given an array of integers, produce a new array that contains all positive values of the originalarray,
// in their original order, followed by all values that are zero or negative, in their originalorder.
import scala.collection.mutable.ArrayBuffer

val a = Array[Int](1,-1,2,-2,3,-3,4,-4,5,-5, 0)
val positive, negative = new ArrayBuffer[Int]

for (num <- a) {
  if (num > 0) {
    positive += num
  }
  else negative += num

}
val sort_array = new ArrayBuffer[Int]
sort_array ++= positive ++= negative

// task 05
//How do you compute the average of an Array[Double]?
val double_array = Array[Double](1.0, 2.0, 3.0, 4.0, 5.0)
val medium_value = double_array.sum / double_array.length

// task 06
//How do you rearrange the elements of an Array[Int] so that they appear in reverse sortedorder?
// How do you do the same with an ArrayBuffer[Int]?

val a = Array[Int] (2, 1, 4, 3, 5)
a.sortWith(_ > _)
// from task 04
sort_array.sortWith(_ > _)

// task 07
//Write a code snippet that produces all values from an array with duplicates removed.
// (Hint:Look at Scaladoc.)
val a = Array[Int] (1,1,2,2,3,3,4,4,5,5)
a.distinct

// task 08

import scala.collection.mutable.ArrayBuffer
val ar = ArrayBuffer[Int](2, -9, 9, 0, -1, -4, -6, 9)
var indexs = for(i <- ar.indices if ar(i) < 0) yield i
indexs = indexs.drop(1)
for (j <- indexs.reverse) ar.remove(j)
println(ar)



// task 10
// Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs
// that are in America. Strip off the "America/" prefix and sort the result.
val tz = java.util.TimeZone.getAvailableIDs().filter(_.startsWith("America/")).map( (s) => s.stripPrefix("America/"))

// task 11
// Import java.awt.datatransfer._ and make an object of type SystemFlavorMap with
// the call
// val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
// Then call the getNativesForFlavor method with parameter DataFlavor.imageFlavor
// and get the return value as a Scala buffer. (Why this obscure class? It's hard
// to find uses of java.util.List in the standard Java library.)

import java.awt.datatransfer._

val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
val nativesForFlavors = flavors.getNativesForFlavors(Array(DataFlavor.imageFlavor))
