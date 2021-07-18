/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mm.fee.gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import mm.fee.database.*;
/**
 *
 * @author HP
 */
public class AddAccountant extends javax.swing.JFrame {

    /**
     * Creates new form AddAccountant
     */
    static AddAccountant frame = new AddAccountant();
    public AddAccountant() {
        initComponents();
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
        lblAddAccountant = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblContactNo = new javax.swing.JLabel();
        textField_2 = new javax.swing.JTextField();
        textField_1 = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        textField = new javax.swing.JTextField();
        btnAddAccountant = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.darkGray);

        lblAddAccountant.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lblAddAccountant.setForeground(java.awt.Color.cyan);
        lblAddAccountant.setText("Add Accountant");

        lblName.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(233, 24, 195));
        lblName.setText("Name :");

        lblPassword.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(218, 37, 176));
        lblPassword.setText("Password :");

        lblEmail.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(215, 37, 168));
        lblEmail.setText("Email :");

        lblContactNo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblContactNo.setForeground(new java.awt.Color(228, 30, 187));
        lblContactNo.setText("Contact No. :");

        textField_2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        textField_1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        textField.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        btnAddAccountant.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnAddAccountant.setForeground(new java.awt.Color(255, 0, 0));
        btnAddAccountant.setText("Add Accountant ");
        btnAddAccountant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAccountantActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 0, 0));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btnAddAccountant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblAddAccountant))
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContactNo)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(textField)
                            .addComponent(textField_1)
                            .addComponent(textField_2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblAddAccountant, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddAccountant, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        frame.dispose();
        AdminSection.main(new String[]{});
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddAccountantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAccountantActionPerformed
        String name=textField.getText();
				char ch[]=passwordField.getPassword();
				String password=String.valueOf(ch);
				String email=textField_1.getText();
				String contactno=textField_2.getText();
				
				if(name == null || name.length() == 0){
					JOptionPane.showMessageDialog(AddAccountant.this,"Please enter Name!");
					return;
				}
				if(password == null || password.length() == 0){
					JOptionPane.showMessageDialog(AddAccountant.this,"Please enter Password!");
					return;
				}
				if(password.toString().length() > 10  || password.toString().length() < 5 )
				{
					JOptionPane.showMessageDialog(AddAccountant.this,"Please enter valid Password.!");
				return;
				}
				if(email == null || email.length() == 0)
				{
					JOptionPane.showMessageDialog(AddAccountant.this,"Please enter Email!");
					return;
				}
				if(!email.isEmpty() && !email.matches("[a-zA-Z0-9\\.]+@[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9]{3}"))
				{
					JOptionPane.showMessageDialog(AddAccountant.this,"Please enter Email!");
					return;
				}
				
				if(contactno == null || contactno.length() == 0)
				{
					JOptionPane.showMessageDialog(AddAccountant.this,"Please enter Contact No.!");
					return;
				}
				if(contactno != null && (contactno.length() > 10 || contactno.length() < 10)){
					JOptionPane.showMessageDialog(AddAccountant.this,"Please enter valid Contact No.!");
					return;
				}
				
			   
				if(name != null && password != null && email!= null && contactno != null ) {
					Accountant a=new Accountant(name,password,email,contactno);
					int status=AccountantDao.save(a);
					
					if(status>0){
						JOptionPane.showMessageDialog(AddAccountant.this,"Accountant added successfully!");
						textField.setText("");textField_1.setText("");textField_2.setText("");
						passwordField.setText("");
					}else{
						JOptionPane.showMessageDialog(AddAccountant.this,"Sorry, Unable to add Accountant!");
					}
				}		
    }//GEN-LAST:event_btnAddAccountantActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAccountant;
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddAccountant;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField textField;
    private javax.swing.JTextField textField_1;
    private javax.swing.JTextField textField_2;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAddAccountant() {
        return btnAddAccountant;
    }

    public void setBtnAddAccountant(JButton btnAddAccountant) {
        this.btnAddAccountant = btnAddAccountant;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(JButton btnBack) {
        this.btnBack = btnBack;
    }

    public JLabel getLblAddAccountant() {
        return lblAddAccountant;
    }

    public void setLblAddAccountant(JLabel lblAddAccountant) {
        this.lblAddAccountant = lblAddAccountant;
    }

    public JLabel getLblContactNo() {
        return lblContactNo;
    }

    public void setLblContactNo(JLabel lblContactNo) {
        this.lblContactNo = lblContactNo;
    }

    public JLabel getLblEmail() {
        return lblEmail;
    }

    public void setLblEmail(JLabel lblEmail) {
        this.lblEmail = lblEmail;
    }

    public JLabel getLblName() {
        return lblName;
    }

    public void setLblName(JLabel lblName) {
        this.lblName = lblName;
    }

    public JLabel getLblPassword() {
        return lblPassword;
    }

    public void setLblPassword(JLabel lblPassword) {
        this.lblPassword = lblPassword;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public JTextField getTextField_1() {
        return textField_1;
    }

    public void setTextField_1(JTextField textField_1) {
        this.textField_1 = textField_1;
    }

    public JTextField getTextField_2() {
        return textField_2;
    }

    public void setTextField_2(JTextField textField_2) {
        this.textField_2 = textField_2;
    }
}
