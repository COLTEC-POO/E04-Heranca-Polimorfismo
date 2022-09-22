import java.util.Date;

public class PessoaFisica extends Cliente{
    private String cpf;
    private int idade;
    private char sexo;

    public PessoaFisica(){
        this.setNome("");
        this.setEnd("");
        this.setSexo('x');
    }

    @Override
    public void imprimeCliente(){
        System.out.println("Cliente: " + this.getNome() );
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade + "\t|\tSexo: " + this.sexo);
        System.out.println("Endereço: " + this.getEnd());
        System.out.println("Cliente desde " + this.getDate());
    }

    //Get

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    //Set
    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
