
package hotelmanagementsystem;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ManageEmp extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    DefaultTableModel tableModel;
    
    public ManageEmp() {
        initComponents();
        
        txtname.setEditable(false);
        txtgender.setEditable(false);
        txtcontactno.setEditable(false);
        txtaddress.setEditable(false);
        txtemail.setEditable(false);
        txtnic.setEditable(false);
        txtdob.setEditable(false);
        txtposition.setEditable(false);
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelms", "root", "aon2000db");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        toppanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        lblempid = new javax.swing.JLabel();
        txtempid = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        lblname = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblgender = new javax.swing.JLabel();
        txtgender = new javax.swing.JTextField();
        lblcontactno = new javax.swing.JLabel();
        txtcontactno = new javax.swing.JTextField();
        lbladdress = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lblnic = new javax.swing.JLabel();
        txtnic = new javax.swing.JTextField();
        lbldob = new javax.swing.JLabel();
        txtdob = new javax.swing.JTextField();
        lblposition = new javax.swing.JLabel();
        txtposition = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnupdate = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 200));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1420, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        toppanel.setBackground(new java.awt.Color(102, 153, 255));
        toppanel.setPreferredSize(new java.awt.Dimension(1620, 100));
        toppanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Manage Employee");
        toppanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        btnclose.setBackground(new java.awt.Color(102, 153, 255));
        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close2.png"))); // NOI18N
        btnclose.setBorder(null);
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        toppanel.add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 30, 40, 30));

        jPanel1.add(toppanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 80));

        lblempid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblempid.setText("Employee ID");
        jPanel1.add(lblempid, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        txtempid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtempid, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 210, -1));

        btnsearch.setBackground(new java.awt.Color(153, 0, 153));
        btnsearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(204, 204, 255));
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, -1, 30));

        lblname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblname.setText("Name");
        jPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, 30));

        txtname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 210, -1));

        lblgender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblgender.setText("Gender");
        jPanel1.add(lblgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, 30));

        txtgender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 210, -1));

        lblcontactno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcontactno.setText("Contact Number");
        jPanel1.add(lblcontactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, 30));

        txtcontactno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtcontactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 210, -1));

        lbladdress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbladdress.setText("Address");
        jPanel1.add(lbladdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, 30));

        txtaddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 210, -1));

        lblemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblemail.setText("Email");
        jPanel1.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, 30));

        txtemail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 210, -1));

        lblnic.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblnic.setText("NIC");
        jPanel1.add(lblnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, -1, 30));

        txtnic.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 210, -1));

        lbldob.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbldob.setText("Date of Birth");
        jPanel1.add(lbldob, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 170, -1, 30));

        txtdob.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 200, 210, -1));

        lblposition.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblposition.setText("Position");
        jPanel1.add(lblposition, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 250, -1, 30));

        txtposition.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtposition, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 280, 210, -1));

        jScrollPane1.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmpID", "Name", "Gender", "ContactNo", "Address", "Email", "nic", "Position"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 1000, 130));

        btnupdate.setBackground(new java.awt.Color(153, 0, 153));
        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(204, 204, 255));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 370, 90, 30));

        btnremove.setBackground(new java.awt.Color(153, 0, 153));
        btnremove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnremove.setForeground(new java.awt.Color(204, 204, 255));
        btnremove.setText("Remove");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        jPanel1.add(btnremove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 430, 90, 30));

        btnclear.setBackground(new java.awt.Color(153, 0, 153));
        btnclear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclear.setForeground(new java.awt.Color(204, 204, 255));
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 490, 90, 30));

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

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // Get the Employee ID from the text box
    String empId = txtempid.getText().trim();

    // Check if the Employee ID text box is empty
    if (empId.isEmpty()) {
        // Display a message prompting the user to enter an Employee ID
        JOptionPane.showMessageDialog(this, "Please enter an Employee ID.");
        return;  // Exit the method early
    }
        try {
            // Query to search for the employee by Employee ID
            String query = "SELECT * FROM employeedetails WHERE EmpID = ?";
            pstm = con.prepareStatement(query);
            pstm.setString(1, empId);
            rs = pstm.executeQuery();

            // Check if the employee was found
            if (rs.next()) {
                // Populate the text fields with the employee details
                txtname.setText(rs.getString("name"));
                txtgender.setText(rs.getString("gender"));
                txtcontactno.setText(rs.getString("contactno"));
                txtaddress.setText(rs.getString("address"));
                txtemail.setText(rs.getString("email"));
                txtnic.setText(rs.getString("nic"));
                txtdob.setText(rs.getString("dob"));
                txtposition.setText(rs.getString("position"));

                // Make the text fields editable
                txtname.setEditable(true);
                txtgender.setEditable(true);
                txtcontactno.setEditable(true);
                txtaddress.setEditable(true);
                txtemail.setEditable(true);
                txtnic.setEditable(true);
                txtdob.setEditable(true);
                txtposition.setEditable(true);
                
            } else {
                // Employee not found
                JOptionPane.showMessageDialog(this, "Employee not found.");
                clearTextFields();
            }
        } catch (SQLException e) {
            System.out.println("Error searching for employee: " + e.getMessage());
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        updateEmployeeDetails();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed

        // Get the Employee ID from the text box
    String empId = txtempid.getText().trim();

    // Check if the Employee ID text box is empty
    if (empId.isEmpty()) {
        // Display a message prompting the user to enter an Employee ID
        JOptionPane.showMessageDialog(this, "Please enter an Employee ID.");
        return;  // Exit the method early
    }

    try {
        // Delete from employeedetails
        String query = "DELETE FROM employeedetails WHERE empID = ?";
        pstm = con.prepareStatement(query);
        pstm.setString(1, empId);
        int rowsAffected = pstm.executeUpdate();

        if (rowsAffected > 0) {
            // Delete from login table
            String loginQuery = "DELETE FROM login WHERE empID = ?";
            pstm = con.prepareStatement(loginQuery);
            pstm.setString(1, empId);
            int loginRowsAffected = pstm.executeUpdate();

            if (loginRowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Employee and account removed successfully.");
                refreshJTable();
                clearTextFields();
            } else {
                JOptionPane.showMessageDialog(this, "Employee removed successfully.");
                refreshJTable();
                clearTextFields();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Failed to remove employee. Employee ID might not exist.");
        }
    } catch (SQLException e) {
        System.out.println("Error removing employee: " + e.getMessage());
    }

    }//GEN-LAST:event_btnremoveActionPerformed

    private void clearTextFields() {
        txtempid.setText("");
        txtname.setText("");
        txtgender.setText("");
        txtcontactno.setText("");
        txtaddress.setText("");
        txtemail.setText("");
        txtnic.setText("");
        txtdob.setText("");
        txtposition.setText("");
        txtname.setEditable(false);
        txtgender.setEditable(false);
        txtcontactno.setEditable(false);
        txtaddress.setEditable(false);
        txtemail.setEditable(false);
        txtnic.setEditable(false);
        txtdob.setEditable(false);
        txtposition.setEditable(false);
    }
    
    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        clearTextFields();
    }//GEN-LAST:event_btnclearActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try {
            String query = "SELECT * FROM employeedetails";
            pstm = con.prepareStatement(query);
            rs = pstm.executeQuery();
            
            tableModel = new DefaultTableModel(new String[]{"empID", "name", "gender", "contactno", "address", "email", "nic", "position"}, 0);
           
            while (rs.next()) {
                Object[] row = {
                    rs.getString("empID"),
                    rs.getString("name"),
                    rs.getString("gender"),
                    rs.getString("contactno"),
                    rs.getString("address"),
                    rs.getString("email"),
                    rs.getString("nic"),
                    rs.getString("position")
                };
                tableModel.addRow(row);
            }
            
            table.setModel(tableModel);
        } catch (SQLException e) {
            System.out.println("Error loading employee data: " + e.getMessage());
        }
    }                                   

     private void updateEmployeeDetails() {
         // Get the Employee ID from the text box
        String empId = txtempid.getText().trim();

        // Check if the Employee ID text box is empty
        if (empId.isEmpty()) {
        // Display a message prompting the user to enter an Employee ID
        JOptionPane.showMessageDialog(this, "Please enter an Employee ID.");
        return;  // Exit the method early
        }
        
        try {
        
        String name = txtname.getText();
        String gender = txtgender.getText();
        String contactno = txtcontactno.getText();
        String address = txtaddress.getText();
        String email = txtemail.getText();
        String nic = txtnic.getText();
        String dob = txtdob.getText();
        String position = txtposition.getText();

        // Retrieve the original data from the database for the given employee ID
        String selectQuery = "SELECT name, gender, contactno, address, email, nic, dob, position FROM employeedetails WHERE empID = ?";
        pstm = con.prepareStatement(selectQuery);
        pstm.setString(1, empId);
        rs = pstm.executeQuery();

        // Check if the employee was found
        if (rs.next()) {
            // Retrieve the original data from the database
            String originalName = rs.getString("name");
            String originalGender = rs.getString("gender");
            String originalContactNo = rs.getString("contactno");
            String originalAddress = rs.getString("address");
            String originalEmail = rs.getString("email");
            String originalNic = rs.getString("nic");
            String originalDob = rs.getString("dob");
            String originalPosition = rs.getString("position");

            // Compare the original data with the current data from the form
            boolean isUpdated = !name.equals(originalName) ||
                                !gender.equals(originalGender) ||
                                !contactno.equals(originalContactNo) ||
                                !address.equals(originalAddress) ||
                                !email.equals(originalEmail) ||
                                !nic.equals(originalNic) ||
                                !dob.equals(originalDob) ||
                                !position.equals(originalPosition);

            if (isUpdated) {
                // Perform the update operation if there are changes
                String updateQuery = "UPDATE employeedetails SET name = ?, gender = ?, contactno = ?, address = ?, email = ?, nic = ?, dob = ?, position = ? WHERE empID = ?";
                pstm = con.prepareStatement(updateQuery);
                pstm.setString(1, name);
                pstm.setString(2, gender);
                pstm.setString(3, contactno);
                pstm.setString(4, address);
                pstm.setString(5, email);
                pstm.setString(6, nic);
                pstm.setString(7, dob);
                pstm.setString(8, position);
                pstm.setString(9, empId);

                int rowsAffected = pstm.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Employee details updated successfully.");
                    refreshJTable();
                    clearTextFields();
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to update employee details. Please try again.");
                }
            } else {
                // Display a message if no changes were made
                JOptionPane.showMessageDialog(this, "No changes made to employee details.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Employee not found.");
        }
    } catch (SQLException e) {
        System.out.println("Error updating employee details: " + e.getMessage());
    }
    }

    private void refreshJTable() {
        try {
            String query = "SELECT * FROM employeedetails";
            pstm = con.prepareStatement(query);
            rs = pstm.executeQuery();

            tableModel = new DefaultTableModel(new String[]{"EmpID", "Name", "Gender", "ContactNo", "Address", "Email", "NIC", "Position"}, 0);

            while (rs.next()) {
                Object[] row = {
                    rs.getString("empID"),
                    rs.getString("name"),
                    rs.getString("gender"),
                    rs.getString("contactno"),
                    rs.getString("address"),
                    rs.getString("email"),
                    rs.getString("nic"),
                    rs.getString("position")
                };
                tableModel.addRow(row);
            }

            table.setModel(tableModel);
        } catch (SQLException e) {
            System.out.println("Error refreshing JTable: " + e.getMessage());
        }
    

    }//GEN-LAST:event_formComponentShown

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        int choice = javax.swing.JOptionPane.showConfirmDialog(this, "Are you sure you want to close this application?", "Confirm", javax.swing.JOptionPane.YES_NO_OPTION);

        if (choice == javax.swing.JOptionPane.YES_OPTION) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_btncloseActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblcontactno;
    private javax.swing.JLabel lbldob;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblempid;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblnic;
    private javax.swing.JLabel lblposition;
    private javax.swing.JTable table;
    private javax.swing.JPanel toppanel;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcontactno;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtempid;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnic;
    private javax.swing.JTextField txtposition;
    // End of variables declaration//GEN-END:variables
}
