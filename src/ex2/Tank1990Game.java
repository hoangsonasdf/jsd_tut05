package ex2;

import javax.swing.*;
import java.io.IOException;

public class Tank1990Game {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tank 1990");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            Battlefield battlefield = new Battlefield("game.map");
            frame.add(battlefield.getBattlefieldPanel());
        } catch (IOException e) {
            e.printStackTrace();
        }

        frame.setVisible(true);
    }
}
