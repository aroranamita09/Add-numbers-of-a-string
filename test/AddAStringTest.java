package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddAStringTest {

    AddAString obj;
    @Before
    public void setUp() throws Exception {
        obj = new AddAString();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void strMatcher() {
        assertEquals(461,obj.AddString("43 68 9 23 318"));

    }
}
