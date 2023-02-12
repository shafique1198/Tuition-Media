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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author MD SHAFIQUE
 */
public class StudentsTable extends javax.swing.JFrame {

    /**
     * Creates new form StudentsTable
     */
    public StudentsTable() {
        initComponents();
        show_student();
    }
    
   
    public ArrayList<StudentA> StudentList(){
        
        ArrayList<StudentA> StudentList = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=TuitionMedia100;selectMethod=cursor", "sa", "123456");
            String Query1 = "SELECT * FROM STUDENT";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(Query1);
            
            StudentA studentA;
            while(rs.next()){
                
                studentA = new StudentA(rs.getInt("s_ID"),rs.getString("Name"),rs.getInt("Age"),rs.getString("Gender"),rs.getString("Educational_Institution"),rs.getString("Class"),rs.getString("Medium_Version"),rs.getInt("Phone"),rs.getInt("Area_Code")); 
                StudentList.add(studentA);
            }
            
 
        }catch(Exception e){
        
        System.out.println(e.getMessage());
        }return StudentList;
    }
    
    public void show_student(){
         ArrayList<StudentA> list = StudentList();
        DefaultTableModel s_model = (DefaultTableModel) S_A_Table.getModel();
        Object [] row = new Object[9];
        for(int i = 0; i<list.size(); i++){
            row[0] = list.get(i).gets_Id();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getAge();
            row[3] = list.get(i).getGender();
            row[4] = list.get(i).getEducational_Institution();
            row[5] = list.get(i).gets_Class();
            row[6] = list.get(i).getMedium_Version();
            row[7] = list.get(i).getPhone();
            row[8] = list.get(i).getArea_Code();
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
        textfield_A_s_Name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textfield_A_Age = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textfield_A_Gender = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textfield_A_EduI = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textfield_A_Phone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textfield_A_Area_Code = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        textfield_A_Medium = new javax.swing.JTextField();
        textfield_A_s_ID = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        textfield_A_class = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        S_A_Table = new javax.swing.JTable();
        jButton_UpdateTData = new javax.swing.JButton();
        jButton_DeleteTData = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(74, 31, 61));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("    Tuition Media");

        jPanel5.setBackground(new java.awt.Color(74, 31, 61));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Student");

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tutuionmediapleaseletitbefinal/icons8_user_20px.png"))); // NOI18N
        jLabel2.setText("Student Code    :");

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("        Name                :");

        textfield_A_s_Name.setBackground(new java.awt.Color(74, 31, 61));
        textfield_A_s_Name.setFont(new java.awt.Font("Sylfaen", 1, 15)); // NOI18N
        textfield_A_s_Name.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("        Age                     :");

        textfield_A_Age.setBackground(new java.awt.Color(74, 31, 61));
        textfield_A_Age.setFont(new java.awt.Font("Sylfaen", 1, 15)); // NOI18N
        textfield_A_Age.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("        Gender               :");

        textfield_A_Gender.setBackground(new java.awt.Color(74, 31, 61));
        textfield_A_Gender.setFont(new java.awt.Font("Sylfaen", 1, 15)); // NOI18N
        textfield_A_Gender.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Educational Institution:");

        textfield_A_EduI.setBackground(new java.awt.Color(74, 31, 61));
        textfield_A_EduI.setFont(new java.awt.Font("Sylfaen", 1, 15)); // NOI18N
        textfield_A_EduI.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("        Contact No          :");

        textfield_A_Phone.setBackground(new java.awt.Color(74, 31, 61));
        textfield_A_Phone.setFont(new java.awt.Font("Sylfaen", 1, 15)); // NOI18N
        textfield_A_Phone.setForeground(new java.awt.Color(255, 255, 255));
        textfield_A_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_A_PhoneActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tutuionmediapleaseletitbefinal/icons8_location_20px.png"))); // NOI18N
        jLabel11.setText("Postal Code        :");

        textfield_A_Area_Code.setBackground(new java.awt.Color(74, 31, 61));
        textfield_A_Area_Code.setFont(new java.awt.Font("Sylfaen", 1, 15)); // NOI18N
        textfield_A_Area_Code.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Class               :");

        textfield_A_Medium.setBackground(new java.awt.Color(74, 31, 61));
        textfield_A_Medium.setFont(new java.awt.Font("Sylfaen", 1, 15)); // NOI18N
        textfield_A_Medium.setForeground(new java.awt.Color(255, 255, 255));

        textfield_A_s_ID.setEditable(false);
        textfield_A_s_ID.setBackground(new java.awt.Color(74, 31, 61));
        textfield_A_s_ID.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Medium/Version       :");

        textfield_A_class.setBackground(new java.awt.Color(74, 31, 61));
        textfield_A_class.setFont(new java.awt.Font("Sylfaen", 1, 15)); // NOI18N
        textfield_A_class.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textfield_A_Medium))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textfield_A_s_ID))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textfield_A_Age)
                                    .addComponent(textfield_A_s_Name)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textfield_A_EduI)
                                    .addComponent(textfield_A_class, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textfield_A_Gender)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textfield_A_Area_Code))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textfield_A_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(textfield_A_s_ID)
                        .addGap(2, 2, 2)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_A_s_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_A_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_A_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_A_EduI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfield_A_class, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfield_A_Medium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield_A_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_A_Area_Code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        S_A_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "s_ID", "Name", "Age", "Gender", "Educational Institution", "Class", "Medium_Version", "Phone", "Area Code"
            }
        ));
        S_A_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                S_A_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(S_A_Table);

        jButton_UpdateTData.setBackground(new java.awt.Color(0, 102, 102));
        jButton_UpdateTData.setFont(new java.awt.Font("Agency FB", 1, 35)); // NOI18N
        jButton_UpdateTData.setForeground(new java.awt.Color(255, 255, 255));
        jButton_UpdateTData.setText("UPDATE");
        jButton_UpdateTData.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton_UpdateTData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateTDataActionPerformed(evt);
            }
        });

        jButton_DeleteTData.setBackground(new java.awt.Color(0, 102, 102));
        jButton_DeleteTData.setFont(new java.awt.Font("Agency FB", 1, 35)); // NOI18N
        jButton_DeleteTData.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DeleteTData.setText("DELETE");
        jButton_DeleteTData.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton_DeleteTData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteTDataActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setFont(new java.awt.Font("Agency FB", 1, 35)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("BACK");
        jButton6.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jButton_UpdateTData, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_DeleteTData, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_UpdateTData)
                    .addComponent(jButton_DeleteTData)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void textfield_A_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_A_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_A_PhoneActionPerformed

    private void S_A_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S_A_TableMouseClicked
        // TODO add your handling code here:
        int i = S_A_Table.getSelectedRow();
        TableModel model = S_A_Table.getModel();
        textfield_A_s_ID.setText(model.getValueAt(i, 0).toString());
        textfield_A_s_Name.setText(model.getValueAt(i, 1).toString());
        textfield_A_Age.setText(model.getValueAt(i, 2).toString());
        textfield_A_Gender.setText(model.getValueAt(i, 3).toString());
        textfield_A_EduI.setText(model.getValueAt(i, 4).toString());
        textfield_A_class.setText(model.getValueAt(i, 5).toString());
        textfield_A_Medium.setText(model.getValueAt(i, 6).toString());
        textfield_A_Phone.setText(model.getValueAt(i, 7).toString());
        textfield_A_Area_Code.setText(model.getValueAt(i, 7).toString());
    }//GEN-LAST:event_S_A_TableMouseClicked

    private void jButton_UpdateTDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateTDataActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=TuitionMedia100;selectMethod=cursor", "sa", "123456");

            int row = S_A_Table.getSelectedRow();
            String value = (S_A_Table.getModel().getValueAt(row,0).toString());
            String query = "UPDATE TEACHER SET Name=?, Age=?,Gender=?,Educational_Institution=?,Class=?,Medium_Version=?,Phone=?,Area_Code=? WHERE s_ID="+value;

            PreparedStatement pst = connection.prepareStatement(query);

            pst.setString(1,textfield_A_s_Name.getText());
            pst.setString(2,textfield_A_Age.getText());
            pst.setString(3,textfield_A_Gender.getText());
            pst.setString(4,textfield_A_EduI.getText());
            pst.setString(5,textfield_A_class.getText());
            pst.setString(6,textfield_A_Medium.getText());
            pst.setString(7,textfield_A_Phone.getText());
            pst.setString(8,textfield_A_Area_Code.getText());

            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)S_A_Table.getModel();
            model.setRowCount(0);
            show_student();
            JOptionPane.showMessageDialog(null, "Updated Successfully");
        }

        catch(Exception e){

            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton_UpdateTDataActionPerformed

    private void jButton_DeleteTDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteTDataActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=TuitionMedia100;selectMethod=cursor", "sa", "123456");
            int row = S_A_Table.getSelectedRow();
            String value = (S_A_Table.getModel().getValueAt(row, 0).toString());
            String Query = "DELETE FROM TEACHER where s_ID="+value;
            PreparedStatement pst = connection.prepareStatement(Query);
            pst.executeUpdate();
            DefaultTableModel s_model = (DefaultTableModel) S_A_Table.getModel();
            s_model.setRowCount(0);
            show_student();
            JOptionPane.showMessageDialog(null, "Deleted Successfully");

        }

        catch(Exception e){

            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton_DeleteTDataActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        AdminPanal adminPanal = new AdminPanal();
        adminPanal.show();
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable S_A_Table;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton_DeleteTData;
    private javax.swing.JButton jButton_UpdateTData;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textfield_A_Age;
    private javax.swing.JTextField textfield_A_Area_Code;
    private javax.swing.JTextField textfield_A_EduI;
    private javax.swing.JTextField textfield_A_Gender;
    private javax.swing.JTextField textfield_A_Medium;
    private javax.swing.JTextField textfield_A_Phone;
    private javax.swing.JTextField textfield_A_class;
    private javax.swing.JTextField textfield_A_s_ID;
    private javax.swing.JTextField textfield_A_s_Name;
    // End of variables declaration//GEN-END:variables
}
