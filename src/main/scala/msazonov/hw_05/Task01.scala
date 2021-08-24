package msazonov.hw_05

/***
 * 1. Improve the Counter class in Section 5.1, “Simple Classes and Parameterless Methods,”
 * on page 55 so that it doesn’t turn negative at Int.MaxValue.
 */
object Task01 {
    def main(args: Array[String]): Unit = {
        val myCounter = new Counter
        myCounter.increment()
        println(myCounter.current)

    }
}

class Counter {
    private var value = 0
    def increment() {
        if (value + 1 <= Int.MaxValue)
            value += 1
    }
    def current() = value
}
