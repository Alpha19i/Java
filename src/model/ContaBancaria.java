package model;

import exception.SaldoInsuficienteException;
import inteface.IMovimentacaoBancaria;

public class ContaBancaria implements IMovimentacaoBancaria {
    private String numeroConta;
    private double saldo;
    
    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    @Override
    public void depositar(double valor) throws SaldoInsuficienteException {
            if (valor <= 0) {
                throw new SaldoInsuficienteException("Valor de depósito inválido: " + valor);
            }

            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");   
    }
    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0 || valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente ou valor de saque inválido: " + valor);
        }

        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso.");
    }
}
