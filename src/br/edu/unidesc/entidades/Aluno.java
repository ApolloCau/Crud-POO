package br.edu.unidesc.entidades;

import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Aluno {

    private String cpf;
    private String nome;
    private String matricula;
    private String curso;

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula() {
        Random valorRandomico = new Random();
        SimpleDateFormat dataFormatada = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar data = Calendar.getInstance();

        int semestre;
        if (data.get(Calendar.MONTH) <= 6) {
            semestre = 1;
        } else {
            semestre = 2;
        }
        System.out.println("A matricula é:");
        System.out.println(dataFormatada.format(data.getTime()) + "-" + valorRandomico.nextInt(99) + "-" + semestre);
    }

    public String getCurso() {
        return curso;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

