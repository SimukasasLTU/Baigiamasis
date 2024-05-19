package lt.viko.eif.spetrauskas.repository;

import lt.viko.eif.spetrauskas.model.ServiceAppointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ServiceAppointmentRepository extends JpaRepository<ServiceAppointment, UUID> {
}
