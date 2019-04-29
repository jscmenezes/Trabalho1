
package dominio;

import java.util.*;

public class Cliente extends Pessoa {
    
    private String endereco;
    private String telefone;    
    List<VeiculoSegurado> veiculosSegurados = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String endereco, String telefone) {
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Cliente(String endereco, String telefone, String nome, Date dataNascimento) {
        super(nome, dataNascimento);
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<VeiculoSegurado> getVeiculosSegurados() {
        return veiculosSegurados;
    }

    public void setVeiculosSegurados(List<VeiculoSegurado> veiculosSegurados) {
        this.veiculosSegurados = veiculosSegurados;
    }

    @Override
    public String toString() {
        return "Cliente{" + super.toString() + ", endereco=" + endereco + ", telefone=" + telefone + ", veiculosSegurados=" + veiculosSegurados + '}';
    }
    
    
    
}
