/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mm.fee.gui;

import com.itextpdf.text.Font;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import mm.fee.database.Student;
import mm.fee.database.StudentDao;

/**
 *
 * @author HP
 */
public class FeeReportgenrator extends javax.swing.JFrame {

    /**
     * Creates new form FeeReportgenrator
     */
    static FeeReportgenrator frame = new FeeReportgenrator();
    public FeeReportgenrator() {
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textField_10 = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        textField = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        textField_1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textField_2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textField_3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textField_4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textField_5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        textField_6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textField_7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textField_8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textField_9 = new javax.swing.JTextField();
        btnPrint = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnLoadRecord = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(java.awt.Color.darkGray);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 17, 209));
        jLabel1.setText("Roll No. : ");

        textField_10.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        textField_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_10ActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(233, 33, 181));
        lblName.setText("Name :");

        textField.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(220, 50, 177));
        lblEmail.setText("Email :");

        textField_1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(222, 15, 212));
        jLabel7.setText("Course :");

        textField_2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(217, 20, 160));
        jLabel8.setText("Fees :");

        textField_3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(226, 34, 191));
        jLabel5.setText("Paid :");

        textField_4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(228, 32, 197));
        jLabel6.setText("Due :");

        textField_5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(200, 40, 187));
        jLabel4.setText("Address :");

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(221, 38, 207));
        jLabel12.setText("City :");

        textField_6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 53, 207));
        jLabel9.setText("State :");

        textField_7.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(243, 26, 226));
        jLabel10.setText("Country :");

        textField_8.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(236, 44, 215));
        jLabel11.setText("Contact No. :");

        textField_9.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        btnPrint.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(204, 51, 0));
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 51, 0));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnLoadRecord.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnLoadRecord.setForeground(new java.awt.Color(204, 51, 0));
        btnLoadRecord.setText("Load Record");
        btnLoadRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadRecordActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 102));
        jButton2.setText("Due Fees");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(btnLoadRecord))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField_8, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_9, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_7, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_6, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_5, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_10, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(124, 124, 124))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoadRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(btnPrint))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textField_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_10ActionPerformed

    private void btnLoadRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadRecordActionPerformed
        String srollno=textField_10.getText();
        if(srollno==null||srollno.trim().equals("")){
            JOptionPane.showMessageDialog(FeeReportgenrator.this,"Please enter rollno first!");
        }else{
            int rollno=Integer.parseInt(srollno);
            Student s=StudentDao.getStudentByRollno(rollno);
            textField.setText(s.getName());
            textField_1.setText(s.getEmail());
            textField_2.setText(s.getCourse());
            textField_3.setText(String.valueOf(s.getFee()));
            textField_4.setText(String.valueOf(s.getPaid()));
            textField_5.setText(String.valueOf(s.getDue()));
            textArea.setText(s.getAddress());
            textField_6.setText(s.getCity());
            textField_7.setText(s.getState());
            textField_8.setText(s.getCountry());
            textField_9.setText(s.getContactno());
            
            
        }
    }//GEN-LAST:event_btnLoadRecordActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
       Document receipt = new Document();
				String name=textField.getText();
				String email=textField_1.getText();
				String course=textField_2.getText();
				String fee=textField_3.getText();
				String paid= textField_4.getText();
				String due=textField_5.getText();
				String address=textArea.getText();
				String city=textField_6.getText();
				String state=textField_7.getText();
				String country=textField_8.getText();
				String contactno=textField_9.getText();
				String rollno=textField_10.getText();

//				int rollno=Integer.parseInt(textField_10.getText());

				if(rollno == null || rollno.length() == 0){
					JOptionPane.showMessageDialog(FeeReportgenrator.this,"Please enter Rollno!");
					return;
				}
                                if(Integer.parseInt(due)!=(Integer.parseInt(fee)-Integer.parseInt(paid)))
                                {
                                    JOptionPane.showMessageDialog(FeeReportgenrator.this,"Please enter Correct Due Fee!");
				    return;
                                }
				try{
					
					PdfWriter.getInstance(receipt, new FileOutputStream("receipt.pdf"));
					receipt.open();
					LineSeparator line;
					line = new LineSeparator();
					  Font f = new Font();
			          
					receipt.add( Chunk.NEWLINE );
					String space = "";
		            Font font2 = new Font(Font.FontFamily.HELVETICA  , 15, Font.BOLD | Font.UNDERLINE );
		            Paragraph receiptname = new Paragraph("Receipt",font2);            
		            receiptname.setAlignment(Paragraph.ALIGN_CENTER);
					receipt.add(receiptname); 
					receipt.add(Chunk.NEWLINE);
					receipt.add(Chunk.NEWLINE);		            
		            PdfPTable table3 = new PdfPTable(2);
		            
		            PdfPCell cell20 = new PdfPCell(new Paragraph("Roll_no:-"));		            
		            PdfPCell cell21 = new PdfPCell(new Paragraph(rollno));
		            receipt.add(cell21);       
		            
		            PdfPCell cell22 = new PdfPCell(new Paragraph("Candidate Name"));		            
		            PdfPCell cell23 = new PdfPCell(new Paragraph(name));
		            receipt.add(cell23);       
		            
		            PdfPCell cell24 = new PdfPCell(new Paragraph("Email "));		            
		            PdfPCell cell25 = new PdfPCell(new Paragraph(email));
		            receipt.add(cell25);       

		            PdfPCell cell26 = new PdfPCell(new Paragraph("Course "));		            
		            PdfPCell cell27 = new PdfPCell(new Paragraph(course));
		            receipt.add(cell27);
		            
		            PdfPCell cell28 = new PdfPCell(new Paragraph("Fee"));		            
		            PdfPCell cell29 = new PdfPCell(new Paragraph(fee));
		            receipt.add(cell29);
		            
		            PdfPCell cell30 = new PdfPCell(new Paragraph("Paid"));		            
		            PdfPCell cell31 = new PdfPCell(new Paragraph(paid));
		            receipt.add(cell31);
		            
		            PdfPCell cell32 = new PdfPCell(new Paragraph("Due"));		            
		            PdfPCell cell33 = new PdfPCell(new Paragraph(due));
		            receipt.add(cell33);

		            PdfPCell cell34 = new PdfPCell(new Paragraph("Address"));		            
		            PdfPCell cell35 = new PdfPCell(new Paragraph(address));
		            receipt.add(cell35);
		            

		            PdfPCell cell36 = new PdfPCell(new Paragraph("City"));		            
		            PdfPCell cell37 = new PdfPCell(new Paragraph(city));
		            receipt.add(cell37);
		           
		            PdfPCell cell38 = new PdfPCell(new Paragraph("State"));		            
		            PdfPCell cell39 = new PdfPCell(new Paragraph(state));
		            receipt.add(cell39);
		           
		            PdfPCell cell40 = new PdfPCell(new Paragraph("Country"));		            
		            PdfPCell cell41 = new PdfPCell(new Paragraph(country));
		            receipt.add(cell41);
		           
		            
		            PdfPCell cell42 = new PdfPCell(new Paragraph("Contact No:"));		            
		            PdfPCell cell43 = new PdfPCell(new Paragraph(contactno));
		            receipt.add(cell43);
		            
		            table3.addCell(cell20);
		            table3.addCell(cell21);
		            		            
		            table3.addCell(cell22);
		            table3.addCell(cell23);
		            table3.addCell(cell24);
		            table3.addCell(cell25);
		            table3.addCell(cell26);
		            table3.addCell(cell27);
		            table3.addCell(cell28);
		            table3.addCell(cell29);
		            table3.addCell(cell30);
		            table3.addCell(cell31);
		            table3.addCell(cell32);
		            table3.addCell(cell33);
		            table3.addCell(cell34);
		            table3.addCell(cell35);
		            table3.addCell(cell36);
		            table3.addCell(cell37);
		            table3.addCell(cell38);
		            table3.addCell(cell39);
		            table3.addCell(cell40);
		            table3.addCell(cell41);
		            table3.addCell(cell42);
		            table3.addCell(cell43);
			                
		            receipt.add(table3);                 
    				receipt.close(); 

				}
				catch(Exception ex)
				{
					  System.out.println(ex.getMessage());
				}
				
				File file = new File("receipt.pdf");
		        try {
					Desktop.getDesktop().open(file);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    }//GEN-LAST:event_btnPrintActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        frame.dispose();
        AccountantSection.main(new String[]{});
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      int fee = (Integer.parseInt(textField_3.getText())-Integer.parseInt(textField_4.getText()));
       String txt = String.valueOf(fee);
        textField_5.setText(txt);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldActionPerformed

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
            java.util.logging.Logger.getLogger(FeeReportgenrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeeReportgenrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeeReportgenrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeeReportgenrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoadRecord;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField textField;
    private javax.swing.JTextField textField_1;
    private javax.swing.JTextField textField_10;
    private javax.swing.JTextField textField_2;
    private javax.swing.JTextField textField_3;
    private javax.swing.JTextField textField_4;
    private javax.swing.JTextField textField_5;
    private javax.swing.JTextField textField_6;
    private javax.swing.JTextField textField_7;
    private javax.swing.JTextField textField_8;
    private javax.swing.JTextField textField_9;
    // End of variables declaration//GEN-END:variables

    public static FeeReportgenrator getFrame() {
        return frame;
    }

    public JButton getBtnLoadRecord() {
        return btnLoadRecord;
    }

    public JButton getBtnPrint() {
        return btnPrint;
    }

    public JButton getjButton1() {
        return jButton1;
    }
    
    public JButton getjButton2() {
        return jButton2;
    }

    public JButton getjButton3() {
        return jButton3;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JLabel getLblEmail() {
        return lblEmail;
    }

    public JLabel getLblName() {
        return lblName;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public JTextField getTextField() {
        return textField;
    }

    public JTextField getTextField_1() {
        return textField_1;
    }

    public JTextField getTextField_10() {
        return textField_10;
    }

    public JTextField getTextField_2() {
        return textField_2;
    }

    public JTextField getTextField_3() {
        return textField_3;
    }

    public JTextField getTextField_4() {
        return textField_4;
    }

    public JTextField getTextField_5() {
        return textField_5;
    }

    public JTextField getTextField_6() {
        return textField_6;
    }

    public JTextField getTextField_7() {
        return textField_7;
    }

    public JTextField getTextField_8() {
        return textField_8;
    }

    public JTextField getTextField_9() {
        return textField_9;
    }
}
