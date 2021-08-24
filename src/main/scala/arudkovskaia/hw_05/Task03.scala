package arudkovskaia.hw_05

class Time(hours: Int, minutes: Int) {
  private val hrs = hours
  private val min = minutes

  def currHrs = hrs
  def currMin = min

  def before(other: Time): Boolean = {
    if (hrs < other.hrs)
      true
    else if (hrs == other.hrs)
      min < other.min
    else
      false
  }
}

object Task03 {
  def main(args: Array[String]): Unit = {
    val midnight = new Time(0, 0)
    val midday = new Time(12, 0)
    val midnightAndHalf = new Time(0, 30)

    println(midnight.before(midday))
    println(midnight.before(midnight))
    println(midnight.before(midnightAndHalf))
  }
}
