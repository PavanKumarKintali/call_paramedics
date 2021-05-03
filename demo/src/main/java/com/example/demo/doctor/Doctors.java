package com.example.demo.doctor;

import javax.persistence.*;

@Entity
@Table
public class Doctors {

    @Id
    @SequenceGenerator(
            name = "doc_sequence",
            sequenceName = "doc_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "doc_sequence"
    )
    private Long doctorId;
    private String name;
    private String email;
    private Long mobileNumber;
    private String location;
    private String expertise;

    public Doctors() {
    }

    public Doctors(String name, String email, Long mobileNumber, String location, String expertise) {
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.location = location;
        this.expertise = expertise;
    }

    public Doctors(Long doctorId, String name, String email, Long mobileNumber, String location, String expertise) {
        this.doctorId = doctorId;
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.location = location;
        this.expertise = expertise;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "doctorId=" + doctorId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", location='" + location + '\'' +
                ", expertise='" + expertise + '\'' +
                '}';
    }
}
