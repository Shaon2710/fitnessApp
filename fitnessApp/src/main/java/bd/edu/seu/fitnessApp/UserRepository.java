package bd.edu.seu.fitnessApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT email FROM users  WHERE email = ?1")
    User findByEmail(String email);
}
