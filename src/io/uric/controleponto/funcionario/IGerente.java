package io.uric.controleponto.funcionario;

public interface IGerente extends IFuncionario{
    String getLogin();
    void setLogin(String login);
    String getSenha();
    void setSenha(String senha);
}
