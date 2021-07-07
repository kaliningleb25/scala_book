package arudkovskaia.hw_05

import scala.beans.BeanProperty

class Student(@BeanProperty var name: String, @BeanProperty var id: Long)

object Task05 {
  def main(args: Array[String]): Unit = {
    val alice = new Student("Alice", 1)
    val bob = new Student("Bob", 2)
    alice.setName("Alisa")
    bob.setId(8)

    println(alice.getName)
    println(bob.getId)
  }
}
