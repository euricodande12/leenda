/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ownermodules;

import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

import models.User;

/**
 *
 * @author timmy
 */
public class ManageFleet extends javax.swing.JFrame {

    /**
     * Creates new form CarListing
     */
    public User user;
    public ManageFleet(User user) {
        // Set Nimbus look and feel
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();  // Handle any exceptions
        }
        this.user = user;
        this.setTitle("Manage Fleet");
        this.setVisible(true);
         initComponents();
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblDashboard = new javax.swing.JLabel();
        lblCarlisting = new javax.swing.JLabel();
        lblBooking = new javax.swing.JLabel();
        lblUsermanagement = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnPrintCarListing = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarListing = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lblRenterID = new javax.swing.JLabel();
        txtRenterID = new javax.swing.JTextField();
        lblCarID = new javax.swing.JLabel();
        txtCarID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCarmodel = new javax.swing.JTextField();
        lblCarmake = new javax.swing.JLabel();
        txtCarmake = new javax.swing.JTextField();
        lblDailyrate = new javax.swing.JLabel();
        txtDailyrate = new javax.swing.JTextField();
        btnEditCarListing = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtrenterID = new javax.swing.JTextField();
        btnDeleteCarListing = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(237, 223, 205));

        jPanel2.setBackground(new java.awt.Color(217, 186, 164));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Leenda");

        lblDashboard.setBackground(new java.awt.Color(133, 62, 52));
        lblDashboard.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(133, 62, 52));
        lblDashboard.setText("Dashboard");
        lblDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        

        lblCarlisting.setBackground(new java.awt.Color(133, 62, 52));
        lblCarlisting.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCarlisting.setForeground(new java.awt.Color(133, 62, 52));
        lblCarlisting.setText("Manage Fleet");

        lblBooking.setBackground(new java.awt.Color(133, 62, 52));
        lblBooking.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblBooking.setForeground(new java.awt.Color(133, 62, 52));
        lblBooking.setText("Booking");
        lblBooking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        

        lblUsermanagement.setBackground(new java.awt.Color(133, 62, 52));
        lblUsermanagement.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblUsermanagement.setForeground(new java.awt.Color(133, 62, 52));
        lblUsermanagement.setText("User Management");
        lblUsermanagement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
       

        btnLogout.setBackground(new java.awt.Color(237, 233, 205));
        btnLogout.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnLogout.setText("Log Out");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDashboard)
                .addGap(54, 54, 54)
                .addComponent(lblCarlisting)
                .addGap(76, 76, 76)
                .addComponent(lblBooking)
                .addGap(79, 79, 79)
                .addComponent(lblUsermanagement)
                .addGap(101, 101, 101)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblDashboard)
                    .addComponent(lblCarlisting)
                    .addComponent(lblBooking)
                    .addComponent(btnLogout)
                    .addComponent(lblUsermanagement))
                .addGap(12, 12, 12))
        );

        jPanel3.setBackground(new java.awt.Color(217, 186, 164));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(133, 62, 52));
        jLabel6.setText("Manage Fleet");

        btnPrintCarListing.setBackground(new java.awt.Color(237, 233, 205));
        btnPrintCarListing.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnPrintCarListing.setText("Print Car Listing");
        btnPrintCarListing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintCarListingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(273, 273, 273)
                .addComponent(btnPrintCarListing)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnPrintCarListing))
                .addGap(11, 11, 11))
        );

        tblCarListing.setBackground(new java.awt.Color(217, 186, 164));
        // Create a new DefaultTableModel with the column names
        DefaultTableModel model = new DefaultTableModel(new Object[] {"Car Name", "Car Year", "Car Type", "Status", "Daily Rate", "VIN"}, 0);
        // Read the cars.csv file
        String filePath = "src\\storage\\cars.csv";
        String line;
        String[] row;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Skip the header line
            br.readLine();

            while ((line = br.readLine()) != null) {
                row = line.split(",");

                // Check if the car owner's email matches the user's email
                if (1==1) {
                    model.addRow(new Object[] {row[0], row[1], row[2], row[3], row[4], row[5]});
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        tblCarListing.setModel(model);
        jScrollPane1.setViewportView(tblCarListing);

        jPanel4.setBackground(new java.awt.Color(217, 186, 164));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblRenterID.setBackground(new java.awt.Color(133, 62, 52));
        lblRenterID.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblRenterID.setForeground(new java.awt.Color(133, 62, 52));
        lblRenterID.setText("Car Name");

        txtRenterID.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        lblCarID.setBackground(new java.awt.Color(133, 62, 52));
        lblCarID.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCarID.setForeground(new java.awt.Color(133, 62, 52));
        lblCarID.setText("Car Type");

        txtCarID.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel9.setBackground(new java.awt.Color(133, 62, 52));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(133, 62, 52));
        jLabel9.setText("Car Year");

        txtCarmodel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        lblCarmake.setBackground(new java.awt.Color(133, 62, 52));
        lblCarmake.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCarmake.setForeground(new java.awt.Color(133, 62, 52));
        lblCarmake.setText("Status");

        txtCarmake.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        lblDailyrate.setBackground(new java.awt.Color(133, 62, 52));
        lblDailyrate.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblDailyrate.setForeground(new java.awt.Color(133, 62, 52));
        lblDailyrate.setText("Daily Rate");

        txtDailyrate.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        btnEditCarListing.setBackground(new java.awt.Color(133, 62, 52));
        btnEditCarListing.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEditCarListing.setForeground(new java.awt.Color(204, 204, 255));
        btnEditCarListing.setText("Edit Car Listing Information");

        jLabel2.setBackground(new java.awt.Color(133, 62, 52));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(133, 62, 52));
        jLabel2.setText("Status");

        jTextField1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtRenterID)
                                .addComponent(lblRenterID)
                                .addComponent(lblCarID)
                                .addComponent(txtCarID, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(106, 106, 106)
                                    .addComponent(lblDailyrate))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblCarmake)
                                        .addComponent(txtCarmodel)
                                        .addComponent(txtCarmake, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDailyrate, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)))))
                        .addComponent(btnEditCarListing, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRenterID)
                    .addComponent(jLabel9)
                    .addComponent(lblDailyrate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRenterID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCarmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDailyrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarID)
                    .addComponent(lblCarmake)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCarmake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnEditCarListing)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(217, 186, 164));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Delete a car with VIN");

        jLabel13.setBackground(new java.awt.Color(133, 62, 52));
        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(133, 62, 52));
        jLabel13.setText("VIN");

        txtrenterID.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        btnDeleteCarListing.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnDeleteCarListing.setText("Delete Car Listing Information");
        btnDeleteCarListing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCarListingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDeleteCarListing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtrenterID)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel12)
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtrenterID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeleteCarListing)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 19, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteCarListingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCarListingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteCarListingActionPerformed

    private void btnPrintCarListingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintCarListingActionPerformed
        try {
             String title = "Leenda - Car Listing";

            // Get the current date and time to display at the bottom (footer) of the page
            String footer = "Generated on: " + new SimpleDateFormat("EEEE, d MMM yyyy hh:mm:ss a").format(new Date());

            // Use the JTable's print method to print the table
            boolean complete = tblCarListing.print();
            if (complete) {
                // If printing is complete, show a success message
                JOptionPane.showMessageDialog(null, "Printing Complete", "Print", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // If printing was cancelled, show a message
                JOptionPane.showMessageDialog(null, "Printing Cancelled", "Print", JOptionPane.WARNING_MESSAGE);
            }
        } catch (HeadlessException | PrinterException ex) {
            // If an error occurs during printing, show an error message
            JOptionPane.showMessageDialog(null, "Error printing table: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_btnPrintCarListingActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageFleet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageFleet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageFleet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageFleet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageFleet(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteCarListing;
    private javax.swing.JButton btnEditCarListing;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPrintCarListing;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblBooking;
    private javax.swing.JLabel lblCarID;
    private javax.swing.JLabel lblCarlisting;
    private javax.swing.JLabel lblCarmake;
    private javax.swing.JLabel lblDailyrate;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblRenterID;
    private javax.swing.JLabel lblUsermanagement;
    private javax.swing.JTable tblCarListing;
    private javax.swing.JTextField txtCarID;
    private javax.swing.JTextField txtCarmake;
    private javax.swing.JTextField txtCarmodel;
    private javax.swing.JTextField txtDailyrate;
    private javax.swing.JTextField txtRenterID;
    private javax.swing.JTextField txtrenterID;
    // End of variables declaration//GEN-END:variables
}
