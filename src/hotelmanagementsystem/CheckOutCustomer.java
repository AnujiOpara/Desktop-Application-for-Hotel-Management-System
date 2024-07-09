
package hotelmanagementsystem;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class CheckOutCustomer extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    
    
    public CheckOutCustomer() {
        initComponents();
        
         // Initialize text fields to be non-editable
        txtname.setEditable(false);
        txtcontactnumber.setEditable(false);
        txtemail.setEditable(false);
        txtcheckindate.setEditable(false);
        txtcheckoutdate.setEditable(false);
        txtpriceperday.setEditable(false);
        txtnumberofdays.setEditable(false);
        txttotalamount.setEditable(false);
        
        
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
        lblcuscheckout = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        lblroomnumber = new javax.swing.JLabel();
        txtroomnumber = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        lblname = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblcontactnumber = new javax.swing.JLabel();
        txtcontactnumber = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lblcheckindate = new javax.swing.JLabel();
        txtcheckindate = new javax.swing.JTextField();
        lblcheckoutdate = new javax.swing.JLabel();
        txtcheckoutdate = new javax.swing.JTextField();
        lblpriceperday = new javax.swing.JLabel();
        txtpriceperday = new javax.swing.JTextField();
        lblnumberofdays = new javax.swing.JLabel();
        txtnumberofdays = new javax.swing.JTextField();
        lbltotalamount = new javax.swing.JLabel();
        txttotalamount = new javax.swing.JTextField();
        btncheckout = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        lblcheckouttime = new javax.swing.JLabel();
        txtcheckouttime = new javax.swing.JTextField();

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

        lblcuscheckout.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblcuscheckout.setForeground(new java.awt.Color(102, 0, 102));
        lblcuscheckout.setText("Customer Check Out");
        toppanel.add(lblcuscheckout, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        btnclose.setBackground(new java.awt.Color(102, 153, 255));
        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close2.png"))); // NOI18N
        btnclose.setBorder(null);
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        toppanel.add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 20, 40, 30));

        jPanel1.add(toppanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        lblroomnumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblroomnumber.setText("Room Number");
        jPanel1.add(lblroomnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        txtroomnumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtroomnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 174, -1));

        btnsearch.setBackground(new java.awt.Color(153, 0, 153));
        btnsearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(204, 204, 255));
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, -1, -1));

        lblname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblname.setText("Name");
        jPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        txtname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 250, -1));

        lblcontactnumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcontactnumber.setText("Contact Number");
        jPanel1.add(lblcontactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        txtcontactnumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtcontactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 250, -1));

        lblemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblemail.setText("Email");
        jPanel1.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        txtemail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 250, -1));

        lblcheckindate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcheckindate.setText("Check In Date");
        jPanel1.add(lblcheckindate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        txtcheckindate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtcheckindate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 220, -1));

        lblcheckoutdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcheckoutdate.setText("Check Out Date(Today)");
        jPanel1.add(lblcheckoutdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, -1));

        txtcheckoutdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtcheckoutdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 220, -1));

        lblpriceperday.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblpriceperday.setText("Price per Day");
        jPanel1.add(lblpriceperday, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, -1, -1));

        txtpriceperday.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtpriceperday, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, 220, -1));

        lblnumberofdays.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblnumberofdays.setText("Number of Days");
        jPanel1.add(lblnumberofdays, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, -1, -1));

        txtnumberofdays.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtnumberofdays, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, 220, -1));

        lbltotalamount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbltotalamount.setText("Total Amount");
        jPanel1.add(lbltotalamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 350, -1, -1));

        txttotalamount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txttotalamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 380, 220, -1));

        btncheckout.setBackground(new java.awt.Color(153, 0, 153));
        btncheckout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncheckout.setForeground(new java.awt.Color(204, 204, 255));
        btncheckout.setText("Check Out");
        btncheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncheckoutActionPerformed(evt);
            }
        });
        jPanel1.add(btncheckout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 270, 120, 30));

        btnclear.setBackground(new java.awt.Color(153, 0, 153));
        btnclear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclear.setForeground(new java.awt.Color(204, 204, 255));
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 320, 120, -1));

        lblcheckouttime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcheckouttime.setText("Check Out Time");
        jPanel1.add(lblcheckouttime, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        txtcheckouttime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtcheckouttime, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 230, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed

        String roomno = txtroomnumber.getText().trim();
        
        // Validate input
        if (roomno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a room number.");
            return;
        }
        try {
            String query = "SELECT * FROM customerdetails WHERE roomnumber=? AND status='CHECK IN'";
            pstm = con.prepareStatement(query);
            pstm.setString(1, roomno);
            rs = pstm.executeQuery();

            if (rs.next()) {
                 // Fill the text fields with the customer details from the database
                txtname.setText(rs.getString("Name"));
                txtcontactnumber.setText(rs.getString(3));
                txtemail.setText(rs.getString(9));
                txtcheckindate.setText(rs.getString(14));
                txtpriceperday.setText(rs.getString(13));
                
                // Set the checkout date to today
                SimpleDateFormat obj = new SimpleDateFormat("yyyy-MM-dd");
                Calendar cal = Calendar.getInstance();
                txtcheckoutdate.setText(obj.format(cal.getTime()));
                
                SimpleDateFormat obj1 = new SimpleDateFormat("HH:mm:ss");
                txtcheckouttime.setText(obj1.format(cal.getTime()));
                
                // Calculate the number of days between check-in and check-out
                String dateBeforeString = rs.getString(14);
                Date dateBefore = obj.parse(dateBeforeString);
                String dateAfterString = obj.format(cal.getTime());
                Date dateAfter = obj.parse(dateAfterString);
                long difference = dateAfter.getTime() - dateBefore.getTime();
                int noOfDays = (int) (difference / (1000 * 60 * 60 * 24));
                 
                // Ensure at least one day is counted
                if (noOfDays <= 0) {
                    noOfDays = 1;
                }
                
                txtnumberofdays.setText(String.valueOf(noOfDays));

                // Calculate the total amount
                float pricePerDay = Float.parseFloat(txtpriceperday.getText());
                float totalAmount = noOfDays * pricePerDay;
                txttotalamount.setText(String.valueOf(totalAmount));
            } else {
                JOptionPane.showMessageDialog(this, "Room number is not booked or does not exist.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred while fetching customer details: " + e.getMessage());
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btncheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncheckoutActionPerformed
       // Validate input fields
        if (txtroomnumber.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a room number.");
            txtroomnumber.requestFocus();
            return;
        }

        if (txtname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Customer name is missing.");
            txtname.requestFocus();
            return;
        }

        if (txtcontactnumber.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Contact number is missing.");
            txtcontactnumber.requestFocus();
            return;
        }

        if (txtcheckoutdate.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Checkout date is missing.");
            txtcheckoutdate.requestFocus();
            return;
        }

        if (txtnumberofdays.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Number of days is missing.");
            txtnumberofdays.requestFocus();
            return;
        }

        if (txttotalamount.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Total amount is missing.");
            txttotalamount.requestFocus();
            return;
        }

        // Proceed with the checkout process
        try {
            // Update customer details
            pstm = con.prepareStatement("UPDATE customerdetails SET checkout=?, checkouttime=?, noofdays=?, totalamount=?, status=? WHERE roomnumber=?");
            pstm.setString(1, txtcheckoutdate.getText().trim());
            pstm.setString(2, txtcheckouttime.getText().trim());
            pstm.setString(3, txtnumberofdays.getText().trim());
            pstm.setString(4, txttotalamount.getText().trim());
            pstm.setString(5, "CHECK OUT");
            pstm.setString(6, txtroomnumber.getText().trim());
            int rowsAffected = pstm.executeUpdate();

            // Update room status
            pstm = con.prepareStatement("UPDATE room SET status=? WHERE roomnumber=?");
            pstm.setString(1, "NOT BOOKED");
            pstm.setString(2, txtroomnumber.getText().trim());
            pstm.executeUpdate();

            // Check if customer details were updated successfully
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Check out successful.");
                clearTextFields();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to check out. Room number may be invalid.");
            }
        } catch (Exception e) {
            // Handle exceptions and display an error message
            JOptionPane.showMessageDialog(this, "An error occurred during check out: " + e.getMessage());
        }
    }//GEN-LAST:event_btncheckoutActionPerformed

        // Clear all text fields
    private void clearTextFields() {
        txtroomnumber.setText("");
        txtname.setText("");
        txtcontactnumber.setText("");
        txtemail.setText("");
        txtcheckindate.setText("");
        txtpriceperday.setText("");
        txtnumberofdays.setText("");
        txttotalamount.setText("");
    }

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        clearTextFields();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        int choice = javax.swing.JOptionPane.showConfirmDialog(this, "Are you sure you want to close this application?", "Confirm", javax.swing.JOptionPane.YES_NO_OPTION);

        if (choice == javax.swing.JOptionPane.YES_OPTION) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_btncloseActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOutCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncheckout;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnsearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblcheckindate;
    private javax.swing.JLabel lblcheckoutdate;
    private javax.swing.JLabel lblcheckouttime;
    private javax.swing.JLabel lblcontactnumber;
    private javax.swing.JLabel lblcuscheckout;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblnumberofdays;
    private javax.swing.JLabel lblpriceperday;
    private javax.swing.JLabel lblroomnumber;
    private javax.swing.JLabel lbltotalamount;
    private javax.swing.JPanel toppanel;
    private javax.swing.JTextField txtcheckindate;
    private javax.swing.JTextField txtcheckoutdate;
    private javax.swing.JTextField txtcheckouttime;
    private javax.swing.JTextField txtcontactnumber;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnumberofdays;
    private javax.swing.JTextField txtpriceperday;
    private javax.swing.JTextField txtroomnumber;
    private javax.swing.JTextField txttotalamount;
    // End of variables declaration//GEN-END:variables
}
