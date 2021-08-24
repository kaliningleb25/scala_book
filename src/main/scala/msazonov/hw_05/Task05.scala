package msazonov.hw_05

import scala.beans.BeanProperty

/***
 * 5. Make a class Student with read-write JavaBeans properties name (of type String) and id (of type Long).
 * What methods are generated? (Use javap to check.) Can you call the JavaBeans getters and setters in Scala? Should you?
 */
object Task05 {
    def main(args: Array[String]): Unit = {
        val student1 = new Student("Max", 1)
        print(student1.name)
        student1.setName("Max2")
        print(student1.name)
    }

    class Student(@BeanProperty var name: String,@BeanProperty var id: Long) {

    }
}