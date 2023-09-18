import java.util.Date;

public class PessoaJuridica extends Cliente{

    String cnpj;
    int numFuncionarios;
    String setor;

    public PessoaJuridica(String nome, String endereco, String cnpj, int numFuncionarios, String setor){

        this.nome = nome;
        this.endereco = endereco;
        data = new Date();

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

        this.cnpj = "null";
        this.numFuncionarios = 0;
        this.setor = "null";

    }

    public void imprimir(){
        super.imprimir();
        System.out.println("cnpj: " + this.cnpj);
        System.out.println("numero de funcionarios: " + this.numFuncionarios);
        System.out.println("setor: " + this.setor);
        System.out.println("\n");
    }
}
