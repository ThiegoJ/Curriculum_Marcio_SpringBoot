package project.unicap.curriculum.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.unicap.curriculum.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}

