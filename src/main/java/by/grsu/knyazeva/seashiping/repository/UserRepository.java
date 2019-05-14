package by.grsu.knyazeva.seashiping.repository;

import by.grsu.knyazeva.seashiping.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
