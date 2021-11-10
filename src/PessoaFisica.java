public class PessoaFisica extends Cliente{
    String CPF;
    int idade;
    char sexo;

    void imprimir() {
        System.out.println("Dono da conta: " + this.nome);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Enedereço: " + this.endereco);
    }
}
