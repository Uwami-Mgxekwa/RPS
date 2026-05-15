package rockpaperscissors;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

public class RPS extends javax.swing.JFrame {

    public RPS() {
        initComponents();
        Image icon = new ImageIcon("C:/Users/user/Desktop/JAVA/Rock Paper Scissors/src/icons/logo.png").getImage();
        this.setIconImage(icon);
        //C:/Users/user/Desktop/JAVA/Rock Paper Scissors/src/icons/logo.png
    }
    
    //int randomNumber = (int) (Math.random() * 10);
    int aiScoreCount;
    int userScoreCount;

    
    private ImageIcon happyRobot = new ImageIcon("C:/Users/user/Desktop/JAVA/Rock Paper Scissors/src/icons/smiley.png");
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        componentMoverUtil1 = new com.k33ptoo.utils.ComponentMoverUtil();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        choice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        display = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        message = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userScore = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        aiScore = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/avatar.png"))); // NOI18N
        jLabel1.setText("USER :");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ai.png"))); // NOI18N
        jLabel2.setText("  AI :  ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        display.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N

        kButton1.setText("PLAY");
        kButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("USER SCORE :");

        userScore.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        userScore.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("AI SCORE :");

        aiScore.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        aiScore.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/brightDay.png"))); // NOI18N
        jLabel5.setText("LIGHT THEME");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/brightNight.png"))); // NOI18N
        jLabel7.setText("DARK THEME");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panelLayout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(85, 85, 85))
                                        .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(193, 193, 193)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aiScore, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userScore, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(aiScore, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        String Choice = choice.getText();
        int randomNumber = (int) (Math.random() * 10);
        
        if(Choice.isBlank()){
            message.setText("Enter Rock Paper or Scissors to play !!");
            message.setForeground(Color.red);
        }
        else{
            if(!Choice.equalsIgnoreCase("Rock") && !Choice.equalsIgnoreCase("Paper") && !Choice.equalsIgnoreCase("Scissors") ){
                message.setText("Only Rock Paper or Scissors !!");
                message.setForeground(Color.red);
            }
            else{
                message.setText("Valid choice");
                message.setForeground(Color.green);
                if(randomNumber==1 || randomNumber==4 || randomNumber==7){
                    jLabel3.setText("ROCK");
                }
                else if(randomNumber==2 || randomNumber==5 || randomNumber==8){
                    jLabel3.setText("PAPER");
                }
                else if(randomNumber==3 || randomNumber==6 || randomNumber==9){
                    jLabel3.setText("Scissors");
                }
                if(Choice.equalsIgnoreCase("Rock")){
                    //ROCK
                    if(randomNumber==1 || randomNumber==4 || randomNumber==7){
                        display.setText("DRAW");
                        display.setForeground(Color.blue);
                    }
                    //PAPER
                    else if(randomNumber==2 || randomNumber==5 || randomNumber==8){
                        display.setText("YOU LOSE !!");
                        display.setForeground(Color.red);
                        aiScoreCount++;
                        String score = String.valueOf(aiScoreCount);
                        aiScore.setText(score);
                        //jLabel2.setIcon(happyRobot);
                        
                    }
                    //SCISSORS
                    else if(randomNumber==3 || randomNumber==6 || randomNumber==9){
                        display.setText("YOU WIN !!");
                        display.setForeground(Color.green);
                        userScoreCount++;
                        String score = String.valueOf(userScoreCount);
                        userScore.setText(score);
                    }
                }
                if(Choice.equalsIgnoreCase("Paper")){
                    //ROCK
                    if(randomNumber==1 || randomNumber==4 || randomNumber==7){
                        display.setText("YOU WIN !!");
                        display.setForeground(Color.green);
                        userScoreCount++;
                        String score = String.valueOf(userScoreCount);
                        userScore.setText(score);
                    }
                    //PAPER
                    else if(randomNumber==2 || randomNumber==5 || randomNumber==8){
                        display.setText("DRAW");
                        display.setForeground(Color.blue);
                    }
                    //SCISSORS
                    else if(randomNumber==3 || randomNumber==6 || randomNumber==9){
                        display.setText("YOU LOSE !!");
                        display.setForeground(Color.red);
                        aiScoreCount++;
                        String score = String.valueOf(aiScoreCount);
                        aiScore.setText(score);
                    }
                }
                if(Choice.equalsIgnoreCase("Scissors")){
                    //ROCK
                    if(randomNumber==1 || randomNumber==4 || randomNumber==7){
                        display.setText("YOU LOSE !!");
                        display.setForeground(Color.red);
                        aiScoreCount++;
                        String score = String.valueOf(aiScoreCount);
                        aiScore.setText(score);
                        
                    }
                    //PAPER
                    else if(randomNumber==2 || randomNumber==5 || randomNumber==8){
                        display.setText("YOU WIN !!");
                        display.setForeground(Color.green);
                        userScoreCount++;
                        String score = String.valueOf(userScoreCount);
                        userScore.setText(score);
                    }
                    //SCISSORS
                    else if(randomNumber==3 || randomNumber==6 || randomNumber==9){
                        display.setText("DRAW");
                        display.setForeground(Color.blue);
                    }
                }
            }
        } 
    }//GEN-LAST:event_kButton1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        panel.setBackground(Color.white);
        jLabel4.setForeground(Color.black);
        jLabel6.setForeground(Color.black);
        jLabel3.setForeground(Color.black);
        userScore.setForeground(Color.black);
        aiScore.setForeground(Color.black);
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        panel.setBackground(Color.black);
        jLabel4.setForeground(Color.white);
        jLabel6.setForeground(Color.white);
        jLabel3.setForeground(Color.white);
        userScore.setForeground(Color.white);
        aiScore.setForeground(Color.white);
    }//GEN-LAST:event_jLabel7MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RPS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aiScore;
    private javax.swing.JTextField choice;
    private com.k33ptoo.utils.ComponentMoverUtil componentMoverUtil1;
    private javax.swing.JLabel display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private com.k33ptoo.components.KButton kButton1;
    private javax.swing.JLabel message;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel userScore;
    // End of variables declaration//GEN-END:variables
}
