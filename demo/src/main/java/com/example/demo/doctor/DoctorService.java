package com.example.demo.doctor;

import com.example.demo.user.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository){ this.doctorRepository= doctorRepository;}

    public List<Doctors> getdoctors() {
        return doctorRepository.findAll();
    }

    public void addnewDoctor(Doctors doctors) {
        Optional<Doctors> findEmail = doctorRepository.findDoctorByEmail(doctors.getEmail());
        if (findEmail.isPresent()){
            throw new IllegalStateException("email already exists");
        }

        doctorRepository.save(doctors);
    }

    public String authenication(String email,Long mob) {
        Optional<Doctors> docauth = doctorRepository.doctorAuthenication(email,mob);
        if (docauth.isPresent()){
            return "login Succesful";
        }
        else{
            return "Invalid Credentials";
        }
    }

}
