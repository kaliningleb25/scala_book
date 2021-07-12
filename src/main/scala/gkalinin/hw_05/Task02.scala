package gkalinin.hw_05

/**
 * Write a class BankAccount with methods deposit and withdraw, and a read-only property balance.
 */
object Task02 {
  def main(args: Array[String]): Unit = {
    val acc = new BankAccount

    println(acc.getBalance)
    acc.deposit(100)
    println(acc.getBalance)
    acc.withdraw(25)
    println(acc.getBalance)
  }
}

class BankAccount {
  private var balance: Int = 0

  def deposit(amount: Int) = {
    balance += amount
  }

  def withdraw(amount: Int) = {
    balance -= amount
  }

  def getBalance: Int = balance
}
