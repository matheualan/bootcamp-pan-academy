package com.feign.aula2.classes;

import com.feign.aula2.classes.model.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "app1", url = "http://localhost:5001/usuario")
public interface UsuarioAula1Feign {

    @GetMapping
    public ResponseEntity<List<Usuario>> getAll();

}
