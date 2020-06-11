package io.uric.controleponto.funcionario;

public abstract class Funcionario implements IFuncionario{
    private int idFunc;
    private String nome;
    private String email;
    private String documento;

    @Override
    public int getIdFunc() {
        return this.idFunc;
    }
    @Override
    public void setIdFunc(int idFunc){
        this.idFunc = idFunc;
    };
    @Override
    public String getNome() {
        return this.nome;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String getEmail() {
        return this.email;
    }
    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String getDocumento() {
        return this.documento;
    }
    @Override
    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
