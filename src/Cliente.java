import java.util.Date;

public class Cliente {
    String nome;
    String cpf;
    String endereco;
    int idade;
    char sexo;


    void imprimir() {
        System.out.println("Cliente Invalido");
    }

    public Cliente(String nome, String cpf, String endereco, int idade, char sexo) {
        this.nome = nome;
        this.cpf = cpf;

        this.endereco = endereco;
        this.idade = idade;
        this.sexo = sexo;

    }
}