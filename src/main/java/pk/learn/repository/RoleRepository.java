package pk.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pk.learn.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByRole(String role);
}
