/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kik;

/**
 *
 * @author fro
 *
 */
public class PCSerwer {

    public static int punkty[] = new int[8];
    public static int r[][] = new int [8][3];
    public static int x;
    public static int y;

    public static void walidacja(String klasa) {
        // reset punktow
        for (int i = 0; i < 8; i++) {
            punkty[i] = 0;
        }

        //rozwiązania gry
        r[0][0] = Metody.stan[0][0]; r[0][1] = Metody.stan[0][1]; r[0][2] = Metody.stan[0][2]; // poziom 1
        r[1][0] = Metody.stan[1][0]; r[1][1] = Metody.stan[1][1]; r[1][2] = Metody.stan[1][2]; // poziom 2
        r[2][0] = Metody.stan[2][0]; r[2][1] = Metody.stan[2][1]; r[2][2] = Metody.stan[2][2]; // poziom 3
        r[3][0] = Metody.stan[0][0]; r[3][1] = Metody.stan[1][0]; r[3][2] = Metody.stan[2][0]; // pion 1
        r[4][0] = Metody.stan[0][1]; r[4][1] = Metody.stan[1][1]; r[4][2] = Metody.stan[2][1]; // pion 2
        r[5][0] = Metody.stan[0][2]; r[5][1] = Metody.stan[1][2]; r[5][2] = Metody.stan[2][2]; // pion 3
        r[6][0] = Metody.stan[0][0]; r[6][1] = Metody.stan[1][1]; r[6][2] = Metody.stan[2][2]; // skos 1
        r[7][0] = Metody.stan[0][2]; r[7][1] = Metody.stan[1][1]; r[7][2] = Metody.stan[2][0]; // skos 2

        for (int i = 0; i < 8; i++) {
            for (int k = 0; k < 3; k++) {
                if (r[i][k] == 1) punkty[i] += 10;
                if (r[i][k] == 2) punkty[i] += 1;
            }
        }
        interpretacja(klasa);
    }

    public static void interpretacja(String klasa) {
        int ruch = 0;
        for (int i = 0; i < 8; i++) {
            if (punkty[i] == 20) {
                for (int k = 0; (k < 3 && ruch == 0); k++) {
                    if (r[i][k] == 0) {
                        if (klasa.equalsIgnoreCase("brak")) {
                            Metody.wykonajRuch(i, k);
                            ruch = 1;
                            break;
                        } else {
                            x = i; y = k;
                            ruch = 1;
                            break;
                        }
                    }
                }
            } else if (punkty[i] == 2) {
                for (int k = 0; (k < 3 && ruch == 0); k++) {
                    if (r[i][k] == 0) {
                        if (klasa.equalsIgnoreCase("brak")) {
                            Metody.wykonajRuch(i, k);
                            ruch = 1;
                            break;
                        } else {
                            x = i; y = k;
                            ruch = 1;
                            break;
                        }
                    }
                }
            } 
        }
        for (int i = 0; i < 8; i++) {
            if ( (punkty[i] == 10) || (punkty[i] == 1)) {
                for (int k = 0; (k < 3 && ruch == 0); k++) {
                    if (r[i][k] == 0) {
                        if (klasa.equalsIgnoreCase("brak")) {
                            Metody.wykonajRuch(i, k);
                            ruch = 1;
                            break;
                        } else {
                            x = i; y = k;
                            ruch = 1;
                            break;
                        }
                    }
                }
            }
        }
        if (ruch == 0) {
            while (true) {
                int l1 = (int)(Math.random() * 3);
                int l2 = (int)(Math.random() * 3);
                if (Metody.stan[l1][l2] == 0) {
                    if (klasa.equalsIgnoreCase("brak")) {
                        Metody.p(l1, l2, "PCKlientPlansza", false);
                        ruch = 1;
                        break;
                    } else {
                        x = l1; y = l2;
                        ruch = 1;
                        break;
                    }
                }
            }
        }
        if (klasa.equalsIgnoreCase("PCKlientPlansza") || klasa.equalsIgnoreCase("KlientPlansza") || klasa.equalsIgnoreCase("SerwerPlansza")) {
            podpowiedz(klasa);
        }
    }

    public static void podpowiedz(String klasa) {
        if (klasa.equalsIgnoreCase("PCKlientPlansza")) {
            Metody.podpowiedz(x, y, klasa);
        }
        if (klasa.equalsIgnoreCase("KlientPlansza")) {
            Metody.podpowiedz(x, y, klasa);
        }
        if (klasa.equalsIgnoreCase("SerwerPlansza")) {
            Metody.podpowiedz(x, y, klasa);
        }
    }
}