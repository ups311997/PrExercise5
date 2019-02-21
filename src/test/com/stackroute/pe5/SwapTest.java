package com.stackroute.pe5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class SwapTest {


    Swap mp;

    @Before
    public void setUp() throws Exception {
        mp = new Swap();
    }

    @After
    public void tearDown() throws Exception {
        mp = null;
    }

    @Test
    public void test1() throws IOException {

        HashMap expected = new HashMap();
        expected.put("val1", " ");
        expected.put("val2", "Java");

        HashMap actual = mp.checkMap();
        assertEquals(expected, actual);

        assertNotNull(mp);

    }


}

