import java.util.Date;

public class Cliente {
    private String endereco;
    private String nome;
    private Date data;

        // Método construtor da classe Cliente

        Cliente (String endereco, String nome) {
            setEndereco(endereco);
            setNome(nome);
            setData();
    }

    // Getters e Setters

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco (String endereco){
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setData (){
        this.data = new Date();
    }

    public Date getData(){
        return data;
    }

    void imprimir() {
        System.out.println("Cliente inválido!");
    }

}