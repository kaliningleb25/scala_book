package arudkovskaia.hw_04

/**
 * 1. Set up a map of prices for a number of gizmos that you covet. Then produce a second map with
 * the same keys and the prices at a 10 percent discount.
 */
object Task01 {
  def main(args: Array[String]): Unit = {
    val gizmos = Map("Sleep" -> 99990, "Sun" -> 700, "Coffee" -> 150)
    // 1
    val discountedPrices = gizmos.values.map(_ * 0.9)
    val newGizmos = gizmos.keys zip discountedPrices
    newGizmos
    // 2
    val anotherGizmos = for ((key, value) <- gizmos) yield (key, value * 0.9)
    anotherGizmos
  }
}
