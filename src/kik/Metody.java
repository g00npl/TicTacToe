/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kik;

/**
 *
 * @author fro
 */
public class Metody {
    public static short[][] stan = new short[3][3];
    public static boolean MaxRuch;
    public static String pole[][] = {
        {"p1","p2","p3"},
        {"p4","p5","p6"},
        {"p7","p8","p9"},
    };

    public static void reset() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                stan[i][j] = 0;
            }
        }
    }

    public static void p(int x, int y, String klasa, boolean wyslij) {
        String XO;
        if (MaxRuch) {
            stan[x][y] = 1;
            XO = "X";
        } else {
            stan[x][y] = 2;
            XO = "O";
        }
        MaxRuch = !MaxRuch;
        if (klasa.equalsIgnoreCase("PCKlientPlansza")) {
            if (x == 0 && y == 0) { PCKlientPlansza.p1.setEnabled(false); PCKlientPlansza.p1.setText(XO); }
            if (x == 0 && y == 1) { PCKlientPlansza.p2.setEnabled(false); PCKlientPlansza.p2.setText(XO); }
            if (x == 0 && y == 2) { PCKlientPlansza.p3.setEnabled(false); PCKlientPlansza.p3.setText(XO); }
            if (x == 1 && y == 0) { PCKlientPlansza.p4.setEnabled(false); PCKlientPlansza.p4.setText(XO); }
            if (x == 1 && y == 1) { PCKlientPlansza.p5.setEnabled(false); PCKlientPlansza.p5.setText(XO); }
            if (x == 1 && y == 2) { PCKlientPlansza.p6.setEnabled(false); PCKlientPlansza.p6.setText(XO); }
            if (x == 2 && y == 0) { PCKlientPlansza.p7.setEnabled(false); PCKlientPlansza.p7.setText(XO); }
            if (x == 2 && y == 1) { PCKlientPlansza.p8.setEnabled(false); PCKlientPlansza.p8.setText(XO); }
            if (x == 2 && y == 2) { PCKlientPlansza.p9.setEnabled(false); PCKlientPlansza.p9.setText(XO); }
            PCKlientPlansza.podpowiedz.setText("");
            PCKlientPlansza.czyWygrana();
        } else if (klasa.equalsIgnoreCase("KlientPlansza")) {
            if (x == 0 && y == 0) { KlientPlansza.p1.setEnabled(false); KlientPlansza.p1.setText(XO); }
            if (x == 0 && y == 1) { KlientPlansza.p2.setEnabled(false); KlientPlansza.p2.setText(XO); }
            if (x == 0 && y == 2) { KlientPlansza.p3.setEnabled(false); KlientPlansza.p3.setText(XO); }
            if (x == 1 && y == 0) { KlientPlansza.p4.setEnabled(false); KlientPlansza.p4.setText(XO); }
            if (x == 1 && y == 1) { KlientPlansza.p5.setEnabled(false); KlientPlansza.p5.setText(XO); }
            if (x == 1 && y == 2) { KlientPlansza.p6.setEnabled(false); KlientPlansza.p6.setText(XO); }
            if (x == 2 && y == 0) { KlientPlansza.p7.setEnabled(false); KlientPlansza.p7.setText(XO); }
            if (x == 2 && y == 1) { KlientPlansza.p8.setEnabled(false); KlientPlansza.p8.setText(XO); }
            if (x == 2 && y == 2) { KlientPlansza.p9.setEnabled(false); KlientPlansza.p9.setText(XO); }
            if (wyslij == true) KlientPlansza.wyslijPole(pole[x][y]);
            KlientPlansza.podpowiedz.setText("");
            KlientPlansza.czyWygrana();
        } else if (klasa.equalsIgnoreCase("SerwerPlansza")) {
            if (x == 0 && y == 0) { SerwerPlansza.p1.setEnabled(false); SerwerPlansza.p1.setText(XO); }
            if (x == 0 && y == 1) { SerwerPlansza.p2.setEnabled(false); SerwerPlansza.p2.setText(XO); }
            if (x == 0 && y == 2) { SerwerPlansza.p3.setEnabled(false); SerwerPlansza.p3.setText(XO); }
            if (x == 1 && y == 0) { SerwerPlansza.p4.setEnabled(false); SerwerPlansza.p4.setText(XO); }
            if (x == 1 && y == 1) { SerwerPlansza.p5.setEnabled(false); SerwerPlansza.p5.setText(XO); }
            if (x == 1 && y == 2) { SerwerPlansza.p6.setEnabled(false); SerwerPlansza.p6.setText(XO); }
            if (x == 2 && y == 0) { SerwerPlansza.p7.setEnabled(false); SerwerPlansza.p7.setText(XO); }
            if (x == 2 && y == 1) { SerwerPlansza.p8.setEnabled(false); SerwerPlansza.p8.setText(XO); }
            if (x == 2 && y == 2) { SerwerPlansza.p9.setEnabled(false); SerwerPlansza.p9.setText(XO); }
            if (wyslij == true) SerwerPlansza.wyslijPole(pole[x][y]);
            SerwerPlansza.podpowiedz.setText("");
            SerwerPlansza.czyWygrana();
        }
        
        
    }

    public static void podpowiedz(int x, int y, String klasa) {
        if (klasa.equalsIgnoreCase("PCKlientPlansza")) {
            if ( (x == 0 && y == 0) || (x == 3 && y == 0) || (x == 6 && y == 0) ) PCKlientPlansza.podpowiedz.setText(pole[0][0]);
            if ( (x == 0 && y == 1) || (x == 4 && y == 0) ) PCKlientPlansza.podpowiedz.setText(pole[0][1]);
            if ( (x == 0 && y == 2) || (x == 5 && y == 0) || (x == 7 && y == 0) ) PCKlientPlansza.podpowiedz.setText(pole[0][2]);
            if ( (x == 1 && y == 0) || (x == 3 && y == 1) ) PCKlientPlansza.podpowiedz.setText(pole[1][0]);
            if ( (x == 1 && y == 1) || (x == 4 && y == 1) || (x == 6 && y == 1) || (x == 7 && y == 1)) PCKlientPlansza.podpowiedz.setText(pole[1][1]);
            if ( (x == 1 && y == 2) || (x == 5 && y == 1) ) PCKlientPlansza.podpowiedz.setText(pole[1][2]);
            if ( (x == 2 && y == 0) || (x == 3 && y == 2) || (x == 7 && y == 2) ) PCKlientPlansza.podpowiedz.setText(pole[2][0]);
            if ( (x == 2 && y == 1) || (x == 4 && y == 2) ) PCKlientPlansza.podpowiedz.setText(pole[2][1]);
            if ( (x == 2 && y == 2) || (x == 5 && y == 2) || (x == 6 && y == 2) ) PCKlientPlansza.podpowiedz.setText(pole[2][2]);
        } else if (klasa.equalsIgnoreCase("KlientPlansza")) {
            if ( (x == 0 && y == 0) || (x == 3 && y == 0) || (x == 6 && y == 0) ) KlientPlansza.podpowiedz.setText(pole[0][0]);
            if ( (x == 0 && y == 1) || (x == 4 && y == 0) ) KlientPlansza.podpowiedz.setText(pole[0][1]);
            if ( (x == 0 && y == 2) || (x == 5 && y == 0) || (x == 7 && y == 0) ) KlientPlansza.podpowiedz.setText(pole[0][2]);
            if ( (x == 1 && y == 0) || (x == 3 && y == 1) ) KlientPlansza.podpowiedz.setText(pole[1][0]);
            if ( (x == 1 && y == 1) || (x == 4 && y == 1) || (x == 6 && y == 1) || (x == 7 && y == 1)) KlientPlansza.podpowiedz.setText(pole[1][1]);
            if ( (x == 1 && y == 2) || (x == 5 && y == 1) ) KlientPlansza.podpowiedz.setText(pole[1][2]);
            if ( (x == 2 && y == 0) || (x == 3 && y == 2) || (x == 7 && y == 2) ) KlientPlansza.podpowiedz.setText(pole[2][0]);
            if ( (x == 2 && y == 1) || (x == 4 && y == 2) ) KlientPlansza.podpowiedz.setText(pole[2][1]);
            if ( (x == 2 && y == 2) || (x == 5 && y == 2) || (x == 6 && y == 2) ) KlientPlansza.podpowiedz.setText(pole[2][2]);
        } else if (klasa.equalsIgnoreCase("SerwerPlansza")) {
            if ( (x == 0 && y == 0) || (x == 3 && y == 0) || (x == 6 && y == 0) ) SerwerPlansza.podpowiedz.setText(pole[0][0]);
            if ( (x == 0 && y == 1) || (x == 4 && y == 0) ) SerwerPlansza.podpowiedz.setText(pole[0][1]);
            if ( (x == 0 && y == 2) || (x == 5 && y == 0) || (x == 7 && y == 0) ) SerwerPlansza.podpowiedz.setText(pole[0][2]);
            if ( (x == 1 && y == 0) || (x == 3 && y == 1) ) SerwerPlansza.podpowiedz.setText(pole[1][0]);
            if ( (x == 1 && y == 1) || (x == 4 && y == 1) || (x == 6 && y == 1) || (x == 7 && y == 1)) SerwerPlansza.podpowiedz.setText(pole[1][1]);
            if ( (x == 1 && y == 2) || (x == 5 && y == 1) ) SerwerPlansza.podpowiedz.setText(pole[1][2]);
            if ( (x == 2 && y == 0) || (x == 3 && y == 2) || (x == 7 && y == 2) ) SerwerPlansza.podpowiedz.setText(pole[2][0]);
            if ( (x == 2 && y == 1) || (x == 4 && y == 2) ) SerwerPlansza.podpowiedz.setText(pole[2][1]);
            if ( (x == 2 && y == 2) || (x == 5 && y == 2) || (x == 6 && y == 2) ) SerwerPlansza.podpowiedz.setText(pole[2][2]);
        }
    }

    public static void wykonajRuch(int x, int y) {
        if ( (x == 0 && y == 0) || (x == 3 && y == 0) || (x == 6 && y == 0) ) p(0, 0, "PCKlientPlansza", false);
        if ( (x == 0 && y == 1) || (x == 4 && y == 0) ) p(0, 1, "PCKlientPlansza", false);
        if ( (x == 0 && y == 2) || (x == 5 && y == 0) || (x == 7 && y == 0) ) p(0, 2, "PCKlientPlansza", false);
        if ( (x == 1 && y == 0) || (x == 3 && y == 1) ) p(1, 0, "PCKlientPlansza", false);
        if ( (x == 1 && y == 1) || (x == 4 && y == 1) || (x == 6 && y == 1) || (x == 7 && y == 1)) p(1, 1, "PCKlientPlansza", false);
        if ( (x == 1 && y == 2) || (x == 5 && y == 1) ) p(1, 2, "PCKlientPlansza", false);
        if ( (x == 2 && y == 0) || (x == 3 && y == 2) || (x == 7 && y == 2) ) p(2, 0, "PCKlientPlansza", false);
        if ( (x == 2 && y == 1) || (x == 4 && y == 2) ) p(2, 1, "PCKlientPlansza", false);
        if ( (x == 2 && y == 2) || (x == 5 && y == 2) || (x == 6 && y == 2) ) p(2, 2, "PCKlientPlansza", false);
    }

    public static void about() {
        Dialogi.info("PJ Tic Tac Toe\nŁukasz Czerepuk & Maciej Rzepiński\nWersja: 1.0 Beta\n2010 @ PJWSTK", "About");
    }

    public static short sprawdzWygrana() {
        short ruch = 0;
        // poziomy:
        for (int y = 0; y < 3; y++) {
            if (stan[0][y] == 1 && stan[1][y] == 1 && stan[2][y] == 1) {
                ruch = 1;
            } else if (stan[0][y] == 2 && stan[1][y] == 2 && stan[2][y] == 2) {
                ruch = 2;
            }
        }
        // piony:
        for (int x = 0; x < 3; x++) {
            if (stan[x][0] == 1 && stan[x][1] == 1 && stan[x][2] == 1) {
                ruch = 1;
            } else if (stan[x][0] == 2 && stan[x][1] == 2 && stan[x][2] == 2) {
                ruch = 2;
            }
        }

        // skosy:
        if (stan[0][0] == 1 && stan[1][1] == 1 && stan[2][2] == 1) {
            ruch = 1;
        } else if (stan[0][0] == 2 && stan[1][1] == 2 && stan[2][2] == 2) {
            ruch = 2;
        } else if (stan[0][2] == 1 && stan[1][1] == 1 && stan[2][0] == 1) {
            ruch = 1;
        } else if (stan[0][2] == 2 && stan[1][1] == 2 && stan[2][0] == 2) {
            ruch = 2;
        }

        // remis?
        if (ruch == 0) {
            boolean remis = true;
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    if (stan[x][y] == 0) {
                        remis = false;
                        break;
                    }
                }
            }
            if (remis) {
                ruch = -1;
            }
        }
        return ruch;
    }
}
