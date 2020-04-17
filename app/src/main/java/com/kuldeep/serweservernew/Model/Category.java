package com.kuldeep.serweservernew.Model;

/**
 * Created by QUOC CUONG on 17/10/2017.
 */

public class Category {
    private String Name, Image, address, Description, Phone, Email;
    private long Table;
    private  double Lat;
    private  double Long;


    public Category() {
    }

    public Category(String name, String image, String description, String phone, String email, long table) {
        Name = name;
        Image = image;
        Description = description;
        Phone = phone;
        Email = email;
        Table = table;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public long getTable() {
        return Table;
    }

    public void setTable(long table) {
        Table = table;
    }

    public double getLat() {
        return Lat;
    }

    public void setLat(double lat) {
        Lat = lat;
    }

    public double getLong() {
        return Long;
    }

    public void setLong(double aLong) {
        Long = aLong;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
