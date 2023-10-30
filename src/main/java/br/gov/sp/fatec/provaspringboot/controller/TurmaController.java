package br.gov.sp.fatec.provaspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import br.gov.sp.fatec.provaspringboot.entity.Turma;
import br.gov.sp.fatec.provaspringboot.service.ITurmaService;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@CrossOrigin
@RequestMapping(value = "/turma")
public class TurmaController {

    @Autowired
    private ITurmaService service;

    @PostMapping
    public Turma novaTurma (@RequestBody Turma turma){
        return service.novaTurma(turma);
    }

    @GetMapping
    public List<Turma> buscarTodas(){
        return service.buscarTodas();
    }

    @GetMapping(value = "/{ano}/{tamanho}") //subrota
    public List<Turma> buscarPorRangeDeAno(
        @PathVariable("ano") Integer ano, @PathVariable("tamanho") Integer tamanho){
        return service.buscarPorRangeDeAno(ano, tamanho);
    }

    
}
