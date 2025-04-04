package capitulo_9;

public class Payroll {
    public static void main(String[] args) {
        long hoursWorked = 40;
        double payRate = 10.0, taxRate = 0.10;
        System.out.println("Hours Worked: " + hoursWorked );
        System.out.println("pay Amount  : " + (hoursWorked * payRate) );
        System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );

        double x = 0.0;
        double total = 3*Math.pow(x, 2) - 8*x + 4;
        System.out.println("Total AT x = " + x + " the value is " + total);

    }
}
