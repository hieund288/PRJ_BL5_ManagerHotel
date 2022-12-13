/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author l
 */
public class Hotel {

    private int hid;
    private String name;
    private String adress;
    private String city;
    private String phone;
    private String description;
    private String imageURL;
    private String type;
    private ArrayList<Room> rooms;

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public Hotel() {
    }

    public Hotel(int hid, String name, String adress, String city, String phone, String description, String imageURL, String type) {
        this.hid = hid;
        this.name = name;
        this.adress = adress;
        this.city = city;
        this.phone = phone;
        this.description = description;
        this.imageURL = imageURL;
        this.type = type;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Hotel{" + "hid=" + hid + ", name=" + name + ", adress=" + adress + ", city=" + city + ", phone=" + phone + ", description=" + description + ", imageURL=" + imageURL + ", type=" + type + ", rooms=" + rooms + '}';
    }

 
}