
package hotelmanagementsystem;

import javax.swing.*;
public class splashScreen extends javax.swing.JFrame {

    
    public splashScreen() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splashpanel = new keeptoo.KGradientPanel();
        lblhotel = new javax.swing.JLabel();
        progressbar = new javax.swing.JProgressBar();
        lblloading = new javax.swing.JLabel();
        lblloadingvalue = new javax.swing.JLabel();
        lblhotelimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome");
        setUndecorated(true);

        splashpanel.setkEndColor(new java.awt.Color(193, 144, 255));
        splashpanel.setkStartColor(new java.awt.Color(153, 167, 253));
        splashpanel.setPreferredSize(new java.awt.Dimension(900, 500));
        splashpanel.setLayout(null);

        lblhotel.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        lblhotel.setForeground(new java.awt.Color(102, 0, 102));
        lblhotel.setText("HOTEL");
        splashpanel.add(lblhotel);
        lblhotel.setBounds(370, 320, 160, 90);

        progressbar.setPreferredSize(new java.awt.Dimension(900, 5));
        splashpanel.add(progressbar);
        progressbar.setBounds(0, 435, 900, 10);

        lblloading.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblloading.setForeground(new java.awt.Color(102, 102, 102));
        lblloading.setText("Loading.........");
        splashpanel.add(lblloading);
        lblloading.setBounds(30, 410, 320, 16);

        lblloadingvalue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblloadingvalue.setForeground(new java.awt.Color(102, 102, 102));
        lblloadingvalue.setText("0%");
        splashpanel.add(lblloadingvalue);
        lblloadingvalue.setBounds(830, 410, 40, 16);

        lblhotelimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hotel15.png"))); // NOI18N
        splashpanel.add(lblhotelimg);
        lblhotelimg.setBounds(250, 40, 410, 330);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splashpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splashpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        splashScreen sp = new splashScreen();
        sp.setVisible(true);
        
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(50);
                sp.lblloadingvalue.setText(i + "%");
                
                if(i==10){
                    sp.lblloading.setText("Turning on Modules....");
                }
                if(i==20){
                    sp.lblloading.setText("Loading Modules....");
                }
                if(i==50){
                    sp.lblloading.setText("Connecting to Database....");
                }
                if(i==70){
                    sp.lblloading.setText("Connection Successful....");
                }
                if(i==80){
                    sp.lblloading.setText("Launching Application....");
                }
                sp.progressbar.setValue(i);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        LoginPage Login = new LoginPage();
        Login.setVisible(true);
        Login.pack();
        Login.setLocationRelativeTo(null);
        sp.dispose();


}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblhotel;
    private javax.swing.JLabel lblhotelimg;
    private javax.swing.JLabel lblloading;
    private javax.swing.JLabel lblloadingvalue;
    private javax.swing.JProgressBar progressbar;
    private keeptoo.KGradientPanel splashpanel;
    // End of variables declaration//GEN-END:variables
}
