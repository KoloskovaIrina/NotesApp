package root.repository;

import org.springframework.data.repository.CrudRepository;
import root.entity.TaskE;

import java.util.List;

public interface TaskRepository extends CrudRepository<TaskE, Long> {
    List<TaskE> findAll();
}