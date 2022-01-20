import java.util.Scanner;

//Punto 1 y punto 2

public class MainClass {

    public static void main(String[] args) {

        Scanner lectTeclado = new Scanner(System.in);
        String cadena = lectTeclado.nextLine();

        try {
            CharEn(cadena, 7);
        } catch (Exception e){
            System.out.println("Excepción atrapada exitosamente.");
            System.out.println("La excepción que ocurrió es: "+e);
        }

    }

    public static void CharEn(String cadena, int n) throws Exception {

        if (n >= 0 && n < cadena.length())
        {
            System.out.println(cadena.charAt(n));
        } else{
            throw new Exception("Se ha intentado recuperar un caracter de una cadena demasiado corta.");
        }
    }
}