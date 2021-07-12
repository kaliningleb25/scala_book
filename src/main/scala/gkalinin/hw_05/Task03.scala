package gkalinin.hw_05

/**
 * Write a class Time with read-only properties hours and minutes and
 * a method before(other: Time): Boolean that checks whether this time comes before the other.
 * A Time object should be constructed as new Time(hrs, min), where hrs is in military time format (between 0 and 23).
 */
object Task03 {
  def main(args: Array[String]): Unit = {
    val time = new Time(0, 0)
    val isBefore = time.before(new Time(17, 0))

    if (isBefore) {
      println("The old time is before the new time")
    } else {
      println("The new time is before the old time")
    }
  }
}

class Time(val hrs: Int, val min: Int) {
  if (hrs < 0 || hrs > 23) {
    throw new IllegalArgumentException(s"Hours should be in range from 0 to 23 but provided: $hrs")
  }
  if (min < 0 || min > 59) {
    throw new IllegalArgumentException(s"Minutes should be in range from 0 to 59 but provided: $min")
  }

  def before(other: Time): Boolean = {
    if (hrs < other.hrs) {
      true
    } else if (hrs == other.hrs) {
      min < other.min
    } else {
      false
    }
  }
}
