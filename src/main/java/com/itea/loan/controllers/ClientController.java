package com.itea.loan.controllers;

import com.itea.loan.dto.ClientDto;
import com.itea.loan.entities.Clients;
import com.itea.loan.repository.ClientsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.text.DateFormat;
import java.util.Date;


@Validated
@RestController
public class ClientController {
    @Resource
    private ClientsRepository clientRepository;
    @PostMapping("createClients")
    public ResponseEntity<?> createUser(@Valid @RequestBody ClientDto clientdto){
        Date date= new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate= dateFormat.format(date);
        clientRepository.save(new Clients(clientdto.getClientName(),clientdto.getAge(),clientdto.getAddress(),clientdto.getSex(),clientdto.getBirth_day(),clientdto.getIpn(),clientdto.getPassport()));
        return ResponseEntity.ok(clientdto);
    }
}
