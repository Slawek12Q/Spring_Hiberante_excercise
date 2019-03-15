package pl.slawek.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.slawek.model.City;


@Repository
public interface CityRepository extends JpaRepository<City, Long>{
}