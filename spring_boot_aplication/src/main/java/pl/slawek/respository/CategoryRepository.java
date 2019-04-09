package pl.slawek.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.slawek.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
