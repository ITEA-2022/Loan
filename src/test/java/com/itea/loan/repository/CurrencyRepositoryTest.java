package com.itea.loan.repository;

import com.itea.loan.entities.Currency;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CurrencyRepositoryTest {

    @Resource
    private CurrencyRepository currencyRepository;

    @Before
    public void setUp() throws Exception {
        currencyRepository.save(new Currency("UAH"));
        currencyRepository.save(new Currency("USD"));
        currencyRepository.save(new Currency("EUR"));
    }

    @Test
    public void test(){
        Assert.assertEquals(3,currencyRepository.findAll().size());
        Assert.assertEquals("USD",currencyRepository.findByName("USD").getName());
    }

    @After
    public void tearDown() throws Exception {
    }
}