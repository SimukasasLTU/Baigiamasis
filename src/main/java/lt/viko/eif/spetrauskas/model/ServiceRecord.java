package lt.viko.eif.spetrauskas.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
public class ServiceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "service_center_id", nullable = false)
    private ServiceCenter serviceCenter;

    private LocalDateTime serviceDate;
    private String serviceType;
    private String notes;
}
