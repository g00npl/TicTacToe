package kik;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dialogi {
    static public void info(String komunikat, String tytul) {
        JOptionPane.showMessageDialog(new JFrame(), komunikat, tytul, JOptionPane.INFORMATION_MESSAGE);
    }
    
    static public void error(String komunikat, String tytul) {
        JOptionPane.showMessageDialog(new JFrame(), komunikat, tytul, JOptionPane.ERROR_MESSAGE);
    }
    
    static public boolean pytanie (String pytanie, String tytul) {
        Object[] options = {"Tak", "Nie"};
            int decyzja = JOptionPane.showOptionDialog(new JFrame(), pytanie, tytul,
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
            if (decyzja == 0) return true;
            else return false;
    }
}
