package io.uric.controleponto.funcionario;

public class Operador extends Funcionario implements IOperador{
    private double valorHora;
    @Override
    public double getValorHora() {
        return this.valorHora;
    }

    @Override
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
