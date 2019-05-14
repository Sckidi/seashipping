package by.grsu.knyazeva.seashiping.repository;

import by.grsu.knyazeva.seashiping.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
