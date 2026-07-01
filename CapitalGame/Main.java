package javaCollections.CapitalGame;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[]args) {

        HashMap<String, String> countries = new HashMap<>();

        try {
            File file = new File("src/javaCollections/CapitalGame/countries.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                String[] parts = line.split(" ");

                if (parts.length == 2) {
                    String country = parts[0].trim();
                    String capital = parts[1].trim();

                    countries.put(country, capital);
                }
            }

            scanner.close();

        }catch (FileNotFoundException exception) {
            System.out.println("File not found");
            return;
        }
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your user: ");
        String user = input.nextLine();

        System.out.println("\nWelcome "+ user + " Let's start the game\n");

        List<String> countryList = new ArrayList<>(countries.keySet());
        Collections.shuffle(countryList);

        int score = 0;

        for (int i = 0; i < 10 && i < countryList.size(); i++) {

            String country = countryList.get(i);
            String correctCapital = countries.get(country);

            System.out.print("What is the capital of " + country + "? ");

            String answer = input.nextLine();

            if (answer.equals(correctCapital)) {
                System.out.println("Correct");
                score ++;
            } else {
                System.out.println("Wrong");
            }
        }
        System.out.println("Game over, " + user);
        System.out.println("Your score: " + score +"/10");

        try {
            FileWriter writer = new FileWriter("src/javaCollections/CapitalGame/scores.txt", true);
            writer.write(user + "," + score +"\n");
            writer.close();

            System.out.println("Score saved successfully.");

        } catch (IOException exception) {
            System.out.println("Error saving score.");
        }

        input.close();
    }
}
