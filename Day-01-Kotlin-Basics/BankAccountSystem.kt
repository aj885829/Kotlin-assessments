class BankAccount(
    val accountNumber: String,
    val accountHolder: String,
    private var balance: Double
) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("$amount deposited successfully.")
        } else {
            println("Invalid amount.")
        }
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            println("$amount withdrawn successfully.")
        } else {
            println("Insufficient balance.")
        }
    }

    fun checkBalance() {
        println("Current Balance: $balance")
    }

    fun accountDetails() {
        println("Account Number : $accountNumber")
        println("Account Holder : $accountHolder")
        println("Balance : ₹$balance")
    }
}


fun main() {

    val account1 = BankAccount(
        "12345",
        "Ram",
        5000.0
    )

    account1.accountDetails()

    println()

    account1.deposit(2500.0)

    account1.withdraw(3000.0)

    account1.checkBalance()
}
