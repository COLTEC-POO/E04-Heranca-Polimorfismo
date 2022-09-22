public class MainFuncionarios {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[5];

        funcionarios[0] = new Gerente();
        funcionarios[0].setSalario(2000);
        funcionarios[0].setNome("g0");

        funcionarios[1] = new Funcionario();
        funcionarios[1].setSalario(2000);
        funcionarios[1].setNome("f1");

        funcionarios[2] = new Funcionario();
        funcionarios[2].setSalario(2000);
        funcionarios[2].setNome("f2");

        funcionarios[3] = new Gerente();
        funcionarios[3].setSalario(2000);
        funcionarios[3].setNome("g3");

        funcionarios[4] = new Funcionario();
        funcionarios[4].setSalario(2000);
        funcionarios[4].setNome("f4");

        Relatorio relat = new Relatorio();

        relat.imprimeComissoes(funcionarios);

    }
}
