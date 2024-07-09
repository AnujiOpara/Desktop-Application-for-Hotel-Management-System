
package hotelmanagementsystem;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;


public class EmpDetails extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    String selectedEmpID = null;  // Store the selected employee ID
    
    public EmpDetails() {
        initComponents();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelms", "root", "aon2000db");
            loadEmployees();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                int row = table.rowAtPoint(evt.getPoint());
                if (row >= 0) {
                    selectedEmpID = table.getValueAt(row, 0).toString();  // Store the employee ID of the selected row
                }
            }
        });
    }
    
    private void loadEmployees() {
        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);

            String query = "SELECT * FROM employeedetails";
            pstm = con.prepareStatement(query);
            rs = pstm.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("empID"),
                    rs.getString("name"),
                    rs.getString("gender"),
                    rs.getString("contactno"),
                    rs.getString("dob"),
                    rs.getString("address"),
                    rs.getString("email"),
                    rs.getString("nic"),
                    rs.getString("position")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }


 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btndetails = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 200));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1420, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1620, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Employee Details");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        btnclose.setBackground(new java.awt.Color(102, 153, 255));
        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close2.png"))); // NOI18N
        btnclose.setBorder(null);
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        jPanel2.add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 30, 40, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 80));

        jScrollPane1.setBorder(null);

        table.setBackground(new java.awt.Color(231, 231, 252));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmpID", "Name", "Gender", "ContactNo", "Address", "Email", "NIC", "DOB", "Position"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 1150, 340));

        btndetails.setBackground(new java.awt.Color(0, 102, 102));
        btndetails.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btndetails.setForeground(new java.awt.Color(255, 255, 255));
        btndetails.setText("Give Details");
        btndetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndetailsActionPerformed(evt);
            }
        });
        jPanel1.add(btndetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 330, -1, -1));

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

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        int choice = javax.swing.JOptionPane.showConfirmDialog(this, "Are you sure you want to close this application?", "Confirm", javax.swing.JOptionPane.YES_NO_OPTION);

        if (choice == javax.swing.JOptionPane.YES_OPTION) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_btncloseActionPerformed

    private void btndetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndetailsActionPerformed
        if (selectedEmpID != null) {
            new Emp(selectedEmpID).setVisible(true);  // Open the Emp page with the selected employee ID
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Please select an employee from the table.");
        }
    }//GEN-LAST:event_btndetailsActionPerformed

      
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
