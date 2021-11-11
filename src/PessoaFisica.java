public class PessoaFisica extends Cliente{

    String cpf;
    int idade;
    char sexo;

    void imprimirFisica() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Idade: " + this.idade);
        System.out.println("Endereço: " + this.endereco);
    }
}

