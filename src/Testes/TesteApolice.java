
package Testes;

import dominio.Apolice;
import dominio.SituacaoApolice;
import java.util.*;

public class TesteApolice {
    public static void main(String args[]){
        
        Date date1 = new Date();
        SituacaoApolice situacao1 = SituacaoApolice.NEGOCIACAO;
        Apolice a1 = new Apolice(1, date1, date1, situacao1, "Porto Alegre Seguros");
        
        System.out.println(a1.toString());
        
    }
    
}
