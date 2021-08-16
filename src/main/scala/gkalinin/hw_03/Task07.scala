package gkalinin.hw_03

/**
 * Write a code snippet that produces all values from an array with duplicates removed. (Hint:
 * Look at Scaladoc.)
 */
object Task07 {
  def main(args: Array[String]): Unit = {
    println(removeDuplicates(Array("test", "test")).mkString("Array(", ", ", ")"))
  }

  def removeDuplicates(arr: Array[Object]): Array[Object] = {
    arr.distinct
  }
}
