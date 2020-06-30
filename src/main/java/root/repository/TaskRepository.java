package root.repository;

import org.springframework.data.repository.CrudRepository;
import root.entity.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {
}