package com.farhankoding.tokofarhan.service.impl;

import com.farhankoding.tokofarhan.entity.dto.UserDTO;
import com.farhankoding.tokofarhan.entity.mapping.UserMapping;
import com.farhankoding.tokofarhan.repository.UserRepository;
import com.farhankoding.tokofarhan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public UserDTO findByUsername(String username) {
        return UserMapping.instance.toDto(repository.findByUsername(username));
    }

    @Override
    public List<UserDTO> getAllData() {
        return UserMapping.instance.toListDto(repository.findAll());
    }
}