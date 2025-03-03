package Binder.FlowerPackage;

public class Flower {
    private String name;
    private int height; // in cm
    private String color;
    private String season;

    // Constructor
    public Flower(String name, int height, String color, String season) {
        this.name = name;
        this.height = height;
        this.color = color;
        this.season = season;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public String getSeason() {
        return season;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    // toString method
    @Override
    public String toString() {
        return "Flower{name='" + name + "', height=" + height + " cm, color='" + color + "', season='" + season + "'}";
    }
}
