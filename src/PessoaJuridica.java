public class PessoaJuridica extends Cliente{

    String cnpj;
    int numFuncionarios;
    String setor;

    void imprimirJuridica() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Setor: " + this.setor);
        System.out.println("Quantidade de Funcionarios; " + this.numFuncionarios);
    }
}
