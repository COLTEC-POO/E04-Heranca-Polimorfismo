import java.util.Scanner;

public class PessoaJuridica extends Cliente{
    String CNPJ;
    String Setor;
    Integer numFuncionarios;

    //------------------------------------------ Metodo Construtor -----------------------------------------------//

    PessoaJuridica(){
        super();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu CNPJ: ");
        this.setCNPJ(entrada.nextLine());

        System.out.println("Informe seu setor: ");
        this.setSetor(entrada.nextLine());

        receberNumFuncionariosValidada();
    }
    //---------------------------------------- Fim Metodo Construtor ---------------------------------------------//

    //--------------------------------------------- Metodos Get --------------------------------------------------//

    public String getCNPJ() {
        return CNPJ;
    }

    public String getSetor() {
        return Setor;
    }

    public Integer getNumFuncionarios() {
        return numFuncionarios;
    }

    //-------------------------------------------- Fim Metodos Get -----------------------------------------------//


    //--------------------------------------------- Metodos Set --------------------------------------------------//

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void setSetor(String setor) {
        Setor = setor;
    }

    public void setNumFuncionarios(Integer numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    //-------------------------------------------- Fim Metodos Set -----------------------------------------------//


    //------------------------------------ Metodos Receber Dados Validos -----------------------------------------//

    public void receberNumFuncionariosValidada(){
        Scanner entrada = new Scanner(System.in);
        boolean ERRO;

        do {
            System.out.println("Informe o numero de funcionarios: ");
            this.setNumFuncionarios(entrada.nextInt());
            ERRO = (this.getNumFuncionarios() < 0);
            if(ERRO) System.out.println("Numero De Funcionarios Invalido");
            entrada.nextLine();
        }while (ERRO);
    }

    //---------------------------------- Fim Metodos Receber Dados Validos ---------------------------------------//

    //-------------------------------------------- Metodos Impressao ---------------------------------------------//

    public void imprimir(){
        System.out.println("CNPJ: " + this.getCNPJ());
        System.out.println("ENDERECO: " + this.getEndereco());
        System.out.println("CLIENTE DESDE: " + this.getData());
    }

    //-------------------------------------------- Metodos Impressao ---------------------------------------------//
}
