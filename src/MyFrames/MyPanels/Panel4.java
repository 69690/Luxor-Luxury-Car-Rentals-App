/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrames.MyPanels;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.regex.Pattern;
/**
 *
 * @author Ahuja
 */
public class Panel4 extends javax.swing.JPanel {

    /**
     * Creates new form Panel4
     */
    public Panel4() {
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

        jLabel2 = new javax.swing.JLabel();
        e2tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fntf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lntf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        e1tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cntf = new javax.swing.JTextField();
        OKBtn = new javax.swing.JButton();
        BGLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(729, 400));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contact Number:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        e2tf.setBackground(new java.awt.Color(0, 0, 0));
        e2tf.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        e2tf.setForeground(new java.awt.Color(255, 255, 255));
        add(e2tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 280, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        fntf.setBackground(new java.awt.Color(0, 0, 0));
        fntf.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        fntf.setForeground(new java.awt.Color(255, 255, 255));
        add(fntf, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 280, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        lntf.setBackground(new java.awt.Color(0, 0, 0));
        lntf.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        lntf.setForeground(new java.awt.Color(255, 255, 255));
        add(lntf, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 280, -1));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("*Retype Email Address:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        e1tf.setBackground(new java.awt.Color(0, 0, 0));
        e1tf.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        e1tf.setForeground(new java.awt.Color(255, 255, 255));
        add(e1tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 280, -1));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email Address:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        cntf.setBackground(new java.awt.Color(0, 0, 0));
        cntf.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        cntf.setForeground(new java.awt.Color(255, 255, 255));
        add(cntf, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 280, -1));

        OKBtn.setBackground(new java.awt.Color(51, 0, 51));
        OKBtn.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        OKBtn.setForeground(new java.awt.Color(255, 255, 255));
        OKBtn.setText("OK");
        OKBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKBtnActionPerformed(evt);
            }
        });
        add(OKBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 330, -1));

        BGLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahuja\\Desktop\\Project\\Pictures\\bg4.gif")); // NOI18N
        add(BGLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 380));
    }// </editor-fold>//GEN-END:initComponents

    String fn;
    String ln;
    String e1;
    String cn;
    String e2;
    
    private void OKBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKBtnActionPerformed
        // TODO add your handling code here:
        fn = fntf.getText();
        ln = lntf.getText();
        e1 = e1tf.getText();
        cn = cntf.getText();
        e2 = e2tf.getText();
        if (e1.equals(e2) && Pattern.matches("[a-zA-Z]+", cn) == false && cn.length()==10){ 
            try {
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/rentals?autoReconnect=true&useSSL=false","root","1234");
                Statement stmt = con.createStatement();
                String q = "insert into screen3 values('"+fn+"','"+ln+"','"+cn+"','"+e1+"');";
                System.out.println(q);
                int rs = stmt.executeUpdate(q);
                stmt.close();
                con.close();
                OKBtn.setVisible(false);
                fntf.setEnabled(false);
                lntf.setEnabled(false);
                e1tf.setEnabled(false);
                e2tf.setEnabled(false);
                cntf.setEnabled(false);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error in Connectivity");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Error: Please Check Your Information");
        }
    }//GEN-LAST:event_OKBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGLabel;
    private javax.swing.JButton OKBtn;
    private javax.swing.JTextField cntf;
    private javax.swing.JTextField e1tf;
    private javax.swing.JTextField e2tf;
    private javax.swing.JTextField fntf;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField lntf;
    // End of variables declaration//GEN-END:variables
}