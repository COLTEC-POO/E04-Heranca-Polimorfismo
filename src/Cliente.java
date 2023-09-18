import java.util.Date;
public class Cliente {
    private String endereco;
    private String nome;
    private Date data;

    public Cliente(String endereco, String nome) {
        this.endereco = endereco;
        this.nome = nome;
    }

    public Cliente() {
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    void imprimir(){
        System.out.println("Cliente Invalido");
    }


}
