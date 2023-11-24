package ma.mundia.patientsmvc2.security.repo;

import ma.mundia.patientsmvc2.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, String> {
    AppUser findByUsername(String username);
}
