public class Gerente extends Funcionario{

    public  boolean concederEmprestimo(){
        //Conceder um emprestimo
        return true;
    }
    public double calcularComissao(){
        return super.calcularComissao() * 2;
    }

}
