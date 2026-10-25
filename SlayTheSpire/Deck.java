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
            public int getTotalCost(Deck deck) {
                    int totalCost = 0;
                    for (Card card : deck.deck) {
                        totalCost += card.cost;
                    }
                    return totalCost;
             
            }
            
            //Returns the cost histogram of the deck
            public int[] getCostHistogram(){
                int[] histogram = new int[7]; // Assuming costs are between 0 and 6
                for (Card card : deck) {
                    histogram[card.cost]++;
                }
                return histogram;
            }

            //Prints the cost histogram of the deck
            public void printCostHistogram() {
                int[] histogram = getCostHistogram();
                System.out.println("Cost Histogram:");
                for (int i = 0; i < histogram.length; i++) {
                    System.out.println("Cost " + i + ": " + histogram[i]);
                }
            }
             
    }