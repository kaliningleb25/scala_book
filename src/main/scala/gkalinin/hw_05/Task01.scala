package gkalinin.hw_05

/**
 * Improve the Counter class in Section 5.1,
 * “Simple Classes and Parameterless Methods,” on page 55 so that it doesn’t turn negative at Int.MaxValue.
 */
object Task01 {
  def main(args: Array[String]): Unit = {
    val counter = new Counter
    println(counter.current())
    counter.increment()
    println(counter.current())
  }
}

class Counter {
  private var value = Int.MaxValue
  def increment() {
    if (value < Int.MaxValue) {
      value += 1
    } else {
      throw new RuntimeException("The value has reached the limit of Int")
    }
  }
  def current(): Int = value
}
