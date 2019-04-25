
package dominio;

import java.util.Date;

public class Usuario extends Pessoa {
    
    private String identificador;
    private String senha;

    public Usuario() {
    }

    public Usuario(String identificador, String senha) {
        this.identificador = identificador;
        this.senha = senha;
    }

    public Usuario(String identificador, String senha, String nome, Date dataNascimento) {
        super(nome, dataNascimento);
        this.identificador = identificador;
        this.senha = senha;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "identificador=" + identificador + ", senha=" + senha + '}';
    }
    
    
    
}
