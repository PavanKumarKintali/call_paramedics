package com.example.demo.appointment;

import com.example.demo.doctor.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointments,Long> {

    @Query("SELECT e from Doctors e where e.location =:name AND e.expertise =:role")
    List<Doctors> docData(@Param("name") String location, @Param("role")String expertise);

    @Query("SELECT e.location,e.expertise from Doctors e")
    List<String> getLoc();
}
