public class Calculadora {
    
    double calcularMedia(double ... numeros){ 
        // Los ... son para tener una cantidad de parámetros variables
        if (numeros.length == 0) {
            return 0.0;
        }
        double suma = 0.0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        return suma/numeros.length;
    }
}
