package com.example.demo.appointment;

import com.example.demo.doctor.Doctors;
import com.example.demo.user.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/appointment")
@CrossOrigin("*")
public class AppointmentController {

    private final AppointmentService appointmentMappingService;

    @Autowired
    public AppointmentController(AppointmentService appointmentMappingService){
        this.appointmentMappingService=appointmentMappingService;
    }

    @GetMapping
    public List<Appointments> getAppointments(){
        return appointmentMappingService.getAppointmentsHistory();
    }

    @RequestMapping(path = "/book")
    @GetMapping
    public List<Doctors> docData(@RequestParam String location, String expertise){ return appointmentMappingService.docData(location,expertise);}

    @RequestMapping(path = "/location")
    @GetMapping
    public List<String> getLoc(){return appointmentMappingService.getLoc();}

}
