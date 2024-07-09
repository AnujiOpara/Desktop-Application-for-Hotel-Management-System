
package hotelmanagementsystem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class RegisterCustomer extends javax.swing.JFrame {

   Connection con;
   PreparedStatement pstm;
   ResultSet rs;
   String roomno;
   
    public RegisterCustomer() {
        initComponents();
        
        // Set the check-in date to the current date
        SimpleDateFormat obj = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        txtcheckindate.setText(obj.format(date));
        
        // Set the check-in time to the current time
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        txtcheckintime.setText(timeFormat.format(date));
        
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelms", "root", "aon2000db");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         
         // Add focus listener to NIC field
         txtnic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                checkCustomerByNIC();
            }
        });
    }
    
    // Check customer details based on NIC and populate form fields
    private void checkCustomerByNIC() {
        String nic = txtnic.getText().trim();

        try {
            String query = "SELECT * FROM customerdetails WHERE nic = ?";
            pstm = con.prepareStatement(query);
            pstm.setString(1, nic);
            rs = pstm.executeQuery();

             // If customer found, populate form fields with their details
            if (rs.next()) {
                txtname.setText(rs.getString("name"));
                txtcontactnumber.setText(rs.getString("contactnumber"));
                cmbgender.setSelectedItem(rs.getString("gender"));
                txtnationality.setText(rs.getString("nationality"));
                txtdob.setText(rs.getString("dateofbirth"));
                txtaddress.setText(rs.getString("address"));
                txtemail.setText(rs.getString("email"));   
            }
           
         } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } finally {
            closeDatabaseResources(pstm, rs);
        }
    }

    // Load room details based on selected room type and bed type
    public void roomDetails(){
        
        cmbroomnumber.removeAllItems();
        txtprice.setText("");
        String bed = (String) cmbbed.getSelectedItem();
        String roomtype = (String) cmbroomtype.getSelectedItem();
        try {
            String query = "SELECT * FROM room WHERE bed=? AND roomtype=? AND status='NOT BOOKED'";
            pstm = con.prepareStatement(query);
            pstm.setString(1, bed);
            pstm.setString(2, roomtype);
            rs = pstm.executeQuery();
            // Populate room numbers in dropdown
            while (rs.next()) {
                cmbroomnumber.addItem(rs.getString("roomnumber"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            closeDatabaseResources(pstm, rs);
        }
    }

   // Check room availability and notify if no rooms are available
    public void checkRoomAvailability() {
        
        try {
           
            String query = "SELECT COUNT(*) AS count FROM room WHERE status != 'BOOKED'";
            pstm = con.prepareStatement(query);
            rs = pstm.executeQuery();
            // Display message if no rooms are available
            if (rs.next()) {
                int availableRooms = rs.getInt("count");
               
                if (availableRooms == 0) {
                    JOptionPane.showMessageDialog(this, "All rooms in the hotel are booked. No available rooms in the hotel.");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } finally {
            closeDatabaseResources(pstm, rs);
        }
    }
    
    private void closeDatabaseResources(PreparedStatement pstm, ResultSet rs) {
        try {
            if (rs != null) rs.close();
            if (pstm != null) pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblname = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblcontactnumber = new javax.swing.JLabel();
        txtcontactnumber = new javax.swing.JTextField();
        lblgender = new javax.swing.JLabel();
        cmbgender = new javax.swing.JComboBox<>();
        lblnationality = new javax.swing.JLabel();
        txtnationality = new javax.swing.JTextField();
        lbldob = new javax.swing.JLabel();
        txtdob = new javax.swing.JTextField();
        lblnic = new javax.swing.JLabel();
        txtnic = new javax.swing.JTextField();
        lbladdress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        lblemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lblcheckindate = new javax.swing.JLabel();
        txtcheckindate = new javax.swing.JTextField();
        lblroomnumber = new javax.swing.JLabel();
        cmbroomnumber = new javax.swing.JComboBox<>();
        lblroomtype = new javax.swing.JLabel();
        cmbroomtype = new javax.swing.JComboBox<>();
        lblbed = new javax.swing.JLabel();
        cmbbed = new javax.swing.JComboBox<>();
        lblprice = new javax.swing.JLabel();
        btnallocateroom1 = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        toppanel = new javax.swing.JPanel();
        lblcusreg = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        txtprice = new javax.swing.JTextField();
        lblpriceval = new javax.swing.JLabel();
        lblnicval = new javax.swing.JLabel();
        lblnameval = new javax.swing.JLabel();
        lblconval = new javax.swing.JLabel();
        lblnationalityval = new javax.swing.JLabel();
        lbldobval = new javax.swing.JLabel();
        lbladdressval = new javax.swing.JLabel();
        lblemailval = new javax.swing.JLabel();
        lblroomnoval = new javax.swing.JLabel();
        lblbedval = new javax.swing.JLabel();
        lblgenval = new javax.swing.JLabel();
        lblroomtypeval = new javax.swing.JLabel();
        lblcheckintime = new javax.swing.JLabel();
        txtcheckintime = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(50, 200));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1420, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1420, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblname.setText("Name");
        jPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 50, -1));

        txtname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 300, -1));

        lblcontactnumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcontactnumber.setText("Contact Number");
        jPanel1.add(lblcontactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        txtcontactnumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtcontactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 230, -1));

        lblgender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblgender.setText("Gender");
        jPanel1.add(lblgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        cmbgender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other", " " }));
        jPanel1.add(cmbgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 170, -1));

        lblnationality.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblnationality.setText("Nationality");
        jPanel1.add(lblnationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        txtnationality.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtnationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 170, -1));

        lbldob.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbldob.setText("Date of Birth");
        jPanel1.add(lbldob, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 110, -1));

        txtdob.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 280, -1));

        lblnic.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblnic.setText("NIC");
        jPanel1.add(lblnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        txtnic.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnicActionPerformed(evt);
            }
        });
        jPanel1.add(txtnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 300, -1));

        lbladdress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbladdress.setText("Address");
        jPanel1.add(lbladdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 60, -1));

        txtaddress.setColumns(20);
        txtaddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtaddress.setRows(5);
        jScrollPane1.setViewportView(txtaddress);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 280, 30));

        lblemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblemail.setText("Email");
        jPanel1.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        txtemail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 290, -1));

        lblcheckindate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcheckindate.setText("Check In Date");
        jPanel1.add(lblcheckindate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));

        txtcheckindate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtcheckindate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 230, -1));

        lblroomnumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblroomnumber.setText("Room Number");
        jPanel1.add(lblroomnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 100, -1, -1));

        cmbroomnumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbroomnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbroomnumberActionPerformed(evt);
            }
        });
        jPanel1.add(cmbroomnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 130, 170, -1));

        lblroomtype.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblroomtype.setText("Room Type");
        jPanel1.add(lblroomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 200, -1, -1));

        cmbroomtype.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbroomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "Non AC" }));
        cmbroomtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbroomtypeActionPerformed(evt);
            }
        });
        jPanel1.add(cmbroomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, 170, -1));

        lblbed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblbed.setText("Bed");
        jPanel1.add(lblbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, 40, -1));

        cmbbed.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbbed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single Bed", "Double Bed", "Queen Bed", "King Bed" }));
        cmbbed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbedActionPerformed(evt);
            }
        });
        jPanel1.add(cmbbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 330, 170, -1));

        lblprice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblprice.setText("Price per Day");
        jPanel1.add(lblprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, -1, -1));

        btnallocateroom1.setBackground(new java.awt.Color(153, 0, 153));
        btnallocateroom1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnallocateroom1.setForeground(new java.awt.Color(204, 204, 255));
        btnallocateroom1.setText("Allocate Room");
        btnallocateroom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallocateroom1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnallocateroom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 300, -1, 30));

        btnclear.setBackground(new java.awt.Color(153, 0, 153));
        btnclear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclear.setForeground(new java.awt.Color(204, 204, 255));
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 353, 130, -1));

        toppanel.setBackground(new java.awt.Color(102, 153, 255));
        toppanel.setPreferredSize(new java.awt.Dimension(1620, 100));
        toppanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcusreg.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblcusreg.setForeground(new java.awt.Color(102, 0, 102));
        lblcusreg.setText("Customer Check In");
        toppanel.add(lblcusreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

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

        txtprice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 430, 170, -1));

        lblpriceval.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lblpriceval, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, 300, 20));

        lblnicval.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lblnicval, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 300, 20));

        lblnameval.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lblnameval, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 300, 20));

        lblconval.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lblconval, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 300, 20));

        lblnationalityval.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lblnationalityval, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 300, 20));

        lbldobval.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lbldobval, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 300, 20));

        lbladdressval.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lbladdressval, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 300, 20));

        lblemailval.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lblemailval, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 300, 20));

        lblroomnoval.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lblroomnoval, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, 300, 20));

        lblbedval.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lblbedval, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, 240, 20));

        lblgenval.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lblgenval, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 240, 20));

        lblroomtypeval.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lblroomtypeval, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, 240, 20));

        lblcheckintime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcheckintime.setText("Check In Time");
        jPanel1.add(lblcheckintime, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        txtcheckintime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtcheckintime, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 230, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Action listener for room number selection
    private void cmbroomnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbroomnumberActionPerformed
         roomno = (String) cmbroomnumber.getSelectedItem();

        try {
            PreparedStatement pstm = con.prepareStatement("select * from room where roomnumber=?");

            pstm.setString(1, roomno);
            ResultSet rs = pstm.executeQuery();
            // Set room price based on selected room number
            while (rs.next()) {
                txtprice.setText(rs.getString("price"));
            }
         } catch (SQLException e) {
            e.printStackTrace();
         }
    }//GEN-LAST:event_cmbroomnumberActionPerformed

  
    private void cmbroomtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbroomtypeActionPerformed
        roomDetails();
    }//GEN-LAST:event_cmbroomtypeActionPerformed

    private void cmbbedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbedActionPerformed
        roomDetails();
    }//GEN-LAST:event_cmbbedActionPerformed

    private void btnallocateroom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallocateroom1ActionPerformed
     boolean isValid = true;
    
    // Validate NIC
    if (txtnic.getText().isEmpty()) {
        lblnicval.setText("NIC is required.");
        txtnic.requestFocus();
        isValid = false;
    } else {
        lblnicval.setText("");  // Clear the validation message
    }

    // Validate name
    if (txtname.getText().isEmpty()) {
        lblnameval.setText("Name is required.");
        txtname.requestFocus();
        isValid = false;
    } else {
        lblnameval.setText("");  // Clear the validation message
    }

     // Validate room selection
    if (cmbgender.getSelectedIndex() == -1) {
        lblgenval.setText("Gender is required.");
        isValid = false;
    } else {
        lblgenval.setText("");  // Clear the validation message
    }
    
    // Validate contact number
    if (txtcontactnumber.getText().isEmpty()) {
        lblconval.setText("Contact Number is required.");
        txtcontactnumber.requestFocus();
        isValid = false;
    } else if (!isNumeric(txtcontactnumber.getText())) {
        lblconval.setText("Contact Number must contain numeric characters only.");
        txtcontactnumber.requestFocus();
        isValid = false;
    } else {
        lblconval.setText("");  // Clear the validation message
    }

    // Validate nationality
    if (txtnationality.getText().isEmpty()) {
        lblnationalityval.setText("Nationality is required.");
        txtnationality.requestFocus();
        isValid = false;
    } else {
        lblnationalityval.setText("");  // Clear the validation message
    }

    // Validate date of birth
    if (txtdob.getText().isEmpty()) {
        lbldobval.setText("Date of Birth is required.");
        txtdob.requestFocus();
        isValid = false;
    } else {
        lbldobval.setText("");  // Clear the validation message
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

    // Validate room selection
    if (cmbroomnumber.getSelectedIndex() == -1) {
        lblroomnoval.setText("Room Number is required.");
        isValid = false;
    } else {
        lblroomnoval.setText("");  // Clear the validation message
    }
    
    if (cmbroomtype.getSelectedIndex() == -1) {
        lblroomtypeval.setText("Room Type is required.");
        isValid = false;
    } else {
        lblroomtypeval.setText("");  // Clear the validation message
    }
    if (cmbbed.getSelectedIndex() == -1) {
        lblbedval.setText("Bed Type is required.");
        isValid = false;
     } else {
        lblbedval.setText("");  // Clear the validation message
    
        }

        // Ensure all required fields are valid before proceeding with room allocation
        if (lblnicval.getText().isEmpty() && lblnameval.getText().isEmpty() && lblconval.getText().isEmpty()
                && lblnationalityval.getText().isEmpty() && lbldobval.getText().isEmpty()
                && lbladdressval.getText().isEmpty() && lblemailval.getText().isEmpty()
                && lblroomnoval.getText().isEmpty() && lblpriceval.getText().isEmpty()) {

        try {
            pstm = con.prepareStatement("INSERT INTO customerdetails(cusID, name, contactnumber, gender, nationality, dateofbirth, nic, address, email, roomnumber, roomtype, bed, priceperday, checkin,checkintime, status) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            // Get the max customer ID to generate new customer ID
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT MAX(cusID) FROM customerdetails");
            int maxCusID = 0;
            if (rs.next()) {
                maxCusID = rs.getInt(1);
            }
            int newCusID = maxCusID + 1;

            pstm.setInt(1, newCusID);
            pstm.setString(2, txtname.getText());
            pstm.setString(3, txtcontactnumber.getText());
            pstm.setString(4, cmbgender.getSelectedItem().toString());
            pstm.setString(5, txtnationality.getText());
            pstm.setString(6, txtdob.getText());
            pstm.setString(7, txtnic.getText());
            pstm.setString(8, txtaddress.getText());
            pstm.setString(9, txtemail.getText());
            pstm.setString(10, cmbroomnumber.getSelectedItem().toString());
            pstm.setString(11, cmbroomtype.getSelectedItem().toString());
            pstm.setString(12, cmbbed.getSelectedItem().toString());
            pstm.setString(13, txtprice.getText());
            pstm.setString(14, txtcheckindate.getText());
            pstm.setString(15, txtcheckintime.getText());
            pstm.setString(16, "CHECK IN");

            pstm.executeUpdate();

            // Update room status to "BOOKED"
            pstm = con.prepareStatement("UPDATE room SET status = 'BOOKED' WHERE roomnumber = ?");
            pstm.setString(1, cmbroomnumber.getSelectedItem().toString());
            pstm.executeUpdate();

            JOptionPane.showMessageDialog(this, "Customer Registered and Room Allocated Successfully!");

            // Clear all fields after successful registration
            txtnic.setText("");
            txtname.setText("");
            txtcontactnumber.setText("");
            cmbgender.setSelectedIndex(-1);
            txtnationality.setText("");
            txtdob.setText("");
            txtaddress.setText("");
            txtemail.setText("");
            cmbroomnumber.setSelectedIndex(-1);
            cmbroomtype.setSelectedIndex(-1);
            cmbbed.setSelectedIndex(-1);
            txtprice.setText("");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } finally {
            closeDatabaseResources(pstm, rs);
        }
    }
    }//GEN-LAST:event_btnallocateroom1ActionPerformed

    
    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtname.setText("");
        txtcontactnumber.setText("");
        cmbgender.setSelectedIndex(-1);
        txtnationality.setText("");
        txtdob.setText("");
        txtnic.setText("");
        txtaddress.setText("");
        txtemail.setText("");
        cmbroomnumber.setSelectedIndex(-1);
        cmbroomtype.setSelectedIndex(-1);
        cmbbed.setSelectedIndex(-1);
        txtprice.setText("");
        
        lblnicval.setText("");
        lblnameval.setText("");
        lblconval.setText("");
        lblnationalityval.setText("");
        lbldobval.setText("");
        lbladdressval.setText("");
        lblemailval.setText("");
        lblroomnoval.setText("");
        lblpriceval.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        int choice = javax.swing.JOptionPane.showConfirmDialog(this, "Are you sure you want to close this application?", "Confirm", javax.swing.JOptionPane.YES_NO_OPTION);

        if (choice == javax.swing.JOptionPane.YES_OPTION) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_btncloseActionPerformed

    private void txtnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnicActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnallocateroom1;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnclose;
    private javax.swing.JComboBox<String> cmbbed;
    private javax.swing.JComboBox<String> cmbgender;
    private javax.swing.JComboBox<String> cmbroomnumber;
    private javax.swing.JComboBox<String> cmbroomtype;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lbladdressval;
    private javax.swing.JLabel lblbed;
    private javax.swing.JLabel lblbedval;
    private javax.swing.JLabel lblcheckindate;
    private javax.swing.JLabel lblcheckintime;
    private javax.swing.JLabel lblcontactnumber;
    private javax.swing.JLabel lblconval;
    private javax.swing.JLabel lblcusreg;
    private javax.swing.JLabel lbldob;
    private javax.swing.JLabel lbldobval;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblemailval;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lblgenval;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblnameval;
    private javax.swing.JLabel lblnationality;
    private javax.swing.JLabel lblnationalityval;
    private javax.swing.JLabel lblnic;
    private javax.swing.JLabel lblnicval;
    private javax.swing.JLabel lblprice;
    private javax.swing.JLabel lblpriceval;
    private javax.swing.JLabel lblroomnoval;
    private javax.swing.JLabel lblroomnumber;
    private javax.swing.JLabel lblroomtype;
    private javax.swing.JLabel lblroomtypeval;
    private javax.swing.JPanel toppanel;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtcheckindate;
    private javax.swing.JTextField txtcheckintime;
    private javax.swing.JTextField txtcontactnumber;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnationality;
    private javax.swing.JTextField txtnic;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
