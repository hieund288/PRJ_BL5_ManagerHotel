/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Hotel;

/**
 *
 * @author l
 */
public class HotelDAO extends DBContext {

    public ArrayList<Hotel> listHotel() {
        ArrayList<Hotel> hotel = new ArrayList<>();
        try {
            String sql = "SELECT hotel.hid , hotel.[name], hotel.adress, hotel.city, hotel.phone, hotel.description ,hotel.imageURL, [type].[name]\n"
                    + "FROM hotel\n"
                    + "INNER JOIN [type] ON hotel.hid = [type].tid;";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Hotel h = new Hotel();
                h.setHid(rs.getInt("hid"));
                h.setName(rs.getString("name"));
                h.setAdress(rs.getString("adress"));
                h.setCity(rs.getString("city"));
                h.setPhone(rs.getString("phone"));
                h.setDescription(rs.getString("description"));
                h.setImageURL(rs.getString("imageURL"));
                h.setType(rs.getString(8));
                hotel.add(h);
            }
        } catch (SQLException ex) {

        }
        return hotel;
    }

    public static void main(String[] args) {
        HotelDAO pro = new HotelDAO();
        System.out.println("" + pro.listHotel());
    }
}
