public class MainFuncionarios {

    public static void main(String[] args) {

        Funcionario atendente = new Funcionario();
        atendente.setMatricula(0002);
        atendente.setNome("TitanBr0202");
        atendente.setSalario(3000.00);
        atendente.setCargo("Atendente");

        Gerente gerente = new Gerente();
        gerente.setMatricula(0001);
        gerente.setNome("Maíra");
        gerente.setSalario(5000);
        gerente.concederEmprestimo();

        GerenteInvestimento gInv = new GerenteInvestimento();

        gInv.setSalario(10000);


        System.out.println("Nome do atendente: "+atendente.getNome());
        System.out.println("Nome do Gerente: "+gerente.getNome());
        System.out.println("Comissao do Atendente: "+atendente.calcularComissao());
        System.out.println("Comissao do Gerente: "+gerente.calcularComissao());
        System.out.println("Comissao do Gerente de Investimento: "+gInv.calcularComissao());




    }
}
