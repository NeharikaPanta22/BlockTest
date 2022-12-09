package model;
import java.util.ArrayList;

public class users {
    String user_name;
    ArrayList <orders> orders;

    public users(String user_name, ArrayList<orders> orders) {
        this.user_name = user_name;
        this.orders = orders;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public ArrayList<orders> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<orders> orders) {
        this.orders = orders;
    }
}