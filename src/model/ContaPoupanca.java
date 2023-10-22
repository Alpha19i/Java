package model;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;
    public ContaPoupanca(String numeroConta, double saldoInicial, double taxaRendimento) {
        super(numeroConta, saldoInicial);
        this.taxaRendimento = taxaRendimento;
        setSaldo(calculaRendimento()+getSaldo());
    }

    private double calculaRendimento() {
        return getSaldo() * taxaRendimento ;
    }
    
}
