package model;

public class items {
    String name;
    String code;
    String brand;
    int price;

    public items(String name, String code, String brand, int price) {
        this.name = name;
        this.code = code;
        this.brand = brand;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void display(){
        System.out.println("items Name: "+this.name+"\nCode: "+this.code+"\nBrand: "+this.brand+"\nPrice:"+this.price);
    }
}