import java.util.Date;

public class PessoaFisica extends Cliente {

    String cpf;
    int idade;
    char sexo;

    public PessoaFisica(String nome, String endereco, String cpf, int idade, char sexo){


        // Atributos da superclasse
        this.nome = nome;
        this.endereco = endereco;
        data = new Date();

        // Atributos da classe
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;

    }

    public PessoaFisica(String nome, String cpf, int idade, char sexo){

        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

    public PessoaFisica(String cpf, int idade, char sexo){

        this.cpf = "<INVALIDO>";
        this.idade = 0;
        this.sexo = 0;
    }

    public void imprimir(){

        super.imprimir();
        System.out.println("===== Pessoa Juridica =====");
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("==========================");
        System.out.println("\n");
    }


}
