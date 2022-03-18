package lista2lse;
import java.util.Scanner;
public class LSEComDescritor {
    Scanner in= new Scanner(System.in);
    private Node primeiro;
    private Node ultimo;
    private int qtd;
    
    public boolean IsEmpty(){
        if(this.primeiro==null && this.ultimo==null && this.qtd==0){
            return true;
        }else{
            return false;
        }
    }
    public void InserirInicio(Produto p){
        Node novo= new Node(p);
        Node aux;     
        if(this.IsEmpty()==true){
            System.out.println("Lista Vázia!");
            this.primeiro= novo;
            this.ultimo= novo;
            this.qtd++;
            System.out.println("Inserção efetuada!");
        }else{     
            aux= this.busca(p.getCodigo());
            if(aux==null){
                novo.setProx(this.primeiro);
                this.primeiro= novo;
                this.qtd++;     
                System.out.println("Inserção efetuada!");
                }else{
                    System.out.println("Valor repetido! Inserção não efetuada!");
            }
        }
    }
    public void InserirFinal(Produto p){//falta fazer comparação
        Node novo= new Node(p);
        Node aux;
        if(this.IsEmpty()==true){
           System.out.println("Lista Vázia!");
            this.primeiro= novo;
            this.ultimo= novo;
            this.qtd++;
            System.out.println("Inserção efetuada!");
        }else{
            aux= this.busca(p.getCodigo());//
            if(aux==null){//não tem repetido
                this.ultimo.setProx(novo);
                this.ultimo= novo;
                this.qtd++;
                System.out.println("Inserção efetuada!");
            }else{
                System.out.println("Valor repetido! Inserção não efetuada!");
            }
        }
    }   
    public void exibirTudo(){
        Node aux;
        if(this.IsEmpty()==true){
            System.out.println("Lista Vázia!");
        }else{
           aux= this.primeiro;
           while(aux!=null){
               System.out.println(aux.getInfo());
               aux= aux.getProx();
           }
        }
    }
    public void RemoverInicio(){
        if(this.IsEmpty()==true){
            System.out.println("Lista Vázia!");
        }else if(this.qtd==1){
            this.primeiro=null;
            this.ultimo=null;
            this.qtd--;
            System.out.println("Remoção efetuada! ");
        }else{
           this.primeiro= this.primeiro.getProx();
        }
    }
    public void RemoverFinal(){
        Node aux;
        if(this.IsEmpty()==true){
        System.out.println("Lista Vázia!");
            }else if(this.qtd==1){
                this.primeiro=null;
                this.ultimo=null;
                this.qtd--;
                System.out.println("Remoção efetuada! ");
            }else{
                aux= this.primeiro;
                while(aux.getProx()!=this.ultimo){
                    aux= aux.getProx();
                }
            this.ultimo=aux;
            this.ultimo.setProx(null);
            this.qtd--;
            System.out.println("Remoção efetuada! ");
        }
    }
    private Node busca(String codigo){
        Node aux;
        if(this.IsEmpty()==true){
            return null;
        }else{
           Produto procura= new Produto(codigo);
           aux= this.primeiro;
           while(aux!=null){
               if(aux.getInfo().equals(procura)==true){
                   return aux;//retorna endereço do nó
               }else{
                   aux= aux.getProx(); //continua procurando se tem repetido
               }
           } 
        }
        return null;//lista vazia ou se não encontrar repetido
    }
    public void alterarInfo(String codigo){
        Node aux;
        aux= this.busca(codigo);
        String descricao;
        double preco;
        int estoque;
        Produto p;//variavel de referencia
        if(aux==null){
            System.out.println("Produto não existe!");
        }else{
            p= aux.getInfo();
            System.out.println("Produto encontrado!");
            System.out.print("Digite o novo preço do produto: ");
            preco= in.nextDouble();
            p.setPreco(preco);
            System.out.print("Digite a novo quantidade presente no estoque: ");
            estoque= in.nextInt();
            p.setEstoque(estoque);
            System.out.println("Alteração realizada com sucesso!");
        }
    }
    public void exibirProduto(String codigo){
        Node aux;
        aux= this.busca(codigo);
        Produto p;
        if(aux==null){
            System.out.println("Produto não existe!");
        }else{
            p= aux.getInfo();
            System.out.println(p);
        }
    }
}
