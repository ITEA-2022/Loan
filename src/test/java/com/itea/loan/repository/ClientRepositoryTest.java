package com.itea.loan.repository;

import com.itea.loan.entities.Client;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientRepositoryTest {

    @Resource
    private ClientRepository clientRepository;

    @org.junit.Before
    public void setUp() throws Exception {

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        clientRepository.save(new Client("Client1",12,"adresa1","male", formatter.parse("01-01-2001"),"11111111","aaa111"));
        clientRepository.save(new Client("Client2",12,"adresa2","male", formatter.parse("01-01-2002"),"22222222","bbb2222"));
        clientRepository.save(new Client("Client3",12,"adresa3","male", formatter.parse("01-01-2003"),"33333333","ccc333"));

    }

    @Test
    public void test(){
        Assert.assertEquals(3,clientRepository.findAll().size());
        Assert.assertEquals("Client2",clientRepository.findByClientName("Client2").getClientName());
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }


}