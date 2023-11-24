package ma.mundia.patientsmvc2.security.service;

import ma.mundia.patientsmvc2.security.entities.AppRole;
import ma.mundia.patientsmvc2.security.entities.AppUser;

public interface AccountService {
    AppUser addnewUser(String username, String password, String email, String confirmPassword);
    AppRole addnewRole(String role);
    void addRoleToUser(String username, String role);
    void removeRoleFromUser(String username, String role);

    AppUser loadUserByUsername(String username);
}
