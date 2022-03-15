package lselista2;
public class LSEComDescritor {
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
       // boolean procura;
        if(this.IsEmpty()==true){
            System.out.println("Lista Vázia!");
            this.primeiro= novo;
            this.ultimo= novo;
            this.qtd++;
            System.out.println("Inserção efetuada!");
        }else{        
            novo.setProx(this.primeiro);
            this.primeiro= novo;
            this.qtd++;     
            System.out.println("Inserção efetuada!");
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
            this.ultimo.setProx(novo);
            this.ultimo= novo;
            this.qtd++;
            System.out.println("Inserção efetuada!");
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
}
  /* private Node buscaSimples(Produto p){
        Node aux;
        if(this.qtd==0){
            return null;
        }else{
            aux= this.primeiro;
            while(aux!=null){
                if(aux.getInfo().compareTo(p)==0){
                    return aux;
                }
                aux= aux.getProx();
            }
        }
        return null;
    }
    public Produto busca(Produto p){
        Node pos;
        pos=this.buscaSimples(p);
            if(pos==null){
                return null;
        }else{
                return pos.getInfo();
            }
    }
    public boolean procura(Produto p){
        Node aux;
        if(this.qtd==0){
            return false;
        }else{
            aux= this.primeiro;
            while(aux!=null){
                if(aux.getInfo().compareTo(p)==0){
                    return true;
                }else{
                    aux= aux.getProx();  
                }
            }
            return false;
        }
    }*/
