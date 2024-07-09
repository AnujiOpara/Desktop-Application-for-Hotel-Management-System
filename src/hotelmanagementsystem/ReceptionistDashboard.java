
package hotelmanagementsystem;

public class ReceptionistDashboard extends javax.swing.JFrame {
    
    private String loggedInUsername;  // Declare the variable to hold the username
    private String employeeID; // Declare the variable to hold the empID
    
    public ReceptionistDashboard(String empID, String username) {
        initComponents();
        this.employeeID = empID; // Store the employee ID
        this.loggedInUsername = username; // Store the user name
        lbluser.setText("Logged in as: " + empID + " - " + username); // Display employee ID , user name
    }

    public ReceptionistDashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toppanel = new javax.swing.JPanel();
        btnmanageroom = new javax.swing.JButton();
        btncusreg = new javax.swing.JButton();
        btncheckout = new javax.swing.JButton();
        btncusdetails = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        lblhotelicn = new javax.swing.JLabel();
        lblhotel = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        toppanel.setBackground(new java.awt.Color(255, 255, 255));
        toppanel.setName(""); // NOI18N
        toppanel.setPreferredSize(new java.awt.Dimension(1920, 1080));
        toppanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnmanageroom.setBackground(new java.awt.Color(51, 0, 51));
        btnmanageroom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnmanageroom.setForeground(new java.awt.Color(255, 255, 255));
        btnmanageroom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/room3.png"))); // NOI18N
        btnmanageroom.setText("Manage Room");
        btnmanageroom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnmanageroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanageroomActionPerformed(evt);
            }
        });
        toppanel.add(btnmanageroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 170, 50));

        btncusreg.setBackground(new java.awt.Color(51, 0, 51));
        btncusreg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncusreg.setForeground(new java.awt.Color(255, 255, 255));
        btncusreg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reg5.png"))); // NOI18N
        btncusreg.setText("Check In");
        btncusreg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncusreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncusregActionPerformed(evt);
            }
        });
        toppanel.add(btncusreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 130, 50));

        btncheckout.setBackground(new java.awt.Color(51, 0, 51));
        btncheckout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncheckout.setForeground(new java.awt.Color(255, 255, 255));
        btncheckout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/checkout3.png"))); // NOI18N
        btncheckout.setText("Check Out");
        btncheckout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncheckoutActionPerformed(evt);
            }
        });
        toppanel.add(btncheckout, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 140, 50));

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
        toppanel.add(btncusdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 40, 180, 50));

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
        toppanel.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 40, 120, 50));

        lblhotelicn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hotel16.png"))); // NOI18N
        toppanel.add(lblhotelicn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, 120));

        lblhotel.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        lblhotel.setForeground(new java.awt.Color(102, 0, 102));
        lblhotel.setText("HOTEL");
        toppanel.add(lblhotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, 20));

        lbluser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toppanel.add(lbluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 120, 250, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg19.1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        toppanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(toppanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1660, 980));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncusdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncusdetailsActionPerformed
        
        // Create an instance of CusDetails and pass the logged-in username
    CusDetails f3 = new CusDetails(employeeID, loggedInUsername);
    f3.setVisible(true);
    }//GEN-LAST:event_btncusdetailsActionPerformed

    private void btnmanageroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanageroomActionPerformed
       
        ManageRoom f1 = new ManageRoom();
        f1.setVisible(true);
        
    }//GEN-LAST:event_btnmanageroomActionPerformed

    
    private void btncusregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncusregActionPerformed
        
        RegisterCustomer f2 = new RegisterCustomer();
        f2.setVisible(true);
    }//GEN-LAST:event_btncusregActionPerformed

    private void btncheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncheckoutActionPerformed
        
        CheckOutCustomer f4 = new CheckOutCustomer();
        f4.setVisible(true);
    }//GEN-LAST:event_btncheckoutActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        int choice = javax.swing.JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Confirm", javax.swing.JOptionPane.YES_NO_OPTION);
    
    if (choice == javax.swing.JOptionPane.YES_OPTION) {
        this.dispose();
        System.exit(0);
    }
    }//GEN-LAST:event_btnlogoutActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceptionistDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncheckout;
    private javax.swing.JButton btncusdetails;
    private javax.swing.JButton btncusreg;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnmanageroom;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblhotel;
    private javax.swing.JLabel lblhotelicn;
    private javax.swing.JLabel lbluser;
    private javax.swing.JPanel toppanel;
    // End of variables declaration//GEN-END:variables
}
