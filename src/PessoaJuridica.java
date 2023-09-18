public class PessoaJuridica extends Cliente{
    String cnpj;
    int numFuncionarios;
    String setor;

    public void imprimir(){
        System.out.println("DADOS PESSOA JURIDICA");
        System.out.println("NOME: "+this.nome);
        System.out.println("ENDERECO: "+this.endereco);
        System.out.println("DATA DE CRIACAO: "+this.dataCriacao);
        System.out.println("CNPJ: "+this.cnpj);
        System.out.println("NUMERO DE FUNCIONARIOS: "+this.numFuncionarios);
        System.out.println("SETOR DE ATUACAO: "+this.setor);

    }
}
