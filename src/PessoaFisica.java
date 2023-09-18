public class PessoaFisica extends Cliente{
    String cpf;
    int idade;
    char sexo;
    public void imprimir(){
        System.out.println("DADOS PESSOA FISICA");
        System.out.println("NOME: "+this.nome);
        System.out.println("ENDERECO: "+this.endereco);
        System.out.println("DATA DE CRIACAO: "+this.dataCriacao);
        System.out.println("CPF: "+this.cpf);
        System.out.println("IDADE: "+this.idade);
        System.out.println("SEXO: "+this.sexo);
    }
}
