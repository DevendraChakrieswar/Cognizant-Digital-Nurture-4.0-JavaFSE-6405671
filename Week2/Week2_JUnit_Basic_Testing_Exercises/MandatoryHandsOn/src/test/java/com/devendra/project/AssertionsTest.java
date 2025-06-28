package com.devendra.project;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        assertEquals(5, 2+3);
        assertTrue(5 > 3);
        assertFalse(5 < 3);
        String value = null;
        assertNull(value);
        Object obj = new Object();
        assertNotNull(obj);
    }
}
