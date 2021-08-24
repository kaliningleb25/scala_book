package msazonov.hw_05

/***
 * 2. Write a class BankAccount with methods deposit and withdraw, and a read-only property balance.
 */
object Task02 {
    def main(args: Array[String]): Unit = {
        val User1 = new BankAccount()
        User1.deposit(5000)
        User1.withdraw(3500)
        print(User1.getBalance)
    }

}

class BankAccount(private var balance: Int = 0){
    def deposit(value: Int): Unit = {
        balance += value
    }
    def withdraw(value: Int): Unit = {
        if (value <= balance)
            balance -= value

    }
    def getBalance = balance
}
