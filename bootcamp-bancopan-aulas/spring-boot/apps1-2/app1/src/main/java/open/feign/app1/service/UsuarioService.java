package open.feign.app1.service;

import open.feign.app1.model.Usuario;
import open.feign.app1.repo.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepo userRepo;

    public List<Usuario> getAll() {
        return userRepo.findAll();
    }

    public Optional<Usuario> getById(long id) {
        return userRepo.findById(id);
    }
}
