package root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import root.entity.ListE;
import root.repository.ListRepository;

@ComponentScan
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class);
        ListRepository repository= context.getBean(ListRepository.class);
        repository.save(new ListE(1L,"List1"));
        repository.save(new ListE(2L,"List2"));
        repository.save(new ListE(3L,"List3"));
        Iterable<ListE> lists = repository.findAll();

        for (ListE entity: lists){
            System.out.println(entity.getName());
        }
        SpringApplication.run(Application.class, args);
       // context.close();

    }
}