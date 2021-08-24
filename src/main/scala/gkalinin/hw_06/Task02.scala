package gkalinin.hw_06

/**
 * The preceding problem wasn’t very object-oriented.
 * Provide a general superclass UnitConversion and define objects
 * InchesToCentimeters, GallonsToLiters, and MilesToKilometers that extend it.
 */
object Task02 {
  def main(args: Array[String]): Unit = {
    println(s"${InchesToCentimeters.convert(5)} centimeters")
    println(s"${GallonsToLiters.convert(5)} litters")
    println(s"${MilesToKilometers.convert(5)} kilometers")
  }
}

abstract class UnitConversion {
  def convert(value: Int): Double
}

object InchesToCentimeters extends UnitConversion {
  override def convert(value: Int): Double = value * 2.54
}

object GallonsToLiters extends UnitConversion {
  override def convert(value: Int): Double = value * 3.785
}

object MilesToKilometers extends UnitConversion {
  override def convert(value: Int): Double = value * 1.609
}




