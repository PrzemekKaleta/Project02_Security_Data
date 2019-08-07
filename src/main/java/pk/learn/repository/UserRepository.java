package pk.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pk.learn.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User, Long>{
    Optional<User> findByName(String name);
}
