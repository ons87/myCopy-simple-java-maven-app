package com.mycompany.app;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    public App app;
    @BeforeEach
    public void init(){
          app = new App();
    }
    @Test
    public void testAppConstructor() {
        App app2 = new App();
        assertEquals(app.getMessage(), app2.getMessage());
    }

    @Test
    public void testStars()
    {
        String[] list = {"*", "*", "", "*" ,"", "", "*", "*"};
        assertEquals(2, app.countStars(list));
    }

    @Test
    public void testStarsOne()
    {
        String[] list = {"*", "", "", "*" ,"", "", "*", "*"};
        assertEquals(1, app.countStars(list));
    }

    @Test
    public void testStarsNone()
    {

        String[] list = {"*", "", "", "*" ,"", "", "", "*"};
        assertEquals(0, app.countStars(list));
    }

    @Test
    public void testStarsEmpty()
    {
        String[] list = {};
        assertEquals(0, app.countStars(list));
    }
}
