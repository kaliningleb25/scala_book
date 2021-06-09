package gkalinin.hw_04

/**
 * Set up a map of prices for a number of gizmos that you covet. Then produce a second map with
 * the same keys and the prices at a 10 percent discount.
 */
object Task01 {
  def main(args: Array[String]): Unit = {
    val gizmos = Map("item1" -> 100.0, "item2" -> 125.0)
    val gizmosWithDiscount = for ((k, v) <- gizmos) yield (k, v - v * 10/100)

    println(s"gizmos: $gizmos")
    println(s"gizmosWithDiscount: $gizmosWithDiscount")
  }
}
