package capitulo_8;

public class Shortfall {
    public static void main(String[] args) {
//        BYTE (8 bits) alamacena numeros enteros pequeños rango -128 a 127
        byte edad = 25;
        System.out.println("Edad: " + edad);

//        SHORT (16 bits) almacena numeros enteros mas grandes que Byte rango -32768 a 32767
        short distancia = 15000;
        System.out.println("Distancia: " + distancia);

//        INT (32 bits) tipo mas comun para numeros enteros rango 2,147,483,648 a 2,147,483,647
        int poblacion = 1000000;
        System.out.println("Población: " + poblacion);

//        LONG (64 bits) para valores enteros muy grandes rango -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807.
//        Se debe agregar L al final del valor.
        long distanciaTierraSol = 149600000000L;
        System.out.println("Distancia Tierra-Sol: " + distanciaTierraSol);

//        FLOAT (32 bits) para numeros decimales con menor precicion se debe agregar F al final del valor
        float temperatura = 36.5F;
        System.out.println("Temperatura: " + temperatura);

//        DOUBLE (64 bits) para numeros decimales con mas precision
        double precio = 99.99;
        System.out.println("Precio: " + precio);

//        CHAR (16 bits) Almacena un solo caracter UNICOE (Letras, numeros y simbolos)
        char inicial = 'A';
        System.out.println("Inicial: " + inicial);

//        BOOLEAN (1 bit) solo puede ser true o false
        boolean esMayorDeEdad = true;
        System.out.println("¿Es mayor de edad?: " + esMayorDeEdad);



    }
}
