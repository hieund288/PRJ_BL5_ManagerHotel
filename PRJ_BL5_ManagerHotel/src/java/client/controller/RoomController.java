/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client.controller;

import dao.RoomDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import model.Hotel;
import model.Room;

/**
 *
 * @author l
 */
public class RoomController extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // SessionDBContext sessionDB = new SessionDBContext();
        // ArrayList<Session> sessions = sessionDB.getListSessionStudent(sid, from, to);
        // req.setAttribute("sessions", sessions);
        int aid = Integer.parseInt(req.getParameter("id"));
        RoomDAO roomdao = new RoomDAO();
        Hotel hotel = roomdao.getHotelbyID(aid);
        req.setAttribute("hotel", hotel);
        req.getRequestDispatcher("client/room.jsp").forward(req, resp);
    }
    
}
