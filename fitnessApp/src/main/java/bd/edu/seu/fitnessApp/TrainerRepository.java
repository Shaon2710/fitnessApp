package bd.edu.seu.fitnessApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TrainerRepository extends JpaRepository<Trainer, Long> {

    @Query("SELECT email FROM trainer  WHERE email = ?1")
    Trainer findByTrainer_email(String trainer_email);
}
