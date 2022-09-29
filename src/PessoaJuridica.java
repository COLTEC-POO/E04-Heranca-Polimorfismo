public class PessoaJuridica extends Cliente {

    private String cnpj;
    private int nFuncionarios;
    private String setor;

    public PessoaJuridica(String nome, String endereco, String cnpj, int nFuncionarios, String setor) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.nFuncionarios = nFuncionarios;
        this.setor = setor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getnFuncionarios() {
        return nFuncionarios;
    }

    public void setnFuncionarios(int nFuncionarios) {
        this.nFuncionarios = nFuncionarios;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void imprimir(){
        System.out.println("Nome:"+ this.getNome());
        System.out.println("CNPJ:"+ this.getCnpj());
        System.out.println("Setor:"+ this.getSetor());
        System.out.println("Endereco:" + this.getEndereco());
        System.out.println("Número de funcionários:"+ this.getnFuncionarios() +"\n\n");
    }
}
