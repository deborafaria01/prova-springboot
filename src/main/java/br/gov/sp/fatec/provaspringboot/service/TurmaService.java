package br.gov.sp.fatec.provaspringboot.service;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.sp.fatec.provaspringboot.entity.Turma;
import br.gov.sp.fatec.provaspringboot.repository.TurmaRepository;



@Service
public class TurmaService implements ITurmaService {

    @Autowired
    private TurmaRepository turmaRepo;

   // public List<Turma> buscarTodas() {
   //     return turmaRepo.findAll();
  //  }

  @Transactional
    public Turma novaTurma(Turma turma) {
        if(turma.getDataHoraCadastro()== null){
            turma.setDataHoraCadastro(LocalDateTime.now());
        }

        return turmaRepo.save(turma);

    }
    
   
        

    

    
    
}
