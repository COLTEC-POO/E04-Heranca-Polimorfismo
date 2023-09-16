public class PessoaFisica extends Cliente {

    private String CPF;
    private int idade;
    private char sexo;

    public PessoaFisica (String endereco, String nome, String CPF, int idade, char sexo) {
        super(endereco, nome);
        setCPF(CPF);
        setIdade(idade);
        setSexo(sexo);
    }

    // Getters e Setters

    public String getCPF (){
        return CPF;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public char getSexo(){
        return sexo;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    @Override
    void imprimir(){
        System.out.println("Dados do cliente:");
        System.out.println("Data de criação da conta: " + getData());
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("CPF: " + getCPF());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
    }

}
