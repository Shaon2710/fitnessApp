package bd.edu.seu.fitnessApp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class TrainerRepositoryTest {

    @Autowired
    private TrainerRepository trepo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateTrainer(){
        Trainer trainer = new Trainer();

        trainer.setTrainer_name("Joan");
        trainer.setTrainer_email("joan@test.com");
        trainer.setTrainer_password("258");
        trainer.setTrainer_age(28);
        trainer.setTrainer_mobile(125498);
        trainer.setTrainer_location("gazipur");
        trainer.setTrainer_experince("almost two years");

        Trainer saveTrainer = trepo.save(trainer);
        Trainer exTrainer = entityManager.find(Trainer.class, saveTrainer.getTrainer_id());

        assertThat(exTrainer.getTrainer_email()).isEqualTo(trainer.getTrainer_email());
    }

}
