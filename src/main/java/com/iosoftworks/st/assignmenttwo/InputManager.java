package com.iosoftworks.st.assignmenttwo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class InputManager {

    private static InputManager instance;

    public static InputManager getInstance() {
        if(instance == null) instance = new InputManager();
        return instance;
    }

    public boolean promptBool(String prompt) {
        // use promptBoolStreams using default system in/out streams.
        return promptBoolStreams(prompt, System.in, System.out);
    }

    // Prompts user via custom Input/Output streams, used for testing.
    public boolean promptBoolStreams(String prompt, InputStream in, OutputStream out) {
        try {
            prompt = prompt + " [y/N]: "; // add yes no prompt to end of prompt
            out.write(prompt.getBytes()); // write prompt to out stream

            // from https://stackoverflow.com/questions/309424/how-do-i-read-convert-an-inputstream-into-a-string-in-java
            Scanner s = new Scanner(in).useDelimiter("\\A"); // setup scanner to read input stream
            while (!s.hasNextLine()) {} // wait for input
            String r = s.nextLine(); // grab input

            return r.equalsIgnoreCase("y"); // return true if y, false if anything else.
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
