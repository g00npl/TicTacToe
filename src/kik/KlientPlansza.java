package kik;

import java.awt.Toolkit;

public class KlientPlansza extends javax.swing.JFrame {
    static String nickGracza;
    static String nickPrzeciwnika;
    static int GraNr = 0;
    static String nr = new String();
    static int wynikG = 0;
    static int wynikP = 0;
    static String wGracz = new String();
    static String wPrzeciwnik = new String();
    static int zmRuch;
    static int timestart;

    public KlientPlansza(String nickKlient) {
        nickGracza = nickKlient;
        initComponents();
        NICKGracz.setText(nickGracza);
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setBounds(width / 2 - 133, height / 2 - 305, 266, 610);
        this.setVisible(true);
        startGry();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KtoGra = new javax.swing.JPanel();
        TwojMoj = new javax.swing.JLabel();
        Plansza = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        poleCzatu = new javax.swing.JTextArea();
        PoleTekstowe = new javax.swing.JTextField();
        WyczyscPoleCzatu = new javax.swing.JButton();
        WyslijWiadomosc = new javax.swing.JButton();
        p1 = new javax.swing.JButton();
        p2 = new javax.swing.JButton();
        p3 = new javax.swing.JButton();
        p5 = new javax.swing.JButton();
        p4 = new javax.swing.JButton();
        p6 = new javax.swing.JButton();
        p7 = new javax.swing.JButton();
        p8 = new javax.swing.JButton();
        p9 = new javax.swing.JButton();
        Podpowiedz = new javax.swing.JButton();
        podpowiedz = new javax.swing.JLabel();
        Wyniki = new javax.swing.JPanel();
        GraNumer = new javax.swing.JLabel();
        nrGry = new javax.swing.JLabel();
        wynikPrzeciwnik = new javax.swing.JLabel();
        separator = new javax.swing.JLabel();
        wynikGracz = new javax.swing.JLabel();
        NICKGracz = new javax.swing.JLabel();
        NICKPrzeciwnik = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        Gra = new javax.swing.JMenu();
        Zakoncz = new javax.swing.JMenuItem();
        Informacje = new javax.swing.JMenu();
        About = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Klient :: PJ Tic Tac Toe");
        setLocationByPlatform(true);
        setResizable(false);

        TwojMoj.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N

        javax.swing.GroupLayout KtoGraLayout = new javax.swing.GroupLayout(KtoGra);
        KtoGra.setLayout(KtoGraLayout);
        KtoGraLayout.setHorizontalGroup(
            KtoGraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KtoGraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TwojMoj)
                .addContainerGap(258, Short.MAX_VALUE))
        );
        KtoGraLayout.setVerticalGroup(
            KtoGraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KtoGraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TwojMoj)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Plansza.setMaximumSize(null);

        poleCzatu.setColumns(10);
        poleCzatu.setEditable(false);
        poleCzatu.setFont(new java.awt.Font("Verdana", 0, 13));
        poleCzatu.setLineWrap(true);
        poleCzatu.setRows(5);
        jScrollPane1.setViewportView(poleCzatu);

        PoleTekstowe.setMargin(new java.awt.Insets(0, 2, 0, 2));
        PoleTekstowe.setPreferredSize(new java.awt.Dimension(12, 25));
        PoleTekstowe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aPoleTekstowe(evt);
            }
        });

        WyczyscPoleCzatu.setFont(new java.awt.Font("Verdana", 0, 11));
        WyczyscPoleCzatu.setText("Wyczyść");
        WyczyscPoleCzatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aWyczyscPoleCzatu(evt);
            }
        });

        WyslijWiadomosc.setFont(new java.awt.Font("Verdana", 0, 11));
        WyslijWiadomosc.setText("Wyślij");
        WyslijWiadomosc.setToolTipText("Wyślij wiadomość do użytkownika");
        WyslijWiadomosc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aWyslijWiadomosc(evt);
            }
        });

        p1.setBackground(new java.awt.Color(240, 240, 240));
        p1.setFont(new java.awt.Font("Verdana", 1, 18));
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

        Podpowiedz.setFont(new java.awt.Font("Verdana", 0, 11));
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
                .addGroup(PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PoleTekstowe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanszaLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(WyczyscPoleCzatu)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(WyslijWiadomosc))
                        .addGroup(PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PlanszaLayout.createSequentialGroup()
                                .addGroup(PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(p7, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(p4, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(p8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(p6, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanszaLayout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(podpowiedz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Podpowiedz)
                .addContainerGap())
        );
        PlanszaLayout.setVerticalGroup(
            PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanszaLayout.createSequentialGroup()
                .addGroup(PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlanszaLayout.createSequentialGroup()
                        .addGroup(PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PlanszaLayout.createSequentialGroup()
                        .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p8, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PoleTekstowe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WyslijWiadomosc)
                    .addComponent(WyczyscPoleCzatu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Podpowiedz)
                    .addComponent(podpowiedz))
                .addContainerGap())
        );

        Wyniki.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        GraNumer.setFont(new java.awt.Font("Verdana", 0, 11));
        GraNumer.setText("Gra Numer:");

        nrGry.setFont(new java.awt.Font("Verdana", 1, 12));
        nrGry.setForeground(new java.awt.Color(0, 102, 204));
        nrGry.setText("0");

        wynikPrzeciwnik.setFont(new java.awt.Font("Verdana", 1, 12));
        wynikPrzeciwnik.setForeground(new java.awt.Color(204, 0, 0));
        wynikPrzeciwnik.setText("0");

        separator.setFont(new java.awt.Font("Verdana", 0, 13));
        separator.setText("||");

        wynikGracz.setFont(new java.awt.Font("Verdana", 1, 12));
        wynikGracz.setForeground(new java.awt.Color(0, 153, 0));
        wynikGracz.setText("0");

        NICKGracz.setFont(new java.awt.Font("Verdana", 0, 11));

        NICKPrzeciwnik.setFont(new java.awt.Font("Verdana", 0, 13));

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
                        .addComponent(nrGry, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(WynikiLayout.createSequentialGroup()
                        .addComponent(NICKGracz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(wynikGracz)
                        .addGap(18, 18, 18)
                        .addComponent(separator)
                        .addGroup(WynikiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(WynikiLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(NICKPrzeciwnik))
                            .addGroup(WynikiLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(wynikPrzeciwnik, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(244, 244, 244))))
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
                    .addComponent(NICKPrzeciwnik)
                    .addComponent(separator)
                    .addComponent(wynikPrzeciwnik))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Gra.setText("Gra");

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
            .addComponent(Plansza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(KtoGra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Wyniki, 0, 270, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Wyniki, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KtoGra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Plansza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        } else if (ruch == 1) {
            int timess = (int) System.currentTimeMillis();

            Dialogi.info("Wygrał gracz " + nickGracza + "\nCzas Gry: " + (timess - timestart) / 1000 + " sekund", "Wynik");

            wynikG++;
            wGracz = "" + wynikG;
            wynikGracz.setText(wGracz);
            ustawDostepnoscWszystkich(false);
        } else if (ruch == 2) {
            int timess = (int) System.currentTimeMillis();

            Dialogi.info("Wygrał gracz " + nickPrzeciwnika + "\nCzas Gry: " + (timess - timestart) / 1000 + " sekund", "Wynik");

            wynikP++;
            wPrzeciwnik = "" + wynikP;
            wynikPrzeciwnik.setText(wPrzeciwnik);
            ustawDostepnoscWszystkich(false);
        } else {
            if (zmRuch == 1) {
                TwojMoj.setText("TWÓJ RUCH");
                ustawDostepnosc(true);
                zmRuch = 0;
            } else if (zmRuch == 0) {
                TwojMoj.setText("RUCH PRZECIWNIKA");
                ustawDostepnosc(false);
                zmRuch = 1;
            }
        }

        return ruch;
    }

    private void p1Wyslij(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1Wyslij
        Metody.p(0, 0, "KlientPlansza", true);
    }//GEN-LAST:event_p1Wyslij

    private void p2Wyslij(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2Wyslij
        Metody.p(0, 1, "KlientPlansza", true);
    }//GEN-LAST:event_p2Wyslij

    private void p3Wyslij(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3Wyslij
        Metody.p(0, 2, "KlientPlansza", true);
    }//GEN-LAST:event_p3Wyslij

    private void p4Wyslij(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4Wyslij
        Metody.p(1, 0, "KlientPlansza", true);
    }//GEN-LAST:event_p4Wyslij

    private void p5Wyslij(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5Wyslij
        Metody.p(1, 1, "KlientPlansza", true);
    }//GEN-LAST:event_p5Wyslij

    private void p6Wyslij(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6Wyslij
        Metody.p(1, 2, "KlientPlansza", true);
    }//GEN-LAST:event_p6Wyslij

    private void p7Wyslij(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p7Wyslij
        Metody.p(2, 0, "KlientPlansza", true);
    }//GEN-LAST:event_p7Wyslij

    private void p8Wyslij(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p8Wyslij
        Metody.p(2, 1, "KlientPlansza", true);
    }//GEN-LAST:event_p8Wyslij

    private void p9Wyslij(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p9Wyslij
        Metody.p(2, 2, "KlientPlansza", true);
    }//GEN-LAST:event_p9Wyslij

    private void ZakonczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZakonczActionPerformed
        if (Dialogi.pytanie("Czy na pewno?", "Zakończ program")) {
            System.exit(0);
        }
    }//GEN-LAST:event_ZakonczActionPerformed

    private void showAbout(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAbout
        Metody.about();
    }//GEN-LAST:event_showAbout

    private void aWyslijWiadomosc(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aWyslijWiadomosc
        wyslijTekst();
    }//GEN-LAST:event_aWyslijWiadomosc

    private void aPoleTekstowe(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aPoleTekstowe
        wyslijTekst();
    }//GEN-LAST:event_aPoleTekstowe

    private void aWyczyscPoleCzatu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aWyczyscPoleCzatu
        KlientPlansza.poleCzatu.setText("");
    }//GEN-LAST:event_aWyczyscPoleCzatu

    private void aPodpowiedz(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aPodpowiedz
        if (zmRuch == 0) PCSerwer.walidacja("KlientPlansza");
    }//GEN-LAST:event_aPodpowiedz

    public static void startGry() {
        Metody.reset();

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

        timestart = (int) System.currentTimeMillis();
    }

    public static void pobierzNick(String nickOpponent) {
        nickPrzeciwnika = nickOpponent;
        NICKPrzeciwnik.setText(nickPrzeciwnika);
        Dialogi.info("Połączono z graczem: " + nickPrzeciwnika
                + "\nGracz " + nickPrzeciwnika + " będzie dysponował znakiem \"O\".\n"
                + "Twoim znakiem będzie \"X\"", "Informacje");
    }

    public static void ktoZaczyna(String kto) {
        if (kto.equals("T")) {
            TwojMoj.setText("TWÓJ RUCH");
            ustawDostepnoscWszystkich(true);
            zmRuch = 0;
            Metody.MaxRuch = true;
        } else if (kto.equals("P")) {
            TwojMoj.setText("RUCH PRZECIWNIKA");
            ustawDostepnoscWszystkich(false);
            zmRuch = 1;
            Metody.MaxRuch = false;
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

    public void wyslijTekst() {
        String wyslijWiadomosc = new String();
        wyslijWiadomosc = "t|" + PoleTekstowe.getText().trim();

        Klient.out.println(wyslijWiadomosc);
        PoleTekstowe.setText("");
        poleCzatu.append("<" + nickGracza + "> " + wyslijWiadomosc.substring(2) + "\n");
    }

    public static void wyslijPole(String pole) {
        String wyslijPole = new String();
        wyslijPole = "p|" + pole;

        Klient.out.println(wyslijPole);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JMenu Gra;
    private javax.swing.JLabel GraNumer;
    private javax.swing.JMenu Informacje;
    private javax.swing.JPanel KtoGra;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JLabel NICKGracz;
    private static javax.swing.JLabel NICKPrzeciwnik;
    private javax.swing.JPanel Plansza;
    public static javax.swing.JButton Podpowiedz;
    private javax.swing.JTextField PoleTekstowe;
    public static javax.swing.JLabel TwojMoj;
    private javax.swing.JButton WyczyscPoleCzatu;
    private javax.swing.JPanel Wyniki;
    private javax.swing.JButton WyslijWiadomosc;
    private javax.swing.JMenuItem Zakoncz;
    private javax.swing.JScrollPane jScrollPane1;
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
    public static javax.swing.JTextArea poleCzatu;
    private javax.swing.JLabel separator;
    private static javax.swing.JLabel wynikGracz;
    private static javax.swing.JLabel wynikPrzeciwnik;
    // End of variables declaration//GEN-END:variables
}
