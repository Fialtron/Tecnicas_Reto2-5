import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean exit = false;
        int option;

        Scanner sc = new Scanner(System.in);
        while (!exit) {
            System.out.print("Menu Basico \n 1. Opcion 1 \n 2. Opcion 2 \n 3. Opcion 3 \n 4. Opcion 4\n 5. Salir \n");
            System.out.print("Ingrese una opcion: ");
            try {
                option = Integer.parseInt(sc.next());
                switch (option) {
                    case 1:
                        System.out.print("Bienvenido estas en la Opcion 1! \n");
                        break;
                    case 2:
                        System.out.print("Bienvenido estas en la Opcion 2! \n");
                        break;
                    case 3:
                        System.out.print("Bienvenido estas en la Opcion 3! \n");
                        break;
                    case 4:
                        System.out.print("Bienvenido estas en la Opcion 4! \n");
                        break;
                    case 5:
                        System.out.print("Hasta luego!");
                        exit = true;
                        break;
                    default:
                        System.out.print("Opcion no valida!");
                }
            } catch (NumberFormatException ex ){
                System.out.println("Inserte un numero valido. Por favor intente nuevamente");
            }
        }
    }
}


