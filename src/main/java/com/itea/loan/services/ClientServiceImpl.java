package com.itea.loan.services;

import com.itea.loan.entities.Client;
import com.itea.loan.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client SaveClient(Client client) {
        //some addition logic
        clientRepository.save(client);
        return client;
    }

    @Override
    public Client ClientDetailInfo(Long id) {
        return clientRepository.getById(id);
    }
}
