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

    public Hotel getHotelbyID(int aid) {
        Hotel hotel = new Hotel();
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
                Room r = new Room();

                hotel.setHid(rs.getInt("hid"));
                hotel.setName(rs.getString("name"));
                hotel.setAdress(rs.getString("adress"));
                hotel.setPhone(rs.getString("phone"));
                hotel.setDescription(rs.getString("description"));
                hotel.setImageURL(rs.getString("imageURL"));

                r.setRid(rs.getInt("rid"));
                r.setHotelid(rs.getInt("hotelID"));
                r.setName(rs.getString("name"));
                r.setRoomtype(rs.getString("roomtype"));
                r.setQuantity(rs.getInt("quantity"));
                r.setPrice(rs.getInt("price"));
                r.setDescription(rs.getString("description"));
                r.setStatus(rs.getBoolean("status"));
                r.setImageURL((rs.getString("imageURL")));
                room.add(r);
            }
            hotel.setRooms(room);
        } catch (SQLException ex) {
        }
        return hotel;
    }

    public static void main(String[] args) {
        RoomDAO pro = new RoomDAO();
        System.out.println("" + pro.getHotelbyID(4));
    }

}
