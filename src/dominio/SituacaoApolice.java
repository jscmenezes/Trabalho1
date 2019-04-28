
package dominio;

public enum SituacaoApolice {
    
    NEGOCIACAO("Em negociacao", 1), 
    CANCELADA("Cancelada", 2), 
    QUITADA("Quitado", 3),
    PARCELADA("Parcelada", 4);
    
    private final String nome;
    private final int valor;
    
    SituacaoApolice(String n, int v){
        nome = n;
        valor = v;
    }
    
    public String getNome(){
        return nome;
    }

    public int getValor() {
        return valor;
    }
    
    @Override
    public String toString() {
        return "SituacaoApolice{valor=" + valor + ", nome=" + nome + '}';
    }
    
    
    
}
