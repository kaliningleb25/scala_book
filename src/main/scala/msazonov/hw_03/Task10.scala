package msazonov.hw_03

/**
 * 10. Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs that are in America.
 * Strip off the "America/" prefix and sort the result.
 */
object Task10 {
    def main(args: Array[String]): Unit = {
        var a = java.util.TimeZone.getAvailableIDs().filter(_.startsWith("America/")).map(_.stripPrefix("America/")).sorted.mkString("\n")
        print(a)
    }
}
