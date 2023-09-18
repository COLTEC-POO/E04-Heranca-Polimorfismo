import java.util.Date;

public class PessoaFisica extends Cliente {

    String cpf;
    int idade;
    char sexo;

    public PessoaFisica(String nome, String endereco, String cpf, int idade, char sexo){

        this.nome = nome;
        this.endereco = endereco;
        data = new Date();

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

        this.cpf = "null";
        this.idade = 0;
        this.sexo = 0;
    }

    public void imprimir(){

        super.imprimir();
        System.out.println("pessoa juridica");
        System.out.println("cpf: " + this.cpf);
        System.out.println("idade: " + this.idade);
        System.out.println("sexo: " + this.sexo);
        System.out.println("\n");
    }


}