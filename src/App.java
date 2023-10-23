import model.ContaCorrente;
import model.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente conta = new ContaCorrente("12345", 1000.0, 500.0);
        ContaPoupanca contap = new ContaPoupanca("666.666", 10000, 0.1);

        System.out.println("Saldo inicial: R$" + conta.getSaldo());
        conta.depositar(500.0);
        System.out.println("Novo saldo: R$" + conta.getSaldo());
        conta.sacar(1800.0);
        System.out.println("Novo saldo: R$" + conta.getSaldo());
        System.out.println("Limite do cheque especial "+ conta.getlimiteChequeEspecial());
        System.out.println("\n");

        System.out.println("Saldo p inicial: R$" + contap.getSaldo());
        contap.depositar(500.0);
        System.out.println("Novo saldo p : R$" + contap.getSaldo());
        contap.sacar(1000.0);
        System.out.println("Novo saldo p : R$" + contap.getSaldo());
        
    }
}
