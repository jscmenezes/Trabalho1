
package trabalho1;

import java.util.*;
import dominio.*;

public class Trabalho1 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        List<Usuario> usuarios = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        List<VeiculoSegurado> veiculos = new ArrayList<>();
        
        while (true){
            
            int opcao = Menu.montaMenu();
            
            switch(opcao){
                
                case 1:
                    System.out.println("---------------- \n Cadastrando novo USUARIO \n");
                    System.out.println("Nome: ");
                    String nome = in.nextLine();
                    System.out.println("Data de Nascimento:");
                    System.out.println("Dia(2): ");
                    int dia = in.nextInt();
                    System.out.println("Mes(2): ");
                    int mes = in.nextInt();
                    System.out.println("Ano(2):");
                    int ano = in.nextInt();
                    in.nextLine();
                    System.out.println("Identificador: ");
                    String identificador = in.nextLine();
                    System.out.println("Senha: ");
                    String senha = in.nextLine();
                    Date anonasc = new Date(ano, mes, dia);
                    usuarios.add(new Usuario(identificador,senha, nome, anonasc));
                    System.out.println("------------------------");
                    break;
                    
                case 2:
                    // Cadastrar Veiculo Segurado
                    System.out.println("\n\n-----------------------------");
                    System.out.println("Cadastrar VEICULO Segurado\n");
                    
                
                case 3:
                    // Cadastrar Cliente
                    System.out.println("---------------- \n Cadastrando novo CLIENTE \n");
                    System.out.println("Nome: ");
                    nome = in.nextLine();
                    System.out.println("Data de Nascimento:");
                    System.out.println("Dia(2): ");
                    dia = in.nextInt();
                    System.out.println("Mes(2): ");
                    mes = in.nextInt();
                    System.out.println("Ano(2):");
                    ano = in.nextInt();
                    in.nextLine();
                    System.out.println("Endereco: ");
                    String endereco = in.nextLine();
                    System.out.println("Telefone: ");
                    String telefone = in.nextLine();
                    clientes.add(new Cliente(endereco, telefone, nome, new Date(ano, mes, dia)));
                    System.out.println("--------------------------------");
                    break;
                    
                case 4:
                    // Listar Clientes
                    System.out.println("\n\n -------------------- \n");
                    System.out.println("Listando CLIENTES\n");
                    for(Cliente cliente: clientes){
                        System.out.println(cliente.toString());
                    }
                    break;
                    
                case 6:
                    System.out.println("\n\n\n--------- \nListando USUARIOS\n");
                    for(Usuario usuario: usuarios){
                        System.out.println(usuario);
                    }
                    break;
                
                case 0:
                    System.exit(0);
            }
            
        }
        
    }
    
}
