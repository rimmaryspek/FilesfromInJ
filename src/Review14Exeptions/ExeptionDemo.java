package Review14Exeptions;

import utils.configReader;

import java.io.IOException;

public class ExeptionDemo {
    public static void main(String[] args)  {
        try {
            configReader.read("skjdbfjsdhbf");
        } catch (IOException ignored) {
        }
        System.out.println("important line of code");

    }
}

