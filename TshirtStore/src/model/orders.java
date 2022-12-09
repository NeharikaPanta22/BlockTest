package model;
import java.util.ArrayList;

public class orders {
    String user_name;
    ArrayList<items> items;

    public orders(String user_name, ArrayList<model.items> items) {
        this.user_name = user_name;
        this.items = items;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public ArrayList<items> getItems() {
        return items;
    }

    public void setItems(ArrayList<items> items) {
        this.items = items;
    }
}