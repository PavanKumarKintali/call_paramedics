package com.example.demo.doctor;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctors,Long> {

    @Query("SELECT u FROM Doctors u WHERE u.email = ?1")
    Optional<Doctors> findDoctorByEmail(String email);

    @Query("SELECT e from Doctors e where e.email =:name AND e.mobileNumber =:role")
    Optional<Doctors> doctorAuthenication(@Param("name") String email,@Param("role")Long mob);
}
