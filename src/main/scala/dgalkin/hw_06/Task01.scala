object Task01 {
  def main(args: Array[String]): Unit = {
    println(Conversions.inchesToCentimeters(1))
    println(Conversions.gallonsToLiters(2))
    println(Conversions.milesToKilometers(3))
  }
}

object Conversions {

  def inchesToCentimeters = 2.54 * (_: Double)

  def gallonsToLiters = 3.78541 * (_: Double)

  def milesToKilometers = 1.60934 * (_: Double)
}