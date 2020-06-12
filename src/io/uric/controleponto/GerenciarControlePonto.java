package io.uric.controleponto;

import io.uric.controleponto.funcionario.Funcionario;
import io.uric.controleponto.funcionario.Gerente;
import io.uric.controleponto.funcionario.Operador;
import io.uric.controleponto.funcionario.Secretaria;
import io.uric.controleponto.registroponto.RegistroPonto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GerenciarControlePonto {
    private static void Sleep() throws InterruptedException {
        Thread.sleep((long)(Math.random() * 1000 + 1000));
    }
    private static List<RegistroPonto> filtragemPontos(List<RegistroPonto> pontosRegistrados, Funcionario funcionario){
        return pontosRegistrados.stream()
                .filter((RegistroPonto rp) -> (rp.getFunc().equals(funcionario)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) throws InterruptedException {
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        List<RegistroPonto> pontosRegistrados = new ArrayList<RegistroPonto>();
        funcionarios.add(new Gerente(
                funcionarios.size()+1,
                "Carlos Nobrega",
                "nobrega@praca.com",
                "482751234-MG",
                "carlosngb",
                "123456"
        ));
        funcionarios.add(new Operador(
                funcionarios.size()+1,
                "Pedro Peçanha",
                "pecanha@praca.com",
                "49273123-92",
                14.15
        ));
        funcionarios.add(new Secretaria(
                funcionarios.size()+1,
                "Pedro Peçanha",
                "pecanha@praca.com",
                "49273123-92",
                "38314115",
                "1565"
        ));
        pontosRegistrados.add(new RegistroPonto(Long.valueOf(pontosRegistrados.size()+1), funcionarios.get(0), LocalDate.now(), LocalDateTime.now()));
        Sleep();
        pontosRegistrados.add(new RegistroPonto(Long.valueOf(pontosRegistrados.size()+1), funcionarios.get(1), LocalDate.now(), LocalDateTime.now()));
        Sleep();
        pontosRegistrados.add(new RegistroPonto(Long.valueOf(pontosRegistrados.size()+1), funcionarios.get(1), LocalDate.now(), LocalDateTime.now()));
        Sleep();

        List<RegistroPonto> pontosFiltrados = filtragemPontos(pontosRegistrados,funcionarios.get(1));

        if (pontosFiltrados.size()>=1){
            RegistroPonto temp = pontosFiltrados.get(pontosFiltrados.size()-1);
            if (temp.getHoraEntrada()!=null && temp.getHoraSaida() == null){
                pontosRegistrados.add(new RegistroPonto(Long.valueOf(pontosRegistrados.size()+1), temp.getFunc(), temp.getData(), temp.getHoraEntrada(), LocalDateTime.now()));
            }
            else if (temp.getHoraEntrada()!=null && temp.getHoraSaida() != null){
                pontosRegistrados.add(new RegistroPonto(Long.valueOf(pontosRegistrados.size()+1), temp.getFunc(), LocalDate.now(), LocalDateTime.now()));
            }
        }

        System.out.println("Iniciando testes de exibição....");
        pontosRegistrados.stream().forEach(registroPonto -> registroPonto.apresentarRegistroPonto());





    }
}
