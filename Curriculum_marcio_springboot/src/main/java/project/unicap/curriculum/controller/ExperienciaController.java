package project.unicap.curriculum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.unicap.curriculum.Experiencia;
import project.unicap.curriculum.service.ExperienciaService;

import java.util.List;

@RestController
@RequestMapping("/api/experiencias")
public class ExperienciaController {
    @Autowired
    private ExperienciaService experienciaService;

    @GetMapping
    public List<Experiencia> listarTodas() {
        return experienciaService.listarTodas();
    }

    @PostMapping
    public Experiencia criar(@RequestBody Experiencia experiencia) {
        return experienciaService.salvar(experiencia);
    }

    @GetMapping("/{id}")
    public Experiencia obterPorId(@PathVariable Long id) {
        return experienciaService.obterPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        experienciaService.deletar(id);
    }
}
