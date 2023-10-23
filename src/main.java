//Ver el string es palindromo
//ver si el numero es primo
//ver cuantas mayusculas tiene la cadena
//si no es primo, factorizalo
//mostrar el tamaño de la cadena
import java.util.Scanner;

public class main{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        String cadena = "a";
        boolean primo = false;
        System.out.println("Introduce una palabra: ");
        cadena = sc.nextLine();
        //Ver el string es palindromo

        //ver si el numero es primo

        //ver cuantas mayusculas tiene la cadena
        int aux = 0;
        for (int i = 1; i <= cadena.length(); i++){
            if (cadena.isUpperCase(cadena.chartAt(i))){
                aux++;
            }
        }
        System.out.prinln("La cadena tiene " + aux + " mayúsculas.");
        //si no es primo, factorizalo

        //mostrar el tamaño de la cadena

    }
}