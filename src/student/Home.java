package student;

import java.awt.Color;
import java.awt.Image;
import java.awt.print.PrinterException;
import java.io.File;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gayan
 */
public class Home extends javax.swing.JFrame {

    Student student = new Student();
    Course course = new Course();
    Marks marks = new Marks();
    MarkSheet markSheet = new MarkSheet();
    int xx, xy;
    private String imagePath;
    private DefaultTableModel model;
    private int rowIndex;
    NumberFormat nf = NumberFormat.getInstance();

    public Home() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CloseBtn = new javax.swing.JButton();
        MarkSheet = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        st_DOB = new com.toedter.calendar.JDateChooser();
        st_Gender = new javax.swing.JComboBox<>();
        st_StudentName = new javax.swing.JTextField();
        st_Email = new javax.swing.JTextField();
        st_NIC = new javax.swing.JTextField();
        st_MotherName = new javax.swing.JTextField();
        st_FatherName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        st_Address = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        st_Browsebtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        st_image = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        St_studentID = new javax.swing.JTextField();
        st_PhoneNo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        st_Searchfield = new javax.swing.JTextField();
        st_Refresh = new javax.swing.JButton();
        st_SearchBtn = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        st_AddNewbtn = new javax.swing.JButton();
        st_DeleteBtn = new javax.swing.JButton();
        st_PrintBtn = new javax.swing.JButton();
        st_ClearBtn = new javax.swing.JButton();
        St_Logoutbtn = new javax.swing.JButton();
        st_UpdateBtn = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        Cause_Module01 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Cause_ID = new javax.swing.JTextField();
        jPanel35 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        Cause_SearchSID = new javax.swing.JTextField();
        Cause_Sid_SearchBtn = new javax.swing.JButton();
        Cause_StudentID = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        Cause_Module02 = new javax.swing.JComboBox<>();
        Cause_Module03 = new javax.swing.JComboBox<>();
        Cause_Module04 = new javax.swing.JComboBox<>();
        Cause_Semester = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        Cause_Module05 = new javax.swing.JComboBox<>();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        cause_Searchfield = new javax.swing.JTextField();
        Cause_Refresh = new javax.swing.JButton();
        Cause_Search = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        cause_Table = new javax.swing.JTable();
        jPanel26 = new javax.swing.JPanel();
        Cause_Save = new javax.swing.JButton();
        Cause_Print = new javax.swing.JButton();
        Cause_ClearBtn = new javax.swing.JButton();
        Cause_Logout_Btn = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        Marks_searchSID = new javax.swing.JTextField();
        Marks_SemesterSearch = new javax.swing.JTextField();
        Marks_PanelSearch_Btn = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        Marks_ID = new javax.swing.JTextField();
        Marks_Semester = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        Marks_score3 = new javax.swing.JTextField();
        Marks_score4 = new javax.swing.JTextField();
        Marks_score1 = new javax.swing.JTextField();
        Marks_score2 = new javax.swing.JTextField();
        Marks_score5 = new javax.swing.JTextField();
        Marks_Module1 = new javax.swing.JTextField();
        Marks_Module2 = new javax.swing.JTextField();
        Marks_Module5 = new javax.swing.JTextField();
        Marks_Module3 = new javax.swing.JTextField();
        Marks_Module4 = new javax.swing.JTextField();
        Marks_StudentID1 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        Marks_SearchField = new javax.swing.JTextField();
        Marks_RefreshBtn = new javax.swing.JButton();
        Marks_SearchBtn = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        marks_table = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        Marks_Save = new javax.swing.JButton();
        Marks_Print = new javax.swing.JButton();
        Marks_ClearBtn = new javax.swing.JButton();
        Marks_Logout_Btn = new javax.swing.JButton();
        Marks_UpdateBtn = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        Marksheet_SearchField = new javax.swing.JTextField();
        Marksheet_SearchBtn = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        GPA_Label = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        MarksheetTable = new javax.swing.JTable();
        jPanel34 = new javax.swing.JPanel();
        MarkSheet_PrintBtn = new javax.swing.JButton();
        MarkSheet_ClearBtn = new javax.swing.JButton();
        MarkSheet_Logout_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1560, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 767));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel1.setText("EduFlow Student Management System");

        CloseBtn.setBackground(new java.awt.Color(153, 204, 255));
        CloseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/close 1.png"))); // NOI18N
        CloseBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        MarkSheet.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MarkSheet.setMaximumSize(new java.awt.Dimension(32000, 3200));
        MarkSheet.setPreferredSize(new java.awt.Dimension(32000, 3200));

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));
        jPanel4.setPreferredSize(new java.awt.Dimension(1400, 647));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        st_DOB.setDateFormatString("YYYY-MM-dd");
        st_DOB.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        st_Gender.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        st_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        st_StudentName.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        st_Email.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        st_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st_EmailActionPerformed(evt);
            }
        });

        st_NIC.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        st_MotherName.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        st_FatherName.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setText("Student's ID");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("Student Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setText("Date of Birth");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setText("Email");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setText("Phone Number");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setText("NIC Number");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setText("Address");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setText("Mother's Name");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel11.setText("Father's Name");

        st_Address.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        st_Browsebtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        st_Browsebtn.setText("Browse");
        st_Browsebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st_BrowsebtnActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(st_image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(st_image, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Picture");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(st_Browsebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(st_Browsebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        St_studentID.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        st_PhoneNo.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        st_PhoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                st_PhoneNoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(17, 17, 17))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(st_FatherName)
                                    .addComponent(st_Address)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(st_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(st_PhoneNo)
                                    .addComponent(st_Email)
                                    .addComponent(st_DOB, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                    .addComponent(st_StudentName)
                                    .addComponent(St_studentID)
                                    .addComponent(st_NIC)
                                    .addComponent(st_MotherName))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(297, 297, 297)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(37, 37, 37))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(St_studentID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(st_StudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(st_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(st_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(st_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(st_PhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(st_NIC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(st_MotherName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(st_FatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(st_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("Search Student");

        st_Refresh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        st_Refresh.setText("Refresh");
        st_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st_RefreshActionPerformed(evt);
            }
        });

        st_SearchBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        st_SearchBtn.setText("Search");
        st_SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st_SearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(st_Searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(st_SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(st_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_Searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student's ID", "Student Name", "Date of Birth", "Gender", "Email", "Phone Number", "Nic Number", "Mother's Name", "Father's Name", "Address", "Image Path"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studentTable);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        st_AddNewbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        st_AddNewbtn.setText("ADD NEW");
        st_AddNewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st_AddNewbtnActionPerformed(evt);
            }
        });

        st_DeleteBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        st_DeleteBtn.setText("DELETE");
        st_DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st_DeleteBtnActionPerformed(evt);
            }
        });

        st_PrintBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        st_PrintBtn.setText("PRINT");
        st_PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st_PrintBtnActionPerformed(evt);
            }
        });

        st_ClearBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        st_ClearBtn.setText("CLEAR");
        st_ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st_ClearBtnActionPerformed(evt);
            }
        });

        St_Logoutbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        St_Logoutbtn.setText("LOGOUT");
        St_Logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                St_LogoutbtnActionPerformed(evt);
            }
        });

        st_UpdateBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        st_UpdateBtn.setText("UPDATE");
        st_UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st_UpdateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(st_AddNewbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(st_UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(st_DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(st_PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(st_ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(St_Logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st_AddNewbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(St_Logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        MarkSheet.addTab("Student", jPanel4);

        jPanel19.setBackground(new java.awt.Color(0, 51, 102));

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));
        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        Cause_Module01.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Cause_Module01.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Introduction to Computer Science", "Mathamatics For Computing", "Programming Fundamentals", "Digital Logic and Computer Architecture", "Object Oriented Programming", "Database Management", "GUI Development", "Software Engineering", "Web Development", "Enterprices Application Development", "Operatig System" }));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel28.setText("Student's ID");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel31.setText("Semester");

        Cause_ID.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jPanel35.setBackground(new java.awt.Color(204, 204, 204));
        jPanel35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel54.setText("Student's ID");

        Cause_SearchSID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cause_SearchSIDKeyTyped(evt);
            }
        });

        Cause_Sid_SearchBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cause_Sid_SearchBtn.setText("Search");
        Cause_Sid_SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cause_Sid_SearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addComponent(Cause_SearchSID, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cause_Sid_SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cause_SearchSID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cause_Sid_SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Cause_StudentID.setEditable(false);
        Cause_StudentID.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel29.setText("ID");

        Cause_Module02.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Cause_Module02.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Introduction to Computer Science", "Mathamatics For Computing", "Programming Fundamentals", "Digital Logic and Computer Architecture", "Object Oriented Programming", "Database Management", "GUI Development", "Software Engineering", "Web Development", "Enterprices Application Development", "Operatig System" }));

        Cause_Module03.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Cause_Module03.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Introduction to Computer Science", "Mathamatics For Computing", "Programming Fundamentals", "Digital Logic and Computer Architecture", "Object Oriented Programming", "Database Management", "GUI Development", "Software Engineering", "Web Development", "Enterprices Application Development", "Operatig System" }));

        Cause_Module04.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Cause_Module04.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Introduction to Computer Science", "Mathamatics For Computing", "Programming Fundamentals", "Digital Logic and Computer Architecture", "Object Oriented Programming", "Database Management", "GUI Development", "Software Engineering", "Web Development", "Enterprices Application Development", "Operatig System" }));

        Cause_Semester.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Cause_Semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel32.setText("Module 1");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel33.setText("Module 3");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel34.setText("Module 2");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel35.setText("Module 4");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel36.setText("Module 5");

        Cause_Module05.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Cause_Module05.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Introduction to Computer Science", "Mathamatics For Computing", "Programming Fundamentals", "Digital Logic and Computer Architecture", "Object Oriented Programming", "Database Management", "GUI Development", "Software Engineering", "Web Development", "Enterprices Application Development", "Operatig System" }));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel29)
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel31)
                        .addComponent(jLabel34)
                        .addComponent(jLabel33)
                        .addComponent(jLabel35)
                        .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cause_Semester, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cause_Module04, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cause_Module03, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cause_Module02, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cause_Module01, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cause_StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cause_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cause_Module05, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cause_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cause_StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(20, 20, 20)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cause_Semester, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cause_Module01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cause_Module02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cause_Module03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cause_Module04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cause_Module05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(102, 102, 102));
        jPanel23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        jPanel24.setBackground(new java.awt.Color(204, 204, 204));
        jPanel24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel40.setText("Search Student");

        Cause_Refresh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cause_Refresh.setText("Refresh");
        Cause_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cause_RefreshActionPerformed(evt);
            }
        });

        Cause_Search.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cause_Search.setText("Search");
        Cause_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cause_SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addGap(18, 18, 18)
                .addComponent(cause_Searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cause_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Cause_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cause_Searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cause_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cause_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(204, 204, 204));
        jPanel25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        cause_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Student's ID", "Semester", "Module1", "Module2", "Module3", "Module4", "Module5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(cause_Table);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel26.setBackground(new java.awt.Color(204, 204, 204));
        jPanel26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        Cause_Save.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cause_Save.setText("SAVE");
        Cause_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cause_SaveActionPerformed(evt);
            }
        });

        Cause_Print.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cause_Print.setText("PRINT");
        Cause_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cause_PrintActionPerformed(evt);
            }
        });

        Cause_ClearBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cause_ClearBtn.setText("CLEAR");
        Cause_ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cause_ClearBtnActionPerformed(evt);
            }
        });

        Cause_Logout_Btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cause_Logout_Btn.setText("LOGOUT");
        Cause_Logout_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cause_Logout_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cause_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Cause_Print, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Cause_ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Cause_Logout_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cause_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cause_Print, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cause_ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cause_Logout_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        MarkSheet.addTab("Course", jPanel19);

        jPanel11.setBackground(new java.awt.Color(0, 51, 102));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));
        jPanel12.setPreferredSize(new java.awt.Dimension(492, 635));

        jPanel36.setBackground(new java.awt.Color(204, 204, 204));
        jPanel36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel55.setText("Semester");

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel59.setText("Student's ID");

        Marks_searchSID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Marks_searchSIDKeyTyped(evt);
            }
        });

        Marks_SemesterSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Marks_SemesterSearchKeyTyped(evt);
            }
        });

        Marks_PanelSearch_Btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Marks_PanelSearch_Btn.setText("Search");
        Marks_PanelSearch_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Marks_PanelSearch_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59)
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Marks_SemesterSearch)
                    .addComponent(Marks_searchSID, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Marks_PanelSearch_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Marks_searchSID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Marks_SemesterSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Marks_PanelSearch_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel30.setText("ID");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel37.setText("Student's ID");

        Marks_ID.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        Marks_Semester.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel38.setText("Module 2");

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel39.setText("Module 1");

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel56.setText("Module 3");

        jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel57.setText("Module 4");

        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel58.setText("Module 5");

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel60.setText("Semester");

        Marks_score3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Marks_score3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Marks_score3.setText("0.0");
        Marks_score3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Marks_score3ActionPerformed(evt);
            }
        });

        Marks_score4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Marks_score4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Marks_score4.setText("0.0");

        Marks_score1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Marks_score1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Marks_score1.setText("0.0");

        Marks_score2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Marks_score2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Marks_score2.setText("0.0");

        Marks_score5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Marks_score5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Marks_score5.setText("0.0");

        Marks_Module1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Marks_Module1KeyTyped(evt);
            }
        });

        Marks_Module2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Marks_Module2KeyTyped(evt);
            }
        });

        Marks_Module5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Marks_Module5KeyTyped(evt);
            }
        });

        Marks_Module3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Marks_Module3KeyTyped(evt);
            }
        });

        Marks_Module4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Marks_Module4KeyTyped(evt);
            }
        });

        Marks_StudentID1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Marks_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel56)
                                            .addComponent(jLabel57))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(Marks_Module3, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                                .addComponent(Marks_Module2))
                                            .addComponent(Marks_Module4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Marks_Module5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Marks_score2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Marks_score3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Marks_score4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Marks_score1)
                                            .addComponent(Marks_score5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel58)
                                            .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel38)
                                                    .addComponent(jLabel60))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Marks_Module1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Marks_StudentID1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Marks_Semester, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(3, 3, 3))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Marks_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(Marks_StudentID1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(Marks_Semester, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Marks_score1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(Marks_Module1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel38)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Marks_score2)
                        .addComponent(Marks_Module2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel56)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Marks_score3)
                        .addComponent(Marks_Module3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel57)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Marks_score4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Marks_Module4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Marks_score5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel58)
                        .addComponent(Marks_Module5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(179, 179, 179))
        );

        jPanel15.setBackground(new java.awt.Color(102, 102, 102));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));
        jPanel15.setPreferredSize(new java.awt.Dimension(1193, 228));

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel27.setText("Search Student");

        Marks_RefreshBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Marks_RefreshBtn.setText("Refresh");
        Marks_RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Marks_RefreshBtnActionPerformed(evt);
            }
        });

        Marks_SearchBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Marks_SearchBtn.setText("Search");
        Marks_SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Marks_SearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(Marks_SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Marks_SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Marks_RefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Marks_SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Marks_RefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Marks_SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));
        jPanel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        marks_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Student's ID", "Semester", "Module1", "Score1", "Module2", "Score2", "Module3", "Score3", "Module4", "Score4", "Module5", "Score5", "Average"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        marks_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marks_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(marks_table);
        if (marks_table.getColumnModel().getColumnCount() > 0) {
            marks_table.getColumnModel().getColumn(0).setResizable(false);
            marks_table.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel18.setBackground(new java.awt.Color(204, 204, 204));
        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        Marks_Save.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Marks_Save.setText("SAVE");
        Marks_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Marks_SaveActionPerformed(evt);
            }
        });

        Marks_Print.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Marks_Print.setText("PRINT");
        Marks_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Marks_PrintActionPerformed(evt);
            }
        });

        Marks_ClearBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Marks_ClearBtn.setText("CLEAR");
        Marks_ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Marks_ClearBtnActionPerformed(evt);
            }
        });

        Marks_Logout_Btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Marks_Logout_Btn.setText("LOGOUT");
        Marks_Logout_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Marks_Logout_BtnActionPerformed(evt);
            }
        });

        Marks_UpdateBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Marks_UpdateBtn.setText("UPDATE");
        Marks_UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Marks_UpdateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Marks_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Marks_UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Marks_Print, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Marks_ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Marks_Logout_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Marks_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Marks_Print, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Marks_ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Marks_Logout_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Marks_UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        MarkSheet.addTab("Marks", jPanel11);

        jPanel27.setBackground(new java.awt.Color(0, 51, 102));

        jPanel28.setBackground(new java.awt.Color(102, 102, 102));
        jPanel28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        jPanel37.setBackground(new java.awt.Color(204, 204, 204));
        jPanel37.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel61.setText("Student's ID");

        Marksheet_SearchBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Marksheet_SearchBtn.setText("Search");
        Marksheet_SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Marksheet_SearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(Marksheet_SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Marksheet_SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Marksheet_SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Marksheet_SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        GPA_Label.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        GPA_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GPA_Label.setText("GPA: 0.0");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GPA_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(GPA_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel31.setBackground(new java.awt.Color(102, 102, 102));
        jPanel31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        jPanel33.setBackground(new java.awt.Color(204, 204, 204));
        jPanel33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        MarksheetTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Student's ID", "Semester", "Module1", "Score1", "Module2", "Score2", "Module3", "Score3", "Module4", "Score4", "Module5", "Score5", "Average"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(MarksheetTable);
        if (MarksheetTable.getColumnModel().getColumnCount() > 0) {
            MarksheetTable.getColumnModel().getColumn(0).setResizable(false);
            MarksheetTable.getColumnModel().getColumn(1).setResizable(false);
            MarksheetTable.getColumnModel().getColumn(2).setResizable(false);
            MarksheetTable.getColumnModel().getColumn(3).setResizable(false);
            MarksheetTable.getColumnModel().getColumn(4).setResizable(false);
            MarksheetTable.getColumnModel().getColumn(5).setResizable(false);
            MarksheetTable.getColumnModel().getColumn(6).setResizable(false);
            MarksheetTable.getColumnModel().getColumn(7).setResizable(false);
            MarksheetTable.getColumnModel().getColumn(8).setResizable(false);
            MarksheetTable.getColumnModel().getColumn(9).setResizable(false);
            MarksheetTable.getColumnModel().getColumn(10).setResizable(false);
            MarksheetTable.getColumnModel().getColumn(11).setResizable(false);
            MarksheetTable.getColumnModel().getColumn(12).setResizable(false);
        }

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel34.setBackground(new java.awt.Color(204, 204, 204));
        jPanel34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        MarkSheet_PrintBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MarkSheet_PrintBtn.setText("PRINT");
        MarkSheet_PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarkSheet_PrintBtnActionPerformed(evt);
            }
        });

        MarkSheet_ClearBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MarkSheet_ClearBtn.setText("CLEAR");
        MarkSheet_ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarkSheet_ClearBtnActionPerformed(evt);
            }
        });

        MarkSheet_Logout_Btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MarkSheet_Logout_Btn.setText("LOGOUT");
        MarkSheet_Logout_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarkSheet_Logout_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MarkSheet_PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MarkSheet_ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MarkSheet_Logout_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MarkSheet_PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarkSheet_ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarkSheet_Logout_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        MarkSheet.addTab("Mark Sheet", jPanel27);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MarkSheet, javax.swing.GroupLayout.PREFERRED_SIZE, 1542, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MarkSheet, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void init() {
        tableViewstudent();
        tableViewCourse();
        tableViewMarks();
        tableViewMarksheet();
        St_studentID.setText(String.valueOf(student.getMax()));
        Cause_ID.setText(String.valueOf(course.getMax()));
        Marks_ID.setText(String.valueOf(marks.getMax()));
    }

    private void tableViewstudent() {
        student.getStudentValue(studentTable, "");
        model = (DefaultTableModel) studentTable.getModel();
        studentTable.setRowHeight(30);
        studentTable.setShowGrid(true);
        studentTable.setGridColor(Color.black);
        studentTable.setBackground(Color.white);

    }

    private void tableViewCourse() {
        course.getCourseValue(cause_Table, "");
        model = (DefaultTableModel) cause_Table.getModel();
        cause_Table.setRowHeight(30);
        cause_Table.setShowGrid(true);
        cause_Table.setGridColor(Color.black);
        cause_Table.setBackground(Color.white);
    }

    private void tableViewMarks() {
        marks.getMarksValue(marks_table, "");
        model = (DefaultTableModel) marks_table.getModel();
        marks_table.setRowHeight(30);
        marks_table.setShowGrid(true);
        marks_table.setGridColor(Color.black);
        marks_table.setBackground(Color.white);
    }

    private void clearStudent() {
        St_studentID.setText(String.valueOf(student.getMax()));
        St_studentID.setText(null);
        st_StudentName.setText(null);
        st_Email.setText(null);
        st_PhoneNo.setText(null);
        st_NIC.setText(null);
        st_MotherName.setText(null);
        st_FatherName.setText(null);
        st_Address.setText(null);
        st_DOB.setDate(null);
        st_Gender.setSelectedIndex(0);
        st_image.setIcon(null);
        studentTable.clearSelection();
        imagePath = null;
    }

    private void tableViewMarksheet() {
        model = (DefaultTableModel) MarksheetTable.getModel();
        MarksheetTable.setRowHeight(30);
        MarksheetTable.setShowGrid(true);
        MarksheetTable.setGridColor(Color.black);
        MarksheetTable.setBackground(Color.white);
    }

    public void clearCourse() {
        Marks_ID.setText(String.valueOf(marks.getMax()));
        Cause_ID.setText(String.valueOf(course.getMax()));
        Cause_SearchSID.setText(null);
        Cause_StudentID.setText(null);
        Cause_Semester.removeAllItems();
        Cause_Module01.setSelectedIndex(0);
        Cause_Module02.setSelectedIndex(0);
        Cause_Module03.setSelectedIndex(0);
        Cause_Module04.setSelectedIndex(0);
        Cause_Module05.setSelectedIndex(0);
        cause_Table.clearSelection();
    }

    public void clearMarks() {
        Marks_searchSID.setText(null);
        Marks_SemesterSearch.setText(null);
        Marks_ID.setText(null);
        Marks_StudentID1.setText(null);
        Marks_Semester.setText(null);
        Marks_Module1.setText(null);
        Marks_Module2.setText(null);
        Marks_Module3.setText(null);
        Marks_Module4.setText(null);
        Marks_Module5.setText(null);
        Marks_score1.setText("0.0");
        Marks_score2.setText("0.0");
        Marks_score3.setText("0.0");
        Marks_score4.setText("0.0");
        Marks_score5.setText("0.0");
        marks_table.clearSelection();
    }

    public boolean isEmptyStudent() {
        if (st_StudentName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Student name is missing ");
            return false;
        }
        if (st_DOB.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Student Date of birth is missing ");
            return false;
        }
        if (st_DOB.getDate().compareTo(new Date()) > 0) {
            JOptionPane.showMessageDialog(this, "No Student from the future are allowed ");
            return false;
        }
        if (st_Email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Student's Email is Missing");
            return false;
        }
        if (!st_Email.getText().matches("^.+@.+\\..+$")) {
            JOptionPane.showMessageDialog(this, "Invalid Email Address");
            return false;
        }
        if (st_PhoneNo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Student Phone Number is missing ");
            return false;
        }
        if (st_NIC.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Student NIC Number is missing ");
            return false;
        }
        if (st_MotherName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Student's Mother's Name is missing ");
            return false;
        }
        if (st_FatherName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Student's Father's Name is missing ");
            return false;
        }
        if (st_Address.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Student's Address is missing ");
            return false;
        }
        return true;
    }

    private void st_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st_EmailActionPerformed

    private void Marks_score3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Marks_score3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Marks_score3ActionPerformed

    private void St_LogoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_St_LogoutbtnActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Do You Want To Logout Now?", "Select", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            new LoginPage().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_St_LogoutbtnActionPerformed

    private void Cause_Logout_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cause_Logout_BtnActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Do You Want To Logout Now?", "Select", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            new LoginPage().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_Cause_Logout_BtnActionPerformed

    private void Marks_Logout_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Marks_Logout_BtnActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Do You Want To Logout Now?", "Select", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            new LoginPage().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_Marks_Logout_BtnActionPerformed

    private void MarkSheet_Logout_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarkSheet_Logout_BtnActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Do You Want To Logout Now?", "Select", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            new LoginPage().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_MarkSheet_Logout_BtnActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();
        this.setLocation(X - xx, Y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void st_ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st_ClearBtnActionPerformed
        clearStudent();
    }//GEN-LAST:event_st_ClearBtnActionPerformed

    private void st_AddNewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st_AddNewbtnActionPerformed
        if (isEmptyStudent()) {
            if (!student.isEmailExist(st_Email.getText())) {
                if (!student.isphonelExist(st_PhoneNo.getText())) {
                    int id = Integer.parseInt(St_studentID.getText());
                    String name = st_StudentName.getText();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String date = dateFormat.format(st_DOB.getDate());
                    String gender = st_Gender.getSelectedItem().toString();
                    String email = st_Email.getText();
                    String phone = st_PhoneNo.getText();
                    String nic = st_NIC.getText();
                    String mother_name = st_MotherName.getText();
                    String father_name = st_FatherName.getText();
                    String address = st_Address.getText();
                    student.insert(id, name, date, gender, email, phone, nic, mother_name, father_name, address, imagePath);
                    studentTable.setModel(new DefaultTableModel(null, new Object[]{"Student's ID", "Student Name", "Date of Birth", "Gender",
                        "Email", "Phone Number", "NIC Number", "Mother's Name", "Father's Name", "Address", "Image Path"}));
                    student.getStudentValue(studentTable, "");
                    clearStudent();
                } else {
                    JOptionPane.showMessageDialog(this, "This Phone Number Already Exists");
                }
            } else {
                JOptionPane.showMessageDialog(this, "This Email Address Already Exists");
            }
        }

    }//GEN-LAST:event_st_AddNewbtnActionPerformed

    private void st_PhoneNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_st_PhoneNoKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_st_PhoneNoKeyTyped

    private void st_BrowsebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st_BrowsebtnActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.image", "jpg", "gif", "png");
        file.addChoosableFileFilter(filter);
        int output = file.showSaveDialog(file);
        if (output == JFileChooser.APPROVE_OPTION) {
            File SelectFile = file.getSelectedFile();
            String path = SelectFile.getAbsolutePath();
            st_image.setIcon(imageAdjust(path, null));
            imagePath = path;

        } else {
            JOptionPane.showMessageDialog(this, "No Image Selected ");
        }
    }//GEN-LAST:event_st_BrowsebtnActionPerformed

    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMouseClicked
        model = (DefaultTableModel) studentTable.getModel();
        rowIndex = studentTable.getSelectedRow();
        St_studentID.setText(model.getValueAt(rowIndex, 0).toString());
        st_StudentName.setText(model.getValueAt(rowIndex, 1).toString());
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 2).toString());
            st_DOB.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        String gender = model.getValueAt(rowIndex, 3).toString();
        if (gender.equals("Male")) {
            st_Gender.setSelectedIndex(0);
        } else {
            st_Gender.setSelectedIndex(1);
        }
        st_Email.setText(model.getValueAt(rowIndex, 4).toString());
        st_PhoneNo.setText(model.getValueAt(rowIndex, 5).toString());
        st_NIC.setText(model.getValueAt(rowIndex, 6).toString());
        st_MotherName.setText(model.getValueAt(rowIndex, 7).toString());
        st_FatherName.setText(model.getValueAt(rowIndex, 8).toString());
        st_Address.setText(model.getValueAt(rowIndex, 9).toString());
        String path = (String) model.getValueAt(rowIndex, 10);
        imagePath = path;
        st_image.setIcon(imageAdjust(path, null)); // get Image path and calleed imageAdjust method convert image path to image icon
    }//GEN-LAST:event_studentTableMouseClicked

    private void st_UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st_UpdateBtnActionPerformed
        if (isEmptyStudent()) {

            int id = Integer.parseInt(St_studentID.getText());
            if (student.isIdExist(id)) {
                if (!check()) {
                    String name = st_StudentName.getText();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String date = dateFormat.format(st_DOB.getDate());
                    String gender = st_Gender.getSelectedItem().toString();
                    String email = st_Email.getText();
                    String phone = st_PhoneNo.getText();
                    String nic = st_NIC.getText();
                    String mother_name = st_MotherName.getText();
                    String father_name = st_FatherName.getText();
                    String address = st_Address.getText();
                    student.update(id, name, date, gender, email, phone, nic, mother_name, father_name, address, imagePath);
                    studentTable.setModel(new DefaultTableModel(null, new Object[]{"Student's ID", "Student Name", "Date of Birth", "Gender",
                        "Email", "Phone Number", "NIC Number", "Mother's Name", "Father's Name", "Address", "Image Path"}));
                    student.getStudentValue(studentTable, "");
                    clearStudent();

                }

            } else {
                JOptionPane.showMessageDialog(this, "Student Id Doesn't Exists ");
            }

        }
    }//GEN-LAST:event_st_UpdateBtnActionPerformed

    private void st_DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st_DeleteBtnActionPerformed
        int id = Integer.parseInt(St_studentID.getText());
        if (student.isIdExist(id)) {
            student.delete(id);
            studentTable.setModel(new DefaultTableModel(null, new Object[]{"Student's ID", "Student Name", "Date of Birth", "Gender",
                "Email", "Phone Number", "NIC Number", "Mother's Name", "Father's Name", "Address", "Image Path"}));
            student.getStudentValue(studentTable, "");
            clearStudent();
        } else {
            JOptionPane.showMessageDialog(this, "Student Id Doesn't Exists ");
        }
    }//GEN-LAST:event_st_DeleteBtnActionPerformed

    private void st_SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st_SearchBtnActionPerformed
        if (st_Searchfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter a student id");
        } else {
            studentTable.setModel(new DefaultTableModel(null, new Object[]{"Student's ID", "Student Name", "Date of Birth", "Gender",
                "Email", "Phone Number", "NIC Number", "Mother's Name", "Father's Name", "Address", "Image Path"}));
            student.getStudentValue(studentTable, st_Searchfield.getText());
        }
    }//GEN-LAST:event_st_SearchBtnActionPerformed

    private void st_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st_RefreshActionPerformed
        studentTable.setModel(new DefaultTableModel(null, new Object[]{"Student's ID", "Student Name", "Date of Birth", "Gender",
            "Email", "Phone Number", "NIC Number", "Mother's Name", "Father's Name", "Address", "Image Path"}));
        student.getStudentValue(studentTable, "");
        st_Searchfield.setText(null);
    }//GEN-LAST:event_st_RefreshActionPerformed

    private void st_PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st_PrintBtnActionPerformed
        try {
            MessageFormat header = new MessageFormat("Student Information");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            studentTable.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_st_PrintBtnActionPerformed

    private void Cause_ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cause_ClearBtnActionPerformed
        clearCourse();
    }//GEN-LAST:event_Cause_ClearBtnActionPerformed

    private void Cause_Sid_SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cause_Sid_SearchBtnActionPerformed
        if (Cause_SearchSID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter a Student ID ");
        } else {
            int id = Integer.parseInt(Cause_SearchSID.getText());
            if (course.getId(id)) {
                Cause_Semester.removeAllItems();
                int semester = course.countSemester(id);
                if (semester >= 0) {
                    for (int i = 1; i <= 1 + semester; i++) {
                        Cause_Semester.addItem(i + "");
                    }
                }
            }
        }
    }//GEN-LAST:event_Cause_Sid_SearchBtnActionPerformed

    private void Cause_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cause_SaveActionPerformed
        if (Cause_StudentID.getText().isEmpty() || Cause_Semester.getItemCount() == 0) {
            JOptionPane.showMessageDialog(this, "Student Id or Semester Number is Missing ");
        } else {
            int id = course.getMax();
            int studentId = Integer.parseInt(Cause_StudentID.getText());
            int semesterNO = Integer.parseInt(Cause_Semester.getSelectedItem().toString());
            String module1 = Cause_Module01.getSelectedItem().toString();
            String module2 = Cause_Module02.getSelectedItem().toString();
            String module3 = Cause_Module03.getSelectedItem().toString();
            String module4 = Cause_Module04.getSelectedItem().toString();
            String module5 = Cause_Module05.getSelectedItem().toString();
            if (course.isSemesterExist(studentId, semesterNO)) {
                JOptionPane.showMessageDialog(this, "This Student has Aready taken Semester" + semesterNO);
            } else {
            }
            if (course.isCourseExist(studentId, "module1", module1)) {
                JOptionPane.showMessageDialog(this, "This Student has Aready taken " + module1 + "Module");
            }
            if (course.isCourseExist(studentId, "module2", module2)) {
                JOptionPane.showMessageDialog(this, "This Student has Aready taken " + module2 + "Module");
            }
            if (course.isCourseExist(studentId, "module3", module3)) {
                JOptionPane.showMessageDialog(this, "This Student has Aready taken " + module3 + "Module");
            }
            if (course.isCourseExist(studentId, "module4", module4)) {
                JOptionPane.showMessageDialog(this, "This Student has Aready taken " + module4 + "Module");
            }
            if (course.isCourseExist(studentId, "module5", module5)) {
                JOptionPane.showMessageDialog(this, "This Student has Aready taken " + module5 + "Module");
            }
            course.insert(id, studentId, semesterNO, module1, module2, module3, module4, module5);
            cause_Table.setModel(new DefaultTableModel(null, new Object[]{"ID", "Student ID", "Module1", "Module2",
                "Module3", "Module4", "Module"}));
            course.getCourseValue(cause_Table, "");
            clearCourse();
        }
    }//GEN-LAST:event_Cause_SaveActionPerformed

    private void Cause_SearchSIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cause_SearchSIDKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_Cause_SearchSIDKeyTyped

    private void Cause_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cause_SearchActionPerformed
        if (cause_Searchfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Search Field Is Empty");
        } else {
            cause_Table.setModel(new DefaultTableModel(null, new Object[]{"ID", "Student ID", "Module1", "Module2",
                "Module3", "Module4", "Module5"}));
            course.getCourseValue(cause_Table, cause_Searchfield.getText());
        }
    }//GEN-LAST:event_Cause_SearchActionPerformed

    private void Cause_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cause_RefreshActionPerformed
        cause_Table.setModel(new DefaultTableModel(null, new Object[]{"ID", "Student ID", "Module1", "Module2",
            "Module3", "Module4", "Module5"}));
        course.getCourseValue(cause_Table, "");
        cause_Searchfield.setText(null);
    }//GEN-LAST:event_Cause_RefreshActionPerformed

    private void Cause_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cause_PrintActionPerformed
        try {
            MessageFormat header = new MessageFormat("Student's Course Information");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            cause_Table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Cause_PrintActionPerformed

    private void Marks_searchSIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Marks_searchSIDKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_Marks_searchSIDKeyTyped

    private void Marks_SemesterSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Marks_SemesterSearchKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_Marks_SemesterSearchKeyTyped

    private void Marks_ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Marks_ClearBtnActionPerformed
        clearMarks();
    }//GEN-LAST:event_Marks_ClearBtnActionPerformed

    private void Marks_PanelSearch_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Marks_PanelSearch_BtnActionPerformed
        if (Marks_searchSID.getText().isEmpty() || Marks_SemesterSearch.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Student ID or Semester Number is Missing ");
        } else {
            int sid = Integer.parseInt(Marks_searchSID.getText());
            int semNo = Integer.parseInt(Marks_SemesterSearch.getText());
            marks.getDetails(sid, semNo);
        }
    }//GEN-LAST:event_Marks_PanelSearch_BtnActionPerformed

    private void Marks_Module1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Marks_Module1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Marks_Module1KeyTyped

    private void Marks_Module2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Marks_Module2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Marks_Module2KeyTyped

    private void Marks_Module5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Marks_Module5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Marks_Module5KeyTyped

    private void Marks_Module3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Marks_Module3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Marks_Module3KeyTyped

    private void Marks_Module4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Marks_Module4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Marks_Module4KeyTyped

    private void Marks_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Marks_SaveActionPerformed
        if (!Marks_StudentID1.getText().isEmpty()) {
            if (!marks.isIdExist(Integer.parseInt(Marks_ID.getText()))) {
                int sid = Integer.parseInt(Marks_StudentID1.getText());
                int semesterNo = Integer.parseInt(Marks_Semester.getText());
                if (!marks.isSidSemesterNoExist(sid, semesterNo)) {
                    if (isNumeric(Marks_score1.getText()) && isNumeric(Marks_score2.getText()) && isNumeric(Marks_score3.getText())
                            && isNumeric(Marks_score4.getText()) && isNumeric(Marks_score5.getText())) {
                        int id = marks.getMax();
                        String module1 = Marks_Module1.getText();
                        String module2 = Marks_Module2.getText();
                        String module3 = Marks_Module3.getText();
                        String module4 = Marks_Module4.getText();
                        String module5 = Marks_Module5.getText();
                        double score1 = Double.parseDouble(Marks_score1.getText());
                        double score2 = Double.parseDouble(Marks_score2.getText());
                        double score3 = Double.parseDouble(Marks_score3.getText());
                        double score4 = Double.parseDouble(Marks_score4.getText());
                        double score5 = Double.parseDouble(Marks_score5.getText());
                        double average = (score1 + score2 + score3 + score4 + score5) / 5;
                        nf.setMaximumFractionDigits(2);
                        marks.insert(id, sid, semesterNo, module1, module2, module3, module4, module5, score1, score2, score3, score4, score5, Double.parseDouble(nf.format(average)));
                        marks_table.setModel(new DefaultTableModel(null, new Object[]{"ID", "Student ID", "Module1", "Score1", "Module2", "Score2",
                            "Module3", "Score3", "Module4", "Score4", "Module5", "Score5", "Average"}));
                        marks.getMarksValue(marks_table, "");
                        clearMarks();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Semester" + semesterNo + "MArks Already Added");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Marks Id Already Exist");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No Student Selected");
        }
    }//GEN-LAST:event_Marks_SaveActionPerformed

    private void marks_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marks_tableMouseClicked
        model = (DefaultTableModel) marks_table.getModel();
        rowIndex = marks_table.getSelectedRow();
        Marks_ID.setText(model.getValueAt(rowIndex, 0).toString());
        Marks_StudentID1.setText(model.getValueAt(rowIndex, 1).toString());
        Marks_Semester.setText(model.getValueAt(rowIndex, 2).toString());

        Marks_Module1.setText(model.getValueAt(rowIndex, 3).toString());
        Marks_Module2.setText(model.getValueAt(rowIndex, 5).toString());
        Marks_Module3.setText(model.getValueAt(rowIndex, 7).toString());
        Marks_Module4.setText(model.getValueAt(rowIndex, 9).toString());
        Marks_Module5.setText(model.getValueAt(rowIndex, 11).toString());

        Marks_score1.setText(model.getValueAt(rowIndex, 4).toString());
        Marks_score2.setText(model.getValueAt(rowIndex, 6).toString());
        Marks_score3.setText(model.getValueAt(rowIndex, 8).toString());
        Marks_score4.setText(model.getValueAt(rowIndex, 10).toString());
        Marks_score5.setText(model.getValueAt(rowIndex, 12).toString());
    }//GEN-LAST:event_marks_tableMouseClicked

    private void Marks_UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Marks_UpdateBtnActionPerformed
        int id = Integer.parseInt(Marks_ID.getText());
        if (marks.isIdExist(id)) {
            double score1 = Double.parseDouble(Marks_score1.getText());
            double score2 = Double.parseDouble(Marks_score2.getText());
            double score3 = Double.parseDouble(Marks_score3.getText());
            double score4 = Double.parseDouble(Marks_score4.getText());
            double score5 = Double.parseDouble(Marks_score5.getText());
            double average = (score1 + score2 + score3 + score4 + score5) / 5;
            nf.setMaximumFractionDigits(2);
            marks.update(id, score1, score2, score3, score4, score5, Double.parseDouble(nf.format(average)));
            marks_table.setModel(new DefaultTableModel(null, new Object[]{"ID", "Student ID", "Module1", "Score1", "Module2", "Score2",
                "Module3", "Score3", "Module4", "Score4", "Module5", "Score5", "Average"}));
            marks.getMarksValue(marks_table, "");
            clearMarks();

        } else {
            JOptionPane.showMessageDialog(this, "Score Id Doesnt't Exist ");
        }
    }//GEN-LAST:event_Marks_UpdateBtnActionPerformed

    private void Marks_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Marks_PrintActionPerformed
        try {
            MessageFormat header = new MessageFormat("Student Marks");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            marks_table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Marks_PrintActionPerformed

    private void Marks_SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Marks_SearchBtnActionPerformed
        if (Marks_SearchField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter a student id");
        } else {
            marks_table.setModel(new DefaultTableModel(null, new Object[]{"ID", "Student ID", "Module1", "Score1", "Module2", "Score2",
                "Module3", "Score3", "Module4", "Score4", "Module5", "Score5", "Average"}));
            marks.getMarksValue(marks_table, Marks_SearchField.getText());
        }
    }//GEN-LAST:event_Marks_SearchBtnActionPerformed

    private void Marks_RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Marks_RefreshBtnActionPerformed
        marks_table.setModel(new DefaultTableModel(null, new Object[]{"ID", "Student ID", "Module1", "Score1", "Module2", "Score2",
            "Module3", "Score3", "Module4", "Score4", "Module5", "Score5", "Average"}));
        marks.getMarksValue(marks_table, "");
        Marks_SearchField.setText(null);
    }//GEN-LAST:event_Marks_RefreshBtnActionPerformed

    private void Marksheet_SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Marksheet_SearchBtnActionPerformed
        if (Marksheet_SearchField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter a Student ID");
        } else {
            int sid = Integer.parseInt(Marksheet_SearchField.getText());
            if (markSheet.isIdExist(sid)) {
                MarksheetTable.setModel(new DefaultTableModel(null, new Object[]{"ID", "Student ID", "Module1", "Score1", "Module2", "Score2",
                    "Module3", "Score3", "Module4", "Score4", "Module5", "Score5", "Average"}));
                markSheet.getMarksheetValue(MarksheetTable, sid);
                String gpa = String.valueOf(String.format("%.2f", markSheet.getGPA(sid)));
                GPA_Label.setText("GPA: " + gpa);
            } else {
                JOptionPane.showMessageDialog(this, "No Marks Found");
            }
        }
    }//GEN-LAST:event_Marksheet_SearchBtnActionPerformed

    private void MarkSheet_ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarkSheet_ClearBtnActionPerformed
        Marksheet_SearchField.setText(null);
        GPA_Label.setText("GPA: 0.0");
        MarksheetTable.setModel(new DefaultTableModel(null, new Object[]{"ID", "Student ID", "Module1", "Score1", "Module2", "Score2",
            "Module3", "Score3", "Module4", "Score4", "Module5", "Score5", "Average"}));
    }//GEN-LAST:event_MarkSheet_ClearBtnActionPerformed

    private void MarkSheet_PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarkSheet_PrintBtnActionPerformed
        try {
            MessageFormat header = new MessageFormat("Marks Sheet Student ID " + Marksheet_SearchField.getText() + "    " + GPA_Label.getText());
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            MarksheetTable.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MarkSheet_PrintBtnActionPerformed

    private void CloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBtnActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Do You Really Want To Exit?", "Select", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_CloseBtnActionPerformed

    private boolean isNumeric(String s) {
        try {
            double d = Double.parseDouble(s);
            if (d >= 0.0 && d <= 4.0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Please Enter a Valid Value.Value Must Be Berween 0.0 to 4.0 ");
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, " " + e);
        }
        return false;
    }

    public boolean check() {
        String newEmail = st_Email.getText();
        String newPhone = st_PhoneNo.getText();
        String oldEmail = model.getValueAt(rowIndex, 4).toString();
        String oldPhone = model.getValueAt(rowIndex, 5).toString();
        if (newEmail.equals(oldEmail) && newPhone.equals(oldPhone)) {
            return false;
        } else {
            if (!newEmail.equals(oldEmail)) {
                boolean x = student.isEmailExist(newEmail);
                if (x) {
                    JOptionPane.showMessageDialog(this, "This Email Already Exists ");
                }
                return x;
            }
            if (!newPhone.equals(oldPhone)) {
                boolean x = student.isphonelExist(newPhone);
                if (x) {
                    JOptionPane.showMessageDialog(this, "This Phone Number Already Exists ");
                }
                return x;
            }
        }
        return false;
    }

    private ImageIcon imageAdjust(String path, byte[] pic) {
        ImageIcon myImage = null;
        if (path != null) {
            myImage = new ImageIcon(path);
        } else {
            myImage = new ImageIcon(pic);
        }
        Image img = myImage.getImage();
        Image newImage = img.getScaledInstance(st_image.getWidth(), st_image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(newImage);
        return icon;
    }

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cause_ClearBtn;
    private javax.swing.JTextField Cause_ID;
    private javax.swing.JButton Cause_Logout_Btn;
    private javax.swing.JComboBox<String> Cause_Module01;
    private javax.swing.JComboBox<String> Cause_Module02;
    private javax.swing.JComboBox<String> Cause_Module03;
    private javax.swing.JComboBox<String> Cause_Module04;
    private javax.swing.JComboBox<String> Cause_Module05;
    private javax.swing.JButton Cause_Print;
    private javax.swing.JButton Cause_Refresh;
    private javax.swing.JButton Cause_Save;
    private javax.swing.JButton Cause_Search;
    private javax.swing.JTextField Cause_SearchSID;
    private javax.swing.JComboBox<String> Cause_Semester;
    private javax.swing.JButton Cause_Sid_SearchBtn;
    public static javax.swing.JTextField Cause_StudentID;
    private javax.swing.JButton CloseBtn;
    private javax.swing.JLabel GPA_Label;
    private javax.swing.JTabbedPane MarkSheet;
    private javax.swing.JButton MarkSheet_ClearBtn;
    private javax.swing.JButton MarkSheet_Logout_Btn;
    private javax.swing.JButton MarkSheet_PrintBtn;
    private javax.swing.JButton Marks_ClearBtn;
    private javax.swing.JTextField Marks_ID;
    private javax.swing.JButton Marks_Logout_Btn;
    public static javax.swing.JTextField Marks_Module1;
    public static javax.swing.JTextField Marks_Module2;
    public static javax.swing.JTextField Marks_Module3;
    public static javax.swing.JTextField Marks_Module4;
    public static javax.swing.JTextField Marks_Module5;
    private javax.swing.JButton Marks_PanelSearch_Btn;
    private javax.swing.JButton Marks_Print;
    private javax.swing.JButton Marks_RefreshBtn;
    private javax.swing.JButton Marks_Save;
    private javax.swing.JButton Marks_SearchBtn;
    private javax.swing.JTextField Marks_SearchField;
    public static javax.swing.JTextField Marks_Semester;
    private javax.swing.JTextField Marks_SemesterSearch;
    public static javax.swing.JTextField Marks_StudentID1;
    private javax.swing.JButton Marks_UpdateBtn;
    private javax.swing.JTextField Marks_score1;
    private javax.swing.JTextField Marks_score2;
    private javax.swing.JTextField Marks_score3;
    private javax.swing.JTextField Marks_score4;
    private javax.swing.JTextField Marks_score5;
    private javax.swing.JTextField Marks_searchSID;
    private javax.swing.JTable MarksheetTable;
    private javax.swing.JButton Marksheet_SearchBtn;
    private javax.swing.JTextField Marksheet_SearchField;
    private javax.swing.JButton St_Logoutbtn;
    private javax.swing.JTextField St_studentID;
    private javax.swing.JTextField cause_Searchfield;
    private javax.swing.JTable cause_Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable marks_table;
    private javax.swing.JButton st_AddNewbtn;
    private javax.swing.JTextField st_Address;
    private javax.swing.JButton st_Browsebtn;
    private javax.swing.JButton st_ClearBtn;
    private com.toedter.calendar.JDateChooser st_DOB;
    private javax.swing.JButton st_DeleteBtn;
    private javax.swing.JTextField st_Email;
    private javax.swing.JTextField st_FatherName;
    private javax.swing.JComboBox<String> st_Gender;
    private javax.swing.JTextField st_MotherName;
    private javax.swing.JTextField st_NIC;
    private javax.swing.JTextField st_PhoneNo;
    private javax.swing.JButton st_PrintBtn;
    private javax.swing.JButton st_Refresh;
    private javax.swing.JButton st_SearchBtn;
    private javax.swing.JTextField st_Searchfield;
    private javax.swing.JTextField st_StudentName;
    private javax.swing.JButton st_UpdateBtn;
    private javax.swing.JLabel st_image;
    private javax.swing.JTable studentTable;
    // End of variables declaration//GEN-END:variables

    private void ìf() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void start() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
