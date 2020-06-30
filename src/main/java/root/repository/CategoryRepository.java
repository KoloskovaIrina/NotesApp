package root.repository;

import org.springframework.data.repository.CrudRepository;
import root.entity.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}

