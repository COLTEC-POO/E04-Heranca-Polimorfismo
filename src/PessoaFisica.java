public class PessoaFisica extends Cliente {

    String cpf;
    int idade;
    char sexo;

    // construtor

    public PessoaFisica() {
        this.cpf = "000.000.000-00";
        this.idade = 0;
        this.sexo = 'm';
    }

    // impressão dados pessoa física

    public void imprimirPF(){

        System.out.println("Nome: " + this.nome);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Data criação do cliente: " + this.data);

    }
}