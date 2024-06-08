package project.unicap.curriculum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.unicap.curriculum.Educacao;
import project.unicap.curriculum.service.EducacaoService;

import java.util.List;

@RestController
@RequestMapping("/api/educacoes")
public class EducacaoController {
    @Autowired
    private EducacaoService educacaoService;

    @GetMapping
    public List<Educacao> listarTodas() {
        return educacaoService.listarTodas();
    }

    @PostMapping
    public Educacao criar(@RequestBody Educacao educacao) {
        return educacaoService.salvar(educacao);
    }

    @GetMapping("/{id}")
    public Educacao obterPorId(@PathVariable Long id) {
        return educacaoService.obterPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        educacaoService.deletar(id);
    }
}
