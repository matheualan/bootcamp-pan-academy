package banco.pan.join.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Role {

    @Id
    private String nomeRole;

    @ManyToMany(mappedBy = "roles")
    private List<Usuario> usuarios;

    //getters e setters
    public String getNomeRole() {
        return nomeRole;
    }

    public void setNomeRole(String nomeRole) {
        this.nomeRole = nomeRole;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
