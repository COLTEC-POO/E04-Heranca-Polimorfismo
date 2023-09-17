import java.util.Date;

public class Cliente {
    String endereco;
    String nome;
     Date data;

//  Constructor do Cliente
    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.data = new Date();
    }

    void imprimir() {
        System.out.println("Cliente Invalido");
    }

    public static class PessoaFisica extends Cliente {

        public String cpf;
        public int idade;
        public char sexo;

//      Constructo da Pessoa Fisica
        public PessoaFisica(String nome, String endereco, String cpf, int idade, char sexo) {
            // Pegando nome e endereco da SuperClasse, sendo Cliente
            super(nome, endereco);

            this.cpf = cpf;
            this.idade = idade;
            this.sexo = sexo;
        }
        @Override
        void imprimir() {
            // Imprimindo dados pegos da SuperClasse
            System.out.println("Nome: " + super.nome);
            System.out.println("Endereco: " + super.endereco);
            System.out.println("Data de Criacao: " + super.data);

            // Imprimindo dados da propria SubClasse
            System.out.println("CPF: " + cpf);
            System.out.println("Idade: " + idade);
            System.out.println("Sexo: " + sexo);
        }
    }

    public static class PessoaJuridica extends Cliente {
        public  String cnpj;
        public String setor;

        public int numFunc;

        // Constructor de pessoa Juridica
        public PessoaJuridica(String nome, String endereco, String setor,String cnpj, int numFunc) {
            // Pegando dados da superClasse
            super(nome, endereco);

            // Constructor normalmente do restante dos dados
            this.cnpj = cnpj;
            this.numFunc = numFunc;
            this.setor = setor;
        }
        // Sobrescrevendo a funcao de imprimir para amplia-la
        @Override
        void imprimir() {
            // Imprimindo dados pegos da SuperClasse
            System.out.println("Nome: " + super.nome);
            System.out.println("Endereco: " + super.endereco);
            System.out.println("Data de Criacao: " + super.data);


            // Imprimindo dados da propria SubClasse
            System.out.println("CNPJ: " + cnpj);
            System.out.println("Numero de Funcionarios: " + numFunc);
            System.out.println("Setor: " + setor);
        }
    }
}