package root.repository;

import org.springframework.data.repository.CrudRepository;
import root.entity.TaskE;


public interface TaskRepository extends CrudRepository<TaskE, Long> {
    TaskE findById(long id);

}