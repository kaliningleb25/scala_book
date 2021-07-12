package gkalinin.hw_06

/**
 * Write an object Conversions with methods inchesToCentimeters,
 * gallonsToLiters, and milesToKilometers.
 */
object Task01 {
  def main(args: Array[String]): Unit = {
    println(s"${Conversions.inchesToCentimeters(5)} centimeters")
    println(s"${Conversions.gallonsToLitters(5)} litters")
    println(s"${Conversions.milesToKilometers(5)} kilometers")
  }
}

object Conversions {
  def inchesToCentimeters(inches: Int): Double = inches * 2.54
  def gallonsToLitters(gallons: Int): Double = gallons * 3.785
  def milesToKilometers(miles: Int): Double = miles * 1.609
}
