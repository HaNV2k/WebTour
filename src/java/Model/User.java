package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class User {

    private String email, pass, name, address, DOB, phone;
    private boolean gender;

    public User() {
        connect();
    }

    public User(String email, String pass) {
        this.email = email;
        this.pass = pass;
        connect();
    }

    public User(String email, String pass, String name, String address, String DOB, String phone, boolean gender) {
        this.email = email;
        this.pass = pass;
        this.name = name;
        this.address = address;
        this.DOB = DOB;
        this.phone = phone;
        this.gender = gender;
        connect();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

   
    Connection cnn;
    Statement stm;//thực thiện câu lệnh sql
    PreparedStatement ps;
    ResultSet rs;//chứa kết quả trả về từ câu lệnh select và xử lý    

    private void connect() {
        try {
            cnn = (new DBContext()).connection;
            System.out.println("Connect Succesfull");
        } catch (Exception e) {
            System.out.println("Lỗi connect" + e.getMessage());
        }
    }

    public boolean checkLogin() {
        try {
            connect();
            String strSelect = "select * from [user] where email='" + email + "' and pass = '" + pass + "'";
            cnn = (new DBContext()).connection;
            ps = cnn.prepareStatement(strSelect);
            rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean checkExist(String email) {
        try {
            String strSelect = "select * from [user] where  email ='" + email + "'";
            stm = cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stm.executeQuery(strSelect);
            while (rs.next()) {
                return true;
            }

        } catch (Exception e) {
            System.out.println("Login error : " + e.getMessage());
        }

        return false;
    }
    
    public boolean checkAdmin(String email,String passwod){
        if(email.equals("nguyenvanha2k@gmail.com") && passwod.equals("123456")){
            System.out.println("login admin successfull");
            return true;
        }
        return false;
    }
    
    public ArrayList<User> setListUser(String name,boolean gender, String address, String DOB, String email, String pass, String phone) {
        ArrayList<User> list = new ArrayList<User>();
        try {
            
            String strSelect = "INSERT INTO [user](fullName,gender,address,DoB,email,pass,phone) VALUES(?,?,?,?,?,?,?)";
            cnn = (new DBContext()).connection;
            ps = cnn.prepareStatement(strSelect);
            ps.setString(1, name);
            ps.setBoolean(2, gender);
            ps.setString(3, address);
            ps.setString(4, DOB);
            ps.setString(5, email);
            ps.setString(6, pass);
            ps.setString(7, phone);
            ps.executeUpdate();
            System.out.println("insert successfull");
        } catch (Exception e) {
            System.out.println("insert user:" + e.getMessage());
        }
        return list;
    }

    public static void main(String[] args) {
        User u = new User("nguyenvanha2k@gmail.com", "123456");
        System.out.println(u.checkLogin());
        u.connect();
      
    }
}
