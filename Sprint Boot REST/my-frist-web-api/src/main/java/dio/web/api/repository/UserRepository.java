package dio.web.api.repository;

import dio.web.api.handler.BusinessException;
import dio.web.api.model.Usuario;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class UserRepository {

    public void save(@NotNull Usuario usuario){
        if(usuario.getLogin() == null){
            throw  new BusinessException("AAAA");
        };
        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.printf("DELETE/id - Recebendo o id: %d para excluir um usuário%n", id);
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson","password"));
        usuarios.add(new Usuario("frank","masterpass"));
        return usuarios;
    }

    public Usuario findByUsername(String username){
        System.out.printf("FIND/username - Recebendo o usernamae: %s para localizar um usuário%n", username);
        return new Usuario("gleyson","password");
    }

}
