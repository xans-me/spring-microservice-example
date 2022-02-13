package com.xansme.userservice.dto;

import com.xansme.userservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateDTO {

    private User user;
    private Department department;
}
