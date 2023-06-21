public class CuentaAhorro extends CuentaBancaria {
    
    private final double COMISION = 0.12;

    public CuentaAhorro(String titular, TipoDeCuenta tipo, double saldo) {
        super(titular, tipo, saldo);
    }

    public CuentaAhorro(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void sacarDinero(double cantidad) {   
        if (cantidad < 0) {
            return;
        }
        saldo -= cantidad;
        saldo -= COMISION;
    }
    @Override
    public void informarSobreCondicionesLegales() {
        System.out.println("Condiciones Legales de la cuenta de Ahorro del banco");
        System.out.println("La comisión por retiro es de 0.12");        
    }


    


    
}
