 import java.util.ArrayList;
 import java.util.List;

 
 //Creates a map of the deck with card names and their corresponding values expressed as costs
           
 public class Deck{
            private List<Card> deck = new ArrayList<>();
            
            //Adds a card to the deck
            void addCard(Card card) {
                deck.add(card);
            }
            //Prints the cards in the deck
            void printDeck() {
                System.out.println("Deck:");
                for (Card card : deck) {
                    System.out.println(card);
                }
            }
            //Returns the size of the deck
            int size() {
                return deck.size();
            }
        }