public class CuentaNomina extends CuentaBancaria {

    public CuentaNomina(String titular, TipoDeCuenta tipo, double saldo) {
        super(titular, tipo, saldo);
    }

    public CuentaNomina(String titular, double saldo) {
        super(titular, saldo);
    }


    @Override
    public void informarSobreCondicionesLegales() {
        System.out.println("Condiciones Legales de la cuenta de Nomina del banco");
        System.out.println(" No hay comisión por retiro");
        
    }

    
    
}
