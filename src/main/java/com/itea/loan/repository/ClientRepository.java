package com.itea.loan.repository;

//import ch.qos.logback.core.net.server.Client;
import com.itea.loan.entities.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Clients, Long> {
    Clients findByClientName(String clientName);
}
