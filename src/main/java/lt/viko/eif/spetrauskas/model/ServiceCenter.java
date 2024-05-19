package lt.viko.eif.spetrauskas.model;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class ServiceCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;
    private String address;
    private String phone;
}
