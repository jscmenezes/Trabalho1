
package dominio;

import java.util.*;

public class VeiculoSegurado {
    
    private double kilometragem;
    private String placa;
    Apolice apolice;
    
    public static int contador = 0;

    public VeiculoSegurado() {
        this(0.0, "", null);
    }

    public VeiculoSegurado(double kilometragem, String placa, Apolice apolice) {
        this.kilometragem = kilometragem;
        this.placa = placa;
        this.apolice = apolice;
        contador++;
    }

    public double getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(double kilometragem) {
        this.kilometragem = kilometragem;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Apolice getApolice() {
        return apolice;
    }

    public void setApolice(Apolice apolice) {
        this.apolice = apolice;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        VeiculoSegurado.contador = contador;
    }

    @Override
    public String toString() {
        return "VeiculoSegurado{" + "kilometragem=" + kilometragem + ", placa=" + placa + ", apolice=" + apolice + '}';
    }
    
    
    
    
    
}
