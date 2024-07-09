
package hotelmanagementsystem;

public class AdminDashboard extends javax.swing.JFrame {
    
private String loggedInUsername; // Add a field to hold the logged-in username
private String employeeID; // Add a field to hold the employee ID


 public AdminDashboard(String username, String empID) {
        initComponents();
        this.loggedInUsername = username; // Store the username
        this.employeeID = empID; // Store the employee ID
        lbluser.setText("Logged in as: " + empID + " - " + username); // // Display username and ID
    }
    
    public AdminDashboard() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toppanel = new javax.swing.JPanel();
        btnempregistration = new javax.swing.JButton();
        btnempmanagement = new javax.swing.JButton();
        lblhotelicn = new javax.swing.JLabel();
        lblhotel = new javax.swing.JLabel();
        btnempdetails = new javax.swing.JButton();
        btncusdetails = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        lbluser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1660, 980));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        toppanel.setBackground(new java.awt.Color(255, 255, 255));
        toppanel.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        toppanel.setMinimumSize(new java.awt.Dimension(727, 73));
        toppanel.setPreferredSize(new java.awt.Dimension(1920, 1080));
        toppanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnempregistration.setBackground(new java.awt.Color(51, 0, 51));
        btnempregistration.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnempregistration.setForeground(new java.awt.Color(255, 255, 255));
        btnempregistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reg5.png"))); // NOI18N
        btnempregistration.setText("Employee Registration");
        btnempregistration.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnempregistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnempregistrationActionPerformed(evt);
            }
        });
        toppanel.add(btnempregistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 240, 50));

        btnempmanagement.setBackground(new java.awt.Color(51, 0, 51));
        btnempmanagement.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnempmanagement.setForeground(new java.awt.Color(255, 255, 255));
        btnempmanagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/emp3.png"))); // NOI18N
        btnempmanagement.setText("Employee Management");
        btnempmanagement.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnempmanagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnempmanagementActionPerformed(evt);
            }
        });
        toppanel.add(btnempmanagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 240, 50));

        lblhotelicn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hotel16.png"))); // NOI18N
        toppanel.add(lblhotelicn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        lblhotel.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        lblhotel.setForeground(new java.awt.Color(102, 0, 102));
        lblhotel.setText("HOTEL");
        toppanel.add(lblhotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        btnempdetails.setBackground(new java.awt.Color(51, 0, 51));
        btnempdetails.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnempdetails.setForeground(new java.awt.Color(255, 255, 255));
        btnempdetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/details3.png"))); // NOI18N
        btnempdetails.setText("Employee Details");
        btnempdetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnempdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnempdetailsActionPerformed(evt);
            }
        });
        toppanel.add(btnempdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 42, 190, 50));

        btncusdetails.setBackground(new java.awt.Color(51, 0, 51));
        btncusdetails.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncusdetails.setForeground(new java.awt.Color(255, 255, 255));
        btncusdetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/details3.png"))); // NOI18N
        btncusdetails.setText("Customer Details");
        btncusdetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncusdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncusdetailsActionPerformed(evt);
            }
        });
        toppanel.add(btncusdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 40, 200, 50));

        btnlogout.setBackground(new java.awt.Color(51, 0, 51));
        btnlogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(255, 255, 255));
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout3.png"))); // NOI18N
        btnlogout.setText("Log out");
        btnlogout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        toppanel.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 40, 140, 50));

        lbluser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toppanel.add(lbluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 100, 240, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg18.1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        toppanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(toppanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed

    int choice = javax.swing.JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Confirm", javax.swing.JOptionPane.YES_NO_OPTION);
    
    if (choice == javax.swing.JOptionPane.YES_OPTION) {
        this.dispose();
        System.exit(0);
    }
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btncusdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncusdetailsActionPerformed
        
        CusDetails f4 = new CusDetails(employeeID, loggedInUsername);
        f4.setVisible(true);
    }//GEN-LAST:event_btncusdetailsActionPerformed

    private void btnempmanagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnempmanagementActionPerformed
        
        ManageEmp f2 = new ManageEmp();
        f2.setVisible(true);
    }//GEN-LAST:event_btnempmanagementActionPerformed

    private void btnempdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnempdetailsActionPerformed
        
        EmpDetails f3 = new EmpDetails();
        f3.setVisible(true);
    }//GEN-LAST:event_btnempdetailsActionPerformed

    private void btnempregistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnempregistrationActionPerformed
        
        RegisterEmp f1 = new RegisterEmp();
        f1.setVisible(true);
    }//GEN-LAST:event_btnempregistrationActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncusdetails;
    private javax.swing.JButton btnempdetails;
    private javax.swing.JButton btnempmanagement;
    private javax.swing.JButton btnempregistration;
    private javax.swing.JButton btnlogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblhotel;
    private javax.swing.JLabel lblhotelicn;
    private javax.swing.JLabel lbluser;
    private javax.swing.JPanel toppanel;
    // End of variables declaration//GEN-END:variables
}
