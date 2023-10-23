
//Ver el string es palindromo
//ver si el numero es primo
//ver cuantas mayusculas tiene la cadena
//si no es primo, factorizalo
//mostrar el tamaño de la cadena
import java.util.Scanner;

public class main{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int numero;
        String cadena = "";
        boolean primo = false;
        System.out.println("Introduce una palabra: ");
        cadena = sc.nextLine();

        System.out.println("Introduce un número: ");
        numero = sc.nextInt();

        //Ver el string es palindromo

        cadena = cadena.replaceAll("\\s", "").toLowerCase();

        int izquierda = 0;
        int derecha = cadena.length() - 1;
        boolean esPalindromo = true;

        while (izquierda < derecha) {
            if (cadena.charAt(izquierda) != cadena.charAt(derecha)) {
                esPalindromo = false;
                break;
            }
            izquierda++;
            derecha--;
        }

        if (esPalindromo) {
            System.out.println(cadena + " es un palíndromo.");
        } else {
            System.out.println(cadena + " no es un palíndromo.");
        }

        //ver si el numero es primo

        //ver cuantas mayusculas tiene la cadena

        //si no es primo, factorizalo

        //mostrar el tamaño de la cadena

    }
}