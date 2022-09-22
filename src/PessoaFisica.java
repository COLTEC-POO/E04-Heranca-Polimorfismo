import java.util.Date;

public class PessoaFisica extends Cliente{

    private String cpf;
    private int idade;
    private char sexo;

    public PessoaFisica(String nome, String endereco, String cpf, int idade, char sexo) {

        setNome(nome);
        setEndereco(endereco);
        this.cpf = cpf;
        this.sexo = sexo;
        this.idade = idade;
        setData(new Date());

    }
    public String getcpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void imprimirDadosCliente() {
        System.out.println(">> Dados pessoa fisica ");
        System.out.println("\nNome: " + this.getNome() +
                           "\nEndereco: " + this.getEndereco() +
                           "\nCPF: " + this.getcpf() +
                           "\nIdade: " + this.getIdade() +
                           "\nSexo: " + this.getSexo() +
                           "\nData: " + this.getData());
    }
}
