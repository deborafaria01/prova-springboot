package br.gov.sp.fatec.provaspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.provaspringboot.entity.Turma;
import br.gov.sp.fatec.provaspringboot.service.ITurmaService;

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

    
}
