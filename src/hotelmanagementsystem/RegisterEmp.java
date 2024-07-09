
package hotelmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class RegisterEmp extends javax.swing.JFrame {

   Connection con;
   PreparedStatement pstm;
   ResultSet rs;
   String imgPath = null;
   
    public RegisterEmp() {
        initComponents();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelms", "root", "aon2000db");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
     private boolean isEmailValid(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
     // Validate numeric input
    private boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
    
    // Validate NIC format (Sri Lanka)
    private boolean isNicValid(String nic) {
        String oldNicRegex = "^[0-9]{9}[VvXx]$";
        String newNicRegex = "^[0-9]{12}$";
        return nic.matches(oldNicRegex) || nic.matches(newNicRegex);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        toppanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        lblname = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblgender = new javax.swing.JLabel();
        cmbgender = new javax.swing.JComboBox<>();
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
        btnregister1 = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        lblimg = new javax.swing.JLabel();
        btnaddimg = new javax.swing.JButton();
        btnremoveimg = new javax.swing.JButton();
        lblpositionval = new javax.swing.JLabel();
        lblnameval = new javax.swing.JLabel();
        lblconval = new javax.swing.JLabel();
        lbladdressval = new javax.swing.JLabel();
        lblemailval = new javax.swing.JLabel();
        lblnicval = new javax.swing.JLabel();
        lbldobval = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1420, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        toppanel.setBackground(new java.awt.Color(102, 153, 255));
        toppanel.setPreferredSize(new java.awt.Dimension(1620, 100));
        toppanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Employee Registration");
        toppanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, 50));

        btnclose.setBackground(new java.awt.Color(102, 153, 255));
        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close2.png"))); // NOI18N
        btnclose.setBorder(null);
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        toppanel.add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 30, 40, 30));

        jPanel1.add(toppanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 80));

        lblname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblname.setText("Name");
        jPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        txtname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 260, -1));

        lblgender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblgender.setText("Gender");
        jPanel1.add(lblgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        cmbgender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jPanel1.add(cmbgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 120, -1));

        lblcontactno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcontactno.setText("Contact Number");
        jPanel1.add(lblcontactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        txtcontactno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtcontactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 260, -1));

        lbladdress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbladdress.setText("Address");
        jPanel1.add(lbladdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, -1, -1));

        txtaddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 250, -1));

        lblemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblemail.setText("Email");
        jPanel1.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, -1, -1));

        txtemail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 280, -1));

        lblnic.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblnic.setText("NIC");
        jPanel1.add(lblnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, -1, -1));

        txtnic.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 280, -1));

        lbldob.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbldob.setText("Date of Birth");
        jPanel1.add(lbldob, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, -1, -1));

        txtdob.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 280, -1));

        lblposition.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblposition.setText("Position");
        jPanel1.add(lblposition, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, -1, -1));

        txtposition.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtposition, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 280, -1));

        btnregister1.setBackground(new java.awt.Color(153, 0, 153));
        btnregister1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnregister1.setForeground(new java.awt.Color(204, 204, 255));
        btnregister1.setText("Register");
        btnregister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregister1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnregister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 460, -1, 40));

        btnclear.setBackground(new java.awt.Color(153, 0, 153));
        btnclear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclear.setForeground(new java.awt.Color(204, 204, 255));
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 460, -1, 40));

        lblimg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblimg.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(lblimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 200, 130, 140));

        btnaddimg.setBackground(new java.awt.Color(0, 102, 102));
        btnaddimg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnaddimg.setForeground(new java.awt.Color(255, 255, 255));
        btnaddimg.setText("Add Image");
        btnaddimg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddimgActionPerformed(evt);
            }
        });
        jPanel1.add(btnaddimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 230, 120, -1));

        btnremoveimg.setBackground(new java.awt.Color(0, 102, 102));
        btnremoveimg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnremoveimg.setForeground(new java.awt.Color(255, 255, 255));
        btnremoveimg.setText("Remove Image");
        btnremoveimg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveimgActionPerformed(evt);
            }
        });
        jPanel1.add(btnremoveimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 260, 120, -1));

        lblpositionval.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lblpositionval, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 260, 20));

        lblnameval.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lblnameval, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 260, 20));

        lblconval.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lblconval, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 370, 20));

        lbladdressval.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lbladdressval, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 260, 20));

        lblemailval.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lblemailval, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 280, 20));

        lblnicval.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lblnicval, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 280, 20));

        lbldobval.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lbldobval, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 280, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed

        txtname.setText("");
        txtcontactno.setText("");
        txtdob.setText("");
        txtnic.setText("");
        txtaddress.setText("");
        txtemail.setText("");
        txtposition.setText("");
        
        lblnameval.setText("");
        lblconval.setText("");
        lbladdressval.setText("");
        lblemailval.setText("");
        lblnicval.setText("");
        lbldobval.setText("");
        lblpositionval.setText("");

    }//GEN-LAST:event_btnclearActionPerformed

    private void btnregister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregister1ActionPerformed
        boolean isValid = true;
    
    // Validate name
    if (txtname.getText().isEmpty()) {
        lblnameval.setText("Name is required.");
        txtname.requestFocus();
        isValid = false;
    } else {
        lblnameval.setText("");  // Clear the validation message
    }
    
    // Validate contact number
    if (txtcontactno.getText().isEmpty()) {
        lblconval.setText("Contact Number is required.");
        txtcontactno.requestFocus();
        isValid = false;
    } else if (!isNumeric(txtcontactno.getText())) {
        lblconval.setText("Contact Number must contain numeric characters only.");
        txtcontactno.requestFocus();
        isValid = false;
    } else {
        lblconval.setText("");  // Clear the validation message
    }
    
    // Validate address
    if (txtaddress.getText().isEmpty()) {
        lbladdressval.setText("Address is required.");
        txtaddress.requestFocus();
        isValid = false;
    } else {
        lbladdressval.setText("");  // Clear the validation message
    }
    
    // Validate email
    if (txtemail.getText().isEmpty()) {
        lblemailval.setText("Email is required.");
        txtemail.requestFocus();
        isValid = false;
    } else if (!isEmailValid(txtemail.getText())) {
        lblemailval.setText("Invalid Email format.");
        txtemail.requestFocus();
        isValid = false;
    } else {
        lblemailval.setText("");  // Clear the validation message
    }
    
    // Validate NIC
    if (txtnic.getText().isEmpty()) {
        lblnicval.setText("NIC is required.");
        txtnic.requestFocus();
        isValid = false;
    } else if (!isNicValid(txtnic.getText())) {
            lblnicval.setText("Invalid NIC format.");
            txtnic.requestFocus();
            isValid = false;
    } else {
        lblnicval.setText("");  // Clear the validation message
    }

    // Validate date of birth
    if (txtdob.getText().isEmpty()) {
        lbldobval.setText("Date of Birth is required.");
        txtdob.requestFocus();
        isValid = false;
    } else {
        lbldobval.setText("");  // Clear the validation message
    }

    if (txtposition.getText().isEmpty()) {
        lblpositionval.setText("Position is required.");
        txtposition.requestFocus();
        isValid = false;
    } else {
        lblpositionval.setText("");  // Clear the validation message
    }
    
    // Ensure all required fields are valid before proceeding with room allocation
        if (lblnameval.getText().isEmpty() && lblconval.getText().isEmpty() && lbladdressval.getText().isEmpty()
                && lbldobval.getText().isEmpty()&& lblemailval.getText().isEmpty() && lblnicval.getText().isEmpty()
                && lbldobval.getText().isEmpty() && lblpositionval.getText().isEmpty()) {
                
            try{ 
                Statement stmt = con.createStatement();
                rs = stmt.executeQuery("SELECT empID FROM employeedetails ORDER BY empID DESC LIMIT 1");

                String newEmpID;
                if (rs.next()) {
                    String maxEmpID = rs.getString("empID");
                    int maxNumber = Integer.parseInt(maxEmpID.substring(3));
                    int newNumber = maxNumber + 1;
                    newEmpID = String.format("EMP%03d", newNumber);
                } else {
                    newEmpID = "EMP001";
                }
               
                pstm = con.prepareStatement("INSERT INTO employeedetails (empID, name, gender, contactno, dob, address, email, nic, position, empimg) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                pstm.setString(1, newEmpID);
                pstm.setString(2, txtname.getText());
                pstm.setString(3, cmbgender.getSelectedItem().toString());
                pstm.setString(4, txtcontactno.getText());
                pstm.setString(5, txtdob.getText());
                pstm.setString(6, txtaddress.getText());
                pstm.setString(7, txtemail.getText());
                pstm.setString(8, txtnic.getText());
                pstm.setString(9, txtposition.getText());
                pstm.setString(10, imgPath);
                
                pstm.executeUpdate();

                JOptionPane.showMessageDialog(this, "Employee registered successfully.");

                btnclearActionPerformed(evt);

            } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    }//GEN-LAST:event_btnregister1ActionPerformed

    
    
    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        int choice = javax.swing.JOptionPane.showConfirmDialog(this, "Are you sure you want to close this application?", "Confirm", javax.swing.JOptionPane.YES_NO_OPTION);

        if (choice == javax.swing.JOptionPane.YES_OPTION) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnaddimgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddimgActionPerformed
        // Specify the desired directory path
    String defaultDirectoryPath = "C:\\Users\\Opara\\Documents\\NetBeansProjects\\HotelManagementSystem\\src\\image";

    // Create a JFileChooser with the specified directory as the current directory
    JFileChooser fileChooser = new JFileChooser(new File(defaultDirectoryPath));
    // Add file filter for images
    FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "png");
    fileChooser.addChoosableFileFilter(filter);
    
    int result = fileChooser.showOpenDialog(null);  // Changed from showSaveDialog to showOpenDialog
    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        imgPath = selectedFile.getAbsolutePath();
        ImageIcon imgIcon = new ImageIcon(new ImageIcon(imgPath).getImage().getScaledInstance(lblimg.getWidth(), lblimg.getHeight(), Image.SCALE_SMOOTH));
        lblimg.setIcon(imgIcon);
    }
    }//GEN-LAST:event_btnaddimgActionPerformed

    private void btnremoveimgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveimgActionPerformed
        lblimg.setIcon(null);
        imgPath = null;
    }//GEN-LAST:event_btnremoveimgActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddimg;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnregister1;
    private javax.swing.JButton btnremoveimg;
    private javax.swing.JComboBox<String> cmbgender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lbladdressval;
    private javax.swing.JLabel lblcontactno;
    private javax.swing.JLabel lblconval;
    private javax.swing.JLabel lbldob;
    private javax.swing.JLabel lbldobval;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblemailval;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lblimg;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblnameval;
    private javax.swing.JLabel lblnic;
    private javax.swing.JLabel lblnicval;
    private javax.swing.JLabel lblposition;
    private javax.swing.JLabel lblpositionval;
    private javax.swing.JPanel toppanel;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcontactno;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnic;
    private javax.swing.JTextField txtposition;
    // End of variables declaration//GEN-END:variables
}
