package msazonov.hw_05

/***
 * 10. Consider the class Click here to view code image
 *
 * Rewrite it to use explicit fields and a default primary constructor. Which form do you prefer? Why?
 */
object Task10 {
    def main(args: Array[String]): Unit = {
        var person = new Employee()
        print(person.salary)
    }

    class Employee(val name: String = "John Q. Public", var salary: Double = 0.0){
    }

}
