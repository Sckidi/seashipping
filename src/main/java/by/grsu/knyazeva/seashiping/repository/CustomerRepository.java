package by.grsu.knyazeva.seashiping.repository;

import by.grsu.knyazeva.seashiping.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByRegistrationNumber(String registrationNumber);
}
