/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutuionmediapleaseletitbefinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getString;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AppliedTuitionTable extends javax.swing.JFrame {

    /**
     * Creates new form AppliedTuitionTable
     */
    public AppliedTuitionTable() {
        initComponents();
        show_ATT();
    }

   public ArrayList<ATT> ATTList(){
        
        ArrayList<ATT> ATTList = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=TuitionMedia100;selectMethod=cursor", "sa", "123456");
            String Query1 = "SELECT * FROM APPLIED_TUITION";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(Query1);
            
            ATT att;
            while(rs.next()){
                
                att = new ATT(rs.getInt("serial"),rs.getInt("t_ID"),rs.getInt("s_ID")); 
                ATTList.add(att);
            }
            
 
        }catch(Exception e){
        
        System.out.println(e.getMessage());
        }return ATTList;
    }
   
   public void show_ATT(){
         ArrayList<ATT> list = ATTList();
        DefaultTableModel s_model = (DefaultTableModel) jTable_AppTuition.getModel();
        Object [] row = new Object[3];
        for(int i = 0; i<list.size(); i++){
            row[0] = list.get(i).getserial();
            row[1] = list.get(i).gett_ID();
            row[2] = list.get(i).gets_ID();
            
            s_model.addRow(row);
            
        }
     }
            
            
        
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_SID = new javax.swing.JTextField();
        jTextField_TID = new javax.swing.JTextField();
        jButton_Reject1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_AppTuition = new javax.swing.JTable();
        jButton_Approve = new javax.swing.JButton();
        jButton_Reject = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(74, 31, 61));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("   Tuition Media");

        jPanel5.setBackground(new java.awt.Color(74, 31, 61));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Applied Teachers");

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Teacher ID :");

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student ID   :");

        jTextField_SID.setBackground(new java.awt.Color(74, 31, 61));
        jTextField_SID.setForeground(new java.awt.Color(255, 255, 255));

        jTextField_TID.setBackground(new java.awt.Color(74, 31, 61));
        jTextField_TID.setForeground(new java.awt.Color(255, 255, 255));

        jButton_Reject1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_Reject1.setText("Back");
        jButton_Reject1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Reject1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(60, 60, 60))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_SID))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_TID)))))
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jButton_Reject1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_TID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_SID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Reject1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTable_AppTuition.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No", "Teachers ID", "Students ID"
            }
        ));
        jTable_AppTuition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_AppTuitionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_AppTuition);

        jButton_Approve.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_Approve.setText("APPROVE");
        jButton_Approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ApproveActionPerformed(evt);
            }
        });

        jButton_Reject.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_Reject.setText("REJECT");
        jButton_Reject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton_Approve, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(jButton_Reject, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Approve, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jButton_Reject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_AppTuitionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_AppTuitionMouseClicked
        // TODO add your handling code here:
        int i = jTable_AppTuition.getSelectedRow();
        TableModel model = jTable_AppTuition.getModel();
        jTextField_TID.setText(model.getValueAt(i, 1).toString());
        jTextField_SID.setText(model.getValueAt(i, 2).toString());
    }//GEN-LAST:event_jTable_AppTuitionMouseClicked

    private void jButton_ApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ApproveActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=TuitionMedia100;selectMethod=cursor", "sa", "123456");
            String Query = "INSERT INTO ONGOING_TUITION(t_ID,s_ID) values(?, ?)";
            PreparedStatement pst = connection.prepareStatement(Query);
            pst.setString(1,jTextField_TID.getText());
            pst.setString(2,jTextField_SID.getText());
            //int row = jTable_AppTuition.getSelectedRow();
            String value = (jTextField_TID.getText());
            String Query1 = "DELETE FROM APPLIED_TUITION where t_ID="+value;
            PreparedStatement pst1 = connection.prepareStatement(Query1);


            pst.executeUpdate();
            pst1.executeUpdate();
            JOptionPane.showMessageDialog(null, "Tuition Approved");
            //StudentLoginForm s = new StudentLoginForm();
            //s.show();

            //dispose();
            //int row = jTable_AppTuition.getSelectedRow();
            //String value = (jTable_AppTuition.getModel().getValueAt(row, 0).toString());
            //String Query1 = "DELETE FROM APPLIED_TUITION where t_ID="+value;
            //PreparedStatement pst1 = connection.prepareStatement(Query1);
           // pst1.executeUpdate();
            DefaultTableModel s_model = (DefaultTableModel) jTable_AppTuition.getModel();
            s_model.setRowCount(0);
            show_ATT();
            //JOptionPane.showMessageDialog(null, "Deleted Successfully");
            
            
        }

        catch(Exception e){

            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_jButton_ApproveActionPerformed

    private void jButton_RejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RejectActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=TuitionMedia100;selectMethod=cursor", "sa", "123456");
            String value = (jTextField_TID.getText());
            String Query = "DELETE FROM APPLIED_TUITION where t_ID="+value;
            PreparedStatement pst = connection.prepareStatement(Query);
            pst.executeUpdate();
            DefaultTableModel s_model = (DefaultTableModel) jTable_AppTuition.getModel();
            s_model.setRowCount(0);
            show_ATT();
            JOptionPane.showMessageDialog(null, "Tuition Rejected");
        } catch(Exception e){

            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton_RejectActionPerformed

    private void jButton_Reject1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Reject1ActionPerformed
        // TODO add your handling code here:
        AdminPanal adminPanal = new AdminPanal();
        adminPanal.show();
        dispose();
        
    }//GEN-LAST:event_jButton_Reject1ActionPerformed

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
            java.util.logging.Logger.getLogger(AppliedTuitionTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppliedTuitionTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppliedTuitionTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppliedTuitionTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppliedTuitionTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Approve;
    private javax.swing.JButton jButton_Reject;
    private javax.swing.JButton jButton_Reject1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_AppTuition;
    private javax.swing.JTextField jTextField_SID;
    private javax.swing.JTextField jTextField_TID;
    // End of variables declaration//GEN-END:variables
}
