package main.java;

import java.awt.*;

public class MousePointer {
    public static void main(String[] args) {
        while (true) {
            try {
                // These coordinates are screen coordinates
                int xCoord = 500;
                int yCoord = 500;

                // Move the cursor
                Robot robot = new Robot();
                robot.mouseMove(xCoord, yCoord);
                System.out.println("Moved mouse");
                robot.delay(500);
            } catch (AWTException e) {
            }
        }
    }
}
