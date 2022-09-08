package com.itea.loan.repository;

import com.itea.loan.entities.Requests;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.text.SimpleDateFormat;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class RequestsRepositoryTest {

    @Resource
    private RequestsRepository requestsRepository;

    @Before
    public void setUp() throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        requestsRepository.save(new Requests(1L,1,1L,1L,1L,formatter.parse("01-01-2020"),formatter.parse("02-02-2020")));
        requestsRepository.save(new Requests(3L,1,1L,1L,1L,formatter.parse("01-01-2021"),formatter.parse("02-02-2021")));

    }

    @Test
    public void test(){
        Assert.assertEquals(2,requestsRepository.findAll().size());
        Assert.assertEquals(2,requestsRepository.findAll().stream().mapToDouble(r -> r.getSum()).sum() );

    }

    @After
    public void tearDown() throws Exception {
    }
}