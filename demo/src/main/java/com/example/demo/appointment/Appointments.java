package com.example.demo.appointment;


import com.example.demo.doctor.Doctors;
import com.example.demo.user.Users;

import javax.persistence.*;

@Entity
@Table
public class Appointments {

    @Id
    @SequenceGenerator(
            name = "app_sequence",
            sequenceName = "app_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "app_sequence"
    )
    private Long appId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctors doctors;

    public Appointments() {
    }

    public Appointments(Users users, Doctors doctors) {
        this.users = users;
        this.doctors = doctors;
    }

    public Appointments(Long appId, Users users, Doctors doctors) {
        this.appId = appId;
        this.users = users;
        this.doctors = doctors;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Doctors getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctors doctors) {
        this.doctors = doctors;
    }
}
