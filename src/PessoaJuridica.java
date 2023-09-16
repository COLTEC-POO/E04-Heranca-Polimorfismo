import java.util.Date;

public class PessoaJuridica extends Cliente{

    String cnpj;
    int numFuncionarios;
    String setor;

    public PessoaJuridica(String nome, String endereco, String cnpj, int numFuncionarios, String setor){

        // Atributos da superclasse
        this.nome = nome;
        this.endereco = endereco;
        data = new Date();

        // Atributos da classe
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;

    }

    public PessoaJuridica(String nome, String cnpj, int numFuncionarios, String setor){

        this.nome = nome;
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;


    }

    public PessoaJuridica( String cnpj, int numFuncionarios, String setor){

        this.cnpj = "<INVALIDO>";
        this.numFuncionarios = 0;
        this.setor = "<INVALIDO>";

    }

    public void imprimir(){
        super.imprimir();
        System.out.println("===== Pessoa Juridica =====");
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Numero de funcionarios: " + this.numFuncionarios);
        System.out.println("Setor: " + this.setor);
        System.out.println("==========================");
        System.out.println("\n");
    }
}
