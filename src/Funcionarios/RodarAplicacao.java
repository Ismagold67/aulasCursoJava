package Funcionarios;

public class RodarAplicacao {
    public static void main(String[] args) {

        Funcionarios gerente = new Gerente();
        Funcionarios vendedor = new Vendedor();
        Funcionarios faxineiro = new Faxineiro();

        Vendedor vendedor_= (Vendedor) new Funcionarios();
    }
}
