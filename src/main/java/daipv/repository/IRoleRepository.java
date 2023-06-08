package daipv.repository;

import daipv.model.RoleName;
import daipv.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRoleRepository extends JpaRepository<Roles,Long> {

    Optional<Roles> findByRoleName(RoleName roleName);
}
