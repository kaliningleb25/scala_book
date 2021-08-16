package gkalinin.hw_03

import java.awt.datatransfer._

/**
 * Import java.awt.datatransfer._ and make an object of type SystemFlavorMap with the call
 *
 * Then call the getNativesForFlavor method with parameter DataFlavor.imageFlavor
 * and get the return value as a Scala buffer. (Why this obscure class? It’s hard to find uses
 * of java.util.List in the standard Java library.)
 */
object Task11 {
  def main(args: Array[String]): Unit = {
    val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]

    flavors
      .getNativesForFlavor(DataFlavor.imageFlavor)
      .toArray
      .toBuffer
  }
}
