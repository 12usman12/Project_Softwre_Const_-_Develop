/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package group_g_bse203030.bse203022.bse203031;

import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Osaf Ahmed
 */
public class FeeShow extends javax.swing.JFrame {

    /**
     * Creates new form FeeShow
     */
    public FeeShow() {
        initComponents();
        jTextArea1.setEnabled(false);
        feeShow();
    }
    public void feeShow()
    {
                    String name = null ;
                    String id = null ; 
                    String ChallanID = null ; 
                    String DateOFIssue = null ; 
                    String GetCourse = null ;
                    String CampusID = null ;
                    String ScholarShip = null ; 
                    String DueDate = null ;
                    String LateSubmition = null ;
                    int total = 0 ;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scd_project", "root","");
          
                
                Statement st = con.createStatement();
                
                String sql = "select * from feesummary";
                ResultSet r = st.executeQuery(sql);
                
                while(r.next()){
                    
                     name = r.getString("name");
                     id = r.getString("id"); 
                     ChallanID = r.getString("ChallanID"); 
                     DateOFIssue = r.getString("DateOFIssue"); 
                     GetCourse = r.getString("GetCourse");
                     CampusID = r.getString("CampusID");
                     ScholarShip = r.getString("ScholarShip"); 
                     DueDate = r.getString("DueDate");
                     LateSubmition = r.getString("LateSubmition");
                     total = r.getInt("total");
                    
                     
                }
                jTextArea1.append("                                                                                Capital University Of Science and Technology \n"
                                        + "                                                                                                      Islamabad     \n"
                                        + "                                                                                               Zone-V, Kahuta Road \n"
                                         + "                                                                                              THE BANK OF PUNJAB \n"
                                         + "                                                 ---------------------------------------------------------------------------------------------- \n\n "
                                         + "                                                    Name: "+name+"                                                                           Issue Date: "+DateOFIssue+"\n\n"
                                         + "                                                    ChallanID: "+ChallanID+"                                                                 CampusID: "+CampusID+"\n\n"
                                         + "                                                    ID : "+id+"                                                                           Course: "+GetCourse+"\n\n\n\n"
                                         + "                                                 ---------------------------------------------------------------------------------------------- \n\n  "
                                         + "                                                   Number                                      Particulars                                     Amount\n\n\n"
                                         + "                                                   1                           Tuition Fee,1st Inst.,18 U Sch,"+ScholarShip+" % Consc          "+total+"\n\n\n"
                                         + "                                                 ---------------------------------------------------------------------------------------------- \n\n  "
                                         + "                                                   Submit After"+DueDate+"                                                                        \n\n"
                                         + "                                                ---------------------------------------------------------------------------------------------- \\n\\n  \"\n" 
                                         + "                                                   Number                                      Particulars                                     Amount \n\n\n\n" 
                                           + "                                                   1                                      Tuition Fee,1st Inst.                             "+total+LateSubmition+ "\n\n\n\n ");
            con.close();    
            
            
        }
        catch(SQLException ex){
            System.out.println("Error occure on connecting database");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewStudentProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Your Fee");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(71, 71, 71)
                .addComponent(jButton2)
                .addGap(260, 260, 260))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String PrintData = jTextArea1.getText();
        PrinterJob job =PrinterJob.getPrinterJob();
        boolean doprint = job.printDialog();
        if(doprint)
        {
            try
            {
                jTextArea1.print();
                
            }catch(Exception e)
            {
                e.getMessage();
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        FeeShow f = new FeeShow();
         MainPageForStudent m = new MainPageForStudent();
         f.setVisible(false);
            m.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FeeShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeeShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeeShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeeShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeeShow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
