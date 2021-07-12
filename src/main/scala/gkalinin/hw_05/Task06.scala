package gkalinin.hw_05

/**
 * In the Person class of Section 5.1, “Simple Classes and Parameterless Methods,” on page 55,
 * provide a primary constructor that turns negative ages to 0.
 */
object Task06 {
  def main(args: Array[String]): Unit = {
    val person = new Person(-5)
    println(person.age)
  }
}

class Person(var age: Int) {
  if (age < 0) {
    age = 0
  }
}