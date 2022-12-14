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
import model.Account;
import model.Booking;
import model.Hotel;
import model.Room;
import model.Type;

/**
 *
 * @author l
 */
public class RoomDAO extends DBContext {

    public ArrayList<Room> getHotelDetails(int aid) {
        ArrayList<Room> room = new ArrayList<>();
        try {
            String sql = "SELECT \n"
                    + "hotel.hid, hotel.adress, hotel.phone, hotel.description, hotel.imageURL, \n"
                    + "room.rid, room.hotelID , hotel.name as hname, room.name as rname, room.roomtype, room.quantity, room.price, \n"
                    + "room.description as rdescription, room.status, room.imageURL as rimageURL,\n"
                    + "type.name, type.tid\n"
                    + "FROM hotel\n"
                    + "INNER JOIN room ON hotel.hid = room.hotelID\n"
                    + "INNER join type on hotel.typeid = type.tid\n"
                    + "where room.hotelid=?\n"
                    + "order by room.rid";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, aid);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Room r = new Room();
                Hotel h = new Hotel();
                Type t = new Type();

                h.setHid(rs.getInt("hid"));
                h.setHname(rs.getString("name"));
                h.setAdress(rs.getString("adress"));
                h.setPhone(rs.getString("phone"));
                h.setDescription(rs.getString("description"));
                h.setImageURL(rs.getString("imageURL"));

                r.setRid(rs.getInt("rid"));
                r.setHotelid(rs.getInt("hotelID"));
                r.setRname(rs.getString("rname"));
                r.setRoomtype(rs.getString("roomtype"));
                r.setQuantity(rs.getInt("quantity"));
                r.setPrice(rs.getInt("price"));
                r.setRdescription(rs.getString("rdescription"));
                r.setStatus(rs.getBoolean("status"));
                r.setRimageURL((rs.getString("rimageURL")));
                r.setHotel(h);

                t.setTid(rs.getInt("tid"));
                t.setName(rs.getString("name"));
                r.setType(t);

                room.add(r);
            }
        } catch (SQLException ex) {
        }
        return room;
    }

    public ArrayList<Booking> getHotelDetailsbyRoom(int pid) {
        ArrayList<Booking> book = new ArrayList<>();
        try {
            String sql = "SELECT Account.aid, Account.Name, \n"
                    + "Room.rid,Room.name,Room.roomtype , Room.imageURL , \n"
                    + "Booking.datefrom, Booking.dateto, Booking.numPeople, Booking.status\n"
                    + "FROM Booking\n"
                    + "INNER JOIN Account ON Booking.accountID = Account.aid\n"
                    + "INNER JOIN Room ON Booking.roomID = Room.rid\n"
                    + "where Account.aid = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, pid);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                Booking b = new Booking();
                Account a = new Account();
                Room r = new Room();
                a.setAid(rs.getInt("aid"));
                a.setName(rs.getString("Name"));
                r.setRid(rs.getInt("rid"));
                r.setRname(rs.getString("name"));
                r.setRoomtype(rs.getString("roomtype"));
                r.setRimageURL((rs.getString("imageURL")));
                b.setDatefrom(rs.getDate("datefrom"));
                b.setDateto(rs.getDate("dateto"));
                b.setNumPeople(rs.getInt("numPeople"));
                b.setStatus(rs.getBoolean("status"));
                //  b.setBid(rs.getInt("bid"));
                //  b.setRoomID(rs.getInt("roomID"));
                //  b.setAccountID(rs.getInt("accountID"));

                b.setRoom(r);
                b.setAccount(a);
                book.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoomDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return book;
    }

    public Account addbooking(String rid, String acid, String from, String end, String num) {
        String sql = "insert into Booking(roomID,accountID,datefrom,dateto,numPeople,status) values(?,?,?,?,?,?);";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, rid);
            st.setString(2, acid);
            st.setString(3, from);
            st.setString(4, end);
            st.setString(5, num);
            st.setBoolean(6, true);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public static void main(String[] args) {
        RoomDAO pro = new RoomDAO();
        System.out.println("" + pro.getHotelDetailsbyRoom(1));
    }

}
