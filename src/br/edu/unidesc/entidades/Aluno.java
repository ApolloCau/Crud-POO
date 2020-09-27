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
        //Esta resolução é uma previa e foi encontrado os seguintes problemas de logica:
        //Não descobri um metodo que faça o formato ficar como o requerido;
        //Não consegui adcionar os numeros aleatorios a Matricula;
        //Não consegui implementar o semestre;
        Random random = new Random();
        Integer RR = random.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        Date date = cal.getTime();
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd-DD-hh-mm-ss");
        String date1 = format1.format(date);
        Date inActiveDate = null;
        this.matricula = date.toString();
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

