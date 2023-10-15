package dio.aulaspringdatajpa.repository;

import dio.aulaspringdatajpa.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User use = new User();
        use.setName("Jailson");
        use.setUserName("Akarui-kage");
        use.setPassword("jaja123");

        repository.save(use);

        for(User u: repository.findAll()){
            System.out.println(u);
        }


    }

}
