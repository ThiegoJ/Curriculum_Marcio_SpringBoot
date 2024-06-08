package project.unicap.curriculum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.unicap.curriculum.Pessoa;
import project.unicap.curriculum.Repository.PessoaRepository;

import java.util.List;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> listarTodas() {
        return pessoaRepository.findAll();
    }

    public Pessoa salvar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Pessoa obterPorId(Long id) {
        return pessoaRepository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        pessoaRepository.deleteById(id);
    }
}
