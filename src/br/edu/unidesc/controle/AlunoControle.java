package br.edu.unidesc.controle;

import br.edu.unidesc.entidades.Aluno;
import br.edu.unidesc.inter.AlunoContract;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class AlunoControle implements AlunoContract {
    private final String ARQUIVO_CSV="aluno.csv";
    private final String SEPARADOR =",";


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
    private void gravarArquivo(Aluno aluno)
    {

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

    @Override
    public void gravarAluno() {
            try {
                File arquivo = new File("aluno.csv");
                arquivo.createNewFile();
                FileWriter fileWriter = new FileWriter(arquivo);
                BufferedWriter implementaConteudo = new BufferedWriter(fileWriter);
                implementaConteudo.write("Aluno: Carlos\n" + "CPF: 123456789-40\n" + "Curso: Sistemas de Informação");
                implementaConteudo.close();
                fileWriter.close();
            } catch (IOException ex) {

            }
        }

    private void salvarEntidade(Aluno aluno) {
        alunos.add(aluno);
    }
}

