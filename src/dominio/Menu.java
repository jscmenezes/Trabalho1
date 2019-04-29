
package dominio;

import java.util.*;

public class Menu {
    public static int montaMenu(){
        Scanner in = new Scanner(System.in);
        String menu = "\n\nMenu Jeron Soft\n";
                menu += "1 - Cadastrar Usuario\n";
                menu += "2 - Cadastrar Veiculo Segurado\n";
                menu += "3 - Cadastrar Cliente\n";
                menu += "4 - Listar todos os Clientes\n";
                menu += "5 - Listar todos os Veiculos\n";
                menu += "6 - Listar todos os usuários\n";
                menu += "\n";
                menu += "0 - Sair\n";
                
                System.out.println(menu);
                return in.nextInt();
                
    }
    
}
