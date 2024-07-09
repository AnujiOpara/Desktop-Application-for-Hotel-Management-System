
package hotelmanagementsystem;

import java.sql.*;
import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JFrame {

    Connection con;
    
    public LoginPage() {
        initComponents();
        
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

        Login = new keeptoo.KGradientPanel();
        lbllogin = new javax.swing.JLabel();
        lblloginicn = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        usericnpanel = new javax.swing.JPanel();
        lblusericn = new javax.swing.JLabel();
        pswicnpanel = new javax.swing.JPanel();
        lblpswicn = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnsignup = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Form");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(820, 630));

        Login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 204), 5));
        Login.setkEndColor(new java.awt.Color(255, 255, 255));
        Login.setkStartColor(new java.awt.Color(193, 144, 255));
        Login.setMaximumSize(new java.awt.Dimension(800, 600));
        Login.setMinimumSize(new java.awt.Dimension(800, 600));
        Login.setOpaque(false);
        Login.setPreferredSize(new java.awt.Dimension(800, 600));
        Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbllogin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbllogin.setForeground(new java.awt.Color(153, 0, 153));
        lbllogin.setText("LOGIN");
        Login.add(lbllogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        lblloginicn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loginicn.png"))); // NOI18N
        Login.add(lblloginicn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 290, 270));

        lblusername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblusername.setForeground(new java.awt.Color(102, 0, 102));
        lblusername.setText("User Name");
        Login.add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        txtusername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtusername.setForeground(new java.awt.Color(102, 102, 102));
        txtusername.setBorder(null);
        txtusername.setPreferredSize(new java.awt.Dimension(75, 25));
        Login.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 290, 30));

        usericnpanel.setPreferredSize(new java.awt.Dimension(30, 30));

        lblusericn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/usericn1.png"))); // NOI18N

        javax.swing.GroupLayout usericnpanelLayout = new javax.swing.GroupLayout(usericnpanel);
        usericnpanel.setLayout(usericnpanelLayout);
        usericnpanelLayout.setHorizontalGroup(
            usericnpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usericnpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblusericn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        usericnpanelLayout.setVerticalGroup(
            usericnpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblusericn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Login.add(usericnpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 40, -1));

        pswicnpanel.setPreferredSize(new java.awt.Dimension(30, 30));

        lblpswicn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pswicn1.png"))); // NOI18N

        javax.swing.GroupLayout pswicnpanelLayout = new javax.swing.GroupLayout(pswicnpanel);
        pswicnpanel.setLayout(pswicnpanelLayout);
        pswicnpanelLayout.setHorizontalGroup(
            pswicnpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pswicnpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblpswicn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );
        pswicnpanelLayout.setVerticalGroup(
            pswicnpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblpswicn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Login.add(pswicnpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 40, -1));

        lblpassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(102, 0, 102));
        lblpassword.setText("Password");
        Login.add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        txtpassword.setBorder(null);
        txtpassword.setPreferredSize(new java.awt.Dimension(75, 25));
        Login.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 290, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("I don't have an account");
        Login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, -1, -1));

        btnsignup.setBackground(new java.awt.Color(153, 0, 153));
        btnsignup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsignup.setForeground(new java.awt.Color(204, 204, 255));
        btnsignup.setText("Sign Up");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        Login.add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 120, -1));

        btnlogin.setBackground(new java.awt.Color(0, 51, 204));
        btnlogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(204, 204, 255));
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        Login.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 90, 30));

        btnclose.setBackground(new java.awt.Color(0, 0, 153));
        btnclose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclose.setForeground(new java.awt.Color(255, 255, 255));
        btnclose.setText("Close");
        btnclose.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        Login.add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 580, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        SignupPage SignUpFrame = new SignupPage();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnsignupActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // Retrieve username and password inputs
    String username = txtusername.getText();
    String password = new String(txtpassword.getPassword());

    // Validate inputs
    if (username.isEmpty() && password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Fields should not be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
        txtusername.requestFocus();
        return; // Return early to prevent further processing
    }

    if (username.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Enter User Name.", "Warning", JOptionPane.WARNING_MESSAGE);
        txtusername.requestFocus();
        return; // Return early to prevent further processing
    }

    if (password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Enter Password.", "Warning", JOptionPane.WARNING_MESSAGE);
        txtpassword.requestFocus();
        return; // Return early to prevent further processing
    }

    try {
        // Prepare SQL statement
        String sql = "SELECT employeedetails.position, login.empID FROM login JOIN employeedetails ON login.empID = employeedetails.empID WHERE login.user = ? AND login.password = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, username);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();

        // Check if a match was found
        if (rs.next()) {
            String role = rs.getString("position");
            String empID = rs.getString("empID");

            // Navigate to appropriate dashboard based on role
            if (role.equalsIgnoreCase("Admin")) {
                dispose();
                AdminDashboard adminDashboard = new AdminDashboard(empID, username);
                adminDashboard.setVisible(true);
            } else if (role.equalsIgnoreCase("Receptionist")) {
                dispose();
                ReceptionistDashboard receptionistDashboard = new ReceptionistDashboard(empID, username);
                receptionistDashboard.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "You are not authorized for this role.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Handle invalid credentials
            JOptionPane.showMessageDialog(this, "Invalid User Name or Password.", "Error", JOptionPane.ERROR_MESSAGE);
            txtusername.setText("");
            txtpassword.setText("");
        }

    } catch (Exception e) {
        System.out.println("Error during login: " + e.getMessage());
        JOptionPane.showMessageDialog(this, "An error occurred during login.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnloginActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
    int choice = javax.swing.JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm", javax.swing.JOptionPane.YES_NO_OPTION);
    
    if (choice == javax.swing.JOptionPane.YES_OPTION) {
        this.dispose();
        System.exit(0);
    }
    }//GEN-LAST:event_btncloseActionPerformed
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel Login;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbllogin;
    private javax.swing.JLabel lblloginicn;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblpswicn;
    private javax.swing.JLabel lblusericn;
    private javax.swing.JLabel lblusername;
    private javax.swing.JPanel pswicnpanel;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    private javax.swing.JPanel usericnpanel;
    // End of variables declaration//GEN-END:variables
}
