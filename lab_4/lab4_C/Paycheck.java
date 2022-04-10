package mpp_cs401_assignments.MPP_CS401Assignment.lab_4.lab4_C;


/** Immutable */
final public class Paycheck {

    private double grossPay;
    private double fica;
    private double state;
    private double local;
    private double mediCare;
    private double socialSecurity;

    public Paycheck(double grossPay, double fica, double state, double local, double mediCare, double socialSecurity) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.mediCare = mediCare;
        this.socialSecurity = socialSecurity;
    }

    public void print(){
        System.out.println("------------------------------");
        System.out.println("Gross Payment : " + this.grossPay);
        /*System.out.println("  Fica: " + fica  );
        System.out.println("  State: " + state );
        System.out.println(" Local: " + local  );
        System.out.println("  Medicare: " + mediCare );
        System.out.println("  Social Security: " + socialSecurity  );*/
        System.out.printf("Taxes Payment : %.2f \n" ,calculateTaxes());
        System.out.printf("Net Payment  : %.2f \n",  this.getNetPay());
        System.out.println("------------------------------");
    }
    public double getNetPay(){
        return grossPay- calculateTaxes();
    }
    private double calculateTaxes(){
        return grossPay* fica/100 + grossPay*state/100 + grossPay*local/100 + grossPay*mediCare/100 + grossPay*socialSecurity/100;
    }

}
