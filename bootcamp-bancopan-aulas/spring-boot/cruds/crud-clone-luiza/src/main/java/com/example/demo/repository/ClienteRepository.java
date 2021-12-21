package com.example.demo.repository;

import com.example.demo.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {

    @Query(value = "SELECT * FROM CLIENTE_MODEL u WHERE u.tipo = :tipo ", nativeQuery = true)
    List<ClienteModel> procuraPessoasFisicas(Long tipo);

    @Query(value = "SELECT * FROM CLIENTE_MODEL u WHERE u.tipo = :tipo ", nativeQuery = true)
    List<ClienteModel> procuraTipoPessoas(Long tipo);
    //todos
    @Query(value = "SELECT * FROM CLIENTE_MODEL c  ", nativeQuery = true)
    List<ClienteModel> procuraTodos();
    //por ordem alfabetica
    @Query(value = "SELECT * FROM CLIENTE_MODEL c ORDER BY c.nome ", nativeQuery = true)
    List<ClienteModel> procuraTodosAlfabetico();
}
