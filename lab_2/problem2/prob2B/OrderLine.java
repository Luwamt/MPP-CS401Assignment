package mpp_cs401_assignments.MPP_CS401Assignment.lab_2.problem2.prob2B;

public class OrderLine {

    private Order order;

    OrderLine(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "order=" + order +
                '}';
    }
}
