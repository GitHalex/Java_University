package capitulo_10;

public class Operators {
    public static void main(String[] args) {
        double x = 12.0;
        double result;
        result = x / 3;
        System.out.println(result);

        short x1 = 12;
        short y = 3;
        short value;
        value = (short) (x / y);

        double total = ((3/2) * 5.7) + 9/10;
        System.out.println("Total: " + total);

        System.out.println("The result is: " + (1/2 + 1/2));
        System.out.println("The result is: " + (1.0/2 + 1/2));
        System.out.println("The result is: " + (1/2.0 + 1/2));
        System.out.println("The result is: " + (1/2 + 1.0/2.0));
        System.out.println("The result is: " + (1/2.0 + 1.0/2.0));

        System.out.println("The result is: -10/5 " + (-10/5));
        System.out.println("The result is: -129/100 " + (-129/100));
        System.out.println("The result is: -129/100 " + (17/2));
        System.out.println("The result is: -129/100 " + (-12/3));
        System.out.println("The result is: 10/-6 " + (10/-6));

        System.out.println("The result is: (18.0 - 23.3) / (73 - 23) " + ((18.0-23.3)/(73-23)));
        System.out.println(8/16 + 3.5);
    }
}
