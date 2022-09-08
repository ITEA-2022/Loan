package com.itea.loan.controllers;

import com.itea.loan.dto.RequestDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
public class RequestController {
    @PostMapping("createRequest")
    private String createRequest (@Valid @RequestBody RequestDto requestDto){
        return "request";
    }
}
