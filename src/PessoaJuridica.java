public class PessoaJuridica extends Cliente{
    private String cnpj;
    private int numFuncionarios;
    private String setor;

    @Override
    public void imprimeCliente() {
        System.out.println("Cliente: " + this.getNome());
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Setor: " + this.setor +"\t|\tN° de Funcionarios: " + this.numFuncionarios);
        System.out.println("Localização: " + this.getEnd());
        System.out.println("Cliente desde " + this.getDate());
    }

    //Set
    @Override
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setNumFunc(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public void setSetor(String setor) {
        this.setor = setor;
    }
}
