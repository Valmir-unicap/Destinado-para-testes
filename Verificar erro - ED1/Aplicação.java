package listaduplamenteencadeada;
import java.util.Scanner;
public class ListaDuplamenteEncadeada {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        LDE listaClientes= new LDE();
        //LDE listaClientes2= new LDE();
        Cliente c;
        String cpf, nome, fone, email;
        int escolha;
        do{
            menu();
            escolha= in.nextInt();
            switch(escolha){
                case 1:
                    System.out.println("Lista A");
                    in.nextLine();
                    System.out.print("Digite o cpf: ");
                    cpf= in.nextLine();
                    System.out.print("Digite o nome: ");
                    nome= in.nextLine();
                    System.out.print("Digite o telefone: ");
                    fone= in.nextLine();
                    System.out.print("Digite o email: ");
                    email= in.nextLine();
                    c= new Cliente(cpf,nome,fone,email);
                    listaClientes.inserirOrdenado(c);
                    break;
                case 2:
                    System.out.println("Lista A");
                    listaClientes.exibirLista();
                    break;
                case 3:
                   System.out.println("Lista A");
                   in.nextLine();
                   System.out.print("Digite o cpf que deseja remover: ");
                   cpf= in.nextLine();
                   c= new Cliente(cpf);
                    listaClientes.RemoverOrdenado(c);
                    break;
                case 4:
                    System.out.println("Lista C");
                    in.nextLine();
                    System.out.print("Digite o cpf: ");
                    cpf= in.nextLine();
                    System.out.print("Digite o nome: ");
                    nome= in.nextLine();
                    System.out.print("Digite o telefone: ");
                    fone= in.nextLine();
                    System.out.print("Digite o email: ");
                    email= in.nextLine();
                    c= new Cliente(cpf,nome,fone,email);
                    listaClientes.inserirOrdenado(c);
                    listaClientes.intersecao(listaClientes);
                    break;
                case 5:
                    System.out.println("Lista B");
                    listaClientes.copia();
                    break;
                case 6:
                    System.out.println("Lista B");
                    listaClientes.exibirLista();
                    break;
                case 0:
                    System.out.println("Fim do programa! @Developer Valmir Jr");
                    break;
                default: 
                    System.out.println("Opção inválida!");
                    break;
            }    
        }while(escolha!=0);
    }
    
    public static void menu(){
        System.out.println("Menu");
        System.out.println("1- Inserir cliente na lsita");
        System.out.println("2- Exibir clientes cadastrados");
        System.out.println("3- Remover cliente da lista");
        System.out.println("4- Interseção");
        System.out.println("5- Copia da lista");
        System.out.println("6- exibir copia da lista");
        System.out.println("0- Sair do programa");
        System.out.print("Escolha: ");
    }
}
