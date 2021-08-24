package msazonov.hw_05

/***
 * 6. In the Person class of Section 5.1, “Simple Classes and Parameterless Methods,” on page 55, provide a primary
 * constructor that turns negative ages to 0.
 */
object Task06 {
    def main(args: Array[String]): Unit = {
        val person1 = new Person("Max", -2)
        print(person1.age)
    }

    class Person(var name:String, var age:Int) {
        if(age < 0) {
            age = 0
        }
    }
}
