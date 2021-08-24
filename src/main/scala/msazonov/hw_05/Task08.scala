package msazonov.hw_05

/***
 * 8. Make a class Car with read-only properties for manufacturer, model name, and model year, and a read-write property
 * for the license plate. Supply four constructors. All require the manufacturer and model name.
 * Optionally, model year and license plate can also be specified in the constructor. If not, the model year is set
 * to -1 and the license plate to the empty string. Which constructor are you choosing as the primary constructor? Why?
 */
object Task08 {
    def main(args: Array[String]): Unit = {
        val car1 = new Car("Toyota", "LandCuiser")
        print(car1.modelYear)
    }

    class Car(val manufacturer: String, val modelName: String, val modelYear: Int, var license: String){
        def this(manufacturer: String, modelName: String, modelYear: Int){
            this(manufacturer, modelName, modelYear, "")
        }

        def this(manufacturer: String, modelName: String, license: String) {
            this(manufacturer, modelName, -1, license)
        }

        def this(manufacturer: String, modelName: String) {
            this(manufacturer, modelName, -1, "")
        }

    }
}
