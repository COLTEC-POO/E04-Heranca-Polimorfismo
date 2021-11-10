public class PessoaJuridica extends Cliente{
    String cnpj;
    int numFuncionarios;
    String setor;

    void imprimir() {
        System.out.println("Nome fantasia: " + this.nome);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Numero de funcionarios; " + this.numFuncionarios);
        System.out.println("Setor: " + this.setor);

    }
}
