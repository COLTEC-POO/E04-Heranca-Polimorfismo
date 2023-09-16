public class PessoaJuridica extends Cliente {

    private String CNPJ;
    private int numFuncionarios;
    private String setor;

    public PessoaJuridica(String endereco, String nome, String CNPJ, int numFuncionarios, String setor) {
        super(endereco, nome);
        setCNPJ(CNPJ);
        setNumFuncionarios(numFuncionarios);
        setSetor(setor);
    }

    // Getters e Setters

    public String getCNPJ (){
        return CNPJ;
    }

    public void setCNPJ (String CNPJ){
        this.CNPJ = CNPJ;
    }

    public int getNumFuncionarios(){
        return numFuncionarios;
    }

    public void setNumFuncionarios (int numFuncionarios){
        this.numFuncionarios = numFuncionarios;
    }

    public String getSetor(){
        return setor;
    }

    public void setSetor (String setor){
        this.setor = setor;
    }

    @Override
    void imprimir(){
        System.out.println("Dados do cliente:");
        System.out.println("Data de criação da conta: " + getData());
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("CNPJ: " + getCNPJ());
        System.out.println("Quantidade de funcionários: " + getNumFuncionarios());
        System.out.println("Setor de atuação: " + getSetor());
    }
    
}
