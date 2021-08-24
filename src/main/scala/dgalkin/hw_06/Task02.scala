object Task02 {
  def main(args: Array[String]): Unit = {
    println(InchesToCentimeters.convert(1))
    println(GallonsToLiters.convert(2))
    println(MilesToKilometers.convert(3))
  }
}

abstract class UnitConversion(conversion: Double) {
  def convert(d: Double): Double = d * conversion
}

object InchesToCentimeters extends UnitConversion(2.54) {}

object GallonsToLiters extends UnitConversion(3.78541) {}

object MilesToKilometers extends UnitConversion(1.60934) {}