package com.xansme.userservice.service;

import com.xansme.userservice.dto.Department;
import com.xansme.userservice.dto.ResponseTemplateDTO;
import com.xansme.userservice.entity.User;
import com.xansme.userservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("Inside saveUser of UserService");
        return userRepository.save(user);
    }

    public ResponseTemplateDTO getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment of UserService");
        ResponseTemplateDTO dto = new ResponseTemplateDTO();
        User user = userRepository.findByUserId(userId);

        Department department = restTemplate.getForObject("http://localhost:9001/departments/"+user.getDepartmentId(), Department.class);

        dto.setUser(user); dto.setDepartment(department);
        return dto;
    }
}
