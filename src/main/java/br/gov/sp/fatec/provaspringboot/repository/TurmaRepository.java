package br.gov.sp.fatec.provaspringboot.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.gov.sp.fatec.provaspringboot.entity.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long> {

   @Query("SELECT u FROM Turma u WHERE u.ano = :ano AND u.tamanho < :tamanho")
    public List<Turma> findByYearRange(@Param("ano") Integer ano, @Param("tamanho") Integer tamanho);

    
}
