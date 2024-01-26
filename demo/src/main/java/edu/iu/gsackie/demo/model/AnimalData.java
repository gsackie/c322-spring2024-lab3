package edu.iu.gsackie.demo.model;

public class AnimalData {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPicture() {
        return picture;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    private String name;
    private String picture;
    private String location;
}
