package io.uric.controleponto.registroponto;

import io.uric.controleponto.funcionario.Funcionario;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroPonto implements IRegistroPonto {
    long idRegPonto;
    Funcionario funcionario;
    LocalDate dataRegistro;
    LocalDateTime horaEntrada;
    LocalDateTime horaSaida;

    @Override
    public long getIdRegPonto() {
        return this.idRegPonto;
    }

    @Override
    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    @Override
    public Funcionario getFunc() {
        return this.funcionario;
    }

    @Override
    public void setFunc(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public LocalDate getData() {
        return this.dataRegistro;
    }

    @Override
    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    @Override
    public LocalDateTime getHoraEntrada() {
        return this.horaEntrada;
    }

    @Override
    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    @Override
    public LocalDateTime getHoraSaida() {
        return this.horaSaida;
    }

    @Override
    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    @Override
    public void apresentarRegistroPonto() {
        System.out.println("====================");
        System.out.println("Funcionário: " + this.funcionario.getClass().getSimpleName() + ' ' +this.funcionario.getNome());
        System.out.println("Data de Registro: " + this.dataRegistro);
        System.out.println("Horário Entrada: "+ this.horaEntrada );
        System.out.println("Horário Saída: "+ this.horaSaida);
    }
}
