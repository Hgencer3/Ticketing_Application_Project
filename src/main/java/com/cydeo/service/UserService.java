package com.cydeo.service;

import com.cydeo.dto.UserDTO;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UserService {

    List<UserDTO> listAllUsers();
    UserDTO findByUserName(String username);
    void save(UserDTO dto);
    UserDTO update(UserDTO dto);
    void deleteByUserName(String username);
    void delete(String username);


}
