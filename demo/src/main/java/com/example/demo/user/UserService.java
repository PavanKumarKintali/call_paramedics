package com.example.demo.user;

import com.example.demo.doctor.Doctors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<Users> getusers(){
        return userRepository.findAll();
    }

    public void addnewUser(Users users){
        Optional<Users> findEmail = userRepository.findUserByEmail(users.getEmail());
        if (findEmail.isPresent()){
            throw new IllegalStateException("email already exists");
        }

        userRepository.save(users);

    }

    public Users getMob(String name) {
       return userRepository.getMob(name);
    }

    public String authenication(String email, Long mobileNumber) {
        Optional<Users> userauth = userRepository.userAuthenication(email,mobileNumber);
        if (userauth.isPresent()){
            return "login Succesful";
        }
        else{
            return "Invalid Credentials";
        }
    }
}
