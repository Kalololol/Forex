package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame implements ActionListener {

    JLabel lPowitanie, lOpisMenu, lInfo;
    JButton bNew, bHistory, bInfo, bExit;
    JMenuBar mMenu;
    JMenu menuFile, menuHelp;
    JMenuItem mNew, mHistory, mInfo, mExit;

    public MainMenu(){
        super("Forexowa księgowość");
        setSize(500,500);
        setLayout(null);

        label();
        button();
        topProgramBar();

    }

    void label(){
        lPowitanie = new JLabel("Program wyliczający bilans zysków strat na Forexie");
        lPowitanie.setBounds(50, 10, 400, 30 );
        lPowitanie.setFont(new Font("Powitanie", Font.BOLD, 15));
        add(lPowitanie);

        lOpisMenu = new JLabel("Wybierz działanie docelowe: ");
        lOpisMenu.setBounds(120, 50, 250, 30);
        lOpisMenu.setFont(new Font("Opis menu", Font.BOLD, 15));
        add(lOpisMenu);

        lInfo = new JLabel("Wersja 1.0.0v");
        lInfo.setBounds(210,214,150,20);
        lInfo.setFont(new Font("wersja", Font.BOLD,9));
        add(lInfo);
    }

    void button(){
        bNew = new JButton("Nowy raport");
        bNew.setBounds(150, 90, 180, 30);
        add(bNew);
        bNew.addActionListener(this);

        bHistory = new JButton("Zapisane raporty");
        bHistory.setBounds(150,121,180,30);
        add(bHistory);
        bHistory.addActionListener(this);

        bInfo = new JButton("Informacje o programie");
        bInfo.setBounds(150,152,180,30);
        add(bInfo);
        bHistory.addActionListener(this);

        bExit = new JButton("Wyjście");
        bExit.setBounds(150,183,180,30);
        add(bExit);
        bExit.addActionListener(this);
    }

    void topProgramBar() {
        mMenu = new JMenuBar();
        menuFile = new JMenu("Plik");
        menuHelp = new JMenu("Pomoc");

        setJMenuBar(mMenu);
        mMenu.add(menuFile);
        mMenu.add(menuHelp);

        mNew = new JMenuItem("Nowy raport");
        mNew.addActionListener(this);
        mHistory = new JMenuItem("Historia");
        mHistory.addActionListener(this);
        mInfo = new JMenuItem("Informacje o programie");
        mInfo.addActionListener(this);
        mExit = new JMenuItem("Wyjście z programu");
        mExit.addActionListener(this);

        menuFile.add(mNew);
        menuFile.add(mHistory);
        menuFile.add(mExit);
        menuHelp.add(mInfo);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        Object choose = e.getSource();
        if(choose == bExit || choose == mExit) {
            dispose();
        }
        if(choose == bNew || choose == mNew){
            NewReport newReport = new NewReport();
            newReport.setDefaultCloseOperation(HIDE_ON_CLOSE);
            newReport.setVisible(true);
        }
        if (choose == mHistory || choose == bHistory) {
            SavedReports savedReports = new SavedReports();
            savedReports.setDefaultCloseOperation(HIDE_ON_CLOSE);
            savedReports.setVisible(true);
        }

        if (choose == mInfo || choose == bInfo) {
            AboutProgram aboutProgram = new AboutProgram();
            aboutProgram.setDefaultCloseOperation(HIDE_ON_CLOSE);
            aboutProgram.setVisible(true);
        }

    }
}