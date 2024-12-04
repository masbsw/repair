package com.repair.repair.service;


import com.repair.repair.dal.DataAccessLayer;
import com.repair.repair.dto.SignupRequest;
import com.repair.repair.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl {
    private final DataAccessLayer dataAccessLayer;
    @Autowired
    public UserDetailsServiceImpl(DataAccessLayer dataAccessLayer){
        this.dataAccessLayer = dataAccessLayer;
    }

    public String newUser(SignupRequest signupRequest){
        User user = new User();
        user.setUsername(signupRequest.getUsername());
        user.setPassword(signupRequest.getPassword());
        user.setEmail(signupRequest.getEmail());
        return dataAccessLayer.newUserToDatabase(user);
    }
}
