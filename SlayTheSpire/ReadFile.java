import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

// Reads the input file for deck building
public class ReadFile {
    
    // Creates an array of cards from the input file and adds them to invalidCards list if they are invalid
    public static List<Card> invalidCards = new ArrayList<>();
    //Creates a set of valid card names to check if the card name is valid
    public static Set<String> validCardNames = new HashSet<>();
    public static int numberOfRows = 0;
    public static boolean isOverAThousandCards = false;
    
    public static void loadDeck(Deck deck) {
                invalidCards.clear();
                numberOfRows = 0;
                isOverAThousandCards = false;
                validCardNames.clear();
                loadValidCardNames();

                    try {
                        File file = new File("inputFileForSlayTheSpireDeck.txt");
                        Scanner scanner = new Scanner(file);

              
                      //Reads the file and creates a deck of cards
                        try {
                            int numberOfCards = 0;
                            while (numberOfCards <= 1000 && scanner.hasNextLine()) {
                                numberOfRows++;
                                String line = scanner.nextLine();

                                //Checks to see if there are more than 1000 cards in the input file
                                if (numberOfCards >= 1000) {
                                    isOverAThousandCards = true;                                                             
                                    continue;
                                }

                                int colonIndex = line.lastIndexOf(':');
                                String cardName = line.substring(0, colonIndex).trim();
                                int cardCost = Integer.parseInt(line.substring(colonIndex + 1).trim());
                                //Checks to see if the card name is valid, if not, adds the card to the invalidCards list
                                if (!validCardNames.contains(cardName)) {
                                    invalidCards.add(new Card(cardName, cardCost));
                                    continue;
                                }
                                
                                //Checks to see if the card cost is valid, if not, adds the card to the invalidCards list
                                if (cardCost < 0 || cardCost > 6) {
                                    invalidCards.add(new Card(cardName, cardCost));
                                    continue;
                                }
                                

                                //Creates a new card object and adds it to the deck
                                Card card = new Card(cardName, cardCost);
                                deck.addCard(card);
                                numberOfCards++;
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
                // Returns the list of invalid cards
                public static List<Card> getInvalidCards() {
                    return invalidCards;
                }
                //Returns if there are more than 1000 cards in the input file
                public static boolean isOverAThousandCards() {
                    return isOverAThousandCards;
                }
                //Reads the validCardNames.txt file and adds the valid card names to the validCardNames set
                public static void loadValidCardNames() {
                    try {
                        File file = new File("cardList.txt");
                        Scanner scanner = new Scanner(file);
                        while (scanner.hasNextLine()) {
                            String line = scanner.nextLine();
                            validCardNames.add(line.trim());
                        }
                        scanner.close();
                    } catch (FileNotFoundException e) {
                        System.err.println("Error: cardList.txt file not found");
                    }
                }
            }
        

    