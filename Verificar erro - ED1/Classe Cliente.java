package listaduplamenteencadeada;
/*
 * @author valmir
 */
public class Cliente implements Comparable <Cliente>{

    private String cpf;
    private String nome;
    private String fone;
    private String email;
    
    public Cliente(String cpf){
        this.cpf=cpf;
    }

    public Cliente(String cpf, String nome, String fone, String email){//permite repetidos
        this.cpf=cpf;
        this.nome=nome;
        this.email=email;
        this.fone=fone;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setFone(String fone){
        this.fone=fone;
    }
    public String getFone(){
        return this.fone;
    }
    public void setEmail(){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }
    @Override
    public String toString(){
        return "cpf: "+this.cpf+ ", do nome: "+this.nome+", do telefone:"+this.fone+", do email: "+this.email;
    }
    @Override
    public int compareTo (Cliente c) {
        int retorno;
        retorno = this.cpf.compareTo(c.cpf);
        return retorno;        
    }
}
