package prova.restapi.repository;

import org.springframework.data.repository.CrudRepository;
import prova.restapi.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}
