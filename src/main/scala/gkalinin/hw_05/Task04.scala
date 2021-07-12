package gkalinin.hw_05

/**
 * Reimplement the Time class from the preceding exercise so that the internal representation
 * is the number of minutes since midnight (between 0 and 24 × 60 – 1). Do not change the public interface.
 * That is, client code should be unaffected by your change.
 */
object Task04 {
  def main(args: Array[String]): Unit = {
    val time = new TimeNew(0, 0)
    val isBefore = time.before(new TimeNew(17, 0))

    if (isBefore) {
      println("The old time is before the new time")
    } else {
      println("The new time is before the old time")
    }
  }
}

class TimeNew(val hrs: Int, val min: Int) {
  if (hrs < 0 || hrs > 23) {
    throw new IllegalArgumentException(s"Hours should be in range from 0 to 23 but provided: $hrs")
  }
  if (min < 0 || min > 59) {
    throw new IllegalArgumentException(s"Minutes should be in range from 0 to 59 but provided: $min")
  }

  //TODO
  val minutesSinceMidnight: Int = hrs * min

  def before(other: TimeNew): Boolean = {
    minutesSinceMidnight < other.minutesSinceMidnight
  }
}