/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package group_g_bse203030.bse203022.bse203031;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VAIO
 */
public class Teacher_education_foam extends javax.swing.JFrame {

    /**
     * Creates new form Teacher_education_foam
     */
    public Teacher_education_foam() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        t3 = new javax.swing.JTable();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Teachers Profile");

        t1.setBackground(new java.awt.Color(153, 255, 255));
        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Degree", "Institution"
            }
        ));
        t1.setIntercellSpacing(new java.awt.Dimension(20, 0));
        t1.setRowHeight(40);
        jScrollPane1.setViewportView(t1);

        t2.setBackground(new java.awt.Color(153, 255, 255));
        t2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Degree", "Institution"
            }
        ));
        t2.setIntercellSpacing(new java.awt.Dimension(20, 0));
        t2.setRowHeight(40);
        jScrollPane2.setViewportView(t2);

        t3.setBackground(new java.awt.Color(153, 255, 255));
        t3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Degree", "Institution"
            }
        ));
        t3.setIntercellSpacing(new java.awt.Dimension(20, 0));
        t3.setRowHeight(40);
        jScrollPane3.setViewportView(t3);

        b1.setBackground(new java.awt.Color(102, 255, 102));
        b1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b1.setText("Sir QAISAR MANZOOR ");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(102, 255, 102));
        b2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b2.setText("Sir MEHRAN YOUSAF");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(102, 255, 102));
        b3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b3.setText("Sir AAMER NADEEM");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(110, 110, 110)
                .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(132, 132, 132)
                .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b2)
                            .addComponent(b1)
                            .addComponent(b3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(82, 82, 82)))
                .addGap(8, 8, 8)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scd_project", "root","");
          
                
                Statement st = con.createStatement();
                
                String sql = "select * from teacher_t1";
                ResultSet r = st.executeQuery(sql);
                
                while(r.next()){
                    
                    String c1 = r.getString("Degree");
                    String c2 = r.getString("Institution");
                    
                   
                    
                    String tabdata[] = {c1,c2};
                    DefaultTableModel model = (DefaultTableModel)t1.getModel();
                    model.addRow(tabdata);
                }
            con.close();    
            
            
        }
        catch(SQLException ex){
            System.out.println("Error occure on connecting database");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Attendence_foam.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scd_project", "root","");
          
                
                Statement st = con.createStatement();
                
                String sql = "select * from teacher_t2";
                ResultSet r = st.executeQuery(sql);
                
                while(r.next()){
                    
                    String c1 = r.getString("Degree");
                    String c2 = r.getString("Institution");
                    
                   
                    
                    String tabdata[] = {c1,c2};
                    DefaultTableModel model = (DefaultTableModel)t2.getModel();
                    model.addRow(tabdata);
                }
            con.close();    
            
            
        }
        catch(SQLException ex){
            System.out.println("Error occure on connecting database");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Attendence_foam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scd_project", "root","");
          
                
                Statement st = con.createStatement();
                
                String sql = "select * from teacher_t3";
                ResultSet r = st.executeQuery(sql);
                
                while(r.next()){
                    
                    String c1 = r.getString("Degree");
                    String c2 = r.getString("Institution");
                    
                   
                    
                    String tabdata[] = {c1,c2};
                    DefaultTableModel model = (DefaultTableModel)t3.getModel();
                    model.addRow(tabdata);
                }
            con.close();    
            
            
        }
        catch(SQLException ex){
            System.out.println("Error occure on connecting database");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Attendence_foam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Teacher_education_foam t =new Teacher_education_foam();
        MainPageForStudent m = new MainPageForStudent();
         t.setVisible(false);
            m.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Teacher_education_foam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher_education_foam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher_education_foam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher_education_foam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher_education_foam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable t1;
    private javax.swing.JTable t2;
    private javax.swing.JTable t3;
    // End of variables declaration//GEN-END:variables
}
