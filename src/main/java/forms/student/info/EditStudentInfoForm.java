/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package forms.student.info;

import dialog.InfoDialog;
import forms.student.login.NewLoginForm;
import handlers.EditStudentInfoHandler;
import helper.FrameHelper;
import helper.InputValidationHelper;
import helper.PasswordHelper;
import user.AuthUser;
import user.Student;

import java.util.HashMap;

/**
 * @author misterfocusth
 */
public class EditStudentInfoForm extends javax.swing.JInternalFrame {

    private HashMap<String, String> studentData = new HashMap<>();

    /**
     * Creates new form EditStudentInfoForm
     */
    public EditStudentInfoForm() {
        initComponents();
        showStudentInfo();
    }

    private void showStudentInfo() {
        Student student = (Student) AuthUser.getAuthUser();

        selectedThNameTitleBox.setSelectedItem(student.getThNameTitle());
        selectedEnNameTitleBox.setSelectedItem(student.getEnNameTitle());

        thFirstNameTextField.setText(student.getThFirstName());
        thLastNameTextField.setText(student.getThLastName());
        enFirstNameTextField.setText(student.getEnFirstName());
        enLastNameTextField.setText(student.getEnLastName());
        emailTextField.setText(student.getEmail());
        phoneNumberTextField.setText(student.getPhoneNumber());

        identificationNumTextField.setText(student.getIdentificationNumber());
        identificationNumTextField.setEnabled(false);
        studentIdTextField.setText(student.getStudentId());
        studentIdTextField.setEnabled(false);

        selectedBirthDayBox.setSelectedItem(student.getDobDate());
        selectedBirthMonthBox.setSelectedItem(student.getDobMonth());
        birthYearTextField.setText(student.getDobYear());
        selectedGenderBox.setSelectedItem(student.getGender());

        selectedStudentYearBox.setSelectedItem(student.getClassYear());
        itGenerationTextField.setText(student.getGeneration());
        selectedProgramBox.setSelectedItem(student.getProgramName());
        majorTextField.setText(student.getMajorName());

        addressTextArea.setText(student.getContactAddress());
    }

    private HashMap<String, String> toStudentDataMap() {
        HashMap<String, String> studentDataHashMap = new HashMap<>();
        // Personal Data
        String thNameTitle = (String) selectedThNameTitleBox.getSelectedItem();
        String thFirstName = thFirstNameTextField.getText();
        String thLastName = thLastNameTextField.getText();
        String enNameTitle = (String) selectedEnNameTitleBox.getSelectedItem();
        String enFirstName = enFirstNameTextField.getText();
        String enLastName = enLastNameTextField.getText();
        String identificationNumber = identificationNumTextField.getText();
        String email = emailTextField.getText();
        String phoneNumber = phoneNumberTextField.getText();
        String contactAddress = addressTextArea.getText();
        String dobDate = (String) selectedBirthDayBox.getSelectedItem();
        String dobMonth = (String) selectedBirthMonthBox.getSelectedItem();
        String dobYear = birthYearTextField.getText();
        String gender = (String) selectedGenderBox.getSelectedItem();

        // Education Data
        String studentId = studentIdTextField.getText();
        String classYear = (String) selectedStudentYearBox.getSelectedItem();
        String generation = itGenerationTextField.getText();
        String schoolName = (String) selectedSchoolNameBox.getSelectedItem();
        String campusName = (String) campusBox.getSelectedItem();
        String majorName = majorTextField.getText();
        String programName = (String) selectedProgramBox.getSelectedItem();

        // Login Data
        String username = studentIdTextField.getText();

        // Personal Data
        studentDataHashMap.put("thNameTitle", thNameTitle);
        studentDataHashMap.put("thFirstName", thFirstName);
        studentDataHashMap.put("thLastName", thLastName);
        studentDataHashMap.put("enNameTitle", enNameTitle);
        studentDataHashMap.put("enFirstName", enFirstName);
        studentDataHashMap.put("enLastName", enLastName);
        studentDataHashMap.put("identificationNumber", identificationNumber);
        studentDataHashMap.put("email", email);
        studentDataHashMap.put("phoneNumber", phoneNumber);
        studentDataHashMap.put("contactAddress", contactAddress);
        studentDataHashMap.put("dobDate", dobDate);
        studentDataHashMap.put("dobMonth", dobMonth);
        studentDataHashMap.put("dobYear", dobYear);
        studentDataHashMap.put("gender", gender);

        // Education Data
        studentDataHashMap.put("studentId", studentId);
        studentDataHashMap.put("classYear", classYear);
        studentDataHashMap.put("generation", generation);
        studentDataHashMap.put("schoolName", schoolName);
        studentDataHashMap.put("campusName", campusName);
        studentDataHashMap.put("programName", programName);
        studentDataHashMap.put("majorName", majorName);

        // Login Data
        studentDataHashMap.put("username", username);
        studentDataHashMap.put("password", AuthUser.getEncodedPassword());

        return studentDataHashMap;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        selectedThNameTitleBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        thFirstNameTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        thLastNameTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        selectedEnNameTitleBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        enFirstNameTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        enLastNameTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        phoneNumberTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        identificationNumTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        studentIdTextField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        selectedBirthDayBox = new javax.swing.JComboBox<>();
        selectedBirthMonthBox = new javax.swing.JComboBox<>();
        birthYearTextField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        selectedGenderBox = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        selectedStudentYearBox = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        itGenerationTextField = new javax.swing.JTextField();
        selectedSchoolNameBox = new javax.swing.JComboBox<>();
        selectedProgramBox = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        majorTextField = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        campusBox = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        newPasswordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
        jLabel37 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        processUpdateButton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/icons8-male-user-96.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 121, 255));
        jLabel2.setText("เเก้ไขข้อมูลประวัติทะเบียนนักศึกษา");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("นักศึกษาสามารถเเก้ไขข้อมูลส่วนตัวได้หากข้อมูลที่เคยบันทึกไว้ภายในระบบตอน");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("สมัครเข้าใช้งานมีข้อผิดพลาด หรือไม่ถูกต้อง (ข้อมูลบางส่วนไม่สามารถเเก้ไขได้)");

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 121, 255));
        jLabel5.setText("ส่วนที่ 1 - ข้อมูลส่วนตัว");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("คำนำหน้า");

        selectedThNameTitleBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectedThNameTitleBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"นาย", "นางสาว"}));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("ชื่อจริง (ภาษาไทย)");

        thFirstNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("นามสกุล (ภาษาไทย)");

        thLastNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("คำนำหน้า");

        selectedEnNameTitleBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectedEnNameTitleBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Mr.", "Mrs."}));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("ชื่อจริง (ภาษาอังกฤษ)");

        enFirstNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("นามสกุล (ภาษาอังกฤษ)");

        enLastNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("อีเมล");

        emailTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("เบอร์โทรศัพท์");

        phoneNumberTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("เลขบัตรประจำตัวประชาชน");

        identificationNumTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        identificationNumTextField.setToolTipText("ไม่สามารถเเก้ไขข้อมูลส่วนนี้ได้ โปรดติดต่อผู้ดูเเลระบบ");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("รหัสประจำตัวนักศึกษา");

        studentIdTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentIdTextField.setToolTipText("ไม่สามารถเเก้ไขข้อมูลส่วนนี้ได้ โปรดติดต่อผู้ดูเเลระบบ");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("วัน / เดือน / ปี (พ.ศ.) เกิด");

        selectedBirthDayBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectedBirthDayBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));

        selectedBirthMonthBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectedBirthMonthBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฎาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม"}));

        birthYearTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("เพศ");

        selectedGenderBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectedGenderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"ชาย", "หญิง"}));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(41, 121, 255));
        jLabel22.setText("ส่วนที่ 2 - ข้อมูลการศึกษา");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("ชั้นปี");

        selectedStudentYearBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectedStudentYearBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"ปีที่ 1", "ปีที่ 2", "ปีที่ 3", "ปีที่ 4"}));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("รุ่น");

        itGenerationTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        selectedSchoolNameBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        selectedSchoolNameBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"คณะเทคโนโลยีสารสนเทศ"}));
        selectedSchoolNameBox.setEnabled(false);

        selectedProgramBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        selectedProgramBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"เทคโนโลยีสารสนเทศ", "วิทยาการข้อมูลและการวิเคราะห์เชิงธุรกิจ", "เทคโนโลยีสารสนเทศทางธุรกิจ (หลักสูตรนานาชาติ)"}));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("คณะ / วิทยาลัย");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("สาขา / วิชาเอก");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("เเขวงวิชา");

        majorTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("วิทยาเขต");

        campusBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"สถาบันเทคโนโลยีพระจอมเกล้าเจ้าคุณทหารลาดกระบัง วิทยาเขตหลัก (ลาดกระบัง)"}));
        campusBox.setEnabled(false);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(41, 121, 255));
        jLabel29.setText("ส่วนที่ 3 - ข้อมูลในการติดต่อ");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("ที่อยู่ (ที่สามารถติดต่อได้)");

        addressTextArea.setColumns(1);
        addressTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addressTextArea.setLineWrap(true);
        addressTextArea.setRows(2);
        addressTextArea.setTabSize(5);
        jScrollPane2.setViewportView(addressTextArea);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(41, 121, 255));
        jLabel32.setText("ส่วนที่ 4 - ข้อมูลในการเข้าสู่ระบบ / เปลี่ยนรหัสผ่าน");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("รหัสผ่านในการเข้าสู่ระบบ");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("รหัสผ่านใหม่");

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        newPasswordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        confirmPasswordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("ยืนยันรหัสผ่านใหม่");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel29)
                                        .addComponent(jLabel32)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel9)
                                                                        .addComponent(selectedEnNameTitleBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel10)
                                                                        .addComponent(enFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(19, 19, 19)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel11)
                                                                        .addComponent(enLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(identificationNumTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                                        .addComponent(selectedBirthDayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(selectedBirthMonthBox, 0, 114, Short.MAX_VALUE)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(birthYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addComponent(jLabel20))
                                                                .addGap(24, 24, 24)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(phoneNumberTextField)
                                                                        .addComponent(studentIdTextField)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel21)
                                                                                        .addComponent(jLabel17)
                                                                                        .addComponent(jLabel19))
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                        .addComponent(selectedGenderBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(selectedThNameTitleBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel6))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(thFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel7))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel8)
                                                                        .addComponent(thLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jLabel30)
                                                        .addComponent(jLabel31)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel35)
                                                                        .addComponent(jLabel36)
                                                                        .addComponent(jLabel37))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(passwordField)
                                                                        .addComponent(newPasswordField)
                                                                        .addComponent(confirmPasswordField)))
                                                        .addComponent(jScrollPane2)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(selectedStudentYearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel23)
                                                                                        .addComponent(jLabel27))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(itGenerationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel24)))
                                                                        .addComponent(majorTextField))
                                                                .addGap(25, 25, 25)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(selectedSchoolNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel25))
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabel26))
                                                                        .addComponent(jLabel28)
                                                                        .addComponent(campusBox, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(selectedProgramBox, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(selectedThNameTitleBox, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                        .addComponent(thFirstNameTextField)
                                        .addComponent(thLastNameTextField))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(selectedEnNameTitleBox, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                        .addComponent(enFirstNameTextField)
                                        .addComponent(enLastNameTextField))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(identificationNumTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                        .addComponent(studentIdTextField))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel21))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(selectedBirthDayBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(selectedBirthMonthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(birthYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(selectedGenderBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel23)
                                        .addComponent(jLabel24)
                                        .addComponent(jLabel25)
                                        .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(selectedProgramBox)
                                        .addComponent(selectedSchoolNameBox)
                                        .addComponent(itGenerationTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                        .addComponent(selectedStudentYearBox))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel27)
                                        .addComponent(jLabel28))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(campusBox)
                                        .addComponent(majorTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel32)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel35)
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel36)
                                        .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel37)
                                        .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel31)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jPanel2.add(jSeparator1);

        processUpdateButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        processUpdateButton.setForeground(new java.awt.Color(41, 121, 255));
        processUpdateButton.setText("บันทึกข้อมูล");
        processUpdateButton.setPreferredSize(new java.awt.Dimension(500, 35));
        processUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processUpdateButtonActionPerformed(evt);
            }
        });
        jPanel2.add(processUpdateButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(44, 44, 44))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE))
                                                .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel2)
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4)))
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void processUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processUpdateButtonActionPerformed
        this.studentData = this.toStudentDataMap();

        String oldPassword = PasswordHelper.getUserTypedPassword(passwordField);
        String newPassword = PasswordHelper.getUserTypedPassword(newPasswordField);
        String confirmNewPassword = PasswordHelper.getUserTypedPassword(confirmPasswordField);

        boolean isPasswordMatches = PasswordHelper.isPasswordMatches(oldPassword, AuthUser.getEncodedPassword());

        if (InputValidationHelper.validateUserPasswordChange(oldPassword, newPassword, confirmNewPassword)) {
            if (!isPasswordMatches) {
                new InfoDialog("ไม่สามารถอัพเดทข้อมูลนักศึกษา", "ข้อมูลการเข้าสู่ระบบ (รหัสผ่าน) ไม่ตรงกับข้อมูลปัจจุบัน โปรดตรวจสอบรหัสผ่านปัจจุบัน เเละดำเนินการใหม่อีกครั้ง").show();
                return;
            } else if (!newPassword.equals(confirmNewPassword)) {
                new InfoDialog("ไม่สามารถอัพเดทข้อมูลนักศึกษา", "นักศึกษากรอกรหัสผ่านใหม่ไม่ตรงกัน โปรดตรวจสอบข้อมูบเเละดำเนินการใหม่อีกครั้ง").show();
                return;
            } else {
                newPassword = PasswordHelper.encode(newPassword);
                this.studentData.put("password", newPassword);
            }
        }

        if (!InputValidationHelper.validateUserInput(studentData)) {
            new InfoDialog("ไม่สามารถอัพเดทข้อมูลนักศึกษา", "กรอกข้อมูลไม่ครบ โปรดตรวจสอบข้อมูลที่กรอก เเละดำเนินการใหม่อีกครั้ง").show();
            return;
        }

        processUpdateButton.setText("กำลังอัพเดทข้อมูล...");
        processUpdateButton.setEnabled(false);

        if (EditStudentInfoHandler.handleEditStudentInfo(studentData.get("studentId"), studentData)) {
            new InfoDialog("อัพเดทข้อมูลทะเบียนประวัตินักศึกษาสำเร็จ !", "โปรดดำเนินการเข้าสู่ระบบ ใหม่เพื่อนดำเนินการต่อ...").show();
            AuthUser.setAuthUser(null);
            AuthUser.setEncodedPassword("");
            FrameHelper.disposeCurrentInternalFrame();
            NewLoginForm newLoginForm = new NewLoginForm();
            FrameHelper.setLocationToCenter(newLoginForm);
            newLoginForm.setVisible(true);
        } else {
            new InfoDialog("อัพเดทข้อมูลทะเบียนประวัตินักศึกษาไม่สำเร็จ !", "ไม่สามารถอัพเดทข้อมูลได้ โปรดติดต่อผู้พัฒนา");
            processUpdateButton.setText("อัพเดทข้อมูล");
            processUpdateButton.setEnabled(true);
        }


    }//GEN-LAST:event_processUpdateButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JTextField birthYearTextField;
    private javax.swing.JComboBox<String> campusBox;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField enFirstNameTextField;
    private javax.swing.JTextField enLastNameTextField;
    private javax.swing.JTextField identificationNumTextField;
    private javax.swing.JTextField itGenerationTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField majorTextField;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JButton processUpdateButton;
    private javax.swing.JComboBox<String> selectedBirthDayBox;
    private javax.swing.JComboBox<String> selectedBirthMonthBox;
    private javax.swing.JComboBox<String> selectedEnNameTitleBox;
    private javax.swing.JComboBox<String> selectedGenderBox;
    private javax.swing.JComboBox<String> selectedProgramBox;
    private javax.swing.JComboBox<String> selectedSchoolNameBox;
    private javax.swing.JComboBox<String> selectedStudentYearBox;
    private javax.swing.JComboBox<String> selectedThNameTitleBox;
    private javax.swing.JTextField studentIdTextField;
    private javax.swing.JTextField thFirstNameTextField;
    private javax.swing.JTextField thLastNameTextField;
    // End of variables declaration//GEN-END:variables
}
