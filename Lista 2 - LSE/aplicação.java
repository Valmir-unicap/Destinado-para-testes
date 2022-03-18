package lista2lse;
import java.util.Scanner;
public class Lista2LSE {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        LSEComDescritor lista2= new LSEComDescritor();
        int escolha;
        String codigo, descricao;
        double preco;
        int estoque;
        Produto p;
        do{
            menu();
            System.out.print("Escolha um opção acima: ");
            escolha= in.nextInt();
            switch (escolha){
                case 1: 
                    in.nextLine();
                    System.out.print("Digite o código do produto: ");
                    codigo= in.nextLine();
                    System.out.print("Digite a descricao do produto: ");
                    descricao= in.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    preco= in.nextDouble();
                    System.out.print("Digite a quantidade presente no estoque: ");
                    estoque= in.nextInt();
                    p= new Produto(codigo,descricao,preco,estoque);
                    lista2.InserirInicio(p);
                    break;
                    
                case 2://remoção no fim da lista
                    lista2.RemoverInicio();
                    break;
                    
                case 3:
                    in.nextLine();
                    System.out.print("Digite o código do produto: ");
                    codigo= in.nextLine();
                    System.out.print("Digite a descricao do produto: ");
                    descricao= in.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    preco= in.nextDouble();
                    System.out.print("Digite a quantidade presente no estoque: ");
                    estoque= in.nextInt();
                    p= new Produto(codigo,descricao,preco,estoque);
                    lista2.InserirFinal(p);
                    break;
                    
                case 4://remoção no fim da lista
                    lista2.RemoverFinal();
                    break;
                    
                case 5://exibir tudo
                    lista2.exibirTudo();
                    break;
                    
                case 6://exibir dados de um único produto
                    in.nextLine();
                    System.out.print("Digite o codigo do Produto: ");
                    codigo= in.nextLine();
                    lista2.exibirProduto(codigo);
                    break;
                    
                case 7://deve fazer uma busca com o codigo, pra assim poder alterar
                    in.nextLine();
                    System.out.print("Digite o codigo do produto: ");
                    codigo= in.nextLine();
                    lista2.alterarInfo(codigo);
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
        System.out.println("Menu de opções");
        System.out.println("1 - Inserir um novo produto no início da lista"); //feito em aula
        System.out.println("2 - Remover o primeiro produto da lista");
        System.out.println("3 - Inserir um novo produto no final da lista");
        System.out.println("4 - Remover último produto da lista");
        System.out.println("5 - Exibir todos produto da lista");//feito em aula
        System.out.println("6 - Exibir os dados de um produto da lista");
        System.out.println("7 - Alterar os dados de um produto da lista");
        System.out.println("0 - Sair do programa!");
        }

    } 
