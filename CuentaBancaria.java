public abstract class CuentaBancaria {

    private String titular;
    private TipoDeCuenta tipo;
    protected double saldo;
    
    public CuentaBancaria(String titular, TipoDeCuenta tipo, double saldo) {
        this.titular = titular;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipo = TipoDeCuenta.AHORRO;
    }

    public CuentaBancaria(){

    }

    /* Metodos de la CuentaBancaria */

    public void sacarDinero(double cantidad){
        if(cantidad < 0){
            return;
        }
        saldo -= cantidad;
    }

    public void ingresarDinero(double cantidad){
        if(cantidad < 0){
            return;
        }
        saldo += cantidad;
    }

    public void cambiarTipoDeCuenta(TipoDeCuenta nuevoTipo){
        tipo = nuevoTipo;
    }

    public double obtenerSaldo(){
        return saldo;
    }

    public abstract void informarSobreCondicionesLegales();


    
    
}
