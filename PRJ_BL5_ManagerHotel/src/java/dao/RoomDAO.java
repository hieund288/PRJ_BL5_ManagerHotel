/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Hotel;
import model.Room;

/**
 *
 * @author l
 */
public class RoomDAO extends DBContext {

    public ArrayList<Room> getHotelDetails(int aid) {
        ArrayList<Room> room = new ArrayList<>();
        try {
            String sql = "SELECT \n"
                    + "hotel.hid,hotel.name, hotel.adress, hotel.phone, hotel.description, hotel.imageURL, \n"
                    + "room.rid, room.hotelID, room.name, room.roomtype, room.quantity, room.price, \n"
                    + "room.description, room.status, room.imageURL\n"
                    + "FROM hotel\n"
                    + "INNER JOIN room ON hotel.hid = room.hotelID\n"
                    + "where room.hotelid=?;";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, aid);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Hotel h = new Hotel();
                Room r = new Room();

                h.setHid(rs.getInt("hid"));
                h.setName(rs.getString("name"));
                h.setAdress(rs.getString("adress"));
                h.setPhone(rs.getString("phone"));
                h.setDescription(rs.getString("description"));
                h.setImageURL(rs.getString("imageURL"));

                r.setRid(rs.getInt("rid"));
                r.setHotelid(rs.getInt("hotelID"));
                r.setRname(rs.getString("name"));
                r.setRoomtype(rs.getString("roomtype"));
                r.setQuantity(rs.getInt("quantity"));
                r.setPrice(rs.getInt("price"));
                r.setDescription(rs.getString("description"));
                r.setStatus(rs.getBoolean("status"));
                r.setImageURL((rs.getString("imageURL")));
                r.setHotel(h);
                room.add(r);
            }
        } catch (SQLException ex) {
        }
        return room;
    }

    public static void main(String[] args) {
        RoomDAO pro = new RoomDAO();
        System.out.println("" + pro.getHotelDetails(5));
    }

}
