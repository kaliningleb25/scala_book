package arudkovskaia.hw_05

class BankAccount {
  private var balance = 0

  def deposit(amount: Int): Unit = {
    balance += amount
  }

  def withdraw(amount: Int): Unit = {
    if (balance >= amount) {
      balance -= amount
    } else {
      throw new IllegalArgumentException("There is not enough money!")
    }
  }

  def getBalance = balance
}

object Task02 {
  def main(args: Array[String]): Unit = {
    val myAcc = new BankAccount
    myAcc.deposit(500)
    println(myAcc.getBalance)

    myAcc.withdraw(100)
    println(myAcc.getBalance)
  }
}
