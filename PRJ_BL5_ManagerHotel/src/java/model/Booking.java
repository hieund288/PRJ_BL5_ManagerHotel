/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author l
 */
public class Booking {

    private int bid;
    private int roomID;
    private int accountID;
    private Date datefrom;
    private Date dateto;
    private int numPeople;
    private boolean status;
    private Room room;
    private Account account;

    public Booking() {
    }

    public Booking(int bid, int roomID, int accountID, Date datefrom, Date dateto, int numPeople, boolean status, Room room, Account account) {
        this.bid = bid;
        this.roomID = roomID;
        this.accountID = accountID;
        this.datefrom = datefrom;
        this.dateto = dateto;
        this.numPeople = numPeople;
        this.status = status;
        this.room = room;
        this.account = account;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public Date getDatefrom() {
        return datefrom;
    }

    public void setDatefrom(Date datefrom) {
        this.datefrom = datefrom;
    }

    public Date getDateto() {
        return dateto;
    }

    public void setDateto(Date dateto) {
        this.dateto = dateto;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Booking{" + "bid=" + bid + ", roomID=" + roomID + ", accountID=" + accountID + ", datefrom=" + datefrom + ", dateto=" + dateto + ", numPeople=" + numPeople + ", status=" + status + ", room=" + room + ", account=" + account + '}';
    }

}
