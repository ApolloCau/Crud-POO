package br.edu.unidesc.controle;

import br.edu.unidesc.entidades.Aluno;
import br.edu.unidesc.inter.AlunoContract;

import java.util.ArrayList;
import java.util.List;


public class AlunoControle implements AlunoContract {

     private List<Aluno> alunos = new ArrayList<>();

    @Override
    public Aluno criarAluno(Aluno aluno) {

        aluno.setMatricula();

        salvarEntidade(aluno);
        return aluno;
    }

    @Override
    public Aluno recuperarAluno(String cpf) {

            for (Aluno aluno : alunos){
                if (cpf.equals(aluno.getCpf())) {
                    return aluno;

                }
            }
        return null;
    }

    @Override
    public Aluno atualizarAluno(Aluno aluno) {
        for (Aluno item : alunos) {
            if (aluno.getCpf().equals(item.getCpf())) {
                item.setNome(aluno.getNome());
                item.setCurso(aluno.getCurso());
            }
        }
        return aluno;
    }

    @Override
    public Boolean deletarAluno(String cpf) {

        Aluno alunoRecuperado = recuperarAluno(cpf);
        if (alunoRecuperado != null){
            alunos.remove(alunoRecuperado);
            return true;

        }
        return false;
    }
    private void salvarEntidade(Aluno aluno) {
        alunos.add(aluno);
    }
}

