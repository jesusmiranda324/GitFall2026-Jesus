import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Random;


class SlayTheSpire {
            
            // Initialized game components 
            
            //Imports file for deck building
            static class ReadFile {
                static void main(String[] args) {
                    try {
                        File file = new File("inputFileForSlayTheSpireDeck.txt");
                        Scanner scanner = new Scanner(file);

                        try {
                            while (scanner.hasNextLine()) {
                                String line = scanner.nextLine();
                                System.out.println(line);
                            }
                        } finally {
                            scanner.close();
                        }
                        
                        scanner.close();
                    } catch (FileNotFoundException e) {
                        System.err.println("Error: inputFileForSlayTheSpireDeck.txt file not found");
                    }
                }
            }
            // Generates a random ID for the deck
            int randomIDGenerator() {
                    Random random = new Random();
                    return random.nextInt(999999999);
            }

            public static void main(String[] args) {
            System.out.println("Welcome to Slay the Spire!");
            //Calls the ReadFile class to read the input file for deck building
            ReadFile.main(null);
            int deckID = new SlayTheSpire().randomIDGenerator();
            System.out.println("Your deck ID is: " + deckID);
        }
    }