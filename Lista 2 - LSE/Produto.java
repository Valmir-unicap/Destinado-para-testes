package lista2lse;
    public class Produto implements Comparable <Produto>{//compara se tem iguala
    private String codigo;
    private String descricao;
    private double preco;
    private int estoque;

    public Produto (String codigo, String descricao, double preco, int estoque){//construtor
        this.codigo= codigo;
        this.descricao= descricao;
        this.preco= preco;
        this.estoque= estoque;
    }
        public Produto (String codigo){ //construtor
        this.codigo= codigo;
    }
    public void setCodigo(String codigo){
        this.codigo= codigo;
    } 
    public String getCodigo (){
        return this.codigo;
    }
    public void setDescricao(String descricao){
        this.descricao= descricao;
    }
    public String getdescriacao(){
        return this.descricao;
    }
    public void setPreco(double preco){
        this.preco= preco;
    }
    public double getPreco(){
        return this.preco;
    }
    public void setEstoque(int estoque){
        this.estoque= estoque;
    }
    public int getEstoque(){
        return this.estoque;
    }
    @Override
    public int compareTo(Produto p) {
        return this.codigo.compareTo(this.codigo);
    }
    public String toString(){
        return "O Codigo: "+this.codigo+ ", descrição: "+this.descricao+ ", do preço: "+this.preco+ ", possui no estoque: "+this.estoque+" unidades";
    }
    public boolean equals(Produto p){
        if(this.codigo.equals(p.codigo)==true){
            return true;
        }else{
            return false;
        }
    }
}
