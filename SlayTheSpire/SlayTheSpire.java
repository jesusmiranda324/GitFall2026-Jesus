class SlayTheSpire {
            public static void main(String[] args) {
            System.out.println("Welcome to Slay the Spire!");
            //Creates a new deck object
            Deck deck = new Deck();
            //Calls the ReadFile class to read the input file for deck building
            ReadFile.loadDeck(deck);
            //Prints the cards in the deck
            deck.printDeck();
            //Generates a random ID for the deck
            int deckID = RandomIDGenerator.createRandomID();
            System.out.println("Your deck ID is: " + deckID);
            //Calls the CreateReport class to create a PDF report of the deck
            CreateReport createReport = new CreateReport();
            createReport.createReport(deckID,deck);
            }
    }