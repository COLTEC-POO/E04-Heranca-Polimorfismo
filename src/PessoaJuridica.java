public class PessoaJuridica extends Cliente{

    String cnpj;
    int numFuncionarios;
    String setor;

    // construtor

    public PessoaJuridica() {
        this.cnpj = "00.000.000/0001-00";
        this.numFuncionarios = 0;
        this.setor = "Inválido";
    }

    // impressão dados pessoa jurídica

    public void imprimirPJ(){

        System.out.println("Nome: " + this.nome);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Número de funcionários: " + this.numFuncionarios);
        System.out.println("Setor: " + this.setor);
        System.out.println("Data criação do cliente: " + this.data);

    }
}