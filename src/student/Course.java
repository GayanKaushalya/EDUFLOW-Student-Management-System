package student;

import Database.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gayan
 */
public class Course {

    Connection con = MyConnection.getConnection();
    PreparedStatement ps;

    public int getMax() {
        int id = 0;
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT MAX(id) FROM course");

            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }

        return id + 1;
    }

    public boolean getId(int id) {
        try {
            ps = con.prepareStatement("select * from student where id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Home.Cause_StudentID.setText(String.valueOf(rs.getInt(1)));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Student ID Doesn't Exist");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public int countSemester(int id) {
        int total = 0;
        try {
            ps = con.prepareStatement("select count(*) as 'total' from course where student_id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                total = rs.getInt(1);
            }
            if (total == 2) {
                JOptionPane.showMessageDialog(null, "This Student Has Completed the Course");
                return -1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    // check whether the student has already taken this semester or not
    public boolean isSemesterExist(int sid, int semesterNo) {
        try {
            ps = con.prepareStatement("select * from course where student_id= ? and semester=?");
            ps.setInt(1, sid);
            ps.setInt(2, semesterNo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // check whether the student has already taken this semester or not
    public boolean isCourseExist(int sid, String moduleNo,String module) {
        String sql = "select  * from course where student_id = ? and "+moduleNo+ " =?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, sid);
            ps.setString(2,module);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // insert data into course table
    public void insert(int id, int student_id, int semester, String module1, String module2, String module3, String module4, String module5) {
        String sql = "Insert into course values (?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, student_id);
            ps.setInt(3, semester);
            ps.setString(4, module1);
            ps.setString(5, module2);
            ps.setString(6, module3);
            ps.setString(7, module4);
            ps.setString(8, module5);
            

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Student's Course Data Added Successfully");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Get all  the values from database course table
    public void getCourseValue(JTable table, String searchValue) {
        String sql = "select * from course where concat(id,student_id,semester) like ? order by id desc";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + searchValue + "%");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[8];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
               
                model.addRow(row);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
