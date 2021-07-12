package gkalinin.hw_05

/**
 * Write a class Person with a primary constructor that accepts a string containing a first name,
 * a space, and a last name, such as new Person("Fred Smith").
 * Supply read-only properties firstName and lastName.
 * Should the primary constructor parameter be a var, a val, or a plain parameter? Why?
 */
object Task07 {
  def main(args: Array[String]): Unit = {
    val person = new Person2("Fred Smith")

    println(person.firstName)
    println(person.lastName)
  }
}

class Person2(fullName: String) {

//  def firstName = name.split(" ")(0)
//  def lastName = name.split(" ")(1)

  val Array(firstName, lastName) = fullName.split("\\s")
}
