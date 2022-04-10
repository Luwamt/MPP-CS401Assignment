package mpp_cs401_assignments.MPP_CS401Assignment.lab_2.problem2.prob2B;

import java.util.ArrayList;
import java.util.List;

//implementing one to many
public class Order {
    private int order_Number;
    private List<OrderLine> lines;

    public Order(int order_Number) {
        this.order_Number = order_Number;
        OrderLine o1= new OrderLine(this);
        this.lines = new ArrayList<OrderLine>();
        this.lines.add(o1);

    }

    public List<OrderLine> getLines() {
        return lines;
    }

    public void setLines(List<OrderLine> lines) {
        this.lines = lines;
    }

    public int getOrder_Number() {
        return order_Number;
    }

    public void setOrder_Number(int order_Number) {
        this.order_Number = order_Number;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_Number=" + order_Number +
                ", lines=" + lines +
                '}';
    }
}
