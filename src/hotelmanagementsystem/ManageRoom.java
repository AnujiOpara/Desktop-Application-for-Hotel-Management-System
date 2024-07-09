
package hotelmanagementsystem;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageRoom extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    
    public ManageRoom() {
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

        jPanel1 = new javax.swing.JPanel();
        lblroomnumber = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtroomnumber = new javax.swing.JTextField();
        lblroomtype = new javax.swing.JLabel();
        cmbroomtype = new javax.swing.JComboBox<>();
        lblbed = new javax.swing.JLabel();
        cmbbed = new javax.swing.JComboBox<>();
        lblprice = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        toppanel = new javax.swing.JPanel();
        lblmanageroom = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(50, 200));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1420, 580));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1420, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblroomnumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblroomnumber.setText("Room Number");
        jPanel1.add(lblroomnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 110, -1, -1));

        table.setBackground(new java.awt.Color(188, 217, 246));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Room Type", "Bed", "Price", "Status"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 840, 360));

        txtroomnumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtroomnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 140, 210, -1));

        lblroomtype.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblroomtype.setText("Room Type");
        jPanel1.add(lblroomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 190, -1, -1));

        cmbroomtype.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbroomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "Non AC", " " }));
        jPanel1.add(cmbroomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 220, 150, -1));

        lblbed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblbed.setText("Bed");
        jPanel1.add(lblbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 280, -1, -1));

        cmbbed.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbbed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single Bed", "Double Bed", "Queen Bed", "King Bed" }));
        jPanel1.add(cmbbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 310, 150, -1));

        lblprice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblprice.setText("Price per Day");
        jPanel1.add(lblprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 370, -1, -1));

        txtprice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 400, 220, -1));

        btnadd.setBackground(new java.awt.Color(153, 0, 153));
        btnadd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(204, 204, 255));
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 490, 80, -1));

        btnremove.setBackground(new java.awt.Color(153, 0, 153));
        btnremove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnremove.setForeground(new java.awt.Color(204, 204, 255));
        btnremove.setText("Remove");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        jPanel1.add(btnremove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 490, -1, -1));

        toppanel.setBackground(new java.awt.Color(102, 153, 255));
        toppanel.setPreferredSize(new java.awt.Dimension(1620, 100));
        toppanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblmanageroom.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblmanageroom.setForeground(new java.awt.Color(102, 0, 102));
        lblmanageroom.setText("Manage Room");
        toppanel.add(lblmanageroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1620, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed

        if(txtroomnumber.getText().equals("")){
            JOptionPane.showMessageDialog(this,"All Fields are Required.");
            txtroomnumber.requestFocus();
        }
        else if(txtprice.getText().equals("")){
            JOptionPane.showMessageDialog(this,"All Fields are Required.");
            txtprice.requestFocus();
        }
        else{
            try{
                pstm = con.prepareStatement("select * from room where roomnumber=?");
                pstm.setString(1,txtroomnumber.getText());
                rs = pstm.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(this,"Room Number already exists.");
                }
                else{
                    pstm = con.prepareStatement("insert into room(roomnumber,roomtype,bed,price,status)values(?,?,?,?,?)");
                    pstm.setString(1,txtroomnumber.getText());
                    pstm.setString(2,cmbroomtype.getItemAt(cmbroomtype.getSelectedIndex()));
                    pstm.setString(3,cmbbed.getItemAt(cmbbed.getSelectedIndex()));
                    pstm.setString(4,txtprice.getText());
                    pstm.setString(5,"NOT BOOKED");
                    pstm.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Room Added.");

                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    Object[] rowData = {txtroomnumber.getText(), cmbroomtype.getSelectedItem(), cmbbed.getSelectedItem(), txtprice.getText(), "NOT BOOKED"};
                    model.addRow(rowData);

                    txtroomnumber.setText("");
                    txtprice.setText("");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed

        int selectedRow = table.getSelectedRow();

        if (selectedRow != -1) {

            String roomNumber = table.getValueAt(selectedRow, 0).toString();

            int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove the selected room?", "Confirm", JOptionPane.YES_NO_OPTION);

            if (confirmation == JOptionPane.YES_OPTION) {
                try {
                    String sql = "DELETE FROM room WHERE roomnumber = ?";
                    pstm = con.prepareStatement(sql);
                    pstm.setString(1, roomNumber);
                    int rowsAffected = pstm.executeUpdate();

                    if (rowsAffected > 0) {
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.removeRow(selectedRow);
                        JOptionPane.showMessageDialog(this, "Room removed successfully.");
                    } else {
                        JOptionPane.showMessageDialog(this, "Room not found or already deleted.");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "An error occurred while removing the room: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a room to remove.");
        }

    }//GEN-LAST:event_btnremoveActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try {
            
            Statement stm = con.createStatement();
            String sql = "select * from room";
            ResultSet rs = stm.executeQuery(sql);
    
    while(rs.next()){
        String roomno = String.valueOf(rs.getInt("roomnumber"));
        String roomtype = String.valueOf(rs.getString("roomtype"));
        String bed = String.valueOf(rs.getString("bed"));
        String price = String.valueOf(rs.getDouble("price"));
        String status = String.valueOf(rs.getString("status"));
        
        String tbData[] = {roomno,roomtype,bed,price,status};
        DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
        
        tblModel.addRow(tbData);
    }
    
    
    }catch(Exception e){
    System.out.println(e.getMessage());
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
                new ManageRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnremove;
    private javax.swing.JComboBox<String> cmbbed;
    private javax.swing.JComboBox<String> cmbroomtype;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblbed;
    private javax.swing.JLabel lblmanageroom;
    private javax.swing.JLabel lblprice;
    private javax.swing.JLabel lblroomnumber;
    private javax.swing.JLabel lblroomtype;
    private javax.swing.JTable table;
    private javax.swing.JPanel toppanel;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtroomnumber;
    // End of variables declaration//GEN-END:variables
}
