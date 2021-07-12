//package gkalinin.hw_05
//
///**
// *  Make a class Car with read-only properties for manufacturer, model name, and model year,
// *  and a read-write property for the license plate. Supply four constructors.
// *  All require the manufacturer and model name.
// *  Optionally, model year and license plate can also be specified in the constructor.
// *  If not, the model year is set to -1 and the license plate to the empty string.
// *  Which constructor are you choosing as the primary constructor? Why?
// */
//object Task08 {
//  def main(args: Array[String]): Unit = {
//    ???
//  }
//}
//
//class Car(manufacturer: String, modelName: String) {
//  private var modelYear = -1
//  private var licensePlate = ""
//
//  def this() {
//    this()
//
//  }
//}


object Test {
  def main(args: Array[String]): Unit = {
    val car1 = new Car("Toyota", "LandCuiser")
    print(car1.modelYear)
  }
}

class Car(val manufacturer: String, val modelName: String, val modelYear: Int = -1, var license: String = ""){

}