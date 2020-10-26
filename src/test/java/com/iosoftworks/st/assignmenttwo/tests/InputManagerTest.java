package com.iosoftworks.st.assignmenttwo.tests;

import com.iosoftworks.st.assignmenttwo.InputManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;

public class InputManagerTest {

    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private static final PrintStream originalOut = System.out;
    private static final PrintStream originalErr = System.err;
    private static final InputStream originalIn  = System.in;

    @BeforeClass
    public static void setup() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterClass
    public static void reset() {
        System.setOut(originalOut);
        System.setErr(originalErr);
        System.setIn(originalIn);
    }

    @Test
    public void PromptBoolStreams_ExpectingTrue() {
        Assert.assertTrue(InputManager.getInstance().promptBoolStreams("Test True", new ByteArrayInputStream("y\n".getBytes()), System.out));
    }

    @Test
    public void PromptBoolStreams_ExpectingFalse() {
        Assert.assertFalse(InputManager.getInstance().promptBoolStreams("Test False", new ByteArrayInputStream("n\n".getBytes()), System.out));
    }

    @Test
    public void PromptBoolStreams_ExpectingFalse_InvalidInput() {
        Assert.assertFalse(InputManager.getInstance().promptBoolStreams("Test Invalid Input", new ByteArrayInputStream("invalid input\n".getBytes()), System.out));
    }

    @Test
    public void PromptBool_ExpectingTrue() {
        System.setIn(new ByteArrayInputStream("y\n".getBytes()));
        Assert.assertTrue(InputManager.getInstance().promptBool("Test True"));
    }

    @Test
    public void PromptBool_ExpectingFalse() {
        System.setIn(new ByteArrayInputStream("n\n".getBytes()));
        Assert.assertFalse(InputManager.getInstance().promptBool("Test False"));
    }

    @Test
    public void PromptBool_ExpectingFalse_InvalidInput() {
        System.setIn(new ByteArrayInputStream("invalid input\n".getBytes()));
        Assert.assertFalse(InputManager.getInstance().promptBool("Test Invalid Input"));
    }
}
