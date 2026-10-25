import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

// Reads the input file for deck building
public class ReadFile {
                public static void loadDeck(Deck deck) {
                    try {
                        File file = new File("inputFileForSlayTheSpireDeck.txt");
                        Scanner scanner = new Scanner(file);

              
                      //Reads the file and creates a deck of cards
                        try {
                            while (scanner.hasNextLine()) {
                                String line = scanner.nextLine();
                                int colonIndex = line.lastIndexOf(':');
                                String cardName = line.substring(0, colonIndex);
                                int cardCost = Integer.parseInt(line.substring(colonIndex + 1).trim());
                                

                                //Creates a new card object and adds it to the deck
                                Card card = new Card(cardName, cardCost);
                                deck.addCard(card);
                                System.out.println("Added card: " + card.toString());
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