package com.kuber.app.controller;

import com.kuber.common.constants.APIPath;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HealthController {

    @GetMapping(value = APIPath.HEALTH_CHECK)
    @ResponseStatus(HttpStatus.OK)
    public String healthCheck() {
        log.info("Test");
        return "success";
    }
}
