package msazonov.hw_05

/***
 * 3. Write a class Time with read-only properties hours and minutes and a method before(other: Time):
 * Boolean that checks whether this time comes before the other. A Time object should be constructed as new
 * Time(hrs, min), where hrs is in military time format (between 0 and 23).
 */
object Task03 {
    def main(args: Array[String]): Unit = {
        val time1 = new Time(15, 49)
        val time2 = new Time(15, 39)
        print(time1.before(time2))
    }

    class Time(val hrs: Int = 0, val min: Int = 0){
        if (hrs < 0 || hrs > 23) throw new IllegalArgumentException("Hours must be between 0 and 23")
        if (min < 0 || min > 59) throw new IllegalArgumentException("Minutes must be between 0 and 59")

        def before(other: Time): Boolean = {
            (hrs < other.hrs) || (hrs == other.hrs && min < other.min)
        }
    }
}


