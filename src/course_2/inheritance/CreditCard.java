package course_2.inheritance;

// Base class
class CreditCard {
    protected String cardNumber;
    protected double balance;

    public CreditCard(String cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public void makePayment(double amount) {
        if (amount > 0) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}