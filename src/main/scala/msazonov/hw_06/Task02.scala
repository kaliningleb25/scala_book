package msazonov.hw_06

/***
 * 2. The preceding problem wasn’t very object-oriented. Provide a general superclass UnitConversion and define objects
 * InchesToCentimeters, GallonsToLiters, and MilesToKilometers that extend it.
 */
object Task02 {
    def main(args: Array[String]): Unit = {

    }
}

class UnitConversion(conversionValue: Double) {
    private def convertToOther(value: Double) = value * conversionValue

    def apply(value: Double) = convertToOther(value)
}

object InchesToCentimeters extends UnitConversion(2.54) {}
object GallonsToLiters extends UnitConversion(3.78) {}
object MilesToKilometers extends UnitConversion(1.604) {}
