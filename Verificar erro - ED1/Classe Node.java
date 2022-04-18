package listaduplamenteencadeada ;
public class Node  {
    private Node ant;
    private Cliente info;
    private Node prox;
    
    public Node(Cliente c){
        this.info=c;
    }
    public void setAnt(Node novoAnt){
        this.ant=novoAnt;
    }
    public void setProx(Node novoProx){
        this.prox=novoProx;
    }
    public void setInfo(Cliente c){
        this.info=c;
    }
    public Node getAnt(){
        return this.ant;
    }
    public Node getProx(){
        return this.prox;
    }
    public Cliente getInfo(){
        return this.info;
    }
}
