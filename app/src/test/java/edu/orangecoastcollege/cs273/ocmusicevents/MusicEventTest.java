package edu.orangecoastcollege.cs273.ocmusicevents;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MusicEventTest {

    private MusicEvent testEvent;

    @Before
    public void setUp() throws Exception {
        testEvent = new MusicEvent();
    }

    @Test
    public void getSetTitle() throws Exception {
        assertNull("Testing that getTile() is null", testEvent.getTitle());
        testEvent.setTitle("Led Zeppelin");
        assertEquals("Led Zeppelin", testEvent.getTitle());
    }

    @Test
    public void getSetDate() throws Exception {
        assertNull("Testing that getDate() is null", testEvent.getDate());
        testEvent.setDate("March 19");
        assertEquals("March 19", testEvent.getDate());
    }

    @Test
    public void setDate() throws Exception {
    }

    @Test
    public void getDay() throws Exception {
    }

    @Test
    public void setDay() throws Exception {
    }

    @Test
    public void getTime() throws Exception {
    }

    @Test
    public void setTime() throws Exception {
    }

    @Test
    public void getLocation() throws Exception {
    }

    @Test
    public void setLocation() throws Exception {
    }

    @Test
    public void getAddress1() throws Exception {
    }

    @Test
    public void setAddress1() throws Exception {
    }

    @Test
    public void getAddress2() throws Exception {
    }

    @Test
    public void setAddress2() throws Exception {
    }

    @Test
    public void getImageName() throws Exception {
    }

    @Test
    public void setImageName() throws Exception {
    }

}