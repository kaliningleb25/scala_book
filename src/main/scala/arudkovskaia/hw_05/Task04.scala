package arudkovskaia.hw_05

class TimeMins(hours: Int, minutes: Int) {
  private val mins = hours * 60 + minutes
  def currMins = this.mins

  def before(other: TimeMins): Boolean = this.mins < other.mins
}
object Task04 {
  def main(args: Array[String]): Unit = {
    val midnight = new TimeMins(0, 0)
    val midday = new TimeMins(12, 0)
    val midnightAndHalf = new TimeMins(0, 30)

    println(midnight.before(midday))
    println(midnight.before(midnight))
    println(midnight.before(midnightAndHalf))
  }

}
