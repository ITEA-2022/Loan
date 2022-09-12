package com.itea.loan.services;

import com.itea.loan.entities.Client;

public interface ClientService {
    Client ClientDetailInfo(Long id);
    Client SaveClient(Client client);
}
