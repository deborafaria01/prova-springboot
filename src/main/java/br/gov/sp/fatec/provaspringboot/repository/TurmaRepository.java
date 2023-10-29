package br.gov.sp.fatec.provaspringboot.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import br.gov.sp.fatec.provaspringboot.entity.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long> {

    @Query("select u from Turma u where u.ano between ?1 and ?2")
    public List<Turma> findByYearRange (Integer anoInicio, Integer anoFim);

    
}
