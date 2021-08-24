package msazonov.hw_05

/***
 * 7. Write a class Person with a primary constructor that accepts a string containing a first name, a space, and a
 * last name, such as new Person("Fred Smith"). Supply read-only properties firstName and lastName.
 * Should the primary constructor parameter be a var, a val, or a plain parameter? Why?
 */
object Task07 {
    def main(args: Array[String]): Unit = {
        val person1 = new Person("Max Sazonov")
        print(person1.firstName)
    }

    class Person (val name: String){
        def firstName = name.split(" ")(0)
        def lastName = name.split(" ")(1)
    }
}
