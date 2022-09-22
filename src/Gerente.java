public class Gerente extends Funcionario {

    public double calculaComissao(){
        return super.calculaComissao() * 2;
    }

    public boolean concederEmprestimo(){
        return true;
    }
}
