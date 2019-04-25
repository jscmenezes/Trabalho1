
package dominio;

import java.util.Date;

public class Apolice {
    
    private long numero;
    private Date data;
    private Date dataValidade;
    private int situacao;
    private String seguradora;

    public Apolice() {
    }

    public Apolice(long numero, Date data, Date dataValidade, int situacao, String seguradora) {
        this.numero = numero;
        this.data = data;
        this.dataValidade = dataValidade;
        this.situacao = situacao;
        this.seguradora = seguradora;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public String getSeguradora() {
        return seguradora;
    }

    public void setSeguradora(String seguradora) {
        this.seguradora = seguradora;
    }

    @Override
    public String toString() {
        return "Apolice{" + "numero=" + numero + ", data=" + data + ", dataValidade=" + dataValidade + ", situacao=" + situacao + ", seguradora=" + seguradora + '}';
    }
    
    
    
}
