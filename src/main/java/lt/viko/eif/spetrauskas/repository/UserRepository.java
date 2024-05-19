package lt.viko.eif.spetrauskas.repository;

import lt.viko.eif.spetrauskas.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
