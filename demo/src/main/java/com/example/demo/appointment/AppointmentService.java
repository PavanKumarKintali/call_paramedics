package com.example.demo.appointment;
import com.example.demo.doctor.Doctors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentMappingRepository;

    @Autowired
    public AppointmentService(AppointmentRepository appointmentMappingRepository) {
        this.appointmentMappingRepository = appointmentMappingRepository;
    }

    public List<Doctors> docData(String location, String expertise) {
        return appointmentMappingRepository.docData(location,expertise);
    }

    public List<Appointments> getAppointmentsHistory() {

        return appointmentMappingRepository.findAll();
    }

    public List<String> getLoc() {
        List<String> location=appointmentMappingRepository.getLoc();
        for(i=0;i<location.length;i++){
            
        }
    }

}
