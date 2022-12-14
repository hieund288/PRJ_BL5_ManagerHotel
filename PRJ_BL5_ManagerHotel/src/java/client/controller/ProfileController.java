/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client.controller;

import auth.controller.BaseAuthenticationController;
import dao.RoomDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import model.Booking;
import model.Room;

/**
 *
 * @author l
 */
public class ProfileController extends BaseAuthenticationController{

    @Override
    protected void processPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
   }

    @Override
    protected void processGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int pid = Integer.parseInt(req.getParameter("id"));
        RoomDAO roomdao = new RoomDAO();
        ArrayList<Booking> book = roomdao.getHotelDetailsbyRoom(pid);
        req.setAttribute("book", book);
        req.getRequestDispatcher("client/profile.jsp").forward(req, resp);
    }
    
}
