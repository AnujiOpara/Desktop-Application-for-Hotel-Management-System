
package hotelmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.draw.LineSeparator;


public class CusDetails extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    
    private String employeeID;
    private String loggedInUsername;

public CusDetails(String empID, String username) {
        initComponents();
        initializeDatabaseConnection();
        addEventListeners();
        this.employeeID = empID;
        this.loggedInUsername = username;
        
    }

    public CusDetails() {
        initComponents();
        initializeDatabaseConnection();
        addEventListeners();
        
    }


    private void initializeDatabaseConnection() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelms", "root", "aon2000db");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error initializing database connection: " + e.getMessage());
        }
    }

    private void addEventListeners() {
        
        cmbsearchby.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                updateTable();
            }
        });

        
        ActionListener[] oldListeners = btnprintbill.getActionListeners();
        for (ActionListener listener : oldListeners) {
            btnprintbill.removeActionListener(listener);
        }

        btnprintbill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                generateBill();
            }
        });
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        toppanel = new javax.swing.JPanel();
        lblcusdetails = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        lblsearchby = new javax.swing.JLabel();
        cmbsearchby = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnprintbill = new javax.swing.JButton();

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

        lblcusdetails.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblcusdetails.setForeground(new java.awt.Color(102, 0, 102));
        lblcusdetails.setText("Customer Details");
        toppanel.add(lblcusdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        btnclose.setBackground(new java.awt.Color(102, 153, 255));
        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close2.png"))); // NOI18N
        btnclose.setBorder(null);
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        toppanel.add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 30, 40, 30));

        jPanel1.add(toppanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 80));

        lblsearchby.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblsearchby.setText("Search by");
        jPanel1.add(lblsearchby, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        cmbsearchby.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbsearchby.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All customer details", "In hotel customer details", "Check out customer details" }));
        jPanel1.add(cmbsearchby, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        table.setBackground(new java.awt.Color(231, 231, 252));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CusID", "Name", "ContactNo", "Gender", "Nationality", "DOB", "NIC", "Address", "Email", "RoomNo", "RoomType", "Bed", "PricePerDay", "Check In", "Check Out", "NoOfDays", "Amount", "Status"
            }
        ));
        table.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tableComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 1350, 250));

        btnprintbill.setBackground(new java.awt.Color(102, 0, 153));
        btnprintbill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnprintbill.setForeground(new java.awt.Color(204, 204, 255));
        btnprintbill.setText("Print Bill");
        btnprintbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintbillActionPerformed(evt);
            }
        });
        jPanel1.add(btnprintbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 480, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tableComponentShown
        updateTable();
        }

        private void updateTable() {

            String selectedOption = cmbsearchby.getSelectedItem().toString();
            String query = "";

            if (selectedOption.equals("All customer details")) {
                query = "SELECT * FROM customerdetails";
            } else if (selectedOption.equals("In hotel customer details")) {
                query = "SELECT * FROM customerdetails WHERE status = 'check in'";
            } else if (selectedOption.equals("Check out customer details")) {
                query = "SELECT * FROM customerdetails WHERE status = 'check out'";
            }

            try {
                pstm = con.prepareStatement(query);
                rs = pstm.executeQuery();

                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0);

                while (rs.next()) {
                    Object[] row = new Object[18];
                    row[0] = rs.getString("cusID");
                    row[1] = rs.getString("name");
                    row[2] = rs.getString("contactnumber");
                    row[3] = rs.getString("gender");
                    row[4] = rs.getString("nationality");
                    row[5] = rs.getDate("dateofbirth");
                    row[6] = rs.getString("nic");
                    row[7] = rs.getString("address");
                    row[8] = rs.getString("email");
                    row[9] = rs.getString("roomnumber");
                    row[10] = rs.getString("roomtype");
                    row[11] = rs.getString("bed");
                    row[12] = rs.getDouble("priceperday");
                    row[13] = rs.getDate("checkin");
                    row[14] = rs.getDate("checkout");
                    row[15] = rs.getInt("noofdays");
                    row[16] = rs.getDouble("totalamount");
                    row[17] = rs.getString("status");

                    model.addRow(row);
                }

                rs.close();
                pstm.close();

            } catch (Exception e) {
                System.out.println("Error fetching data: " + e.getMessage());
            }
        }

        private void generateBill() {

            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                String cusID = model.getValueAt(selectedRow, 0).toString();
                String name = model.getValueAt(selectedRow, 1).toString();
                String contactNo = model.getValueAt(selectedRow, 2).toString();
                String address = model.getValueAt(selectedRow, 7).toString();
                String email = model.getValueAt(selectedRow, 8).toString();
                String roomNumber = model.getValueAt(selectedRow, 9).toString();
                String roomType = model.getValueAt(selectedRow, 10).toString();
                String bed = model.getValueAt(selectedRow, 11).toString();
                double pricePerDay = (double) model.getValueAt(selectedRow, 12);
                int noOfDays = (int) model.getValueAt(selectedRow, 15);
                double totalAmount = (double) model.getValueAt(selectedRow, 16);
                String status = model.getValueAt(selectedRow, 17).toString();

                generatePdfBill(cusID, name, contactNo, address, email, roomNumber, roomType, bed, pricePerDay, noOfDays, totalAmount, status);
            } else {
                JOptionPane.showMessageDialog(this, "No row selected.");
            }
        }

        private void generatePdfBill(String cusID, String name, String contactNo, String address, String email, String roomNumber, String roomType, String bed, double pricePerDay, int noOfDays, double totalAmount, String status) {

    try {
        String pdfPath = "bill.pdf";
        FileOutputStream fileStream = new FileOutputStream(pdfPath);
        Document document = new Document(PageSize.A4);
        PdfWriter writer = PdfWriter.getInstance(document, fileStream);
        document.open();

        Font titleFont = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD);
        Font normalFont = new Font(Font.FontFamily.HELVETICA, 12);

        addHeader(document, titleFont);
        document.add(new Paragraph("\n"));

        // Add header and logged-in user's employee ID and name
        document.add(new Paragraph("Generated by: " + employeeID + " - " + loggedInUsername, normalFont));
        document.add(new Paragraph("\n"));

        // Add customer details
        document.add(new Paragraph("----------Customer Details----------", normalFont));
        document.add(new Paragraph("Customer ID: " + cusID, normalFont));
        document.add(new Paragraph("Name: " + name, normalFont));
        document.add(new Paragraph("Contact No: " + contactNo, normalFont));
        document.add(new Paragraph("Address: " + address, normalFont));
        document.add(new Paragraph("Email: " + email, normalFont));
        document.add(new Paragraph("Room Number: " + roomNumber, normalFont));
        document.add(new Paragraph("Room Type: " + roomType, normalFont));
        document.add(new Paragraph("Bed: " + bed, normalFont));
        document.add(new Paragraph("\n"));

        // Add bill details table
        addBillDetailsTable(document, normalFont, pricePerDay, noOfDays, totalAmount);

        // Add footer
        addFooter(document, normalFont);

        document.close();
        fileStream.close();
        JOptionPane.showMessageDialog(this, "Bill generated successfully.");
    } catch (Exception e) {
        System.err.println("Error generating bill: " + e.getMessage());
    }
}

        private void addHeader(Document document, Font titleFont) throws DocumentException {

            Paragraph header = new Paragraph("HOTEL", titleFont);
            header.setAlignment(Element.ALIGN_CENTER);
            document.add(header);

            try {
                Image logo = Image.getInstance("C:\\Users\\Opara\\Documents\\NetBeansProjects\\HotelManagementSystem\\src\\image\\hotel16.png");
                logo.scaleToFit(100, 100);
                logo.setAlignment(Image.ALIGN_CENTER);
                document.add(logo);
            } catch (Exception e) {
                System.err.println("Error loading logo: " + e.getMessage());
            }

            Paragraph billTitle = new Paragraph("Customer Bill", titleFont);
            billTitle.setAlignment(Element.ALIGN_CENTER);
            document.add(billTitle);
            document.add(new Chunk(new LineSeparator()));
        }

        private void addBillDetailsTable(Document document, Font normalFont, double pricePerDay, int noOfDays, double totalAmount) throws DocumentException {

            PdfPTable table = new PdfPTable(2);
            table.setWidthPercentage(100);
            table.addCell(new PdfPCell(new Phrase("Description", normalFont)));
            table.addCell(new PdfPCell(new Phrase("Amount", normalFont)));

            table.addCell(new PdfPCell(new Phrase("Room Charges (per day)", normalFont)));
            table.addCell(new PdfPCell(new Phrase("Rs." + String.format("%.2f", pricePerDay), normalFont)));

            table.addCell(new PdfPCell(new Phrase("Number of Days", normalFont)));
            table.addCell(new PdfPCell(new Phrase(String.valueOf(noOfDays), normalFont)));

            double roomCharges = pricePerDay * noOfDays;
            table.addCell(new PdfPCell(new Phrase("Total Room Charges", normalFont)));
            table.addCell(new PdfPCell(new Phrase("Rs." + String.format("%.2f", roomCharges), normalFont)));

            document.add(table);
        }

        private void addFooter(Document document, Font normalFont) throws DocumentException {

            document.add(new Paragraph("\n"));
            document.add(new Paragraph("Thank you for staying with us!", normalFont));
            document.add(new Paragraph("HOTEL", normalFont));
            document.add(new Paragraph("Contact: 123-456-7890", normalFont));
            document.add(new Paragraph("Email: hotel@gmail.com", normalFont));
          
    }//GEN-LAST:event_tableComponentShown

       
    

        
    private void btnprintbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintbillActionPerformed
        generateBill();
    }//GEN-LAST:event_btnprintbillActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        int choice = javax.swing.JOptionPane.showConfirmDialog(this, "Are you sure you want to close this application?", "Confirm", javax.swing.JOptionPane.YES_NO_OPTION);

        if (choice == javax.swing.JOptionPane.YES_OPTION) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_btncloseActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CusDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnprintbill;
    private javax.swing.JComboBox<String> cmbsearchby;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcusdetails;
    private javax.swing.JLabel lblsearchby;
    private javax.swing.JTable table;
    private javax.swing.JPanel toppanel;
    // End of variables declaration//GEN-END:variables
}
