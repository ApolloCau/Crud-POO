package br.edu.unidesc;


import br.edu.unidesc.controle.AlunoControle;
import br.edu.unidesc.entidades.Aluno;

public class Teste {
    public static void main(String[] args){

        Aluno aluno=new Aluno();
        aluno.setCurso("SISTEMAS DE INFORMAÇÃO");
        aluno.setNome("Cara Aleatorio da Silva");
        aluno.setCpf("748.733.180-68");

        AlunoControle controle = new AlunoControle();
        aluno = controle.criarAluno(aluno);

        System.out.println("A matricula é:"  +aluno.getMatricula());


        aluno.setNome("Ze Ninguem Da Silva");

        controle.atualizarAluno(aluno);
        if (aluno==null) {
            System.out.println("Aluno não encontrado");
        }
            else
            System.out.println("Aluno atualizado para:   " +aluno.getNome());

            Boolean deletou = controle.deletarAluno(aluno.getCpf());

            if(deletou)
                System.out.println("Aluno Deletado");
            else
                System.out.println("Aluno não encontrado");
            }


        }


