import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
 * La clase tendrá una variable de instancia llamada cuentaBancariaActual de tipo CuentaBancaria.
 * La clase tendrá un constructor que tendrá como parámetros un String que identifica al usuario y un String para la contraseña.
 * La clase tendra los sigueintes métodos:
 * mostrarSaldo() -> Mostrará el saldo de cuentaBancariaActual
 * ingresarDinero() -> Preguntará cuanto dinero ingresará y lo ingresará.
 * sacarDinero() -> Preguntará cuanto dinero quiere sacar y lo sacará
 * consultarMovimientos() -> No hará nada.
 * salir() -> Dará las gracias al usuario.
 */
public class CajeroAutomatico {
    
    CuentaBancaria cuentaBancariaActual;
    
    CajeroAutomatico (String identificador, String constrasena){
        double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0, 50_000);   
        cuentaBancariaActual = new CuentaAhorro("Nombre cualquiera", cantidadAleatoria);
    }

    void mostrarSaldo(){
        System.out.println("Su saldo es: " + cuentaBancariaActual.obtenerSaldo());
    }

    void ingresarDinero(){
        System.out.println("¿Cuánto dinero quiere ingresar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();

        cuentaBancariaActual.ingresarDinero(cantidad);
    }

    void sacarDinero(){
        System.out.println("¿Cuánto dinero quiere sacar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();

        cuentaBancariaActual.sacarDinero(cantidad);
    }

    void consultarUltimosMovimientos(){
        GeneradorAleatorioDeMovimientos generadorAleatorioDeMovimientos = new GeneradorAleatorioDeMovimientos();
        System.out.println("¿Cuántos movimientos quiere consultar?");
        Scanner scanner = new Scanner(System.in);
        int numeroDeMovimientos = scanner.nextInt();
        ArrayList<String> movimientos = generadorAleatorioDeMovimientos.obtenerMovimientos(numeroDeMovimientos, "pesos");

        mostrarMovimientos(movimientos);
    }
    

    void mostrarMovimientos(ArrayList<String> movimientos){
        for (String movimiento : movimientos) {
            System.out.println(movimiento);           
        }
    }

    void mostrarCondicionesLegales(){
        cuentaBancariaActual.informarSobreCondicionesLegales();
    }

    void salir(){
        System.out.println("Muchas gracias por usar nuestros servicios");
    }

}
