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

        int value = 5;
        value = 12 + value;
        System.out.println("The value is: " + value);

        int count = 2;                  // statement 1
        System.out.println( count ) ;   // statement 2

        count = count + 1;              // statement 3
        System.out.println( count ) ;   // statement 4

        float cinco = 5.0F;
        System.out.println(cinco/10);

    }
}

