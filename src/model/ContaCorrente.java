package model;

import exception.SaldoInsuficienteException;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, double saldoInicial, double limiteChequeEspecial ) {
        super(numeroConta, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getlimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
    public void setlimiteChequeEspecial(double saldo) {
        this.limiteChequeEspecial = saldo;
    }
    
    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0 || valor > getSaldo() + limiteChequeEspecial) {
            throw new SaldoInsuficienteException("Saldo insuficiente ou valor de saque inválido: " + valor);
        }

        setSaldo(getSaldo() - valor);
        if(getSaldo()<0){
            setlimiteChequeEspecial(getSaldo()+limiteChequeEspecial);
        }

        System.out.println("Saque de R$" + valor + " realizado com sucesso.");
    }
}


