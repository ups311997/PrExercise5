package com.stackroute.pe5;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.Assert.*;

public class CheckTest {
    Check app;

    @Before
    public void setUp() throws Exception {
        app = new Check();
    }

    @After
    public void tearDown() throws Exception {
        app = null;
    }

    @Test
    public void Test() throws IOException {

        HashMap expected = new HashMap();
        expected.put("a", true);
        expected.put("b", false);
        expected.put("c", true);
        expected.put("d", false);


        String input[] = {"a", "b", "c", "d", "a", "c", "c"};
        HashMap actual = app.checkCharacter(input);

        assertEquals("msg", expected, actual);

        assertNotNull(app);


    }
}

