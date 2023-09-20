import java.util.Date;

public class PessoaFisica extends Cliente {
<<<<<<< HEAD
    protected String cpf;
    protected int idade;
    protected char sexo;
    protected Date data;


     PessoaFisica(String nome, String endereco, String cpf, int idade, char sexo) {
        super(nome,endereco);
=======

    protected String cpf;
    protected int idade;
    protected char sexo;

    public PessoaFisica() {
>>>>>>> origin/main
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

<<<<<<< HEAD

=======
>>>>>>> origin/main
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
<<<<<<< HEAD
    public Date getData() {
        return data;
    }

    @Override
    public void setData(Date data) {
        this.data = data;
    }

    // Reimplementacao do metodo para imprimir os dados da PF
    void imprimir(){
        System.out.println("================ Pessoa Física =================");
=======

    // Reimplementacao do metodo para imprimir os dados da PF
    void imprimir(){
        System.out.println("_______________________________________________");
>>>>>>> origin/main
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereco: " + this.getEndereco());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
<<<<<<< HEAD
//      System.out.println("Data de criacao: " + this.getData());
=======
>>>>>>> origin/main
    }



}
