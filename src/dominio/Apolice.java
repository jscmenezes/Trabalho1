
package dominio;

import java.util.Date;

public class Apolice {
    
    private long numero;
    private Date data;
    private Date dataValidade;
    private String seguradora;
    private SituacaoApolice situacao;

    public Apolice() {
    }

    public Apolice(long numero, Date data, Date dataValidade, SituacaoApolice situacao, String seguradora) {
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

    public SituacaoApolice getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoApolice situacao) {
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
