package lt.viko.eif.spetrauskas.repository;

import lt.viko.eif.spetrauskas.model.ServiceCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ServiceCenterRepository extends JpaRepository<ServiceCenter, UUID> {
}
