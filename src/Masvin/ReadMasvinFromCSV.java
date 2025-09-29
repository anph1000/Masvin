package Masvin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadMasvinFromCSV {
    public static void main(String [] args) {
        String fileName = "Marsvin.rtf";

        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while (br.readLine() != null) {
                count++;
            }
        } catch (IOException e) {
            System.out.println("Fejl ved læsning: " + e.getMessage());
            return;
        }

        Masvin[] masvins = new Masvin[count];

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                String [] parts = line.split(";");
                if (parts.length == 3) {
                    String name = parts[0];
                    String breed = parts[1];
                    int food = Integer.parseInt(parts[2]);
                    masvins[i] = new Masvin(name, breed, food);
                    i++;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Marsvin: ");
        for (Masvin m : masvins) {
            System.out.println(m);
        }
    }
}
