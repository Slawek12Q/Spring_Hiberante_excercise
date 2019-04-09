package pl.slawek.respository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.slawek.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
