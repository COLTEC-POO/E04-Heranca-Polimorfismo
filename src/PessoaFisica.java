import java.util.Scanner;
public class PessoaFisica  extends Cliente{

    public String CPF;
    public int Idade;
    public char Sexo;

    public String getCPF(){
        return this.CPF;
    }
    public int getidade(){
        return this.Idade;
    }
    public char getSexo(){
        return this.Sexo;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public void setIdade(int Idade){
        this.Idade = Idade;
    }
    public void setSexo(char Sexo){
        this.Sexo = Sexo;
    }

    PessoaFisica(){
        super();

        Scanner entrada = new Scanner(System.in);

        System.out.println("CPF: ");
        this.setCPF(entrada.nextLine());

        System.out.println("Idade: ");
        this.setIdade(entrada.nextInt());

        System.out.println("Sexo: ");
        this.setSexo(entrada.next().charAt(Sexo));

        entrada.close();

    }

    public void imprimirDados(){
        System.out.println("Nome " + this.getNome());
        System.out.println(" CPF: " + this.CPF);
        System.out.println("Endereço " + this.getEndereco());
        System.out.println("Idade: " + this.Idade + " Sexo: " + this.Sexo);
        System.out.println(" Sexo: " + this.Sexo);
        System.out.println("Data da Abertura da Conta: " + this.getData());
    }
    
}
