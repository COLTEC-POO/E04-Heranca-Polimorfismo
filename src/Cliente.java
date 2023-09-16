import java.util.Date;

public class Cliente {

    Date data;
    String nome;
    String endereco;

    public Cliente(String nome, String endereco){

        this.nome = nome;
        this.endereco = endereco;
        data = new Date();
    }

    public Cliente() {

        this.endereco = "<INVALIDO>";
        this.nome = "<INVALIDO>";
    }

    public void imprimir() {
        System.out.println("======== Cliente ========");
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de criacao: " + this.data);
        System.out.println("=========================");

    }

}