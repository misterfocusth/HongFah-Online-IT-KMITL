/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package forms.student.document;

import document.GeneralRequestDocument;
import forms.MainForm;
import forms.student.contact.ContactStaffHomeForm;
import helper.FrameHelper;
import user.AuthUser;

/**
 * @author misterfocusth
 */
public class GeneralDocDetailForm extends javax.swing.JInternalFrame {

    private final GeneralRequestDocument docData;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea contactAddressTextArea;
    private javax.swing.JLabel contactStaffLabel1;
    private javax.swing.JLabel documentIDLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea profCommentTextArea;
    private javax.swing.JTextArea remarkTextArea;
    private javax.swing.JTextArea requestBodyTextArea;
    private javax.swing.JLabel requestByNameLabel;
    private javax.swing.JTextField requestByNameTextField;
    private javax.swing.JTextField requestByTextField;
    private javax.swing.JTextField requestTitleTextField;
    private javax.swing.JTextField requestToTextLabel;
    private javax.swing.JLabel respondedAt;
    private javax.swing.JLabel respondedBy;
    private javax.swing.JComboBox<String> selectedWrittenDayBox;
    private javax.swing.JComboBox<String> selectedWrittenMonthBox;
    private javax.swing.JTextArea staffCommentTextArea;
    private javax.swing.JLabel status;
    private javax.swing.JTextArea writtenAtTextArea;
    private javax.swing.JTextField writtenYearTextField;
    /**
     * Creates new form GeneralDocDetailForm
     */
    public GeneralDocDetailForm(GeneralRequestDocument docData) {
        initComponents();
        this.docData = docData;
        showDocData();
    }

    private void showDocData() {
        documentIDLabel.setText(docData.getDocumentId());
        writtenAtTextArea.setText(docData.getWrittenAt());
        requestTitleTextField.setText(docData.getRequestTitle());
        requestToTextLabel.setText(docData.getRequestTo());
        selectedWrittenDayBox.setSelectedItem(docData.getRequestedAtDay());
        selectedWrittenMonthBox.setSelectedItem(docData.getRequestedAtMonth());
        writtenYearTextField.setText(docData.getRequestedAtYear());
        requestByTextField.setText(docData.getRequestBy());
        contactAddressTextArea.setText(docData.getContactAddress());
        requestBodyTextArea.setText(docData.getRequestBody());
        String studentFullName = AuthUser.getAuthUser().getThFirstName() + " " + AuthUser.getAuthUser().getThLastName();
        requestByNameTextField.setText(studentFullName);
        requestByNameLabel.setText("(" + AuthUser.getAuthUser().getThNameTitle() + AuthUser.getAuthUser().getThFirstName() + " " + AuthUser.getAuthUser().getThLastName() + ")");
        respondedBy.setText(docData.getRespondedBy());
        respondedAt.setText(docData.getRespondedAt());
        status.setText(docData.getRequestStatus());
        if (docData.getRequestResponses().size() == 0) {
            staffCommentTextArea.setText("ยังไม่มีการตอบกลับ");
            profCommentTextArea.setText("ยังไม่มีการตอบกลับ");
            remarkTextArea.setText("ยังไม่มีการตอบกลับ");
        } else {
            staffCommentTextArea.setText(docData.getRequestResponses().get(0));
            profCommentTextArea.setText(docData.getRequestResponses().get(1));
            remarkTextArea.setText(docData.getRequestResponses().get(2));
        }

        writtenAtTextArea.setEditable(false);
        requestTitleTextField.setEditable(false);
        requestToTextLabel.setEditable(false);
        selectedWrittenDayBox.setEnabled(false);
        selectedWrittenMonthBox.setEnabled(false);
        writtenYearTextField.setEditable(false);
        requestByTextField.setEditable(false);
        contactAddressTextArea.setEditable(false);
        requestBodyTextArea.setEditable(false);
        staffCommentTextArea.setEditable(false);
        profCommentTextArea.setEditable(false);
        remarkTextArea.setEditable(false);
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
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        contactStaffLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        profCommentTextArea = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        staffCommentTextArea = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        respondedAt = new javax.swing.JLabel();
        respondedBy = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        remarkTextArea = new javax.swing.JTextArea();
        jLabel39 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        documentIDLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        selectedWrittenDayBox = new javax.swing.JComboBox<>();
        selectedWrittenMonthBox = new javax.swing.JComboBox<>();
        writtenYearTextField = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        requestBodyTextArea = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        requestTitleTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        requestToTextLabel = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        requestByTextField = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        writtenAtTextArea = new javax.swing.JTextArea();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        contactAddressTextArea = new javax.swing.JTextArea();
        jLabel37 = new javax.swing.JLabel();
        requestByNameTextField = new javax.swing.JTextField();
        requestByNameLabel = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("   2. ติดต่อเจ้าหน้าที่ห้องฟ้า ผ่านระบบห้องฟ้าออนไลน์");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("   1. ติดต่อ คุณประทีป อินทร์เขียว ได้ที่ห้อง M.22 หรือทางอีเมล prateep@it.kmitl.ac.th");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("มีข้อสงสัยเกี่ยวกับการยื่นเอกสารลาเรียน ?");
        jLabel28.setIconTextGap(6);

        contactStaffLabel1.setBackground(new java.awt.Color(0, 102, 255));
        contactStaffLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contactStaffLabel1.setForeground(new java.awt.Color(0, 102, 255));
        contactStaffLabel1.setText("ติดต่อห้องฟ้า");
        contactStaffLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactStaffLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel25)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(contactStaffLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel25)
                                        .addComponent(contactStaffLabel1))
                                .addGap(12, 12, 12))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("ความเห็นจากเจ้าหน้าที่ / อาจารย์"));

        profCommentTextArea.setColumns(20);
        profCommentTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        profCommentTextArea.setLineWrap(true);
        profCommentTextArea.setTabSize(0);
        profCommentTextArea.setText("ยังไม่มีการตอบกลับ");
        profCommentTextArea.setWrapStyleWord(true);
        jScrollPane9.setViewportView(profCommentTextArea);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("ความเห็นจากอาจารย์ (ถ้ามี)");

        staffCommentTextArea.setColumns(20);
        staffCommentTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        staffCommentTextArea.setLineWrap(true);
        staffCommentTextArea.setTabSize(0);
        staffCommentTextArea.setText("ยังไม่มีการตอบกลับ");
        staffCommentTextArea.setWrapStyleWord(true);
        jScrollPane10.setViewportView(staffCommentTextArea);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("ความเห็นจากเจ้าหน้าที่");

        respondedAt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        respondedAt.setText("jLabel5");

        respondedBy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        respondedBy.setText("jLabel5");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("ตอบกลับโดย : ");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("ตอบกลับเมื่อ : ");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_48x48/icons8-male-user-48.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("สถานะเอกสาร : ");

        status.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        status.setText("ยื่นเอกสารเเล้ว / กำลังรอการตอบกลับ");

        remarkTextArea.setColumns(20);
        remarkTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        remarkTextArea.setLineWrap(true);
        remarkTextArea.setTabSize(0);
        remarkTextArea.setText("ยังไม่มีการตอบกลับ");
        remarkTextArea.setWrapStyleWord(true);
        jScrollPane11.setViewportView(remarkTextArea);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setText("หมายเหตุ / คำสั่ง (ถ้ามี)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel23)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(44, Short.MAX_VALUE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane10)
                                                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel22)
                                                                .addGap(12, 12, 12)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                .addComponent(jLabel19)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(respondedBy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                .addComponent(jLabel21)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(respondedAt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                        .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(30, 30, 30))))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel23)
                                        .addComponent(status))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel22)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel19)
                                                        .addComponent(respondedBy))
                                                .addGap(7, 7, 7)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel21)
                                                        .addComponent(respondedAt))))
                                .addGap(24, 24, 24)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
        );

        jScrollPane7.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("รายละเอียดการยื่นเอกสารคำร้องทั่วไป");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ข้อมูลเอกสารคำร้องทั่วไป ความคิดเห็น เเละสถานะการตอบกลับจากเจ้าหน้าที่");

        documentIDLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        documentIDLabel.setText("XXXXXXXXXX");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("เลขที่เอกสาร (คำร้องเลขที่) : ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_48x48/icons8-analyze-48.png"))); // NOI18N

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("เขียนคำร้องที่");

        selectedWrittenDayBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectedWrittenDayBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));

        selectedWrittenMonthBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectedWrittenMonthBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฎาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม"}));

        writtenYearTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        requestBodyTextArea.setColumns(1);
        requestBodyTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        requestBodyTextArea.setLineWrap(true);
        requestBodyTextArea.setRows(15);
        requestBodyTextArea.setTabSize(1);
        requestBodyTextArea.setWrapStyleWord(true);
        jScrollPane3.setViewportView(requestBodyTextArea);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("เรื่อง");

        requestTitleTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("เรียน (นักศึกษาต้องการเขียนคำร้องถึงใคร)");

        requestToTextLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("เขียนคำร้องเมื่อ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("ยื่นคำร้องโดย (รหัสนักศึกษา)");

        requestByTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        requestByTextField.setEnabled(false);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("ที่อยู่สำหรับติดต่อ");

        writtenAtTextArea.setColumns(1);
        writtenAtTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        writtenAtTextArea.setLineWrap(true);
        writtenAtTextArea.setRows(3);
        writtenAtTextArea.setTabSize(0);
        writtenAtTextArea.setWrapStyleWord(true);
        jScrollPane4.setViewportView(writtenAtTextArea);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("มีความประสงค์ที่จะ");

        contactAddressTextArea.setColumns(1);
        contactAddressTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contactAddressTextArea.setLineWrap(true);
        contactAddressTextArea.setRows(3);
        contactAddressTextArea.setTabSize(0);
        contactAddressTextArea.setWrapStyleWord(true);
        jScrollPane5.setViewportView(contactAddressTextArea);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("จึงเรียนมาเพื่อโปรดพิจารณาเเละดำเนินการต่อไปด้วย");

        requestByNameTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        requestByNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        requestByNameTextField.setText("นายศิลา ภักดีวงษ์");
        requestByNameTextField.setEnabled(false);

        requestByNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        requestByNameLabel.setText("NAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(requestToTextLabel)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel13)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addGap(12, 12, 12)
                                                                                                .addComponent(jLabel31))
                                                                                        .addComponent(jLabel20)
                                                                                        .addComponent(jScrollPane3)
                                                                                        .addComponent(jLabel12)
                                                                                        .addComponent(requestTitleTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE))
                                                                                .addComponent(jLabel37)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(requestByNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(requestByNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel14)
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addComponent(selectedWrittenDayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(selectedWrittenMonthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(writtenYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addGap(31, 31, 31)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel15)
                                                                                .addComponent(requestByTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))))
                                                        .addComponent(jLabel33)))
                                        .addComponent(jLabel34)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(requestTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(requestToTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(requestByTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(selectedWrittenDayBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(selectedWrittenMonthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(writtenYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel37)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel31)
                                .addGap(18, 18, 18)
                                .addComponent(requestByNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(requestByNameLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(documentIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(jScrollPane1))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel3)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(documentIDLabel))
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contactStaffLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactStaffLabel1MouseClicked
        ContactStaffHomeForm contactStaffHomeForm = new ContactStaffHomeForm();
        FrameHelper.setLocationToCenter(contactStaffHomeForm);
        MainForm.mainDesktopPane.add(contactStaffHomeForm);
        contactStaffHomeForm.setVisible(true);
    }//GEN-LAST:event_contactStaffLabel1MouseClicked
    // End of variables declaration//GEN-END:variables
}
