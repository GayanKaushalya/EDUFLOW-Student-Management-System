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
public class Marks {

    Connection con = MyConnection.getConnection();
    PreparedStatement ps;

    public int getMax() {
        int id = 0;
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT MAX(id) FROM marks");

            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Marks.class.getName()).log(Level.SEVERE, null, ex);
        }

        return id + 1;

    }

    public boolean getDetails(int sid, int semesterNo) {
        try {
            ps = con.prepareStatement("select * from course where student_id=? and semester= ?");
            ps.setInt(1, sid);
            ps.setInt(2, semesterNo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Home.Marks_StudentID1.setText(String.valueOf(rs.getInt(2)));
                Home.Marks_Semester.setText(String.valueOf(rs.getInt(3)));
                Home.Marks_Module1.setText(rs.getString(4));
                Home.Marks_Module2.setText(rs.getString(5));
                Home.Marks_Module3.setText(rs.getString(6));
                Home.Marks_Module4.setText(rs.getString(7));
                Home.Marks_Module5.setText(rs.getString(8));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Student ID or Semester Number Doesn't Exist");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Marks.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //check Marks id Exist
    public boolean isIdExist(int id) {
        try {
            ps = con.prepareStatement("select * from marks where id= ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Marks.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //checj whether the student id or semester number exixt or not
    public boolean isSidSemesterNoExist(int sid, int semesterNo) {
        try {
            ps = con.prepareStatement("select * from marks where student_id=? and semester= ?");
            ps.setInt(1, sid);
            ps.setInt(2, semesterNo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Marks.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // insert data into marks table
    public void insert(int id, int student_id, int semester, String module1, String module2, String module3, String module4, String module5,
            double score1, double score2, double score3, double score4, double score5, double average) {
        String sql = "Insert into marks values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, student_id);
            ps.setInt(3, semester);
            ps.setString(4, module1);
            ps.setDouble(5, score1);
            ps.setString(6, module2);
            ps.setDouble(7, score2);
            ps.setString(8, module3);
            ps.setDouble(9, score3);
            ps.setString(10, module4);
            ps.setDouble(11, score4);
            ps.setString(12, module5);
            ps.setDouble(13, score5);
            ps.setDouble(14, average);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Marks Added Successfully");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Marks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Get all  the values from database maarks table
    public void getMarksValue(JTable table, String searchValue) {
        String sql = "select * from marks where concat(id,student_id,semester) like ? order by id desc";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + searchValue + "%");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[14];
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getInt(3);
                row[3] = rs.getString(4);
                row[4] = rs.getDouble(5);
                row[5] = rs.getString(6);
                row[6] = rs.getDouble(7);
                row[7] = rs.getString(8);
                row[8] = rs.getDouble(9);
                row[9] = rs.getString(10);
                row[10] = rs.getDouble(11);
                row[11] = rs.getString(12);
                row[12] = rs.getDouble(13);
                row[13] = rs.getDouble(14);
                model.addRow(row);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //update Marks
    public void update(int id, double score1, double score2, double score3, double score4, double score5, double average) {
        String sql = "update marks set  score1=?, score2=?,score3=?,score4=?,score5=?, average=? where id=?";
        try {
            ps = con.prepareStatement(sql);
            
            ps.setDouble(1, score1);
            ps.setDouble(2, score2);
            ps.setDouble(3, score3);
            ps.setDouble(4, score4);
            ps.setDouble(5,score5);
            ps.setDouble(6, average);
            ps.setInt(7, id);
            
            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Score Updated Successfully");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Marks.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
