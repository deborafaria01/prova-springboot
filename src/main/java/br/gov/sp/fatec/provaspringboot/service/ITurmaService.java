package br.gov.sp.fatec.provaspringboot.service;

import java.util.List;

import br.gov.sp.fatec.provaspringboot.entity.Turma;

public interface ITurmaService {
    
    public Turma novaTurma(Turma turma);
    
   public List<Turma> buscarTodas();

     public List<Turma> buscarPorRangeDeAno(Integer anoInicio, Integer anoFim);
}
