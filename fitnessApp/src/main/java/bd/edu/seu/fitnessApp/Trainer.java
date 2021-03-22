package bd.edu.seu.fitnessApp;


import javax.persistence.*;

@Entity
@Table(name = "trainer")
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trainer_id;

    @Column(nullable = false, length = 50)
    private String trainer_name;

    @Column(nullable = false, unique = true, length = 45)
    private String trainer_email;

    @Column(nullable = false, length = 64)
    private String trainer_password;

    @Column(nullable = false)
    private int trainer_age;

    @Column(nullable = false, length = 255)
    private String trainer_location;

    @Column(nullable = false, length = 14)
    private int trainer_mobile;

    @Column(nullable = false, length = 50 )
    private String trainer_experince;

    public Trainer() {

    }


    public Long getTrainer_id() {
        return trainer_id;
    }

    public void setTrainer_id(Long trainer_id) {
        this.trainer_id = trainer_id;
    }

    public String getTrainer_name() {
        return trainer_name;
    }

    public void setTrainer_name(String trainer_name) {
        this.trainer_name = trainer_name;
    }

    public String getTrainer_email() {
        return trainer_email;
    }

    public void setTrainer_email(String trainer_email) {
        this.trainer_email = trainer_email;
    }

    public String getTrainer_password() {
        return trainer_password;
    }

    public void setTrainer_password(String trainer_password) {
        this.trainer_password = trainer_password;
    }

    public int getTrainer_age() {
        return trainer_age;
    }

    public void setTrainer_age(int trainer_age) {
        this.trainer_age = trainer_age;
    }

    public String getTrainer_location() {
        return trainer_location;
    }

    public void setTrainer_location(String trainer_location) {
        this.trainer_location = trainer_location;
    }

    public int getTrainer_mobile() {
        return trainer_mobile;
    }

    public void setTrainer_mobile(int trainer_mobile) {
        this.trainer_mobile = trainer_mobile;
    }

    public String getTrainer_experince() {
        return trainer_experince;
    }

    public void setTrainer_experince(String trainer_experince) {
        this.trainer_experince = trainer_experince;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trainer_id=" + trainer_id +
                ", trainer_name='" + trainer_name + '\'' +
                ", trainer_email='" + trainer_email + '\'' +
                ", trainer_password='" + trainer_password + '\'' +
                ", trainer_age=" + trainer_age +
                ", trainer_location='" + trainer_location + '\'' +
                ", trainer_mobile='" + trainer_mobile + '\'' +
                ", trainer_experince='" + trainer_experince + '\'' +
                '}';
    }
}
