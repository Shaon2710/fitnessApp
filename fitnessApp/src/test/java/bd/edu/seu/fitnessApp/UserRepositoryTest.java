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
public class UserRepositoryTest {

    @Autowired
    private UserRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser(){

        User user = new User();
        user.setName("test3");
        user.setEmail("test3@test.com");
        user.setPassword("1133");
        user.setAge(26);
        user.setLocation("Dhaka");
        user.setMobile("9874563");

        User saveUser =  repo.save(user);
        User exUser  = entityManager.find(User.class, saveUser.getId());

        assertThat(exUser.getEmail()).isEqualTo(user.getEmail());


    }


}
