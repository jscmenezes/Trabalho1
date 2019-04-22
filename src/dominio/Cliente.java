
package dominio;

import java.util.*;

public class Cliente extends Pessoa {
    
    private String endereco;
    private String telefone;
    
    List<VeiculoSegurado> veiculosSegurados = new ArrayList<>();
    
}
