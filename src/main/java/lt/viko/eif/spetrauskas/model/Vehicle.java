package lt.viko.eif.spetrauskas.model;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String make;
    private String model;
    private int year;
    private String vin;
}
