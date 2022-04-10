package mpp_cs401_assignments.MPP_CS401Assignment.lab_4.lab4_C;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee{

    private double commission;
    private double baseSalary;
    private List<Order> orders;

    public Commissioned(int id, double commission , double baseSalary) {
        super(id);
        this.baseSalary = baseSalary;
        this.commission = commission;
        orders = new ArrayList<Order>();
    }
    @Override
    public double calcGrossPay(int month, int year) {
        LocalDate firstOfCurrentMonth = LocalDate.of(year, month, 1);
        double orderAmountsThisMonth = 0.0;
        for(Order o: orders) {
            if(isPreviousMonth(firstOfCurrentMonth, o.getOrderDate())) {
                orderAmountsThisMonth += o.getOrderAmount();
            }
        }
        return baseSalary + commission * orderAmountsThisMonth;
    }
    private boolean isPreviousMonth(LocalDate current, LocalDate maybePrevious) {
        int currMonth = current.getMonthValue();
        int prevMonth = maybePrevious.getMonthValue();
        int currYear = current.getYear();
        int prevYear = maybePrevious.getYear();
        if((currMonth - prevMonth == 1 && currYear == prevYear) ||
                (currMonth == 1 && prevMonth == 12 && currYear - prevYear == 1)) {
            return true;
        }
        return false;
    }
    /*@Override
    public double calcGrossPay(int month, int year) {

        int totalOrdersInThisMonth = 0;
        for (Order order : orderList) {
            if (month == order.getOrderDate().getMonthValue() && year == order.getOrderDate().getYear())
                totalOrdersInThisMonth += order.getOrderAmount();
        }
        return baseSalary + totalOrdersInThisMonth * commission;
    }*/

}
