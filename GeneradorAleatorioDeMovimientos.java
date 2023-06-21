import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/*
 * La clase genera un lista de movimientos bancarios de forma aleatoria.
 * 
 * Tendra un único método público con dos parámetros, uno de tipo int con el numero de movimientos deseados y otro de tipo String en el que se indicara la moneda para los movimientos.
 * 
 * Los tipos de movimientos disponibles son:
 * 
 *  1. Transferencia -> "Tranferencia de x moneda"
 *  2. Ingreso -> "Ingreso de x moneda"
 *  3. Retirada -> "Retirada de x moneda"
 *  4. Pago con tarjeta -> "Pago con tarjeta de x moneda"
 *  5. Nomina -> "Ingreso nomina de x moneda"
 *  6. Pago recibo -> "Pago de recibo de x moneda"
 * 
 * Se generará una lista con el nro de movimientos indicados por parámetros en el que cada movimiento será de los tipos dados y la cantidad de dinero será un double entre 1.0 y 3000.0
 */
public class GeneradorAleatorioDeMovimientos {

    private static final String TRANSFERENCIA = "Transferencia de ";
    private static final String INGRESO = "Ingreso de ";
    private static final String RETIRADA = "Retirada de ";
    private static final String PAGO_CON_TARJETA = "Pago con tarjeta de ";
    private static final String NOMINA = "Ingreso nómina de ";
    private static final String PAGO_RECIBO = "Pago de recibo de ";

    ArrayList<String> obtenerMovimientos(int numeroDeMovimientos, String moneda) {

        ArrayList<String> movimientos = new ArrayList<>();
        for (int i = 0; i < numeroDeMovimientos; i++) {
            int numeroIntDeMovimientoAleatorio = obtenerIntAleatorio(1, 6);
            String tipoDeMovimiento;

            switch (numeroIntDeMovimientoAleatorio) {
                case 1:
                    tipoDeMovimiento = TRANSFERENCIA;
                    break;
                case 2:
                    tipoDeMovimiento = INGRESO;
                    break;
                case 3:
                    tipoDeMovimiento = RETIRADA;
                    break;
                case 4:
                    tipoDeMovimiento = PAGO_CON_TARJETA;
                    break;
                case 5:
                    tipoDeMovimiento = NOMINA;
                    break;
                default:
                    tipoDeMovimiento = PAGO_RECIBO;
                    break;
            }
            double cantidadAleatoria = obtenerDoubleAleatorio(1.0, 3000.0);

            String movimiento = tipoDeMovimiento + String.format("%.2f",cantidadAleatoria) + " " + moneda;

            movimientos.add(movimiento);
        }
        return movimientos;
    }

    private int obtenerIntAleatorio(int minimo, int maximo){
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

    private double obtenerDoubleAleatorio(double minimo, double maximo){
        return ThreadLocalRandom.current().nextDouble(minimo, maximo + 1.0);
    }

}
