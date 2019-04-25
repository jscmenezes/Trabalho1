
package dominio;

import java.util.*;

public class Menu {
    public static int montaMenu(){
        Scanner in = new Scanner(System.in);
        String menu = "1 - Cadastrar Veiculo";
                menu += "2 - Cadastrar Veiculo Segurado";
                menu += "3 - Cadastrar Cliente";
                menu += "4 - Listar todos os Clientes";
                menu += "5 - Listar todos os Veiculos";
                menu += "6 - Listar todos os usuários";
                menu += "";
                menu += "0 - Sair";
                
                System.out.println(menu);
                return in.nextInt();
                
    }
    
}
