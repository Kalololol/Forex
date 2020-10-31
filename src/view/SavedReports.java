package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SavedReports extends JFrame implements ActionListener {

    JMenuBar mMenu;
    JMenu menuFile, menuHelp;
    JMenuItem mNew, mHistory, mInfo, mExit;

    public SavedReports() {
        super("Forexowa księgowość - Nowy Raport");
        setSize(500,500);
        setLayout(null);

        topProgramBar();

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
        if(choose == mExit) {
            dispose();
        }
        if(choose == mNew){
            NewReport newReport = new NewReport();
            newReport.setDefaultCloseOperation(HIDE_ON_CLOSE);
            newReport.setVisible(true);
        }
        if (choose == mHistory ) {
            SavedReports savedReports = new SavedReports();
            savedReports.setDefaultCloseOperation(HIDE_ON_CLOSE);
            savedReports.setVisible(true);
        }

        if (choose == mInfo) {
            AboutProgram aboutProgram = new AboutProgram();
            aboutProgram.setDefaultCloseOperation(HIDE_ON_CLOSE);
            aboutProgram.setVisible(true);
        }
    }

}
