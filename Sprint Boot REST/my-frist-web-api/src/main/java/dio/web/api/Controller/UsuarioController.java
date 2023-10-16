package dio.web.api.Controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UserRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UserRepository usuario;

    @GetMapping()
    public List<Usuario> getUsers(){

        return usuario.findAll();
    }

    @GetMapping("/{usarname}")
    public Usuario getOne(@PathVariable("usarname") String usarname){
        return usuario.findByUsername(usarname);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
         usuario.deleteById(id);
    }

    @PostMapping()
    public void postUser(@RequestBody Usuario usuarioo){
        usuario.save(usuarioo);
    }
}
