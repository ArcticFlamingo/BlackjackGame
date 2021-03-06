/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.awt.Color;
import java.awt.Image;
import java.io.*;
import javax.swing.ImageIcon;

/**
 *
 * @author braneyf
 */
public class Game extends javax.swing.JFrame {
    Integer total = 100;
    Integer maxBet = 1000;
    Integer bet;
    Deck mydeck = new Deck();
    Card card1 = new Card(1,"s");
    Card card2 = new Card(1,"s");
    Card card3 = new Card(1,"s");
    Card card4 = new Card(1,"s");
 
    Card deal1 = new Card(1,"s");
    Card deal2 = new Card(1,"s");
    Card deal3 = new Card(1,"s");
    Card deal4 = new Card(1,"s");
    
    int played = 0;
    int hitCount = -1;
    Integer playerScore = 0;
    Integer dealerScore = 0;
    int stand = 0;
    boolean isWon = false;
    boolean over21 = false;
  
 
    
    
    
    /**
     * Creates new form Game
     */
    public Game() {
        initComponents();
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel8.setVisible(false);
        jLabel16.setText("Total Chips: " + total.toString());
        jLabel15.setText("");
        ImageIcon ImageIcon = new ImageIcon(getClass().getResource("/cards_gif/Chipicon.png"));
        Image Image = ImageIcon.getImage();
        this.setIconImage(Image);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jProgressBar1 = new javax.swing.JProgressBar();
        list1 = new java.awt.List();
        jLabel3 = new javax.swing.JLabel();
        canvas1 = new java.awt.Canvas();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(650, 500));
        setMinimumSize(new java.awt.Dimension(650, 500));
        setPreferredSize(new java.awt.Dimension(650, 500));
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.green);
        jPanel1.setMaximumSize(new java.awt.Dimension(650, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(650, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards_gif/b1fv.gif"))); // NOI18N
        jLabel1.setBounds(20, 200, 71, 96);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards_gif/b1fv.gif"))); // NOI18N
        jLabel2.setBounds(110, 200, 71, 96);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards_gif/b1fv.gif"))); // NOI18N
        jLabel5.setBounds(200, 200, 71, 98);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards_gif/b1fv.gif"))); // NOI18N
        jLabel6.setBounds(290, 200, 71, 96);
        jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards_gif/b1fv.gif"))); // NOI18N
        jLabel8.setBounds(120, 20, 72, 96);
        jLayeredPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards_gif/b1fv.gif"))); // NOI18N
        jLabel7.setBounds(20, 20, 72, 96);
        jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setText("Stand");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Hit");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards_gif/b1fv.gif"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Motorwerk", 0, 15)); // NOI18N
        jLabel15.setText("jLabel15");

        jLabel14.setFont(new java.awt.Font("Motorwerk", 0, 15)); // NOI18N
        jLabel14.setText("Enter Bet:");

        jSpinner1.setFont(new java.awt.Font("Motorwerk", 0, 15)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Motorwerk", 0, 15)); // NOI18N
        jLabel16.setText("Total Chips:");

        jLabel12.setFont(new java.awt.Font("Motorwerk", 0, 15)); // NOI18N
        jLabel12.setText("Current Bet: 0");

        jLabel13.setFont(new java.awt.Font("Motorwerk", 0, 15)); // NOI18N
        jLabel13.setText("Current Score: 0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(449, 449, 449)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel15)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel15)
                        .addGap(58, 58, 58)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Game");

        jMenuItem1.setText("New Game");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Save");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Load");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Options");

        jMenuItem4.setText("Help");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenu3.setText("Change Color");

        jMenuItem8.setBackground(java.awt.Color.blue);
        jMenuItem8.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem8.setText("Blue");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setBackground(java.awt.Color.green);
        jMenuItem9.setText("Green");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem5.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem5.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem5.setText("Black");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setBackground(java.awt.Color.red);
        jMenuItem6.setText("Red");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem10.setBackground(java.awt.Color.orange);
        jMenuItem10.setText("Orange");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem11.setBackground(java.awt.Color.magenta);
        jMenuItem11.setText("Magenta");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(447, 447, 447))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 627, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(played < 52)
        {
                if(hitCount == 0)
                {
                    card3 = mydeck.getCard();
                    played++;
                    String card3info = card3.toString();
                    jLabel5.setVisible(true);
                    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards_gif/" + card3info + ".gif")));
                    hitCount++;
                    playerScore += card3.getValue();
                   
                }
                else if(hitCount == 1)
                {
                    card4 = mydeck.getCard();
                    played++;
                    String card4info = card4.toString();
                    jLabel6.setVisible(true);
                    jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards_gif/" + card4info + ".gif")));
                    hitCount++;
                    playerScore += card4.getValue();
                   
                }
            checkWin(2);
            jLabel13.setText("Current Score: " + playerScore.toString());
               
                
        }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //reveal dealers other cards
        
       
         jLabel8.setVisible(true);
         checkWin(3);
        
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String newBet = jSpinner1.getValue().toString();
        if((played+5)<52)//buffer to allow hits
        {
            //Bet Handling
            bet = Integer.parseInt(newBet);
            
               
                if(bet > total)
                {
                    jLabel15.setText("Not enough chips!");
                }
                else if(bet > maxBet)
                {
                    jLabel15.setText("Bet is too big!");
                }
                 else if(bet < 0)
                {
                    jLabel5.setText("Bet cannot be negative");
                }
                else if(bet == 0)
                {
                    jLabel15.setText("Bet cannot be 0");
                }
                else if(bet < 5)
                {
                    jLabel15.setText("Bet must be min of 5");
                }
                
                else
                {
                    
                    
                    jButton1.setEnabled(false);
                    total = total - bet;
                    jLabel15.setText("");
                    jButton2.setEnabled(true);
                    jButton3.setEnabled(true);
                    jSpinner1.setEnabled(false);
                    jLabel16.setText("Total Chips: " + total.toString());
                    jLabel12.setText("Current Bet: " + bet.toString());
                    
                    //Game Handling
                    playerScore = 0;
                    dealerScore = 0;
                    card1 = mydeck.getCard();
                    card2 = mydeck.getCard();
                    played +=2;
                    hitCount = 0;
                    //player
                    String card1info = card1.toString();
                    String card2info = card2.toString();
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards_gif/" + card1info + ".gif")));
                    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards_gif/" + card2info + ".gif")));
                    jLabel5.setVisible(false);
                    jLabel6.setVisible(false);
                    jLabel8.setVisible(false);
                    //dealer
                    deal1 = mydeck.getCard();
                    deal2 = mydeck.getCard();
                    String deal1info = deal1.toString();
                    String deal2info = deal2.toString();
                    jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards_gif/" + deal1info + ".gif")));
                    jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards_gif/" + deal2info + ".gif")));
                    dealerScore += deal1.getValue() + deal2.getValue();
                    playerScore += card1.getValue() + card2.getValue();
                    jLabel13.setText("Current Score: " + playerScore.toString());
                    checkWin(1);
                    
                    
                }
             if((played+5)>52)
            {
                jButton1.setEnabled(false);
                jLabel15.setText("Game Over!");//new game function
            }
            
   
        }
    
        
       
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
        
        
    /*  mydeck.setChips(total);
      mydeck.setPlayed(played);
      ObjectOutputStream outputStream = null;
      String fileName = "Game1.xml";
      try
      {
          outputStream = new ObjectOutputStream( new FileOutputStream(fileName));
      }
      catch(IOException e)
      {
          System.out.println("Error opening save file!");
          System.exit(0);
      }
      
      try
      {
          outputStream.writeObject(mydeck);
          outputStream.close();
      }
      catch(IOException e)
      {
          System.out.println("Error writing to save file");
          System.exit(0);
      }*/
   
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        jPanel1.setBackground(Color.green);
        jLabel14.setForeground(Color.BLACK);
        jLabel16.setForeground(Color.BLACK);
        jLabel12.setForeground(Color.BLACK);
        jLabel13.setForeground(Color.BLACK);
        jLabel15.setForeground(Color.BLACK);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        Game g = new Game();
        g.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        jPanel1.setBackground(Color.BLUE);
        jLabel14.setForeground(Color.WHITE);
        jLabel16.setForeground(Color.WHITE);
        jLabel12.setForeground(Color.WHITE);
        jLabel13.setForeground(Color.WHITE);
        jLabel15.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        Help h = new Help();
        h.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
         jPanel1.setBackground(Color.BLACK);
        jLabel14.setForeground(Color.WHITE);
        jLabel16.setForeground(Color.WHITE);
        jLabel12.setForeground(Color.WHITE);
        jLabel13.setForeground(Color.WHITE);
        jLabel15.setForeground(Color.WHITE);
        
        
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
         jPanel1.setBackground(Color.red);
        jLabel14.setForeground(Color.BLACK);
        jLabel16.setForeground(Color.BLACK);
        jLabel12.setForeground(Color.BLACK);
        jLabel13.setForeground(Color.BLACK);
        jLabel15.setForeground(Color.BLACK);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
         jPanel1.setBackground(Color.orange);
        jLabel14.setForeground(Color.BLACK);
        jLabel16.setForeground(Color.BLACK);
        jLabel12.setForeground(Color.BLACK);
        jLabel13.setForeground(Color.BLACK);
        jLabel15.setForeground(Color.BLACK);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
    // TODO add your handling code here:
        jPanel1.setBackground(Color.magenta);
        jLabel14.setForeground(Color.BLACK);
        jLabel16.setForeground(Color.BLACK);
        jLabel12.setForeground(Color.BLACK);
        jLabel13.setForeground(Color.BLACK);
        jLabel15.setForeground(Color.BLACK);        
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
       /* ObjectInputStream inputStream = null;
        String fileName = "Game1.xml";
        try
        {
            inputStream = new ObjectInputStream(new FileInputStream (fileName));
        }
        catch(IOException e)
        {
            System.out.println("Error opening the Load file!");
            System.exit(0);
        }
        
        try
        {
            mydeck = (Deck) inputStream.readObject();
        }
        catch (Exception e)
        {
            System.out.println("Error reading load file!");
            System.exit(0);
        }
        
        total = mydeck.getChips();
        played = mydeck.getPlayed();*/
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public void checkWin(int btn)
    {        
        //btn = 1, deal btn
        //btn = 2, hit btn
        //btn  3, stand btn
        if(btn == 1)
        {
            if(playerScore == 21)
            {
                jLabel15.setText("You Won!");
                total = total + bet*2;
                jButton1.setEnabled(true);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jSpinner1.setEnabled(true);
                jLabel8.setVisible(true);
                jLabel16.setText("Total Chips: " + total.toString());
            }
            else if(playerScore > 21)
            {
                jButton1.setEnabled(true);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jSpinner1.setEnabled(true);
                jLabel15.setText("You Lost!");
                jLabel8.setVisible(true);
            }
            
        }
        if(btn == 2)
        {
            if(playerScore > 21)
            {
                jButton1.setEnabled(true);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jSpinner1.setEnabled(true);
                jLabel15.setText("You Lost!");
                jLabel8.setVisible(true);
                
            }
        }
        if(btn == 3)
        {
            if(dealerScore == 21)
            {
                jButton1.setEnabled(true);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jSpinner1.setEnabled(true);
                jLabel15.setText("You Lost!");
                jLabel8.setVisible(true);
            }
            else if(dealerScore > 21)
            {
                 jLabel15.setText("You Won!");
                total = total + (bet*2);
                jButton1.setEnabled(true);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jSpinner1.setEnabled(true);
                jLabel8.setVisible(true);
                jLabel16.setText("Total Chips: " + total.toString());
            }
           else if(21-playerScore < 21-dealerScore)
            {
                jLabel15.setText("You Won!");
                total = total + (bet*2);
                jButton1.setEnabled(true);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jSpinner1.setEnabled(true);
                jLabel8.setVisible(true);
                jLabel16.setText("Total Chips: " + total.toString());
            }
            else
            {
                jButton1.setEnabled(true);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jSpinner1.setEnabled(true);
                jLabel15.setText("You Lost!");
                jLabel8.setVisible(true);
            }
            
        }
       
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Game().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private java.awt.List list1;
    // End of variables declaration//GEN-END:variables

   
}
