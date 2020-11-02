package br.edu.unidesc.controle;

import br.edu.unidesc.entidades.Aluno;
import br.edu.unidesc.inter.AlunoContract;

import javax.imageio.IIOException;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


public class AlunoControle implements AlunoContract {
    private final String ARQUIVO_CSV="aluno.csv";
    private final String SEPARADOR =",";
    private boolean append;

    public AlunoControle() throws Exception
    {

        System.out.println(ARQUIVO_CSV);
    }

     private List<Aluno> alunos = new ArrayList<>();

    @Override
    public Aluno criarAluno(Aluno aluno) {

        File f =new File(ARQUIVO_CSV);
        if (if.exists())

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
    private void gravarArquivo(Aluno aluno) {
        StringBuilder sb = new StringBuilder();
        sb.append(aluno.getNome())
                .append(SEPARADOR)
                .append(aluno.getCpf());

        try {
            FileWriter fw = new FileWriter(ARQUIVO_CSV, append:true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(sb.toString());
            bw.newLine();
            bw.close();
        } catch (IIOException e);
        {
            e.printStackTrace;
        }
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

