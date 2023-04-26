package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void remainTest(){
        assertEquals(service.remain(900), 100);
    }

    @Test
    public void minTest(){
        assertEquals(service.remain(1), 999);
    }

    @Test
    public void zeroTest(){
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void negativeTest(){
        assertEquals(service.remain(-1), 1001);
    }

    @Test
    public void maxTest(){
        assertEquals(service.remain(900950), 50);
    }

}