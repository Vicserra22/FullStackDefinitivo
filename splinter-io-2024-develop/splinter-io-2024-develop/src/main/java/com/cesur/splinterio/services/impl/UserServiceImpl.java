package com.cesur.splinterio.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cesur.splinterio.models.User;
import com.cesur.splinterio.models.dtos.UserDTO;
import com.cesur.splinterio.repositories.UserRepository;
import com.cesur.splinterio.services.UserService;

public class UserServiceImpl implements UserService{
    
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDTO getUserByEmail(String email) {
        User user = userRepository.getUserByEmail(email).get();
        UserDTO response = new UserDTO();
        response.setActive(user.getActive());
        response.setEmail(user.getEmail());
        response.setId(user.getId());
        response.setLastConnection(user.getLastConnection());
        response.setName(user.getName());
        response.setRol(user.getRol());
        return response;
    }

    @Override
    public void updateUser(UserDTO user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public void deleteUser(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

    @Override
    public void storeUser(UserDTO user) {
       
    }
    
}