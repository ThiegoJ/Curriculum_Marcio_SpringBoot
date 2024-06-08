package project.unicap.curriculum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.unicap.curriculum.Experiencia;
import project.unicap.curriculum.Repository.ExperienciaRepository;

import java.util.List;

@Service
public class ExperienciaService {
    @Autowired
    private ExperienciaRepository experienciaRepository;

    public List<Experiencia> listarTodas() {
        return experienciaRepository.findAll();
    }

    public Experiencia salvar(Experiencia experiencia) {
        return experienciaRepository.save(experiencia);
    }

    public Experiencia obterPorId(Long id) {
        return experienciaRepository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        experienciaRepository.deleteById(id);
    }
}
