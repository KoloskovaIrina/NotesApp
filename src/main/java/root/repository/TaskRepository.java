package root.repository;

import org.springframework.data.repository.CrudRepository;
import root.entity.ListE;
import root.entity.TaskE;
import java.util.*;

public interface TaskRepository extends CrudRepository<TaskE, Long> {
    List<TaskE> findByList(ListE list);
}