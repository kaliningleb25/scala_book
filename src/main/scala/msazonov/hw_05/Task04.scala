package msazonov.hw_05

/***
 * 4. Reimplement the Time class from the preceding exercise so that the internal representation is the number
 * of minutes since midnight (between 0 and 24 × 60 – 1). Do not change the public interface.
 * That is, client code should be unaffected by your change.
 */
object Task04 {
    def main(args: Array[String]): Unit = {
        val time1 = new Time(4, 30)
        val time2 = new Time(3, 30)
        print(time1.before(time2))
    }

    class Time(val hrs: Int = 0, val min: Int = 0) {
        if (hrs < 0 || hrs > 23) throw new IllegalArgumentException("Hours must be between 0 and 23")
        if (min < 0 || min > 59) throw new IllegalArgumentException("Minutes must be between 0 and 59")
        private val mins = hrs * 60 + min

        def before(other: Time): Boolean = {
            mins < other.mins
        }
    }
}


