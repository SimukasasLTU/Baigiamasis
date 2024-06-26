package lt.viko.eif.spetrauskas.model;
//atspindi serviso paskyrimą (vizitą į autoservisą)
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
public class ServiceAppointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "service_center_id", nullable = false)
    private ServiceCenter serviceCenter;

    private LocalDateTime appointmentDate;
    private String serviceType;
    private String status;
}
