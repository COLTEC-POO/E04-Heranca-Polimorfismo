import java.util.Date;

public class PessoaJuridica extends Cliente {

    protected String cnpj;
    protected int numFuncionarios;
    protected String setor;

<<<<<<< HEAD
    public PessoaJuridica(String nome, String endereco, String cnpj, int numFuncionarios, String setor) {
        super(nome, endereco);
=======
    public PessoaJuridica() {
>>>>>>> origin/main
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    // Reimplementacao do metodo para imprimir os dados da PJ
    void imprimir(){
<<<<<<< HEAD
        System.out.println("=============== Pessoa Jurídica ================");
=======
        System.out.println("_______________________________________________");
>>>>>>> origin/main
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereco: " + this.getEndereco());
        System.out.println("CNPJ: " + this.getCnpj());
        System.out.println("Num de Funcionarios: " + this.getNumFuncionarios());
        System.out.println("Setor: " + this.getSetor());
    }

}
