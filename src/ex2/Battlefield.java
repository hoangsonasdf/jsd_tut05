package ex2;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class Battlefield {
    private JPanel battlefieldPanel;

    public Battlefield(String mapFilePath) throws IOException {
        battlefieldPanel = new JPanel(new GridLayout(10,10));
        ArrayList<String> mapData = MapLoader.loadMap(mapFilePath);

        for (String row : mapData) {
            for (char cell : row.toCharArray()) {
                switch (cell) {
                    case 'W':
                        battlefieldPanel.add(new JLabel(new ImageIcon("images/wall.gif")));
                        break;
                    case 'T':
                        battlefieldPanel.add(new JLabel(new ImageIcon("images/tank.gif")));
                        break;
                    case ' ':
                        battlefieldPanel.add(new JLabel());
                        break;
                }
            }
        }
    }

    public JPanel getBattlefieldPanel() {
        return battlefieldPanel;
    }
}
