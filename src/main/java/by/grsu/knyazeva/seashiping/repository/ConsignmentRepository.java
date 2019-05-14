package by.grsu.knyazeva.seashiping.repository;

import by.grsu.knyazeva.seashiping.model.Consignment;
import by.grsu.knyazeva.seashiping.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsignmentRepository extends JpaRepository<Consignment, Long> {
}
