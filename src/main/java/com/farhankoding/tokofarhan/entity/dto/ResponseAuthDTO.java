package com.farhankoding.tokofarhan.entity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseAuthDTO {
    private Long id;

    private String username;

    private String profileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String token;
}