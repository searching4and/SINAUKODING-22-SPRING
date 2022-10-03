package com.farhankoding.tokofarhan.service;

import com.farhankoding.tokofarhan.entity.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO findByUsername(String username);

    List<UserDTO> getAllData();
}