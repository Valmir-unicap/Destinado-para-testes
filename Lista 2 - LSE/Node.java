package lista2lse;
public class Node {
    private Produto info;
    private Node prox;
    
    public Node(Produto p){
        this.info= p;
    }
    public void setInfo(Produto p){
        this.info= p;
    }
    public Produto getInfo(){
        return this.info;
    }
   public void setProx(Node novoProx){
        this.prox= novoProx;
    }
    public Node getProx(){
        return this.prox;
    }
}
