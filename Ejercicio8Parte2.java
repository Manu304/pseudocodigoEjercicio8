import java.util.Scanner;

//202030799 Manuel Rojas
//Dise�ar un algoritmo que genere n�meros al azar
//m�ltiplos de 5, mientras el usuario no ingresa la opci�n 'S' (Salir)
public class Ejercicio8Parte2 {
    public static void main(String[] args) {
        char salir = 'N';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Presione 'S' para dejar de generar numeros: ");
        while (salir != 'S'){
            salir = scanner.next().toUpperCase().charAt(0);
            if(salir != 'S'){
                int random = 0;
                do {
                    random = (int) Math.floor(Math.random()*(1000+1));
                } while ((random%5) != 0);
                System.out.println(random);
            }
        }
    }
}