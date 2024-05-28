package lt.viko.eif.spetrauskas.model;
//auto seviso atspindys ir susietą su duomenų bazės lentele.
import lombok.Data;
//automati6kai generuojami getteriai ir seteriai
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
