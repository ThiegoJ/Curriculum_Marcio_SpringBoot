package project.unicap.curriculum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.unicap.curriculum.Habilidade;
import project.unicap.curriculum.Repository.HabilidadeRepository;

import java.util.List;

@Service
public class HabilidadeService {
    @Autowired
    private HabilidadeRepository habilidadeRepository;

    public List<Habilidade> listarTodas() {
        return habilidadeRepository.findAll();
    }

    public Habilidade salvar(Habilidade habilidade) {
        return habilidadeRepository.save(habilidade);
    }

    public Habilidade obterPorId(Long id) {
        return habilidadeRepository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        habilidadeRepository.deleteById(id);
    }
}
