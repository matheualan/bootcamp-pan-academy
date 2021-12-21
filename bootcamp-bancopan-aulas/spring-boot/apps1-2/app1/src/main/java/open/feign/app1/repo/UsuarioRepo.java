package open.feign.app1.repo;

import open.feign.app1.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Long> {

}
