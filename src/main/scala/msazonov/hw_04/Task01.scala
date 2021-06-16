package msazonov.hw_04

/**
 * 1. Set up a map of prices for a number of gizmos that you covet. Then produce a second map with
the same keys and the prices at a 10 percent discount.
 */
object Task01 {
    def main(args: Array[String]): Unit = {
        val gizmos = Map("Headphones" -> 16000, "Watch"-> 15000, "Car" -> 1500000)
        val gizmos2 = for((k, v) <- gizmos) yield (k, (v/100*90))
        print(gizmos2)
    }
}
