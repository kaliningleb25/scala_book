package msazonov.hw_03

import java.awt.datatransfer._
/**
 * 11. Import java.awt.datatransfer._ and make an object of type SystemFlavorMap with the call
 */
object Task11 {
    def main(args: Array[String]): Unit = {
        val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]

        flavors.getNativesForFlavor(DataFlavor.imageFlavor).toArray.toBuffer
    }
}
