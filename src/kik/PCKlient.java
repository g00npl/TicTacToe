/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Polacz.java
 *
 * Created on 2010-05-18, 11:59:16
 */
package kik;

import java.awt.Toolkit;

/**
 *
 * @author Maciej Rzepiński & Łukasz Czerepuk
 */
public class PCKlient extends javax.swing.JFrame {

    /** Creates new form Polacz */
    public PCKlient() {
        initComponents();
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setBounds(width / 2 - 145, height / 2 - 85, 290, 170);
        this.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KlientNick = new javax.swing.JLabel();
        nickKlient = new javax.swing.JTextField();
        polaczKlient = new javax.swing.JButton();
        wrocKlient = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        nickOpis = new javax.swing.JLabel();
        uwaga = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Połącz");
        setResizable(false);

        KlientNick.setFont(new java.awt.Font("Verdana", 0, 11));
        KlientNick.setText("Nick:");

        nickKlient.setFont(new java.awt.Font("Verdana", 0, 13));
        nickKlient.setToolTipText("Tutaj wpisz swój nick");
        nickKlient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aPolacz(evt);
            }
        });

        polaczKlient.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        polaczKlient.setText("Graj");
        polaczKlient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aPolacz(evt);
            }
        });

        wrocKlient.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        wrocKlient.setText("Wróć");
        wrocKlient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aWroc(evt);
            }
        });

        nickOpis.setFont(new java.awt.Font("Verdana", 0, 10));
        nickOpis.setForeground(new java.awt.Color(153, 0, 0));
        nickOpis.setText("(Minimalnie 3 znaki, maksymalnie 8 znaków)");

        uwaga.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        uwaga.setForeground(new java.awt.Color(153, 0, 0));
        uwaga.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(KlientNick)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nickKlient, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                    .addComponent(nickOpis)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(uwaga)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(wrocKlient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(polaczKlient)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KlientNick)
                    .addComponent(nickKlient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(nickOpis)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uwaga)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(polaczKlient)
                    .addComponent(wrocKlient))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aWroc(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aWroc
        this.setVisible(false);
        new Start();
    }//GEN-LAST:event_aWroc

    private void aPolacz(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aPolacz
        String nick = nickKlient.getText();
        if (
                nick.length() >= 3
                && nick.length() <= 8
            ) {
            this.setVisible(false);
            uwaga.setText("");
            new PCKlientPlansza(nick);            
        } else {
            uwaga.setText("Wypełnij poprawnie powyższe pole!");
        }
    }//GEN-LAST:event_aPolacz

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KlientNick;
    private javax.swing.JSeparator jSeparator1;
    private static javax.swing.JTextField nickKlient;
    private javax.swing.JLabel nickOpis;
    private javax.swing.JButton polaczKlient;
    private javax.swing.JLabel uwaga;
    private javax.swing.JButton wrocKlient;
    // End of variables declaration//GEN-END:variables
}
