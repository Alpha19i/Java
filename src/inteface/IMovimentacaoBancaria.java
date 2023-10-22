package inteface;

import exception.SaldoInsuficienteException;

public interface IMovimentacaoBancaria {
    public void depositar(double valor) throws SaldoInsuficienteException;
    public void sacar( double valor) throws SaldoInsuficienteException;
}
