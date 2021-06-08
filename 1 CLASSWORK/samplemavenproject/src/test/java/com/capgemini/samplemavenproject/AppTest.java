package com.capgemini.samplemavenproject;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test //annotation, used to identify this method as test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void shouldAnswerWithTrue1()
    {
        assertTrue(true);
    }
    @Test
    public void shouldAnswerWithFalse()
    {
        assertFalse( false);
    }
}
