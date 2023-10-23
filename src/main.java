
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

        if (numero > 1) {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    primo = false;
                }else {
                    primo = true;
                }
            }
        }

        //ver cuantas mayusculas tiene la cadena
        int aux = 0;
        for (int i = 1; i <= cadena.length(); i++){
            if (cadena.isUpperCase(cadena.chartAt(i))){
                aux++;
            }
        }
        System.out.prinln("La cadena tiene " + aux + " mayúsculas.");
        //si no es primo, factorizalo

        if (primo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
            System.out.print("Factores de " + numero + ": ");
            for (int i = 2; i <= numero; i++) {
                while (numero % i == 0) {
                    System.out.print(i + " ");
                    numero /= i;
                }
            }
            System.out.println();
        }

        //mostrar el tamaño de la cadena



        int longitud = cadena.length();

        System.out.println("La longitud de la cadena es: " + longitud);

        sc.close();

    }
}
