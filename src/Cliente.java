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

    public static class PessoaFisica extends Cliente {

        public PessoaFisica(String cpf, char sexo, int idade) {
            super("x", cpf, "X", idade, sexo);

        }
        @Override
        void imprimir() {
            System.out.println("CPF: " + cpf);
            System.out.println("Idade: " + idade);
            System.out.println("Sexo: " + sexo);
        }
    }

    public static class PessoaJuridica extends Cliente {

    }
}