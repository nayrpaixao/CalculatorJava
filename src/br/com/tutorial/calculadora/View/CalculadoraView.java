/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.tutorial.calculadora.View;

import br.com.tutorial.calculadora.Model.CalculadoraModel;

/**
 *
 * @author npaixao
 */
public class CalculadoraView extends javax.swing.JFrame {

    CalculadoraModel calculadora = new CalculadoraModel();
    boolean segundovalor;
    String operacao;
  
    public CalculadoraView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNumero = new javax.swing.JLabel();
        jButton1Clear1 = new javax.swing.JButton();
        jButton1Percent = new javax.swing.JButton();
        jButton1Dividir = new javax.swing.JButton();
        jButton1Multiplica = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton1Sub = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1Sum = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButton1Ponto = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();
        jButton1Igual = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNumero.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 60)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabelNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 270, 100));

        jButton1Clear1.setContentAreaFilled(false);
        jButton1Clear1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1Clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1Clear1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Clear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 70, 70));

        jButton1Percent.setContentAreaFilled(false);
        jButton1Percent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1Percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1PercentActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Percent, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 60, 70));

        jButton1Dividir.setContentAreaFilled(false);
        jButton1Dividir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1Dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1DividirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 70, 70));

        jButton1Multiplica.setContentAreaFilled(false);
        jButton1Multiplica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1Multiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1MultiplicaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Multiplica, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 70, 70));

        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 70, 70));

        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 60, 70));

        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 60, 70));

        jButton1Sub.setContentAreaFilled(false);
        jButton1Sub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1Sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SubActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 70, 70));

        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 70, 70));

        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 70, 70));

        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 70, 70));

        jButton1Sum.setContentAreaFilled(false);
        jButton1Sum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1Sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SumActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Sum, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 70, 70));

        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 70, 70));

        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 70, 70));

        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 70, 70));

        jButton0.setContentAreaFilled(false);
        jButton0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 70, 70));

        jButton1Ponto.setContentAreaFilled(false);
        jButton1Ponto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton1Ponto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 70, 70));

        jButtonApagar.setContentAreaFilled(false);
        jButtonApagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 70, 70));

        jButton1Igual.setContentAreaFilled(false);
        jButton1Igual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1IgualActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 70, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Calculadora1.PNG"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 552));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1Clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1Clear1ActionPerformed
      calculadora.setValor1(0);
      calculadora.setValor2(0);
      segundovalor = false;
      jLabelNumero.setText("");
      operacao = "";
        
    }//GEN-LAST:event_jButton1Clear1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       jLabelNumero.setText(jLabelNumero.getText() + "7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "8");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       jLabelNumero.setText(jLabelNumero.getText() + "4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       jLabelNumero.setText(jLabelNumero.getText() + "6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      jLabelNumero.setText(jLabelNumero.getText() + "1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       jLabelNumero.setText(jLabelNumero.getText() + "3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
       jLabelNumero.setText(jLabelNumero.getText() + "0");
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton1SumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SumActionPerformed
        calculadora.setValor1(Double.parseDouble(jLabelNumero.getText()));
        segundovalor = true;
        jLabelNumero.setText("");
        operacao = "soma";
    }//GEN-LAST:event_jButton1SumActionPerformed

    private void jButton1IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1IgualActionPerformed
        if(segundovalor == true){
        calculadora.setValor2(Double.parseDouble(jLabelNumero.getText()));
        if(operacao == "soma"){
        calculadora.somar();   
        jLabelNumero.setText(String.valueOf(calculadora.getResultado()));
        operacao = "";
    }//GEN-LAST:event_jButton1IgualActionPerformed
        if(operacao == "subtracao"){
        calculadora.subtracao();
        jLabelNumero.setText(String.valueOf(calculadora.getResultado()));
        operacao = "";
    }              
        if(operacao == "multiplicacao"){
        calculadora.multipicacao();
        jLabelNumero.setText(String.valueOf(calculadora.getResultado()));
        operacao = "";
    }              
        if(operacao == "divisao"){
        calculadora.divisao();   
        jLabelNumero.setText(String.valueOf(calculadora.getResultado()));
        operacao = "";
    }              
                }
    }
    private void jButton1SubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SubActionPerformed
       calculadora.setValor1(Double.parseDouble(jLabelNumero.getText()));
        segundovalor = true;
        jLabelNumero.setText("");
        operacao = "subtracao";
    }//GEN-LAST:event_jButton1SubActionPerformed

    private void jButton1MultiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1MultiplicaActionPerformed
        calculadora.setValor1(Double.parseDouble(jLabelNumero.getText()));
        segundovalor = true;
        jLabelNumero.setText("");
        operacao = "multiplicacao";
    }//GEN-LAST:event_jButton1MultiplicaActionPerformed

    private void jButton1DividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1DividirActionPerformed
        calculadora.setValor1(Double.parseDouble(jLabelNumero.getText()));
        segundovalor = true;
        jLabelNumero.setText("");
        operacao = "divisao";
    }//GEN-LAST:event_jButton1DividirActionPerformed

    private void jButton1PercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1PercentActionPerformed
        calculadora.setValor1(Double.parseDouble(jLabelNumero.getText()));
        calculadora.setResultado(calculadora.getValor1() / 100);
        jLabelNumero.setText(String.valueOf(calculadora.getResultado()));
    }//GEN-LAST:event_jButton1PercentActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        jLabelNumero.setText(jLabelNumero.getText().substring(0, jLabelNumero.getText().length() - 1));
    }//GEN-LAST:event_jButtonApagarActionPerformed
        
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
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1Clear1;
    private javax.swing.JButton jButton1Dividir;
    private javax.swing.JButton jButton1Igual;
    private javax.swing.JButton jButton1Multiplica;
    private javax.swing.JButton jButton1Percent;
    private javax.swing.JButton jButton1Ponto;
    private javax.swing.JButton jButton1Sub;
    private javax.swing.JButton jButton1Sum;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNumero;
    // End of variables declaration//GEN-END:variables
}
