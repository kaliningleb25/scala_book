package gkalinin.hw_05

import scala.beans.BeanProperty

/**
 * Make a class Student with read-write JavaBeans properties name (of type String) and id (of type Long).
 * What methods are generated? (Use javap to check.) Can you call the JavaBeans getters and setters in Scala? Should you?
 */
object Task05 {
  def main(args: Array[String]): Unit = {
    ???
  }
}

class Student {
  @BeanProperty var name: String = _
  @BeanProperty var id: Long = _
}
