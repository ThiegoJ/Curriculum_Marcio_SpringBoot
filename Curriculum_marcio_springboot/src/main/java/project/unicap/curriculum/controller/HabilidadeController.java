package project.unicap.curriculum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.unicap.curriculum.Habilidade;
import project.unicap.curriculum.service.HabilidadeService;

import java.util.List;

@RestController
@RequestMapping("/api/habilidades")
public class HabilidadeController {
    @Autowired
    private HabilidadeService habilidadeService;

    @GetMapping
    public List<Habilidade> listarTodas() {
        return habilidadeService.listarTodas();
    }

    @PostMapping
    public Habilidade criar(@RequestBody Habilidade habilidade) {
        return habilidadeService.salvar(habilidade);
    }

    @GetMapping("/{id}")
    public Habilidade obterPorId(@PathVariable Long id) {
        return habilidadeService.obterPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        habilidadeService.deletar(id);
    }
}

