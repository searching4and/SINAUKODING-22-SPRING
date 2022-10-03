package com.farhankoding.tokofarhan.service;

import com.farhankoding.tokofarhan.entity.dto.AuthenticationDTO;
import com.farhankoding.tokofarhan.entity.dto.ResponseAuthDTO;
import com.farhankoding.tokofarhan.entity.dto.UserDTO;

public interface AuthService {
    ResponseAuthDTO register(UserDTO data);

    ResponseAuthDTO login(AuthenticationDTO data);
}