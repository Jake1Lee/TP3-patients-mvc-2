package ma.mundia.patientsmvc2.security.repo;

import ma.mundia.patientsmvc2.security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole, String> {
}
