package com.itea.loan.controllers;

import com.itea.loan.dto.ManagerDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
public class ManagerController {
    @PostMapping("createManager")
    private String createManager(@Valid @RequestBody ManagerDto managerDto){
        return "manager";
    }
}
