package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class CountTest {


    Count app;

    @Before
    public void setUp() throws Exception {
        app = new Count();
    }

    @After
    public void tearDown() throws Exception {
        app = null;
    }

    @Test
    public void Test() throws IOException {

        HashMap expected = new HashMap();
        expected.put("one", 5);
        expected.put("two", 2);
        expected.put("three", 2);

        String str = "one one -one___two,,three,one @three*one?two";
        String input[] = {"one", "two", "three"};
        HashMap actual = app.countFrequencies(str, input);

        assertEquals("msg", expected, actual);

        assertNotNull(app);


    }
}