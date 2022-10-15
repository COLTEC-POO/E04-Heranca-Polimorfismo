public class PessoaFisica extends Cliente {
    
    String cpf;
    int idade;
    char sexo;

    public void imprimirDadosCliente(){
      System.out.println("....CPF:  " + cpf);
      System.out.println("....IDADE:  " + idade);
      System.out.println("....SEXO:  " + sexo);

    }

    public PessoaFisica(String nome, String endereco, int idade, String cpf, char sexo){
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
    }
}
