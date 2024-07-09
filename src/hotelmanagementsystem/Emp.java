
package hotelmanagementsystem;

import java.awt.Image;
import java.sql.*;
import javax.swing.*;

public class Emp extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    String empID;
    
    public Emp(String empID) {
        this.empID = empID;
        initComponents();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelms", "root", "aon2000db");
            loadEmployeeDetails();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblempimg = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        lblgender = new javax.swing.JLabel();
        lblcon = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblnic = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        lbldob = new javax.swing.JLabel();
        lblposition = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtgender = new javax.swing.JTextField();
        txtcon = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtnic = new javax.swing.JTextField();
        txtdob = new javax.swing.JTextField();
        txtposition = new javax.swing.JTextField();
        btnclose = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(1000, 100));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 650));
        jPanel1.setLayout(null);

        lblempimg.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(lblempimg);
        lblempimg.setBounds(140, 33, 131, 135);

        lblname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblname.setText("Name");
        jPanel1.add(lblname);
        lblname.setBounds(50, 270, 90, 16);

        lblid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblid.setText("Employee ID");
        jPanel1.add(lblid);
        lblid.setBounds(50, 230, 90, 16);

        lblgender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblgender.setText("Gender");
        jPanel1.add(lblgender);
        lblgender.setBounds(50, 310, 90, 16);

        lblcon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblcon.setText("Contact Number");
        jPanel1.add(lblcon);
        lblcon.setBounds(50, 350, 110, 16);

        lblemail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblemail.setText("Email");
        jPanel1.add(lblemail);
        lblemail.setBounds(50, 430, 100, 16);

        lblnic.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblnic.setText("NIC");
        jPanel1.add(lblnic);
        lblnic.setBounds(50, 470, 100, 16);

        lbladdress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbladdress.setText("Address");
        jPanel1.add(lbladdress);
        lbladdress.setBounds(50, 390, 100, 16);

        lbldob.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbldob.setText("DOB");
        jPanel1.add(lbldob);
        lbldob.setBounds(50, 510, 90, 16);

        lblposition.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblposition.setText("Position");
        jPanel1.add(lblposition);
        lblposition.setBounds(50, 540, 100, 16);
        jPanel1.add(txtid);
        txtid.setBounds(220, 220, 130, 22);
        jPanel1.add(txtname);
        txtname.setBounds(220, 260, 130, 22);
        jPanel1.add(txtgender);
        txtgender.setBounds(220, 300, 130, 22);
        jPanel1.add(txtcon);
        txtcon.setBounds(220, 340, 130, 22);
        jPanel1.add(txtaddress);
        txtaddress.setBounds(220, 380, 130, 22);
        jPanel1.add(txtemail);
        txtemail.setBounds(220, 420, 130, 22);
        jPanel1.add(txtnic);
        txtnic.setBounds(220, 460, 130, 22);
        jPanel1.add(txtdob);
        txtdob.setBounds(220, 500, 130, 22);
        jPanel1.add(txtposition);
        txtposition.setBounds(220, 540, 130, 22);

        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close2.png"))); // NOI18N
        btnclose.setBorder(null);
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnclose);
        btnclose.setBounds(340, 20, 30, 30);

        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back3.png"))); // NOI18N
        btnback.setBorder(null);
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback);
        btnback.setBounds(330, 590, 30, 30);

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

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        this.dispose();
        EmpDetails ed = new EmpDetails();
        ed.setVisible(true);

    }//GEN-LAST:event_btnbackActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        int choice = javax.swing.JOptionPane.showConfirmDialog(this, "Are you sure you want to close this application?", "Confirm", javax.swing.JOptionPane.YES_NO_OPTION);

        if (choice == javax.swing.JOptionPane.YES_OPTION) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_btncloseActionPerformed

    private void loadEmployeeDetails() {
       try {
            String query = "SELECT * FROM employeedetails WHERE empID = ?";
            pstm = con.prepareStatement(query);
            pstm.setString(1, empID);
            rs = pstm.executeQuery();

            if (rs.next()) {
                txtid.setText(rs.getString("empID"));
                txtname.setText(rs.getString("name"));
                txtgender.setText(rs.getString("gender"));
                txtcon.setText(rs.getString("contactno"));
                txtaddress.setText(rs.getString("address"));
                txtemail.setText(rs.getString("email"));
                txtnic.setText(rs.getString("nic"));
                txtdob.setText(rs.getString("dob"));
                txtposition.setText(rs.getString("position"));

                String imgPath = rs.getString("empimg");
                if (imgPath != null) {
                    ImageIcon imgIcon = new ImageIcon(new ImageIcon(imgPath).getImage().getScaledInstance(lblempimg.getWidth(), lblempimg.getHeight(), Image.SCALE_SMOOTH));
                    lblempimg.setIcon(imgIcon);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Emp("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblcon;
    private javax.swing.JLabel lbldob;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblempimg;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblnic;
    private javax.swing.JLabel lblposition;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcon;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnic;
    private javax.swing.JTextField txtposition;
    // End of variables declaration//GEN-END:variables
}
