package com.itea.loan.services;

import com.itea.loan.dto.ClientDto;
import com.itea.loan.entities.Client;
import com.itea.loan.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public void saveClient(ClientDto clientDto) {
        //some addition logic
        clientRepository.save(new Client(clientDto.getClientName(),clientDto.getAge(),clientDto.getAddress(),clientDto.getSex(),
                clientDto.getBirthday(),clientDto.getIpn(),clientDto.getPassport(), clientDto.getEmail()));
    }

    @Override
    public Client clientDetailInfo(Long id) {
        return clientRepository.getById(id);
    }
}
