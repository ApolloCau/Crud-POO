package br.edu.unidesc.inter;

import br.edu.unidesc.entidades.Aluno;

public interface AlunoContract {
    Aluno criarAluno(Aluno aluno);
    Aluno recuperarAluno(String cpf);
    Aluno atualizarAluno(Aluno aluno);
    Boolean deletarAluno(String cpf);
    void gravarAluno();

}
