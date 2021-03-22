package bd.edu.seu.fitnessApp;


import javax.persistence.*;

@Entity
@Table(name="health-report")
public class HealthReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long userId;
    @Column(nullable = false)
    private double hartBit;
    @Column(nullable = false)
    private double weight;
    @Column(nullable = false)
    private double bodyMeasurements;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public double getHartBit() {
        return hartBit;
    }

    public void setHartBit(double hartBit) {
        this.hartBit = hartBit;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBodyMeasurements() {
        return bodyMeasurements;
    }

    public void setBodyMeasurements(double bodyMeasurements) {
        this.bodyMeasurements = bodyMeasurements;
    }

    @Override
    public String toString() {
        return "HealthReport{" +
                "id=" + id +
                ", userId=" + userId +
                ", hartBit=" + hartBit +
                ", weight=" + weight +
                ", bodyMeasurements=" + bodyMeasurements +
                '}';
    }
}
