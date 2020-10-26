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
        return promptBoolStreams(prompt, System.in, System.out);
    }

    public boolean promptBoolStreams(String prompt, InputStream in, OutputStream out) {
        try {
            prompt = prompt + " [y/N]: ";
            out.write(prompt.getBytes());

            Scanner s = new Scanner(in).useDelimiter("\\A");
            while (!s.hasNextLine()) {}
            String r = s.nextLine();
            return r.equalsIgnoreCase("y");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
