package gkalinin.hw_05

/**
 * Consider the class
 *
 * class Employee(val name: String, var salary: Double) {
 * def this() { this("John Q. Public", 0.0) }
 * }
 *
 * Rewrite it to use explicit fields and a default primary constructor. Which form do you prefer? Why?
 */
object Task10 {

}

class Employee(val name: String, var salary: Double) {
  def this() {
    this("John Q. Public", 0.0)
  }
}
