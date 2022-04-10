package mpp_cs401_assignments.MPP_CS401Assignment.lab_2.problem2.prob2B.prob2B_Main;

import mpp_cs401_assignments.MPP_CS401Assignment.lab_2.problem2.prob2B.Order;
import mpp_cs401_assignments.MPP_CS401Assignment.lab_2.problem2.prob2B.OrderLine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Order o1= new Order(1);
        //o1.getLines().add(o1.getOrder_Number(),);

        Order o2 = new Order(2);
        List<Order> orders = new ArrayList<>(Arrays.asList(o1,o2));
        //Order line = orders.
        System.out.println(orders);
        // System.out.println("From order lines: "+ o1.getOrder_Number() );
        //System.out.println(o1.getLines());
        //OrderLine line = o1;
        //OrderLine coffee=
    }
}
