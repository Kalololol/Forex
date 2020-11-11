package logic;


public class Transaction {
    private double balance;
    private String date;

    public Transaction(double balance, String date) {
        this.balance = balance;
        this.date = date;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
