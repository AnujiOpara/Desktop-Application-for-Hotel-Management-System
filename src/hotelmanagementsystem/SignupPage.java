
package hotelmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class SignupPage extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    
    public SignupPage() {
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        lblsignup = new javax.swing.JLabel();
        lblsignupicn = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        lblempid = new javax.swing.JLabel();
        txtempid = new javax.swing.JTextField();
        lblpassword = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        lblconfirmpassword = new javax.swing.JLabel();
        txtconfirmpassword = new javax.swing.JPasswordField();
        btnsignup = new javax.swing.JButton();
        lblname = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Signup Form");
        setUndecorated(true);

        kGradientPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 5));
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 153, 255));
        kGradientPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblsignup.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblsignup.setForeground(new java.awt.Color(102, 0, 102));
        lblsignup.setText("SIGN UP");
        kGradientPanel1.add(lblsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 150, -1));

        lblsignupicn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loginicn.png"))); // NOI18N
        kGradientPanel1.add(lblsignupicn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        lblusername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblusername.setForeground(new java.awt.Color(102, 0, 102));
        lblusername.setText("User Name");
        kGradientPanel1.add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        txtusername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtusername.setForeground(new java.awt.Color(102, 102, 102));
        txtusername.setBorder(null);
        kGradientPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 230, -1));

        lblempid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblempid.setForeground(new java.awt.Color(102, 0, 102));
        lblempid.setText("Emp ID");
        kGradientPanel1.add(lblempid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        txtempid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtempid.setForeground(new java.awt.Color(102, 102, 102));
        txtempid.setBorder(null);
        kGradientPanel1.add(txtempid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 230, -1));

        lblpassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(102, 0, 102));
        lblpassword.setText("Password");
        kGradientPanel1.add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        txtpassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(102, 102, 102));
        txtpassword.setBorder(null);
        kGradientPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 230, -1));

        lblconfirmpassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblconfirmpassword.setForeground(new java.awt.Color(102, 0, 102));
        lblconfirmpassword.setText("Confirm Password");
        kGradientPanel1.add(lblconfirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));

        txtconfirmpassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtconfirmpassword.setForeground(new java.awt.Color(102, 102, 102));
        txtconfirmpassword.setBorder(null);
        kGradientPanel1.add(txtconfirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 230, -1));

        btnsignup.setBackground(new java.awt.Color(0, 51, 204));
        btnsignup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsignup.setForeground(new java.awt.Color(204, 204, 255));
        btnsignup.setText("Sign Up");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 110, 40));

        lblname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblname.setForeground(new java.awt.Color(102, 0, 102));
        lblname.setText("Name");
        kGradientPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        txtname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtname.setForeground(new java.awt.Color(102, 102, 102));
        txtname.setBorder(null);
        kGradientPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 230, -1));

        btnback.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnback.setForeground(new java.awt.Color(102, 0, 204));
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back3.png"))); // NOI18N
        btnback.setText("Back");
        btnback.setBorder(null);
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 570, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        
        if (txtname.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "All Fields are Required.");
        txtname.requestFocus();
    } else if (txtempid.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "All Fields are Required.");
        txtempid.requestFocus();
    } else if (txtusername.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "All Fields are Required.");
        txtusername.requestFocus();
    }else if (txtpassword.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "All Fields are Required.");
        txtpassword.requestFocus();
    } else if (txtconfirmpassword.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "All Fields are Required.");
        txtconfirmpassword.requestFocus();
    } else if (!txtpassword.getText().equals(txtconfirmpassword.getText())) {
        JOptionPane.showMessageDialog(this, "Passwords do not match. Please try again.");
        txtpassword.requestFocus();
    } else {
        try {
            pstm = con.prepareStatement("SELECT * FROM employeedetails WHERE empID = ? AND name = ?");
            pstm.setString(1, txtempid.getText());
            pstm.setString(2, txtname.getText());
            rs = pstm.executeQuery();
            
            if (rs.next()) {
               
                pstm = con.prepareStatement("SELECT * FROM login WHERE empID = ?");
                pstm.setString(1, txtempid.getText());
                rs = pstm.executeQuery();
                
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "An account already exists.");
                } else {
                   
                    pstm = con.prepareStatement("INSERT INTO login(user, empID, password) VALUES(?, ?, ?)");
                    pstm.setString(1, txtusername.getText());
                    pstm.setString(2, txtempid.getText());
                    pstm.setString(3, txtpassword.getText());
                    
                    pstm.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Sign up successfully.");
                   
                    LoginPage LoginFrame = new LoginPage();
                    LoginFrame.setVisible(true);
                    LoginFrame.pack();
                    LoginFrame.setLocationRelativeTo(null);
                    this.dispose();
                }
            } else {
                
                JOptionPane.showMessageDialog(this, "Invalid name or employee ID. Please try again.");
                txtempid.requestFocus();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    }//GEN-LAST:event_btnsignupActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        this.dispose();
        LoginPage LoginFrame = new LoginPage();
        LoginFrame.setVisible(true);
        
    }//GEN-LAST:event_btnbackActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnsignup;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblconfirmpassword;
    private javax.swing.JLabel lblempid;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblsignup;
    private javax.swing.JLabel lblsignupicn;
    private javax.swing.JLabel lblusername;
    private javax.swing.JPasswordField txtconfirmpassword;
    private javax.swing.JTextField txtempid;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
