package com.sup.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{
   
    @Test
    public void testwithPositives()
    {
    	int a = 10;
    	int b = 20;
    	int expected = 30;
    	App app1 = new App();
    	int actual = app1.sum(10,20);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithNegatives()
    {
    	int a = -10;
    	int b = -20;
    	int expected = -30;
    	App app1 = new App();
    	int actual = app1.sum(-10,-20);
        assertEquals(expected, actual);
    }
    
   
    
    @Test
    public void testWithMixedValues()
    {
    	int a = 10;
    	int b = -20;
    	int expected = -10;
    	App app1 = new App();
    	int actual = app1.sum(10,-20);
        assertEquals(expected, actual);
    }
}

