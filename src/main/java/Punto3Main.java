import java.util.Scanner;
import java.lang.Math;

//Punto 3

public class Punto3Main {

    static void validar(double numero) throws NumeroNegativoExcepcion {
        if (numero < 0) {
            throw new NumeroNegativoExcepcion("El número es negativo.",
                    new Throwable("Número = " + numero));
        }
    }

    public static void main(String[] args) {
        double numero = 0;
        double raiz = 0;

        Scanner lectTeclado = new Scanner(System.in);

        System.out.println("Introduzca el número a analizar.");

        numero = lectTeclado.nextDouble();

        try {
            validar(numero);
            raiz = Math.sqrt(numero);

            System.out.println("La raíz cuadrada de " + numero + " es " + raiz + ".");

        } catch (NumeroNegativoExcepcion e) {
            System.out.println("Excepción atrapada exitosamente.");

            System.out.println("La excepción que ocurrió es: " + e);
        }
    }
}