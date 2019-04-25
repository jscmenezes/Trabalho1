
package dominio;

public enum SituacaoApolice {
    
    NEGOCIACAO(1), CANCELADA(2), QUITADA(3), PARCELADA(4);
    
    private final int valor;
    
    SituacaoApolice(int valorOpcao){
        valor = valorOpcao;
    }
    
    public int getValor(){
        return valor;
    }
    
    
}
