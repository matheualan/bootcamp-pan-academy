package bancoPan.microtabela.repositories;

import bancoPan.microtabela.model.Tabela;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TabelaRepository extends JpaRepository<Tabela, Long> {
}
