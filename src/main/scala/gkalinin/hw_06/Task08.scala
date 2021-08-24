package gkalinin.hw_06

/**
 * Write an enumeration describing the eight corners of the RGB color cube.
 * As IDs, use the color values (for example, 0xff0000 for Red).
 */
object Task08 {
  def main(args: Array[String]): Unit = {
    val RBGColorCubeOperator = new RBGColorCubeOperator
    println(RBGColorCubeOperator.getColorCode(RGBColorCube.Blue))
  }
}

object RGBColorCube extends Enumeration {
  type RGBColorCube = Value
  val Green, White, Red, Yellow, Blue, Orange = Value
}

import gkalinin.hw_06.RGBColorCube._

class RBGColorCubeOperator {
  def getColorCode(color: RGBColorCube): String = {
    color match {
      case Green  => "009b48"
      case White  => "ffffff"
      case Red    => "b71234"
      case Yellow => "ffd500"
      case Blue   => "0046ad"
      case Orange => "ff5800"
    }
  }
}
