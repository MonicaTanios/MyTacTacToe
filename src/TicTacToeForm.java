
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToeForm extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;

    public TicTacToeForm() {
        initComponents();
        setSize(600, 400);
        setLocationRelativeTo(null); //to be centered
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        jButton3.setOpaque(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setBorderPainted(false);
        jButton4.setOpaque(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setBorderPainted(false);
        jButton5.setOpaque(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setBorderPainted(false);
        jButton6.setOpaque(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setBorderPainted(false);
        jButton7.setOpaque(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setBorderPainted(false);
        jButton8.setOpaque(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setBorderPainted(false);
        jButton9.setOpaque(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setBorderPainted(false);
    }

    private void resetGame() {
        startGame = "X";
        /*xCount = 0; 
         oCount = 0;
         gameScore();*/
        jButton1.setText("");
        jButton1.setBackground(Color.lightGray);
        jButton2.setText("");
        jButton2.setBackground(Color.lightGray);
        jButton3.setText("");
        jButton3.setBackground(Color.lightGray);
        jButton4.setText("");
        jButton4.setBackground(Color.lightGray);
        jButton5.setText("");
        jButton5.setBackground(Color.lightGray);
        jButton6.setText("");
        jButton6.setBackground(Color.lightGray);
        jButton7.setText("");
        jButton7.setBackground(Color.lightGray);
        jButton8.setText("");
        jButton8.setBackground(Color.lightGray);
        jButton9.setText("");
        jButton9.setBackground(Color.lightGray);
    }

    private void gameScore() {
        LabelPlayerX.setText(String.valueOf(xCount));
        LabelPlayerO.setText(String.valueOf(oCount));
    }

    private void choosePlayer() {
        if (startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        } else {
            startGame = "X";
        }
    }

    private void winningGame() {
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();

        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();

        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();

        //FOR X
        if (b1 == "X" && b2 == "X" && b3 == "X") {
            JOptionPane.showMessageDialog(this, "X Wins !", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.yellow);
            jButton2.setBackground(Color.yellow);
            jButton3.setBackground(Color.yellow);
        }
        if (b4 == "X" && b5 == "X" && b6 == "X") {
            JOptionPane.showMessageDialog(this, "X Wins !", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton4.setBackground(Color.yellow);
            jButton5.setBackground(Color.yellow);
            jButton6.setBackground(Color.yellow);
        }
        if (b7 == "X" && b8 == "X" && b9 == "X") {
            JOptionPane.showMessageDialog(this, "X Wins !", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton7.setBackground(Color.yellow);
            jButton8.setBackground(Color.yellow);
            jButton9.setBackground(Color.yellow);
        }
        if (b1 == "X" && b4 == "X" && b7 == "X") {
            JOptionPane.showMessageDialog(this, "X Wins !", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.yellow);
            jButton4.setBackground(Color.yellow);
            jButton7.setBackground(Color.yellow);
        }
        if (b1 == "X" && b5 == "X" && b9 == "X") {
            JOptionPane.showMessageDialog(this, "X Wins !", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.yellow);
            jButton5.setBackground(Color.yellow);
            jButton9.setBackground(Color.yellow);
        }
        if (b3 == "X" && b5 == "X" && b7 == "X") {
            JOptionPane.showMessageDialog(this, "X Wins !", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton3.setBackground(Color.yellow);
            jButton5.setBackground(Color.yellow);
            jButton7.setBackground(Color.yellow);
        }
        if (b1 == "X" && b5 == "X" && b9 == "X") {
            JOptionPane.showMessageDialog(this, "X Wins !", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.yellow);
            jButton5.setBackground(Color.yellow);
            jButton9.setBackground(Color.yellow);
        }
        if (b2 == "X" && b5 == "X" && b8 == "X") {
            JOptionPane.showMessageDialog(this, "X Wins !", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton2.setBackground(Color.yellow);
            jButton5.setBackground(Color.yellow);
            jButton8.setBackground(Color.yellow);
        }
        if (b3 == "X" && b6 == "X" && b9 == "X") {
            JOptionPane.showMessageDialog(this, "X Wins !", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton3.setBackground(Color.yellow);
            jButton6.setBackground(Color.yellow);
            jButton9.setBackground(Color.yellow);
        }

        //FOR O
        if (b1 == "O" && b2 == "O" && b3 == "O") {
            JOptionPane.showMessageDialog(this, "O Wins !", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton1.setBackground(Color.yellow);
            jButton2.setBackground(Color.yellow);
            jButton3.setBackground(Color.yellow);
        }
        if (b4 == "O" && b5 == "O" && b6 == "O") {
            JOptionPane.showMessageDialog(this, "O Wins !", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton4.setBackground(Color.yellow);
            jButton5.setBackground(Color.yellow);
            jButton6.setBackground(Color.yellow);
        }
        if (b7 == "O" && b8 == "O" && b9 == "O") {
            JOptionPane.showMessageDialog(this, "O Wins !", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton7.setBackground(Color.yellow);
            jButton8.setBackground(Color.yellow);
            jButton9.setBackground(Color.yellow);
        }
        if (b1 == "O" && b4 == "O" && b7 == "O") {
            JOptionPane.showMessageDialog(this, "O Wins !", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton4.setBackground(Color.yellow);
            jButton5.setBackground(Color.yellow);
            jButton6.setBackground(Color.yellow);
        }
        if (b1 == "O" && b5 == "O" && b9 == "O") {
            JOptionPane.showMessageDialog(this, "O Wins !", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton1.setBackground(Color.yellow);
            jButton5.setBackground(Color.yellow);
            jButton9.setBackground(Color.yellow);
        }
        if (b3 == "O" && b5 == "O" && b7 == "O") {
            JOptionPane.showMessageDialog(this, "Player O Wins !", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton3.setBackground(Color.yellow);
            jButton5.setBackground(Color.yellow);
            jButton7.setBackground(Color.yellow);
        }
        if (b1 == "O" && b5 == "O" && b9 == "O") {
            JOptionPane.showMessageDialog(this, "O Wins !", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton1.setBackground(Color.yellow);
            jButton5.setBackground(Color.yellow);
            jButton9.setBackground(Color.yellow);
        }
        if (b2 == "O" && b5 == "O" && b8 == "O") {
            JOptionPane.showMessageDialog(this, "O Wins !", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton2.setBackground(Color.yellow);
            jButton5.setBackground(Color.yellow);
            jButton8.setBackground(Color.yellow);
        }
        if (b3 == "O" && b6 == "O" && b9 == "O") {
            JOptionPane.showMessageDialog(this, "O Wins !", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton3.setBackground(Color.yellow);
            jButton6.setBackground(Color.yellow);
            jButton9.setBackground(Color.yellow);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        LabelPlayerX = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        LabelPlayerO = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        ResetButton = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 2, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Comfortaa", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X - O Game");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Dialog", 1, 75)); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Dialog", 1, 75)); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Dialog", 1, 75)); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Comfortaa", 1, 120)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(232, 23, 78));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("x");
        jPanel6.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setLayout(new java.awt.BorderLayout());

        LabelPlayerX.setBackground(new java.awt.Color(0, 0, 0));
        LabelPlayerX.setFont(new java.awt.Font("Comfortaa", 0, 90)); // NOI18N
        LabelPlayerX.setForeground(new java.awt.Color(255, 255, 255));
        LabelPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(LabelPlayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Dialog", 1, 75)); // NOI18N
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Dialog", 1, 75)); // NOI18N
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Dialog", 1, 75)); // NOI18N
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Comfortaa", 1, 95)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(23, 117, 232));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("O");
        jPanel11.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel12.setLayout(new java.awt.BorderLayout());

        LabelPlayerO.setBackground(new java.awt.Color(0, 0, 0));
        LabelPlayerO.setFont(new java.awt.Font("Comfortaa", 0, 90)); // NOI18N
        LabelPlayerO.setForeground(new java.awt.Color(255, 255, 255));
        LabelPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(LabelPlayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Dialog", 1, 75)); // NOI18N
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Dialog", 1, 75)); // NOI18N
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Dialog", 1, 75)); // NOI18N
        jButton9.setBorder(null);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));
        jPanel16.setLayout(new java.awt.BorderLayout());

        ResetButton.setBackground(new java.awt.Color(51, 51, 51));
        ResetButton.setFont(new java.awt.Font("Comfortaa", 1, 30)); // NOI18N
        ResetButton.setForeground(new java.awt.Color(255, 255, 255));
        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        jPanel16.add(ResetButton, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));
        jPanel17.setLayout(new java.awt.BorderLayout());

        ExitButton.setBackground(new java.awt.Color(51, 51, 51));
        ExitButton.setFont(new java.awt.Font("Comfortaa", 1, 30)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel17.add(ExitButton, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private JFrame frame;
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to Exit?", "Tic Tac Toe",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        choosePlayer();
        String b1 = jButton1.getText();
        if (b1.isEmpty()) {
            jButton1.setText(startGame);
            if (startGame.equalsIgnoreCase("x")) {
                int red = 232;
                int green = 23;
                int blue = 78;
                float hsb[] = new float [3];
                Color.RGBtoHSB(red, green , blue, hsb);
                jButton1.setForeground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
            } else {
                int red = 23;
                int green = 117;
                int blue = 232;
                float hsb[] = new float [3];
                Color.RGBtoHSB(red, green , blue, hsb);
                jButton1.setForeground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
            }
        } else {
            JOptionPane.showMessageDialog(this, "It already contains a character", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        
        }

        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String b2 = jButton2.getText();
        if (b2.isEmpty()) {
            jButton2.setText(startGame);
            if (startGame.equalsIgnoreCase("x")) {
                int red = 232;
                int green = 23;
                int blue = 78;
                float hsb[] = new float [3];
                Color.RGBtoHSB(red, green , blue, hsb);
                jButton2.setForeground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
            } else {
                int red = 23;
                int green = 117;
                int blue = 232;
                float hsb[] = new float [3];
                Color.RGBtoHSB(red, green , blue, hsb);
                jButton2.setForeground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
            }
        } else {
            JOptionPane.showMessageDialog(this, "It already contains a character", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            if (b2 == "x") {
                startGame = "O";
            } else {
                startGame = "x";
            }
        }

        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String b1 = jButton3.getText();
        if (b1.isEmpty()) {
            jButton3.setText(startGame);
            if (startGame.equalsIgnoreCase("x")) {
                int red = 232;
                int green = 23;
                int blue = 78;
                float hsb[] = new float [3];
                Color.RGBtoHSB(red, green , blue, hsb);
                jButton3.setForeground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
            } else {
                int red = 23;
                int green = 117;
                int blue = 232;
                float hsb[] = new float [3];
                Color.RGBtoHSB(red, green , blue, hsb);
                jButton3.setForeground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
            }
        } else {
            JOptionPane.showMessageDialog(this, "It already contains a character", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
        }

        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String b1 = jButton4.getText();
        if (b1.isEmpty()) {
            jButton4.setText(startGame);
            if (startGame.equalsIgnoreCase("x")) {
                int red = 232;
                int green = 23;
                int blue = 78;
                float hsb[] = new float [3];
                Color.RGBtoHSB(red, green , blue, hsb);
                jButton4.setForeground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
            } else {
                int red = 23;
                int green = 117;
                int blue = 232;
                float hsb[] = new float [3];
                Color.RGBtoHSB(red, green , blue, hsb);
                jButton4.setForeground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
            }
        } else {
            JOptionPane.showMessageDialog(this, "It already contains a character", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            if (b1 == "X") {
                startGame = "O";
            } else {
                startGame = "X";
            }
        }

        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String b1 = jButton5.getText();
        if (b1.isEmpty()) {
            jButton5.setText(startGame);
            if (startGame.equalsIgnoreCase("x")) {
                int red = 232;
                int green = 23;
                int blue = 78;
                float hsb[] = new float [3];
                Color.RGBtoHSB(red, green , blue, hsb);
                jButton5.setForeground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
            } else {
                int red = 23;
                int green = 117;
                int blue = 232;
                float hsb[] = new float [3];
                Color.RGBtoHSB(red, green , blue, hsb);
                jButton5.setForeground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
            }
        } else {
            JOptionPane.showMessageDialog(this, "It already contains a character", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            if (b1 == "X") {
                startGame = "O";
            } else {
                startGame = "X";
            }
        }

        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String b1 = jButton6.getText();
        if (b1.isEmpty()) {
            jButton6.setText(startGame);
            if (startGame.equalsIgnoreCase("x")) {
                int red = 232;
                int green = 23;
                int blue = 78;
                float hsb[] = new float [3];
                Color.RGBtoHSB(red, green , blue, hsb);
                jButton6.setForeground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
            } else {
                int red = 23;
                int green = 117;
                int blue = 232;
                float hsb[] = new float [3];
                Color.RGBtoHSB(red, green , blue, hsb);
                jButton6.setForeground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
            }
        } else {
            JOptionPane.showMessageDialog(this, "It already contains a character", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            if (b1 == "X") {
                startGame = "O";
            } else {
                startGame = "X";
            }
        }

        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String b1 = jButton7.getText();
        if (b1.isEmpty()) {
            jButton7.setText(startGame);
            if (startGame.equalsIgnoreCase("x")) {
                int red = 232;
                int green = 23;
                int blue = 78;
                float hsb[] = new float [3];
                Color.RGBtoHSB(red, green , blue, hsb);
                jButton7.setForeground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
            } else {
                int red = 23;
                int green = 117;
                int blue = 232;
                float hsb[] = new float [3];
                Color.RGBtoHSB(red, green , blue, hsb);
                jButton7.setForeground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
            }
        } else {
            JOptionPane.showMessageDialog(this, "It already contains a character", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            if (b1 == "X") {
                startGame = "O";
            } else {
                startGame = "X";
            }
        }

        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String b1 = jButton8.getText();
        if (b1.isEmpty()) {
            jButton8.setText(startGame);
            if (startGame.equalsIgnoreCase("x")) {
                int red = 232;
                int green = 23;
                int blue = 78;
                float hsb[] = new float [3];
                Color.RGBtoHSB(red, green , blue, hsb);
                jButton8.setForeground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
            } else {
                int red = 23;
                int green = 117;
                int blue = 232;
                float hsb[] = new float [3];
                Color.RGBtoHSB(red, green , blue, hsb);
                jButton8.setForeground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
            }
        } else {
            JOptionPane.showMessageDialog(this, "It already contains a character", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            if (b1 == "X") {
                startGame = "O";
            } else {
                startGame = "X";
            }
        }

        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String b1 = jButton9.getText();
        if (b1.isEmpty()) {
            jButton9.setText(startGame);
            if (startGame.equalsIgnoreCase("x")) {
                int red = 232;
                int green = 23;
                int blue = 78;
                float hsb[] = new float [3];
                Color.RGBtoHSB(red, green , blue, hsb);
                jButton9.setForeground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
            } else {
                int red = 23;
                int green = 117;
                int blue = 232;
                float hsb[] = new float [3];
                Color.RGBtoHSB(red, green , blue, hsb);
                jButton9.setForeground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
            }
        } else {
            JOptionPane.showMessageDialog(this, "It already contains a character", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            if (b1 == "X") {
                startGame = "O";
            } else {
                startGame = "X";
            }
        }

        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        resetGame();
    }//GEN-LAST:event_ResetButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel LabelPlayerO;
    private javax.swing.JLabel LabelPlayerX;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
