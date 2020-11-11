package logic;

import java.util.Scanner;

public class DataReader {
    private Scanner sc = new Scanner(System.in);

    public Transaction readAndCreatePosition(){
        System.out.println("Wartość: ");
        int balance = sc.nextInt();
        sc.nextLine();
        System.out.println("Data: ");
        String data = sc.nextLine();

        return new Transaction (balance, data);
    }

    public void close() {
        sc.close();
    }

    public int getInt() {
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }
}
