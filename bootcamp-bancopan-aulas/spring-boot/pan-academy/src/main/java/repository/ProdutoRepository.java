package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tabelas.Produtos;

public interface ProdutoRepository extends JpaRepository<Produtos, Long> {

}
