import java.util.Scanner;

/*
 * Programa que emula la interfaz de un cajero autómatico.
 * 
 * Elija una de las siguientes opciones:
 *  Escriba 1 para consultar saldo
 *  Escriba 2 para ingresar dinero
 *  Escriba 3 para sacar dinero
 *  Escriba 4 para consultar sus últimos movimientos
 * Una vez el usuario ha elegido la opción, pulse Enter
 * El programa mostrará la opción seleccionada.
 * Para salir del menu pulse cualquier otro numero.
 */
public class Interfaz {
    public static void main(String[] args) {

        System.out.println("Por favor introduzca su número de identificación");
        Scanner scanner = new Scanner(System.in);
        String identificador = scanner.nextLine();

        System.out.println("Introduzca su contraseña");
        String contrasena = scanner.nextLine();

        CajeroAutomatico cajero = new CajeroAutomatico(identificador, contrasena);

        int opcionSeleccionada;

        do {
            System.out.println("Elija una de las siguientes opciones:");
            System.out.println("    Escriba 1 para consultar saldo");
            System.out.println("    Escriba 2 para ingresar dinero");
            System.out.println("    Escriba 3 para sacar dinero");
            System.out.println("    Escriba 4 para consultar sus últimos movimientos");
            System.out.println("    Escriba 5 para consultar condiciones legales sobre el tipo de cuenta");
            System.out.println("Una vez el usuario ha elegido la opción, pulse Enter");

            // Scanner scanner = new Scanner(System.in);
            opcionSeleccionada = scanner.nextInt(); // Se asigna el valor ingresado a la variable int

            switch (opcionSeleccionada) {
                case 1:
                    cajero.mostrarSaldo();
                    break;
                case 2:
                    cajero.ingresarDinero();
                    break;
                case 3:
                    cajero.sacarDinero();
                    break;

                case 4:
                    cajero.consultarUltimosMovimientos();
                    break;
                case 5:
                    cajero.mostrarCondicionesLegales();
                    break;

                default:
                    cajero.salir();
                    break;
            }

        } while (opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3
                || opcionSeleccionada == 4 || opcionSeleccionada == 5);

    }
}