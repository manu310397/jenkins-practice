package com.manoj.greet;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class GreeterTest {

    private Greeter greeter;

    public GreeterTest() {}

    @Before
    public void setUp() {
        greeter = new Greeter();
    }

    @Test
    public void greetShouldIncludeTheOneBeingGreeted() {
        String someone = "World!";

        assertThat(greeter.greet(someone), containsString(someone));
    }

    @Test
    public void greetShouldIncludeTheOneBeingGreeted1() {
        String someone = "Second Test";

        assertThat(greeter.greet(someone), containsString(someone));
    }
}