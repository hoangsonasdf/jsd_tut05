package ex2;

import java.io.*;
import java.util.ArrayList;

public class MapLoader {
    public static ArrayList<String> loadMap(String filepath) {
        ArrayList<String> mapData = new ArrayList<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filepath));
            while (reader.ready()) {
                mapData.add(reader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                assert reader != null;
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return mapData;
    }
}
