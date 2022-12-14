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
import model.Account;
import model.Booking;
import model.Hotel;
import model.Room;

/**
 *
 * @author l
 */
public class AccountDAO extends DBContext {

    public Account check(String username, String password) {
        String sql = "select*from account where username=? and password=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Account a = new Account(username, password, rs.getInt("roleID"));
                a.setAid(rs.getInt("aid"));
                return a;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public ArrayList<Account> listAccount() {
        ArrayList<Account> account = new ArrayList<>();
        try {
            String sql = "select * from account";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                Account a = new Account();
                a.setAid(rs.getInt("aid"));
                a.setUsername(rs.getString("username"));
                a.setPassword(rs.getString("password"));
                a.setName(rs.getString("name"));
                a.setEmail(rs.getString("email"));
                a.setPhone(rs.getString("phone"));
                a.setRoleID(rs.getInt("roleID"));
                account.add(a);
            }
        } catch (SQLException ex) {

        }
        return account;
    }

    public static void main(String[] args) {
        String a = "dat";
        String b = "dat";
        AccountDAO acc = new AccountDAO();
        System.out.println("" + acc.check(a, b));

    }
}
