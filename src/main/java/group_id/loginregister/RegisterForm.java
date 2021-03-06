/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group_id.loginregister;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;                                                                            

/**
 *
 * @author Admin
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        RegisterLBL = new javax.swing.JLabel();
        userLBL = new javax.swing.JLabel();
        passLBL = new javax.swing.JLabel();
        minimizeLBL = new javax.swing.JLabel();
        exitLBL = new javax.swing.JLabel();
        phoneNumberLBL = new javax.swing.JLabel();
        firstNameLBL = new javax.swing.JLabel();
        lastNameLBL = new javax.swing.JLabel();
        confirmPassLBL = new javax.swing.JLabel();
        userFLD = new javax.swing.JTextField();
        RegisterBTN = new javax.swing.JButton();
        passFLD = new javax.swing.JPasswordField();
        backBTN = new javax.swing.JButton();
        firstNameFLD = new javax.swing.JTextField();
        phoneNumberFLD = new javax.swing.JTextField();
        lastNameFLD = new javax.swing.JTextField();
        confirmPassFLD = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 204, 102)));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        RegisterLBL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        RegisterLBL.setForeground(new java.awt.Color(255, 255, 255));
        RegisterLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisterLBL.setText("REGISTER");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(RegisterLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegisterLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        userLBL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        userLBL.setText("Username:");

        passLBL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        passLBL.setText("Password:");

        minimizeLBL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        minimizeLBL.setForeground(new java.awt.Color(255, 255, 255));
        minimizeLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeLBL.setText("-");
        minimizeLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLBLMouseClicked(evt);
            }
        });

        exitLBL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        exitLBL.setForeground(new java.awt.Color(255, 51, 51));
        exitLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLBL.setText("x");
        exitLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLBLMouseClicked(evt);
            }
        });

        phoneNumberLBL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        phoneNumberLBL.setText("Phone Number:");

        firstNameLBL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        firstNameLBL.setText("First Name:");

        lastNameLBL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lastNameLBL.setText("Last Name:");

        confirmPassLBL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        confirmPassLBL.setText("Confirm Password:");

        userFLD.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        RegisterBTN.setBackground(new java.awt.Color(0, 102, 204));
        RegisterBTN.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        RegisterBTN.setForeground(new java.awt.Color(255, 255, 255));
        RegisterBTN.setText("Register");
        RegisterBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBTNActionPerformed(evt);
            }
        });

        passFLD.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        backBTN.setBackground(new java.awt.Color(255, 153, 51));
        backBTN.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        backBTN.setForeground(new java.awt.Color(255, 255, 255));
        backBTN.setText("Back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        firstNameFLD.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        phoneNumberFLD.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        phoneNumberFLD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneNumberFLDKeyTyped(evt);
            }
        });

        lastNameFLD.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        confirmPassFLD.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizeLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(confirmPassLBL)
                                    .addComponent(passLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastNameLBL)
                                    .addComponent(firstNameLBL)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(phoneNumberLBL, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passFLD, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(firstNameFLD, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(lastNameFLD, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(phoneNumberFLD)
                            .addComponent(userFLD)
                            .addComponent(confirmPassFLD)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(RegisterBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minimizeLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameFLD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLBL))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameFLD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLBL))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberFLD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberLBL))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userFLD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userLBL))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLBL)
                    .addComponent(passFLD, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPassLBL)
                    .addComponent(confirmPassFLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBTNActionPerformed
 
        // Collect registration information
        String firstName = firstNameFLD.getText();
        String lastName = lastNameFLD.getText();
        String phoneNumber = phoneNumberFLD.getText();
        String username = userFLD.getText();
        String password = String.valueOf(passFLD.getPassword());

        if(verifyFields()){
            if(!checkUsername(username)){
                PreparedStatement st;
                ResultSet rs;
               
                // Query to insert information
                String query = "INSERT INTO users (Username, Password, LastName, FirstName, PhoneNumber)\n" +
                               "VALUES (?,?,?,?,?);";

                try {
                    st = Connector.getConnection().prepareStatement(query);

                    st.setString(1, username);
                    st.setString(2, password);
                    st.setString(3, lastName);
                    st.setString(4, firstName);
                    st.setString(5, phoneNumber);

                    if(st.executeUpdate() != 0){
                        JOptionPane.showMessageDialog(null, "Your Account Has Been Created");
                    } else{
                        JOptionPane.showMessageDialog(null, "Error: Check Your Information", "Registration Error", 2);
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
   
    }//GEN-LAST:event_RegisterBTNActionPerformed

    private void minimizeLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLBLMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeLBLMouseClicked

    private void exitLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLBLMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLBLMouseClicked

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        LoginForm loginform = new LoginForm();
        loginform.setVisible(true);
        loginform.pack();
        loginform.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_backBTNActionPerformed

    private void phoneNumberFLDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumberFLDKeyTyped
        // Only allow digits
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_phoneNumberFLDKeyTyped
    
    public boolean verifyFields(){
        String firstName = firstNameFLD.getText();
        String lastName = lastNameFLD.getText();
        String phoneNumber = phoneNumberFLD.getText();
        String username = userFLD.getText();
        String password = String.valueOf(passFLD.getPassword());
        String confirmPassword = String.valueOf(confirmPassFLD.getPassword());
        
        // Check for empty fields
        if(firstName.trim().equals("") || lastName.trim().equals("") || 
           phoneNumber.trim().equals("")|| username.trim().equals("") || 
           password.trim().equals("") || confirmPassword.trim().equals("")){
           
           JOptionPane.showMessageDialog(null, "One or More Fields Are Empty", "Empty Fields", 2);
           return false;
        }
        // Check if passwords match
        else if(!password.equals(confirmPassword)){
           JOptionPane.showMessageDialog(null, "Password Doesn't Match", "Confirm Password", 2);
           return false;
        }
        // Fields are acceptable
        else{
            return true;
        }
    }
    
    public boolean checkUsername(String username){
        PreparedStatement st;
        ResultSet rs;
        boolean usernameExists = false;

        // Query to determine if username is available
        String query = "SELECT * FROM users WHERE Username = ?";

        try {
            st = Connector.getConnection().prepareStatement(query);

            st.setString(1, username);

            rs = st.executeQuery();

            // Check if credentials exist in database
            if(rs.next()) {
                // Username Taken
                usernameExists = true;
                JOptionPane.showMessageDialog(null, "This Username is Already Taken", "Username Failed", 2);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usernameExists;
    }
    
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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegisterBTN;
    private javax.swing.JLabel RegisterLBL;
    private javax.swing.JButton backBTN;
    private javax.swing.JPasswordField confirmPassFLD;
    private javax.swing.JLabel confirmPassLBL;
    private javax.swing.JLabel exitLBL;
    private javax.swing.JTextField firstNameFLD;
    private javax.swing.JLabel firstNameLBL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lastNameFLD;
    private javax.swing.JLabel lastNameLBL;
    private javax.swing.JLabel minimizeLBL;
    private javax.swing.JPasswordField passFLD;
    private javax.swing.JLabel passLBL;
    private javax.swing.JTextField phoneNumberFLD;
    private javax.swing.JLabel phoneNumberLBL;
    private javax.swing.JTextField userFLD;
    private javax.swing.JLabel userLBL;
    // End of variables declaration//GEN-END:variables
}
