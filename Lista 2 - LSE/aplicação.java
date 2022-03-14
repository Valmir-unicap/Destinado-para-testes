package atividade2;
import java.util.Scanner;
/*
 * @author valmir
 */
public class Atividade2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int escolha;
        do{
            menu();
            System.out.print("Escolha um opção acima: ");
            escolha= in.nextInt();
            //colocar aqui
            switch (escolha){
                case 1: 
                    break;
                    
                case 2:
                    break;
                    
                case 3:
                    break;
                    
                case 4:
                    break;
                    
                case 5:
                    break;
                    
                case 6:
                    break;
                    
                case 7:
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
    System.out.println("1 - Inserir um novo aluno no início da lista um novo aluno"); //feito em aula
    System.out.println("2 - Remover o primeiro aluno da lista");
    System.out.println("3 - Inserir um novo aluno no final da lista");
    System.out.println("4 - Remover último aluno da lista");
    System.out.println("5 - Exibir todos alunos da lista");//feito em aula
    System.out.println("6- Exibir os dados de um produto da lista");
    System.out.println("7- Alterar os dados de um produto da lista");
    System.out.println("0 - Sair do programa");
}
}
