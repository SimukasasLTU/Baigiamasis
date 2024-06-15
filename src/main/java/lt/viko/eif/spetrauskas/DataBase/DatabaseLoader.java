package lt.viko.eif.spetrauskas.DataBase;

import lt.viko.eif.spetrauskas.model.*;
import lt.viko.eif.spetrauskas.repository.ServiceAppointmentRepository;
import lt.viko.eif.spetrauskas.repository.ServiceCenterRepository;
import lt.viko.eif.spetrauskas.repository.UserRepository;
import lt.viko.eif.spetrauskas.repository.VehicleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DatabaseLoader {

    @Bean
    CommandLineRunner initDatabase(ServiceAppointmentRepository appointmentRepository,
                                   VehicleRepository vehicleRepository,
                                   ServiceCenterRepository serviceCenterRepository) {
        return args -> {
            // Sukurti ir saugoti ServiceCenter
            ServiceCenter serviceCenter = new ServiceCenter();
            serviceCenter.setName("Igorio garazas 1");
            serviceCenter.setAddress("123 vailniau g");
            serviceCenter.setPhone("123-456-7890");
            serviceCenterRepository.save(serviceCenter);

//            // Sukurti saugoti auto
//            Vehicle vehicle = new Vehicle();
//            vehicle.setMake("Toyota");
//            vehicle.setModel("Corolla");
//            vehicle.setYear(2020);
//            vehicle.setVin("1HGCM82633A123456");
//            vehicleRepository.save(vehicle);
//
//            // Sukurti ir issaugoti ServiceAppointment
//            ServiceAppointment appointment = new ServiceAppointment();
//            appointment.setVehicle(vehicle);
//            appointment.setServiceCenter(serviceCenter);
//            appointment.setAppointmentDate(LocalDateTime.now().plusDays(3));
//            appointment.setServiceType("Sarnytu keitimas");
//            appointment.setStatus("Scheduled");
//            appointmentRepository.save(appointment);

            // Sukurti ir issaugoti User
//            User user = new User();
//            user.setName("Jonas ValancUnas");
//            user.setEmail("Jonasvalancunas@gmail.com");
//            user.setPassword("Jonas");
//            user.setPhone("8615151551");
//            UserRepository.save(user);

        };
    }
}
