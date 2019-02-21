package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class UpdateTest {
    Update app;

    @Before
    public void setUp() throws Exception {
        app = new Update();
    }

    @After
    public void tearDown() throws Exception {
        app = null;
    }

    @Test
    public void test1() throws IOException {


        ArrayList<String> Expected = new ArrayList<String>();
        Expected.add("Kiwi");
        Expected.add("Grape");
        Expected.add("Mango");
        Expected.add("Berry");

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Apple");
        arrayList.add("Grape");
        arrayList.add("Melon");
        arrayList.add("Berry");

        ArrayList actual = app.checkList(arrayList);
        assertEquals(Expected, actual);

        assertNotNull(app);

    }

    @Test
    public void test2() throws IOException {


        ArrayList<String> Expected = new ArrayList<String>();

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Apple");
        arrayList.add("Grape");
        arrayList.add("Melon");
        arrayList.add("Berry");

        ArrayList actual = app.removeList(arrayList);
        assertEquals(Expected, actual);

        assertNotNull(app);

    }

}

