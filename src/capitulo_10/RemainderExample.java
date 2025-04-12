package capitulo_10;

public class RemainderExample {
    public static void main(String[] args) {

        int quotient, remainder;
        quotient = 17 / 3;
        remainder = 17 % 3;

        System.out.println("The quotient of " + quotient + " is " + remainder);
        System.out.println("The remainder of " + remainder + " is " + quotient % 3);
        System.out.println("The original quotient of " + (quotient*3 + remainder));
    }
}
