package root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import root.repository.CategoryRepository;
import root.entity.Category;

@ComponentScan
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        //ConfigurableApplicationContext context = SpringApplication.run(Application.class);
       // CategoryRepository  repository= context.getBean(CategoryRepository.class);
        //repository.save(new Category("New message 1"));
        //repository.save(new Category("New message 2"));
       // Iterable<Category> lists = repository.findAll();

       // for (Category entity: lists){
       //     System.out.println(entity.getName());
       // }
       // context.close();
        SpringApplication.run(Application.class, args);
    }
}