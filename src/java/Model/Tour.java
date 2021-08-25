/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Tour {

    private String email, address, trasport, image, startTime, endTime;
    private int phone, slot, price, idTour;

    public Tour() {
    }

    public Tour(int idTour) {
        this.idTour = idTour;
    }

    public Tour(String email, int phone, String address, String startTime, String endTime, int slot, int price, String trasport, String image, int idTour) {
        this.email = email;
        this.address = address;
        this.trasport = trasport;
        this.image = image;
        this.phone = phone;
        this.slot = slot;
        this.price = price;
        this.idTour = idTour;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTransport() {
        return trasport;
    }

    public void setTransport(String trasport) {
        this.trasport = trasport;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIdTour() {
        return idTour;
    }

    public void setIdTour(int idTour) {
        this.idTour = idTour;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
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

    public ArrayList<User> setListTour(String email, int phone, String address, String startTime, String endTime, int slot, int price, String trasport, String image, int idTour) {
        ArrayList<User> list = new ArrayList<User>();
        try {

            String strSelect = "INSERT INTO Tours(email,phone,address,startTime,endTime,slot,price,transport,image,idTour) VALUES(?,?,?,?,?,?,?,?,?,?)";
            cnn = (new DBContext()).connection;
            ps = cnn.prepareStatement(strSelect);
            ps.setString(1, email);
            ps.setInt(2, phone);
            ps.setString(3, address);
            ps.setString(4, startTime);
            ps.setString(5, endTime);
            ps.setInt(6, slot);
            ps.setInt(7, price);
            ps.setString(8, trasport);
            ps.setString(9, image);
            ps.setInt(10, idTour);
            ps.executeUpdate();
            System.out.println("insert successfull");
        } catch (Exception e) {
            System.out.println("insert Tour:" + e.getMessage());
        }
        return list;
    }

    public boolean checkIdTour(int Id) {
        try {
            String strSelect = "select * from Tours where idTour =" + Id;
            stm = cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stm.executeQuery(strSelect);
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("getuser Error: " + e.getMessage());
        }
        return false;
    }

    public ArrayList<Tour> getListTour() {
        ArrayList<Tour> list = new ArrayList<Tour>();
        String sql = "select * from Tours";
        try {
            connect();
            PreparedStatement ps = cnn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                list.add(new Tour(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7),
                        rs.getString(8), rs.getString(9), rs.getInt(10)));
            }
        } catch (Exception e) {
            System.out.println("Get News: " + e.getMessage());
        }
        return list;
    }

    public ArrayList<Tour> getTourByIdTour(int idTour) {
        ArrayList<Tour> list = new ArrayList<Tour>();
        try {
            String strSelect = "select * from Tours where idTour like " + idTour + "";
            cnn = (new DBContext()).connection;
            PreparedStatement ps = cnn.prepareStatement(strSelect);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Tour(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7),
                        rs.getString(8), rs.getString(9), rs.getInt(10)));
            }
        } catch (Exception e) {
            System.out.println("Get Tour error :" + e.getMessage());
        }
        return list;
    }

    public void updateTour(int idTour, int slot, int order) {
        try {
            String sql = "update Tours set slot=" + (slot - order) + " where idTour= " + idTour + "";;
            cnn = (new DBContext()).connection;
            ps = cnn.prepareStatement(sql);
            System.out.println(ps.executeUpdate());
        } catch (Exception e) {
            System.out.println("Lỗi Update: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Tour t = new Tour();
        ArrayList<Tour> list = t.getTourByIdTour(1);
//        t.setListTour("nguyenvanha2k@gmail.com", 962017914, "Moc chau", "2021-07-21", "2021-07-24", 40, 160, "Car","mocchau.png", 5);
//        for (Tour tour : list) {
//            System.out.println(tour.getAddress() + tour.getIdTour());
//
//        }
//        t.updateTour(1, 36, 3);
//        for (Tour tour : list) {
//            System.out.println(tour.getEmail());
//
//        }
    }
}
