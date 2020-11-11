package logic;

import java.rmi.server.RemoteObjectInvocationHandler;
import java.util.Scanner;

public class Menu {

    private DataReader dataReader = new DataReader();
    private Report Report = new Report();

    public Menu() {
        mainMenu();
    }


    void mainMenu() {
        Option option;
        do {
            printOptions();
            option = Option.createFromInt(dataReader.getInt());

            switch (option) {
                case NEW_REPORT:
                    createReport();
                    break;
                case SAFED_REPORTS:
                    System.out.println("Zapisane raporty");
                    break;
                case INFO:
                    System.out.println("Program do księgowania");
                    break;
                case EXIT:
                    System.out.println("Koniec pracy");
                    break;
                default:
                    System.out.println("Wybierz poprawną opcje");
                    break;
            }
        } while (option != Option.EXIT);
    }

    void createReport(){
            Report report = new Report();
            report.newReport();
            System.out.println();

    }
    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        for (Option option : Option.values()) {
            System.out.println(option);
        }
    }

}
