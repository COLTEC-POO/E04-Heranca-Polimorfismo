import java.util.Date;

public class Cliente {

    
    public String nome; 
    public String endereco;
    public Date data;

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {  
        return this.endereco;
    }
    
    public Date getData() {
        return this.data;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }    

    public void setData(Date data){
        this.data = data;
    }

    public void imprimirDadosCliente() {
        System.out.println("....Nome:  " + nome);
        System.out.println("....Endereco:  " + endereco);
    }
}
