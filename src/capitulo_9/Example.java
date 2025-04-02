package capitulo_9;

public class Example {
    public static void main(String[] args) {
        long hoursWorked = 40;
        double payRate = 10.0, taxRate = 0.10;

        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("pay Amount: " + (hoursWorked * payRate));
        System.out.println("tax Amount: " + (hoursWorked * payRate * taxRate));

        long payAmount; //payAmount is declared withiut an initial value

        payAmount = 123; // an assignment statement

        System.out.println("the variable contains: " + payAmount);

        int suma, total;
        suma = 42 -12;
        total = suma;
        System.out.println("The sum of all numbers is: " + suma);

        int quantity = 7;
        quantity = 13;
        System.out.println("quantity: " + quantity);

    }
}

