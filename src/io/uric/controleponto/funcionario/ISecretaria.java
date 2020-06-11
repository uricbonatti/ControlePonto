package io.uric.controleponto.funcionario;

public interface ISecretaria extends IFuncionario{
    String getTelefone();
    void setTelefone(String telefone);
    String getRamal();
    void setRamal(String ramal);
}
