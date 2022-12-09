import model.items;
import model.orders;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        items i1=new items("t1","1111","b1",1000);
        items i2=new items("t2","1112","b2",1050);
        items i3=new items("t3","1113","b1",1010);
        items i4=new items("t4","1114","b1",1150);
        items i5=new items("t5","1115","b2",1500);

        ArrayList<items> items_u1=new ArrayList<>();

        items_u1.add(i1);
        items_u1.add(i2);


        ArrayList<items> items_u2=new ArrayList<>();
        items_u2.add(i3);
        items_u2.add(i4);

        ArrayList<orders> orders_u1=new ArrayList<>();
        orders u1_o1=new orders("u1",items_u1);
        orders u1_o2=new orders("u1",items_u1);

        orders_u1.add(u1_o1);
        orders_u1.add(u1_o2);

        //creating an arraylist to store the number of orders of second user.
        ArrayList<orders> orders_u2=new ArrayList<>();
        orders u2_o1=new orders("u2",items_u2);
        orders u2_o2=new orders("u2",items_u2);

        orders_u1.add(u2_o1);
        orders_u1.add(u2_o2);

        i1.display();

    }
}