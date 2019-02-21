package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class NamesortTest {
    Namesort app;

    @Before
    public void setUp() throws Exception {
        app = new Namesort();
    }

    @After
    public void tearDown() throws Exception {
        app = null;
    }

    @Test
    public void Test() throws IOException {
        TreeSet expected = new TreeSet();

        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("Olive");


        String input[] = {"Harry", "Olive", "Alice", "Bluto", "Eugene"};
        TreeSet actual = app.sortNames(input);

        assertEquals("msg", expected, actual);

        assertNotNull(app);


    }

}