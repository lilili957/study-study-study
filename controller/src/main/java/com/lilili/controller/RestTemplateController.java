package com.lilili.controller;

import com.lilili.model.Student;
import com.lilili.service.RestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping(value = "restTemplate")
public class RestTemplateController {

    @Autowired
    RestService re1;
    @Autowired
    RestService re2;

    @PostMapping("postEnity")
    public Student postEntity(@RequestBody Student student) {
        log.info("[postEntity] - Parameter: student {}", student);
        student.setName("newName");
        student.setNickName("newNickName");
        return student;
    }


    @GetMapping("/scope")
    public void testBeanScope() {
        log.info("re1: {}", re1);
        log.info("re2: {}", re2);
    }
}
