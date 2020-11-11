package logic;


import java.util.Scanner;

public class Report {

    private Scanner sc = new Scanner(System.in);
     int numberReport = 1;
     int transactionNumber = 0;
    Transaction[] transactions = new Transaction[10000];

    public Report() {
    }

    void newReport() {
        System.out.println("Raport " + numberReport);
        boolean end = true;
        boolean end1 = true;
        do {
            DataReader dataReader = new DataReader();
            transactions[transactionNumber] = dataReader.readAndCreatePosition();
            transactionNumber++;
//            String yesNo;
//           do {
//               System.out.println("Dodać kolejną transakcje?");
//               System.out.println("1 - TAK || 2 - NIE");
//               yesNo = sc.next();
//               if (yesNo == "2") {
//                   end = false;
//                   end1 = false;
//               }
//               else if (yesNo != "1") System.out.println("Podaj poprawną opcje");
//
//           }while (!end1);
//
//        } while (end);

//            problem z zaimplementowaniem warunku czy dodac kolejna transakcje
        numberReport++;
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        for (OptionYesNo optionYesNo : OptionYesNo.values()) {
            System.out.println(optionYesNo);
        }
    }
}



