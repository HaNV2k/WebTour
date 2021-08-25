/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class News {

    private String title, content;

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public News(String title) {
        this.title = title;
    }

    public News() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public ArrayList<News> setNews(String title, String content) {
        ArrayList<News> list = new ArrayList<News>();
        try {

            String strSelect = "INSERT INTO News(title,content) VALUES(?,?)";
            cnn = (new DBContext()).connection;
            ps = cnn.prepareStatement(strSelect);
            ps.setString(1, title);
            ps.setString(2, content);
            ps.executeUpdate();
            System.out.println("insert new successfull");
        } catch (Exception e) {
            System.out.println("insert user:" + e.getMessage());
        }
        return list;
    }

    public ArrayList<News> getList() {
        ArrayList<News> list = new ArrayList<News>();
        String sql = "select * from News";
        try {
            cnn = (new DBContext()).connection;
            PreparedStatement ps = cnn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("getList successfull");
                list.add(new News(rs.getString(1), rs.getString(2)));
            }
        } catch (Exception e) {
            System.out.println("Get News: " + e.getMessage());
        }
        return list;
    }

    public void deleteNews(String title) {

        String sql = "DELETE FROM News WHERE title = ?";
        try {
            System.out.println("delete successfull");
            cnn = (new DBContext()).connection;
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setString(1, title);
            System.out.println(ps.executeUpdate());
        } catch (Exception e) {
            System.out.println("Delete Product error :" + e.getMessage());
        }

    }

    public void updateNews(String title, String content) {
        try {
            String sql = "update News set content='" + content + "' where title= '" + title + "'";;
            cnn = (new DBContext()).connection;
            ps = cnn.prepareStatement(sql);
            System.out.println(ps.executeUpdate());
        } catch (Exception e) {
            System.out.println("Lỗi Update: " + e.getMessage());
        }
    }

    public boolean checkExistNews(String title) {
        try {
            String strSelect = "select * from News where  title ='" + title + "'";
            cnn = (new DBContext()).connection;
            ps = cnn.prepareStatement(strSelect);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Title true");
                return true;
            }
        } catch (Exception e) {
            System.out.println("Title error : " + e.getMessage());
        }
        return false;
    }

    public static void main(String[] args) {
        News n = new News();
        ArrayList<News> list = n.getList();
//        n.updateNews("1", "cccccccccccccccccc");
        for (News news : list) {
            System.out.println(news.getTitle() + "      ");
        }
    }
}
