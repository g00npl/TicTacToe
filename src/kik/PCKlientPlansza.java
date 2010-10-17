package kik;

import java.awt.Toolkit;

public class PCKlientPlansza extends javax.swing.JFrame {    
    static String nickGracza;
    static int GraNr = 0;
    static String nr = new String();
    static int wynikG = 0;
    static int wynikP = 0;
    static String wGracz = new String();
    static String wPrzeciwnik = new String();
    static int zmRuch;
    static int timestart;

    public PCKlientPlansza(String nickSerwer) {
        nickGracza = nickSerwer;
        initComponents();
        NICKGracz.setText(nickGracza);
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setBounds(width / 2 - 133, height / 2 - 225, 266, 450);
        this.setVisible(true);
        startGry();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Plansza = new javax.swing.JPanel();
        p1 = new javax.swing.JButton();
        p2 = new javax.swing.JButton();
        p3 = new javax.swing.JButton();
        p4 = new javax.swing.JButton();
        p5 = new javax.swing.JButton();
        p6 = new javax.swing.JButton();
        p7 = new javax.swing.JButton();
        p8 = new javax.swing.JButton();
        p9 = new javax.swing.JButton();
        Podpowiedz = new javax.swing.JButton();
        podpowiedz = new javax.swing.JLabel();
        Wyniki = new javax.swing.JPanel();
        GraNumer = new javax.swing.JLabel();
        nrGry = new javax.swing.JLabel();
        wynikGracz = new javax.swing.JLabel();
        separator = new javax.swing.JLabel();
        wynikPrzeciwnik = new javax.swing.JLabel();
        NICKGracz = new javax.swing.JLabel();
        NICKPrzeciwnik = new javax.swing.JLabel();
        KtoGra = new javax.swing.JPanel();
        TwojMoj = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        Gra = new javax.swing.JMenu();
        NowaGra = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        Zakoncz = new javax.swing.JMenuItem();
        Informacje = new javax.swing.JMenu();
        About = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PJ Tic Tac Toe");
        setLocationByPlatform(true);
        setResizable(false);

        p1.setBackground(new java.awt.Color(240, 240, 240));
        p1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        p1.setText("X");
        p1.setMaximumSize(new java.awt.Dimension(74, 74));
        p1.setMinimumSize(new java.awt.Dimension(74, 74));
        p1.setPreferredSize(new java.awt.Dimension(74, 74));
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1Wyslij(evt);
            }
        });

        p2.setBackground(new java.awt.Color(240, 240, 240));
        p2.setFont(new java.awt.Font("Verdana", 1, 18));
        p2.setText("X");
        p2.setMaximumSize(new java.awt.Dimension(74, 74));
        p2.setMinimumSize(new java.awt.Dimension(74, 74));
        p2.setPreferredSize(new java.awt.Dimension(74, 74));
        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2Wyslij(evt);
            }
        });

        p3.setBackground(new java.awt.Color(240, 240, 240));
        p3.setFont(new java.awt.Font("Verdana", 1, 18));
        p3.setText("X");
        p3.setMaximumSize(new java.awt.Dimension(74, 74));
        p3.setMinimumSize(new java.awt.Dimension(74, 74));
        p3.setPreferredSize(new java.awt.Dimension(74, 74));
        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3Wyslij(evt);
            }
        });

        p4.setBackground(new java.awt.Color(240, 240, 240));
        p4.setFont(new java.awt.Font("Verdana", 1, 18));
        p4.setText("X");
        p4.setMaximumSize(new java.awt.Dimension(74, 74));
        p4.setMinimumSize(new java.awt.Dimension(74, 74));
        p4.setPreferredSize(new java.awt.Dimension(74, 74));
        p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4Wyslij(evt);
            }
        });

        p5.setBackground(new java.awt.Color(240, 240, 240));
        p5.setFont(new java.awt.Font("Verdana", 1, 18));
        p5.setText("X");
        p5.setMaximumSize(new java.awt.Dimension(74, 74));
        p5.setMinimumSize(new java.awt.Dimension(74, 74));
        p5.setPreferredSize(new java.awt.Dimension(74, 74));
        p5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5Wyslij(evt);
            }
        });

        p6.setBackground(new java.awt.Color(240, 240, 240));
        p6.setFont(new java.awt.Font("Verdana", 1, 18));
        p6.setText("X");
        p6.setMaximumSize(new java.awt.Dimension(74, 74));
        p6.setMinimumSize(new java.awt.Dimension(74, 74));
        p6.setPreferredSize(new java.awt.Dimension(74, 74));
        p6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6Wyslij(evt);
            }
        });

        p7.setBackground(new java.awt.Color(240, 240, 240));
        p7.setFont(new java.awt.Font("Verdana", 1, 18));
        p7.setText("X");
        p7.setMaximumSize(new java.awt.Dimension(74, 74));
        p7.setMinimumSize(new java.awt.Dimension(74, 74));
        p7.setPreferredSize(new java.awt.Dimension(74, 74));
        p7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p7Wyslij(evt);
            }
        });

        p8.setBackground(new java.awt.Color(240, 240, 240));
        p8.setFont(new java.awt.Font("Verdana", 1, 18));
        p8.setText("X");
        p8.setMaximumSize(new java.awt.Dimension(74, 74));
        p8.setMinimumSize(new java.awt.Dimension(74, 74));
        p8.setPreferredSize(new java.awt.Dimension(74, 74));
        p8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p8Wyslij(evt);
            }
        });

        p9.setBackground(new java.awt.Color(240, 240, 240));
        p9.setFont(new java.awt.Font("Verdana", 1, 18));
        p9.setText("X");
        p9.setMaximumSize(new java.awt.Dimension(74, 74));
        p9.setMinimumSize(new java.awt.Dimension(74, 74));
        p9.setPreferredSize(new java.awt.Dimension(74, 74));
        p9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p9Wyslij(evt);
            }
        });

        Podpowiedz.setFont(new java.awt.Font("Verdana", 0, 13));
        Podpowiedz.setText("Podpowiedź");
        Podpowiedz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aPodpowiedz(evt);
            }
        });

        podpowiedz.setFont(new java.awt.Font("Verdana", 1, 11));
        podpowiedz.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout PlanszaLayout = new javax.swing.GroupLayout(Plansza);
        Plansza.setLayout(PlanszaLayout);
        PlanszaLayout.setHorizontalGroup(
            PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanszaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PlanszaLayout.createSequentialGroup()
                        .addGroup(PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(p7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(p1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p5, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)))
                    .addGroup(PlanszaLayout.createSequentialGroup()
                        .addComponent(podpowiedz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Podpowiedz)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        PlanszaLayout.setVerticalGroup(
            PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanszaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlanszaLayout.createSequentialGroup()
                        .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p6, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                    .addGroup(PlanszaLayout.createSequentialGroup()
                        .addGroup(PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p5, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p8, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Podpowiedz)
                    .addComponent(podpowiedz))
                .addContainerGap())
        );

        GraNumer.setFont(new java.awt.Font("Verdana", 0, 11));
        GraNumer.setText("Gra Numer:");

        nrGry.setFont(new java.awt.Font("Verdana", 1, 12));
        nrGry.setForeground(new java.awt.Color(0, 102, 204));
        nrGry.setText("0");

        wynikGracz.setFont(new java.awt.Font("Verdana", 1, 12));
        wynikGracz.setForeground(new java.awt.Color(0, 153, 0));
        wynikGracz.setText("0");

        separator.setFont(new java.awt.Font("Verdana", 0, 13));
        separator.setText("||");

        wynikPrzeciwnik.setFont(new java.awt.Font("Verdana", 1, 12));
        wynikPrzeciwnik.setForeground(new java.awt.Color(204, 0, 0));
        wynikPrzeciwnik.setText("0");

        NICKGracz.setFont(new java.awt.Font("Verdana", 0, 13));

        NICKPrzeciwnik.setFont(new java.awt.Font("Verdana", 0, 13));
        NICKPrzeciwnik.setText("Komputer");

        javax.swing.GroupLayout WynikiLayout = new javax.swing.GroupLayout(Wyniki);
        Wyniki.setLayout(WynikiLayout);
        WynikiLayout.setHorizontalGroup(
            WynikiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WynikiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(WynikiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WynikiLayout.createSequentialGroup()
                        .addComponent(GraNumer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nrGry, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(WynikiLayout.createSequentialGroup()
                        .addComponent(NICKGracz)
                        .addGap(9, 9, 9)
                        .addComponent(wynikGracz)
                        .addGap(18, 18, 18)
                        .addComponent(separator)
                        .addGap(18, 18, 18)
                        .addComponent(wynikPrzeciwnik)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NICKPrzeciwnik)))
                .addGap(101, 101, 101))
        );
        WynikiLayout.setVerticalGroup(
            WynikiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WynikiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(WynikiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GraNumer)
                    .addComponent(nrGry))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WynikiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wynikGracz)
                    .addComponent(NICKGracz)
                    .addComponent(separator)
                    .addComponent(wynikPrzeciwnik)
                    .addComponent(NICKPrzeciwnik))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TwojMoj.setFont(new java.awt.Font("Verdana", 1, 12));

        javax.swing.GroupLayout KtoGraLayout = new javax.swing.GroupLayout(KtoGra);
        KtoGra.setLayout(KtoGraLayout);
        KtoGraLayout.setHorizontalGroup(
            KtoGraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KtoGraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TwojMoj)
                .addContainerGap(246, Short.MAX_VALUE))
        );
        KtoGraLayout.setVerticalGroup(
            KtoGraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KtoGraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TwojMoj)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Gra.setText("Gra");

        NowaGra.setText("Nowa gra");
        NowaGra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NowaGraActionPerformed(evt);
            }
        });
        Gra.add(NowaGra);
        Gra.add(jSeparator1);

        Zakoncz.setText("Zakończ");
        Zakoncz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZakonczActionPerformed(evt);
            }
        });
        Gra.add(Zakoncz);

        Menu.add(Gra);

        Informacje.setText("Informacje");

        About.setText("About");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAbout(evt);
            }
        });
        Informacje.add(About);

        Menu.add(Informacje);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Wyniki, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(KtoGra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Plansza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Wyniki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KtoGra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Plansza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static short czyWygrana() {
        /*
         * -1 = remis
         * 0 = brak rozstrzygnięcia
         * 1 = wygrał x
         * 2 = wygrał o
         */
        short ruch = Metody.sprawdzWygrana();
       
        // interpretacja wyników:
        if (ruch == -1) {
            int timess = (int) System.currentTimeMillis();
            Dialogi.info("Remis!\nCzas Gry: " + (timess - timestart) / 1000 + " sekund", "Wynik");
            wynikP++;
            wPrzeciwnik = "" + wynikP;
            wynikPrzeciwnik.setText(wPrzeciwnik);
            wynikG++;
            wGracz = "" + wynikG;
            wynikGracz.setText(wGracz);
            ustawDostepnoscWszystkich(false);
            if (Dialogi.pytanie("Rozpocząć nową grę?", "Nowa gra")) {
                startGry();
            }
        } else if (ruch == 1) {
            int timess = (int) System.currentTimeMillis();

            Dialogi.info("Wygrał gracz Komputer\nCzas Gry: " + (timess - timestart) / 1000 + " sekund", "Wynik");

            wynikP++;
            wPrzeciwnik = "" + wynikP;
            wynikPrzeciwnik.setText(wPrzeciwnik);
            ustawDostepnoscWszystkich(false);
            if (Dialogi.pytanie("Rozpocząć nową grę?", "Nowa gra")) {
                startGry();
            }
        } else if (ruch == 2) {
            int timess = (int) System.currentTimeMillis();

            Dialogi.info("Wygrał gracz " + nickGracza + "\nCzas Gry: " + (timess - timestart) / 1000 + " sekund", "Wynik");

            wynikG++;
            wGracz = "" + wynikG;
            wynikGracz.setText(wGracz);
            ustawDostepnoscWszystkich(false);
            if (Dialogi.pytanie("Rozpocząć nową grę?", "Nowa gra")) {
                startGry();
            }
        } else {
            if (zmRuch == 0) {
                TwojMoj.setText("TWÓJ RUCH");
                ustawDostepnosc(true);
                zmRuch = 1;
            } else if (zmRuch == 1) {
                TwojMoj.setText("RUCH PRZECIWNIKA");
                ustawDostepnosc(false);
                zmRuch = 0;
                PCSerwer.walidacja("brak");
            }
        }

        return ruch;
    }

    private void p1Wyslij(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1Wyslij
        Metody.p(0, 0, "PCKlientPlansza", false);
    }//GEN-LAST:event_p1Wyslij

    private void p2Wyslij(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2Wyslij
        Metody.p(0, 1, "PCKlientPlansza", false);
    }//GEN-LAST:event_p2Wyslij

    private void p3Wyslij(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3Wyslij
        Metody.p(0, 2, "PCKlientPlansza", false);
    }//GEN-LAST:event_p3Wyslij

    private void p4Wyslij(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4Wyslij
        Metody.p(1, 0, "PCKlientPlansza", false);
    }//GEN-LAST:event_p4Wyslij

    private void p5Wyslij(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5Wyslij
        Metody.p(1, 1, "PCKlientPlansza", false);
    }//GEN-LAST:event_p5Wyslij

    private void p6Wyslij(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6Wyslij
        Metody.p(1, 2, "PCKlientPlansza", false);
    }//GEN-LAST:event_p6Wyslij

    private void p7Wyslij(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p7Wyslij
        Metody.p(2, 0, "PCKlientPlansza", false);
    }//GEN-LAST:event_p7Wyslij

    private void p8Wyslij(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p8Wyslij
        Metody.p(2, 1, "PCKlientPlansza", false);
    }//GEN-LAST:event_p8Wyslij

    private void p9Wyslij(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p9Wyslij
        Metody.p(2, 2, "PCKlientPlansza", false);
    }//GEN-LAST:event_p9Wyslij

    private void NowaGraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NowaGraActionPerformed
        if (Dialogi.pytanie("Czy na pewno?", "Nowa gra")) {
            startGry();
        }
    }//GEN-LAST:event_NowaGraActionPerformed

    private void ZakonczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZakonczActionPerformed
        if (Dialogi.pytanie("Czy na pewno?", "Zakończ program")) {
            System.exit(0);
        }
    }//GEN-LAST:event_ZakonczActionPerformed

    private void showAbout(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAbout
        Metody.about();
    }//GEN-LAST:event_showAbout

    private void aPodpowiedz(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aPodpowiedz
        PCSerwer.walidacja("PCKlientPlansza");
    }//GEN-LAST:event_aPodpowiedz

    public static void startGry() {
        GraNr++;
        nr = "" + GraNr;
        nrGry.setText(nr);

        p1.setText("");
        p2.setText("");
        p3.setText("");
        p4.setText("");
        p5.setText("");
        p6.setText("");
        p7.setText("");
        p8.setText("");
        p9.setText("");
       
        Metody.reset();
        losuj();        
    }

    public static void losuj() {
        int liczba = (int) (Math.random() * 2);
        timestart = (int) System.currentTimeMillis();
        if (liczba == 0) {
            TwojMoj.setText("TWÓJ RUCH");
            // przekazanie informacji o tym kto zaczyna do PCSerwer.java
            ustawDostepnoscWszystkich(true);
            zmRuch = 1;
            Metody.MaxRuch = false;
        } else if (liczba == 1) {
            TwojMoj.setText("RUCH PRZECIWNIKA");
            // przekazanie informacji o tym kto zaczyna do PCSerwer.java
            ustawDostepnoscWszystkich(false);
            zmRuch = 0;
            Metody.MaxRuch = true;
            PCSerwer.walidacja("brak");
        }
    }

    private static void ustawDostepnoscWszystkich(boolean wartosc) {
        p1.setEnabled(wartosc);
        p2.setEnabled(wartosc);
        p3.setEnabled(wartosc);
        p4.setEnabled(wartosc);
        p5.setEnabled(wartosc);
        p6.setEnabled(wartosc);
        p7.setEnabled(wartosc);
        p8.setEnabled(wartosc);
        p9.setEnabled(wartosc);
    }

    private static void ustawDostepnosc(boolean wartosc) {
        if (Metody.stan[0][0] == 0) {
            p1.setEnabled(wartosc);
        }
        if (Metody.stan[0][1] == 0) {
            p2.setEnabled(wartosc);
        }
        if (Metody.stan[0][2] == 0) {
            p3.setEnabled(wartosc);
        }
        if (Metody.stan[1][0] == 0) {
            p4.setEnabled(wartosc);
        }
        if (Metody.stan[1][1] == 0) {
            p5.setEnabled(wartosc);
        }
        if (Metody.stan[1][2] == 0) {
            p6.setEnabled(wartosc);
        }
        if (Metody.stan[2][0] == 0) {
            p7.setEnabled(wartosc);
        }
        if (Metody.stan[2][1] == 0) {
            p8.setEnabled(wartosc);
        }
        if (Metody.stan[2][2] == 0) {
            p9.setEnabled(wartosc);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JMenu Gra;
    private javax.swing.JLabel GraNumer;
    private javax.swing.JMenu Informacje;
    private javax.swing.JPanel KtoGra;
    private javax.swing.JMenuBar Menu;
    private static javax.swing.JLabel NICKGracz;
    private static javax.swing.JLabel NICKPrzeciwnik;
    private javax.swing.JMenuItem NowaGra;
    private javax.swing.JPanel Plansza;
    private javax.swing.JButton Podpowiedz;
    private static javax.swing.JLabel TwojMoj;
    private javax.swing.JPanel Wyniki;
    private javax.swing.JMenuItem Zakoncz;
    private javax.swing.JSeparator jSeparator1;
    private static javax.swing.JLabel nrGry;
    public static javax.swing.JButton p1;
    public static javax.swing.JButton p2;
    public static javax.swing.JButton p3;
    public static javax.swing.JButton p4;
    public static javax.swing.JButton p5;
    public static javax.swing.JButton p6;
    public static javax.swing.JButton p7;
    public static javax.swing.JButton p8;
    public static javax.swing.JButton p9;
    public static javax.swing.JLabel podpowiedz;
    private javax.swing.JLabel separator;
    private static javax.swing.JLabel wynikGracz;
    private static javax.swing.JLabel wynikPrzeciwnik;
    // End of variables declaration//GEN-END:variables
}
