package io.uric.controleponto.funcionario;

public class Secretaria extends Funcionario implements ISecretaria{
    private String telefone;
    private String ramal;
    @Override
    public String getTelefone() {
        return this.telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getRamal() {
        return this.ramal;
    }

    @Override
    public void setRamal(String ramal) {
        this.ramal = ramal;
    }
}
