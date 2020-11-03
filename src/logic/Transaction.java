package logic;


import java.util.Date;
import java.util.Scanner;

public class Transaction {
    private double balance;
    private String date;

    public Transaction (){
        setDate();
        setBalance();

    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public String toString() {
        return "Transaction{" +
                "balance=" + balance +
                ", date='" + date + '\'' +
                '}';
    }

    public String getDate() {
        return date;
    }

    public void setDate() {
        System.out.println("Data: (w formacie dd.mm): ");
        date = scanner.nextLine();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance() {
        System.out.println("Wartość: ");
        balance = scanner.nextDouble();
        scanner.nextLine();
    }

}
