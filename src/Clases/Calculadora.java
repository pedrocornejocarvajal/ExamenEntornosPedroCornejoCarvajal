package Clases;

import java.util.Arrays;
import java.util.Objects;

public class Calculadora {

    public String nombreCalculadora;
    public int[] numeros;

    public Calculadora(String nombreCalculadora, int[] numeros) {
        this.nombreCalculadora = nombreCalculadora;
        this.numeros = numeros;
    }

    public void multiplicar(int x) throws Exception {

        //multiplica valores por x
        if (numeros.length==0) {
            throw new Exception("El vector no esta iniciado");
        }
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i]*x;
        }
    }

    public int numeroRepeticiones(int numero) throws Exception {
        if (numeros.length==0) {
            throw new Exception("El vector no esta iniciado");
        }
        int contador=0;
        for (int j : numeros) {
            if (j == numero) {
                contador++;
            }
        }
        return contador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculadora that = (Calculadora) o;
        return Objects.equals(nombreCalculadora, that.nombreCalculadora) && Arrays.equals(numeros, that.numeros);
    }


}
