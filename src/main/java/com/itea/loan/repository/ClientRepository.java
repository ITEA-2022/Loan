package com.itea.loan.repository;

//import ch.qos.logback.core.net.server.Client;
import com.itea.loan.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findByClientName(String clientName);
}
