package crud.service.repository;

import crud.service.model.ClienteModel;
import crud.service.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<ClienteModel, Integer> {

    public void createCliente(ClienteModel clienteModel);

    @Query(value = "SELECT * FROM CLIENTE_MODEL u WHERE u.tipo = :tipo ", nativeQuery = true)
    List<ClienteModel> procuraPessoasFisicas(Integer tipo);

    @Query(value = "SELECT * FROM CLIENTE_MODEL c ", nativeQuery = false)
    List<ClienteModel> procuraTodos();

    @Query(value = "SELECT * FROM CLIENTE_MODEL c ORDER BY c.nome ", nativeQuery = true)
    List<ClienteModel> procuraTodosAlfabetico();
}
