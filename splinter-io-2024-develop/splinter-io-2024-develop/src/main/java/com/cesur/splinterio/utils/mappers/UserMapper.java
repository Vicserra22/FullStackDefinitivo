package com.cesur.splinterio.utils.mappers;

import java.time.LocalDateTime;

import com.cesur.splinterio.models.User;
import com.cesur.splinterio.models.dtos.UserDTO;
import com.cesur.splinterio.models.dtos.UserDTOWOP;

public class UserMapper {
    public static UserDTO userToDTO(User user){
        UserDTO response = new UserDTO();
        if(user != null){
            
            response.setId(user.getId());
            response.setName(user.getName());
            response.setEmail(user.getEmail());
            response.setRol(user.getRol());
            response.setActive(user.getActive());
            response.setLastConnection(user.getLastConnection());
        }
        return response;
    }

    public static UserDTOWOP userToDtoWOP(User user){
        UserDTOWOP response;
        if(user != null){
            response = new UserDTOWOP(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getRol(),
                user.getActive(),
                user.getLastConnection()
                );
                return response;
        }else{
            response = new UserDTOWOP();
            return response;
        }
        
    }


    public static User dtoToUserCreated(UserDTO user){
        User response = new User();
        if(user != null){
            response.setId(user.getId());
            response.setName(user.getName());
            response.setEmail(user.getEmail());
            response.setPassword(user.getPassword());
            response.setRol(user.getRol());  
            response.setActive(user.getActive());
            response.setCreatedAt(LocalDateTime.now());
            //response.setDeletedAt();
            //response.setUpdateAt();
            //response.setLastConnection();
        }
        return response;
    }

    public static User dtoToUserUpdate(UserDTO user){
        User response = new User();
        if(user != null){
            response.setId(user.getId());
            response.setName(user.getName());
            response.setEmail(user.getEmail());
            response.setPassword(user.getPassword());
            response.setRol(user.getRol());  
            response.setActive(user.getActive());
        } else{   
            //response.setDeletedAt();
            //response.setUpdateAt();
            //response.setLastConnection();
            if (user.getCreatedAt() != null){
                response.setDeletedAt(user.getCreatedAt());
            } else if (user.getUpdateAt() != null){
            
            }
        }
        return response;
    }    
}
