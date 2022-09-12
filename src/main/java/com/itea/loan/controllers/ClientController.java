package com.itea.loan.controllers;

import com.itea.loan.dto.ClientDto;
import com.itea.loan.entities.Client;
import com.itea.loan.repository.ClientRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Validated
@RestController

public class ClientController {
    @Resource
    private ClientRepository clientRepository;
    @PostMapping("clients")
    public ResponseEntity<?> createUser(@Valid @RequestBody ClientDto clientdto) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        clientRepository.save(new Client(clientdto.getClientName(),clientdto.getAge(),clientdto.getAddress(),clientdto.getSex(),
                clientdto.getBirthday(),clientdto.getIpn(),clientdto.getPassport(), clientdto.getEmail()));
        return ResponseEntity.ok(clientdto);
    }
}
