import view.MainMenu;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {
    public static  void main(String[] args) {
        MainMenu menu = new MainMenu();
        menu.setDefaultCloseOperation(EXIT_ON_CLOSE);
        menu.setVisible(true);
    }
}
