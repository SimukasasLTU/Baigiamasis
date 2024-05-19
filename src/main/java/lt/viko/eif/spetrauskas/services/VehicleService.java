package lt.viko.eif.spetrauskas.services;

import lt.viko.eif.spetrauskas.model.Vehicle;
import lt.viko.eif.spetrauskas.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    @Autowired
    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public Vehicle getVehicleById(UUID id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Vehicle updateVehicle(UUID id, Vehicle vehicle) {
        Vehicle existingVehicle = getVehicleById(id);
        if (existingVehicle != null) {
            existingVehicle.setMake(vehicle.getMake());
            existingVehicle.setModel(vehicle.getModel());
            existingVehicle.setYear(vehicle.getYear());
            existingVehicle.setVin(vehicle.getVin());
            return vehicleRepository.save(existingVehicle);
        }
        return null;
    }

    public void deleteVehicle(UUID id) {
        vehicleRepository.deleteById(id);
    }
}
