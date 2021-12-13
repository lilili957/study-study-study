package com.lilili.controller;

import com.lilili.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "restTest")
public class RestTemplateRequestController {
    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/postEntity")
    public Student postEntity(@RequestBody Student student) {
        ResponseEntity<Student> result = restTemplate.postForEntity("http://localhost:8001/restTemplate/postEntity", student, Student.class);
        return result.getBody();
    }
}
