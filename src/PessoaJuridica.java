
public class PessoaJuridica extends Cliente{

    String cnpj;
    int numFuncionarios;
    String setor;
    
    public void imprimirDadosCliente(){
        System.out.println("....CNPJ:  " + cnpj);
        System.out.println("....NUMERO DE FUNCIONARIOS:  " + numFuncionarios);
        System.out.println("....SETOR:  " + setor);

    }

    public PessoaJuridica(String nome, String endereco, int numFuncionarios, String cnpj, String setor){
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
    }
}
