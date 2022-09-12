package com.itea.loan.services;

import com.itea.loan.dto.ClientDto;
import com.itea.loan.entities.Client;

public interface ClientService {
    Client clientDetailInfo(Long id);
    void saveClient(ClientDto clientDto);

}
