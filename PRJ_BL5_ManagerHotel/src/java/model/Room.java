/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author l
 */
public class Room {

    private int rid;
    private int hotelid;
    private String name;
    private String roomtype;
    private int quantity;
    private int price;
    private String description;
    private boolean status;
    private String imageURL;
    private Hotel hotel;

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Room() {
    }

    public Room(int rid, int hotelid, String name, String roomtype, int quantity, int price, String description, boolean status, String imageURL) {
        this.rid = rid;
        this.hotelid = hotelid;
        this.name = name;
        this.roomtype = roomtype;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
        this.status = status;
        this.imageURL = imageURL;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getHotelid() {
        return hotelid;
    }

    public void setHotelid(int hotelid) {
        this.hotelid = hotelid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Room{" + "rid=" + rid + ", hotelid=" + hotelid + ", name=" + name + ", roomtype=" + roomtype + ", quantity=" + quantity + ", price=" + price + ", description=" + description + ", status=" + status + ", imageURL=" + imageURL + '}';
    }

}