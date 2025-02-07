package student;

import Database.MyConnection;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gayan
 */
public class Student {

    Connection con = MyConnection.getConnection();
    PreparedStatement ps;

    public int getMax() {
        int id = 0;
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT MAX(id) FROM student");
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id + 1;
    }

    // insert data into student table
    public void insert(int id, String sname, String date, String gender, String email, String phone, String nic, String mothername, String fathername, String address, String imagepath) {
        String sql = "Insert into student values (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, sname);
            ps.setString(3, date);
            ps.setString(4, gender);
            ps.setString(5, email);
            ps.setString(6, phone);
            ps.setString(7, nic);
            ps.setString(8, mothername);
            ps.setString(9, fathername);
            ps.setString(10, address);
            ps.setString(11, imagepath);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Student Data Added Successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // check student email address is already exists
    public boolean isEmailExist(String email) {
        try {
            ps = con.prepareStatement("select * from student where email= ?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    // check student phone number already exist
    public boolean isphonelExist(String phone) {
        try {
            ps = con.prepareStatement("select * from student where phone= ?");
            ps.setString(1, phone);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    // check student id already exist
    public boolean isIdExist(int id) {
        try {
            ps = con.prepareStatement("select * from student where id= ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // Get all  the values from database student table
    public void getStudentValue(JTable table, String searchValue) {
        String sql = "select * from student where concat(id,name,email,phone) like ? order by id desc";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + searchValue + "%");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[11];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                row[8] = rs.getString(9);
                row[9] = rs.getString(10);
                row[10] = rs.getString(11);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //update student values
    public void update(int id, String sname, String date, String gender, String email, String phone, String nic, String mothername, String fathername, String address, String imagepath) {
        String sql = "update student set name=?, date_of_birth=?,gender=?,email=?,phone=?, nic=?,mother_name=?,father_name=?,address=?,image_path=? where id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, sname);
            ps.setString(2, date);
            ps.setString(3, gender);
            ps.setString(4, email);
            ps.setString(5, phone);
            ps.setString(6, nic);
            ps.setString(7, mothername);
            ps.setString(8, fathername);
            ps.setString(9, address);
            if (imagepath != null && !imagepath.trim().isEmpty()) {
                ps.setString(10, imagepath);
            } else {
                ps.setNull(10, java.sql.Types.VARCHAR);
            }
            ps.setInt(11, id);

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Student Data Updated Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "No Student Found with ID: " + id);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Delete Student Data
    public void delete(int id){
        int yesOrNo= JOptionPane.showConfirmDialog(null,"Course and Score Records Will Also Be Deleted","Student Delete",JOptionPane.OK_CANCEL_OPTION,0);
        if(yesOrNo== JOptionPane.OK_OPTION){
            try {
                ps = con.prepareStatement("delete from student where id = ?");
                ps.setInt(1, id);
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "Student Data Deleted Successfully");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
