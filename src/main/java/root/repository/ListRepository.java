package root.repository;

import org.springframework.data.repository.CrudRepository;
import root.entity.ListE;
import java.util.List;

public interface ListRepository extends CrudRepository<ListE, Long> {

}

