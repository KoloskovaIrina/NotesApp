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


        //ListRepository repository= context.getBean(ListRepository.class);
        //repository.save(new ListE(1L,"Общие"));
       // repository.save(new ListE(2L,"Дом"));
        //repository.save(new ListE(3L,"Работа"));
       // repository.save(new ListE(4L,"Семья"));
        //repository.save(new ListE(5L,"Друзья"));
        //repository.save(new ListE(6L,"Встречи"));
       // repository.save(new ListE(7L,"Покупки"));
        //repository.deleteAll();

        /*Iterable<ListE> lists = repository.findAll();

        for (ListE entity: lists){
            System.out.println(entity.getName());
        }
        SpringApplication.run(Application.class, args);
        context.close();*/

    }
}