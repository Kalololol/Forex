package logic;


import java.util.Scanner;

class Report {

    private static final int MAX_TRANSACTION = 999;
    private Transaction[] transaction = new Transaction[MAX_TRANSACTION];
    private static final double EURO_EXCHANGE = 4,17;
    private static final double USD_EXCHANGE = 3,97;

    private int positionNumber = 1;
    private int transactionNumber = 0;
    private String reportName;

    Scanner scanner = new Scanner(System.in);


    public Report() {
        newReport();
        }

        public void newReport(){

        setReportName();
        System.out.println("Wprowadź swoje transakcje.");
        createReport();
    }

    void createReport(){

        boolean add = true;

        do {
            System.out.println("Transakcja nr " + positionNumber);
            transaction[transactionNumber] = new Transaction();
            transactionNumber++;
            positionNumber++;
            System.out.println("1 - Zakończ raport");
            System.out.println("2 - Dodaj kolejną pozycje");
            int nextPosition = scanner.nextInt();
            scanner.nextLine();
            if(nextPosition == 1) add = false;
        }while (add);

        System.out.println("Raport " + getReportName());

        for (int i = 0; i < transactionNumber; i++) {
            System.out.println(transaction[i]);
            System.out.println();
        }

//        File file = new File(getReportName());
//        boolean fileExists = file.exists();
//        if (!fileExists) {
//            try {
//                fileExists = file.createNewFile();
//            } catch (IOException e) {
//                System.out.println("Nie udało się utworzyć pliku");
//            }
//        }
//
//        if (fileExists)
//            System.out.println("Plik " + getReportName() + " istnieje lub został utworzony");
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName() {
        System.out.println("Wprowadź nazwę raportu: ");
        reportName = scanner.next();
    }
}



