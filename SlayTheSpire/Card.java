// Card class to represent individual cards in the deck
             public class Card {
                String name;
                int cost;

                public Card(String name, int cost) {
                    this.name = name;
                    this.cost = cost;
                }
                @Override
                    public String toString() {
                    return name + " (Cost: " + cost + ")";
                }
            }