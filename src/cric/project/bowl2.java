/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cric.project;

/**
 *
 * @author dilshi
 */
public class bowl2 extends javax.swing.JFrame {

int tot=0;
int d=0;
int flag = 0; 
int fl2 = 0; 
int p = 0; 
double a=0; 
int pl = 0; 
int pc = 0;
    public bowl2() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("NEXT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel5.setText("BOWLING");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(101, 101, 101))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton8)
                            .addComponent(jButton9)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jLabel1.setText("you choosed 8");
     d=8; 
     a=Math.random();
     if(a>=0&&a<0.1) 
{ 
jLabel2.setText("PC chose = 1"); 
p=1; 
} 
     else if(a>=0.1&&a<0.2)
{ 
jLabel2.setText("PC chose = 2"); 
p=2; 
} 
     else if(a>=0.2&&a<0.3) 
{ 
jLabel2.setText("PC chose = 3"); 
p=3; 
} 
     else if(a>=0.3&&a<0.4) 
{ 
jLabel2.setText("PC chose = 4"); 
p=4; 
} 
     else if(a>=0.4&&a<0.5) 
{ 
jLabel2.setText("PC chose = 5"); 
p=5; 
} 
     else if(a>=0.5&&a<0.6) 
{ 
jLabel2.setText("PC chose = 6"); 
p=6; 
} 
     else if(a>=0.6&&a<0.7) 
{ 
jLabel2.setText("PC chose = 7"); 
p=7; 
} 
     else if(a>=0.7&&a<0.8) 
{ 
jLabel2.setText("PC chose = 8");
p=8; 
} 
     else if(a>=0.8&&a<1.0) 
{ 
jLabel2.setText("PC chose = 9");
p=9; 
}
     if(d==p)
     {
         jLabel4.setText("First Innings Over click NEXT");
     }
     else
     {
         tot=tot+p;
         jLabel3.setText("PC score:"+tot);  }  // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jLabel1.setText("you choosed 1");
     d=1; 
     a=Math.random();
     if(a>=0&&a<0.1) 
{ 
jLabel2.setText("PC chose = 1"); 
p=1; 
} 
     else if(a>=0.1&&a<0.2)
{ 
jLabel2.setText("PC chose = 2"); 
p=2; 
} 
     else if(a>=0.2&&a<0.3) 
{ 
jLabel2.setText("PC chose = 3"); 
p=3; 
} 
     else if(a>=0.3&&a<0.4) 
{ 
jLabel2.setText("PC chose = 4"); 
p=4; 
} 
     else if(a>=0.4&&a<0.5) 
{ 
jLabel2.setText("PC chose = 5"); 
p=5; 
} 
     else if(a>=0.5&&a<0.6) 
{ 
jLabel2.setText("PC chose = 6"); 
p=6; 
} 
     else if(a>=0.6&&a<0.7) 
{ 
jLabel2.setText("PC chose = 7"); 
p=7; 
} 
     else if(a>=0.7&&a<0.8) 
{ 
jLabel2.setText("PC chose = 8");
p=8; 
} 
     else if(a>=0.8&&a<1.0) 
{ 
jLabel2.setText("PC chose = 9");
p=9; 
}
     if(d==p)
     {
         jLabel4.setText("First Innings Over click NEXT");
     }
     else
     {
         tot=tot+p;
         jLabel3.setText("PC score:"+tot);
     } // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
jLabel1.setText("you choosed 2");
     d=2; 
     a=Math.random();
     if(a>=0&&a<0.1) 
{ 
jLabel2.setText("PC chose = 1"); 
p=1; 
} 
     else if(a>=0.1&&a<0.2)
{ 
jLabel2.setText("PC chose = 2"); 
p=2; 
} 
     else if(a>=0.2&&a<0.3) 
{ 
jLabel2.setText("PC chose = 3"); 
p=3; 
} 
     else if(a>=0.3&&a<0.4) 
{ 
jLabel2.setText("PC chose = 4"); 
p=4; 
} 
     else if(a>=0.4&&a<0.5) 
{ 
jLabel2.setText("PC chose = 5"); 
p=5; 
} 
     else if(a>=0.5&&a<0.6) 
{ 
jLabel2.setText("PC chose = 6"); 
p=6; 
} 
     else if(a>=0.6&&a<0.7) 
{ 
jLabel2.setText("PC chose = 7"); 
p=7; 
} 
     else if(a>=0.7&&a<0.8) 
{ 
jLabel2.setText("PC chose = 8");
p=8; 
} 
     else if(a>=0.8&&a<1.0) 
{ 
jLabel2.setText("PC chose = 9");
p=9; 
}
     if(d==p)
     {
         jLabel4.setText("First Innings Over click NEXT");
     }
     else
     {
         tot=tot+p;
         jLabel3.setText("PC score:"+tot); }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
jLabel1.setText("you choosed 3");
     d=3; 
     a=Math.random();
     if(a>=0&&a<0.1) 
{ 
jLabel2.setText("PC chose = 1"); 
p=1; 
} 
     else if(a>=0.1&&a<0.2)
{ 
jLabel2.setText("PC chose = 2"); 
p=2; 
} 
     else if(a>=0.2&&a<0.3) 
{ 
jLabel2.setText("PC chose = 3"); 
p=3; 
} 
     else if(a>=0.3&&a<0.4) 
{ 
jLabel2.setText("PC chose = 4"); 
p=4; 
} 
     else if(a>=0.4&&a<0.5) 
{ 
jLabel2.setText("PC chose = 5"); 
p=5; 
} 
     else if(a>=0.5&&a<0.6) 
{ 
jLabel2.setText("PC chose = 6"); 
p=6; 
} 
     else if(a>=0.6&&a<0.7) 
{ 
jLabel2.setText("PC chose = 7"); 
p=7; 
} 
     else if(a>=0.7&&a<0.8) 
{ 
jLabel2.setText("PC chose = 8");
p=8; 
} 
     else if(a>=0.8&&a<1.0) 
{ 
jLabel2.setText("PC chose = 9");
p=9; 
}
     if(d==p)
     {
         jLabel4.setText("First Innings Over click NEXT");
     }
     else
     {
         tot=tot+p;
         jLabel3.setText("PC score:"+tot); }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jLabel1.setText("you choosed 4");
     d=4; 
     a=Math.random();
     if(a>=0&&a<0.1) 
{ 
jLabel2.setText("PC chose = 1"); 
p=1; 
} 
     else if(a>=0.1&&a<0.2)
{ 
jLabel2.setText("PC chose = 2"); 
p=2; 
} 
     else if(a>=0.2&&a<0.3) 
{ 
jLabel2.setText("PC chose = 3"); 
p=3; 
} 
     else if(a>=0.3&&a<0.4) 
{ 
jLabel2.setText("PC chose = 4"); 
p=4; 
} 
     else if(a>=0.4&&a<0.5) 
{ 
jLabel2.setText("PC chose = 5"); 
p=5; 
} 
     else if(a>=0.5&&a<0.6) 
{ 
jLabel2.setText("PC chose = 6"); 
p=6; 
} 
     else if(a>=0.6&&a<0.7) 
{ 
jLabel2.setText("PC chose = 7"); 
p=7; 
} 
     else if(a>=0.7&&a<0.8) 
{ 
jLabel2.setText("PC chose = 8");
p=8; 
} 
     else if(a>=0.8&&a<1.0) 
{ 
jLabel2.setText("PC chose = 9");
p=9; 
}
     if(d==p)
     {
         jLabel4.setText("First Innings Over click NEXT");
     }
     else
     {
         tot=tot+p;
         jLabel3.setText("PC score:"+tot);  }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
jLabel1.setText("you choosed 5");
     d=5; 
     a=Math.random();
     if(a>=0&&a<0.1) 
{ 
jLabel2.setText("PC chose = 1"); 
p=1; 
} 
     else if(a>=0.1&&a<0.2)
{ 
jLabel2.setText("PC chose = 2"); 
p=2; 
} 
     else if(a>=0.2&&a<0.3) 
{ 
jLabel2.setText("PC chose = 3"); 
p=3; 
} 
     else if(a>=0.3&&a<0.4) 
{ 
jLabel2.setText("PC chose = 4"); 
p=4; 
} 
     else if(a>=0.4&&a<0.5) 
{ 
jLabel2.setText("PC chose = 5"); 
p=5; 
} 
     else if(a>=0.5&&a<0.6) 
{ 
jLabel2.setText("PC chose = 6"); 
p=6; 
} 
     else if(a>=0.6&&a<0.7) 
{ 
jLabel2.setText("PC chose = 7"); 
p=7; 
} 
     else if(a>=0.7&&a<0.8) 
{ 
jLabel2.setText("PC chose = 8");
p=8; 
} 
     else if(a>=0.8&&a<1.0) 
{ 
jLabel2.setText("PC chose = 9");
p=9; 
}
     if(d==p)
     {
         jLabel4.setText("First Innings Over click NEXT");
     }
     else
     {
         tot=tot+p;
         jLabel3.setText("PC score:"+tot);  }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
jLabel1.setText("you choosed 6");
     d=6; 
     a=Math.random();
     if(a>=0&&a<0.1) 
{ 
jLabel2.setText("PC chose = 1"); 
p=1; 
} 
     else if(a>=0.1&&a<0.2)
{ 
jLabel2.setText("PC chose = 2"); 
p=2; 
} 
     else if(a>=0.2&&a<0.3) 
{ 
jLabel2.setText("PC chose = 3"); 
p=3; 
} 
     else if(a>=0.3&&a<0.4) 
{ 
jLabel2.setText("PC chose = 4"); 
p=4; 
} 
     else if(a>=0.4&&a<0.5) 
{ 
jLabel2.setText("PC chose = 5"); 
p=5; 
} 
     else if(a>=0.5&&a<0.6) 
{ 
jLabel2.setText("PC chose = 6"); 
p=6; 
} 
     else if(a>=0.6&&a<0.7) 
{ 
jLabel2.setText("PC chose = 7"); 
p=7; 
} 
     else if(a>=0.7&&a<0.8) 
{ 
jLabel2.setText("PC chose = 8");
p=8; 
} 
     else if(a>=0.8&&a<1.0) 
{ 
jLabel2.setText("PC chose = 9");
p=9; 
}
     if(d==p)
     {
         jLabel4.setText("First Innings Over click NEXT");
     }
     else
     {
         tot=tot+p;
         jLabel3.setText("PC score:"+tot);  }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
jLabel1.setText("you choosed 7");
     d=7; 
     a=Math.random();
     if(a>=0&&a<0.1) 
{ 
jLabel2.setText("PC chose = 1"); 
p=1; 
} 
     else if(a>=0.1&&a<0.2)
{ 
jLabel2.setText("PC chose = 2"); 
p=2; 
} 
     else if(a>=0.2&&a<0.3) 
{ 
jLabel2.setText("PC chose = 3"); 
p=3; 
} 
     else if(a>=0.3&&a<0.4) 
{ 
jLabel2.setText("PC chose = 4"); 
p=4; 
} 
     else if(a>=0.4&&a<0.5) 
{ 
jLabel2.setText("PC chose = 5"); 
p=5; 
} 
     else if(a>=0.5&&a<0.6) 
{ 
jLabel2.setText("PC chose = 6"); 
p=6; 
} 
     else if(a>=0.6&&a<0.7) 
{ 
jLabel2.setText("PC chose = 7"); 
p=7; 
} 
     else if(a>=0.7&&a<0.8) 
{ 
jLabel2.setText("PC chose = 8");
p=8; 
} 
     else if(a>=0.8&&a<1.0) 
{ 
jLabel2.setText("PC chose = 9");
p=9; 
}
     if(d==p)
     {
         jLabel4.setText("First Innings Over click NEXT");
     }
     else
     {
         tot=tot+p;
         jLabel3.setText("PC score:"+tot);    }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
jLabel1.setText("you choosed 9");
     d=9; 
     a=Math.random();
     if(a>=0&&a<0.1) 
{ 
jLabel2.setText("PC chose = 1"); 
p=1; 
} 
     else if(a>=0.1&&a<0.2)
{ 
jLabel2.setText("PC chose = 2"); 
p=2; 
} 
     else if(a>=0.2&&a<0.3) 
{ 
jLabel2.setText("PC chose = 3"); 
p=3; 
} 
     else if(a>=0.3&&a<0.4) 
{ 
jLabel2.setText("PC chose = 4"); 
p=4; 
} 
     else if(a>=0.4&&a<0.5) 
{ 
jLabel2.setText("PC chose = 5"); 
p=5; 
} 
     else if(a>=0.5&&a<0.6) 
{ 
jLabel2.setText("PC chose = 6"); 
p=6; 
} 
     else if(a>=0.6&&a<0.7) 
{ 
jLabel2.setText("PC chose = 7"); 
p=7; 
} 
     else if(a>=0.7&&a<0.8) 
{ 
jLabel2.setText("PC chose = 8");
p=8; 
} 
     else if(a>=0.8&&a<1.0) 
{ 
jLabel2.setText("PC chose = 9");
p=9; 
}
     if(d==p)
     {
         jLabel4.setText("First Innings Over click NEXT");
     }
     else
     {
         tot=tot+p;
         jLabel3.setText("PC score:"+tot); }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       batting2 b=new batting2();
       b.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(bowl2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bowl2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bowl2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bowl2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bowl2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
