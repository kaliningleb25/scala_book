package arudkovskaia.hw_05

class Counter {
  private var value = 0

  def increment() {
    if (value < Int.MaxValue) value += 1
  }

  def current = value
}

object Task01 {
  def main(args: Array[String]): Unit = {
    val myCounter = new Counter
    myCounter.increment()
    println(myCounter.current)
  }

}
