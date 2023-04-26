package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemain() {
        assertEquals(service.remain(900), 100);
    }

    @Test
    public void testMin(){
        assertEquals(service.remain(1), 999);
    }

    @Test
    public void testZero(){
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void testNegative(){
        assertEquals(service.remain(-1), 1001);
    }

    @Test
    public void testMax(){
        assertEquals(service.remain(1000), 0);
    }
  
}