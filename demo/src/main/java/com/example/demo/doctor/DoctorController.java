package com.example.demo.doctor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "api/v1/doctor")
@CrossOrigin("*")
public class DoctorController {
    private final DoctorService doctorService;

    @Autowired
    public DoctorController(DoctorService doctorService){this.doctorService=doctorService;}

    @GetMapping
    public List<Doctors> getDoctorData(){ return doctorService.getdoctors();}

    @RequestMapping(path = "/login")
    @GetMapping
    public String authenication(@RequestParam String email,Long mobileNumber){ return doctorService.authenication(email,mobileNumber);}

    @PostMapping
    public void registerDoctor(@RequestBody Doctors doctors){
        doctorService.addnewDoctor(doctors);
    }
}
