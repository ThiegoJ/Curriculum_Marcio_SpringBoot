package project.unicap.curriculum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.unicap.curriculum.Educacao;
import project.unicap.curriculum.Repository.EducacaoRepository;

import java.util.List;

@Service
public class EducacaoService {
    @Autowired
    private EducacaoRepository educacaoRepository;

    public List<Educacao> listarTodas() {
        return educacaoRepository.findAll();
    }

    public Educacao salvar(Educacao educacao) {
        return educacaoRepository.save(educacao);
    }

    public Educacao obterPorId(Long id) {
        return educacaoRepository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        educacaoRepository.deleteById(id);
    }
}

