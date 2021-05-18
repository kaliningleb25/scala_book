package gkalinin.hw_01

/**
 * Using BigInt, compute '2^1024'
 */
object Task06 {
  def main(args: Array[String]): Unit = {
    def pow(acc: Int, value: BigInt): BigInt = {
      if (acc == 1024) {
        value
      } else {
        pow(acc + 1, value * 2)
      }
    }

    val res = pow(1, 2)

    println(s"2^1024 = $res")
  }
}
