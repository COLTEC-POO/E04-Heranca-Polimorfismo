import java.util.Date;

public class Operacao {

        /* Tipo da operação */
        public char tipo;

        /* Valor da operação */
        public double valor;

        public Date data;



        public Date getData() {
            return data;
        }

        public void setData(Date data) {
            this.data = data;
        }

        public char getTipo() {
            return tipo;
        }

        public void setTipo(char tipo) {
            this.tipo = tipo;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }

    public void imprimirExtrato() {
        System.out.println("Extrato Bancário");{
            System.out.println("DATA " + this.getData() + "TIPO DE OPERACAO: " + this.getTipo() + "VALOR: R$" + this.getValor());
        }
    }


/**
 * Construtor. Inicializa uma nova instância da classe Operacao onde a data da operação é exatamente a data
 @@ -35,7 +59,8 @@ public class Operacao {
 public Operacao(char tipo, double valor) {
 this.tipo = tipo;
 this.valor = valor;
 data = new Date();
 dataOperacao = new Date();
 }**/


    public Operacao(char tipo, double valor) {
     this.tipo = tipo;
     this.valor = valor;
     data = new Date();
    }
}
