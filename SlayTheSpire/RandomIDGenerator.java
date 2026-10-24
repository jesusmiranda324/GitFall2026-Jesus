import java.util.Random;
// Generates a random ID for the deck
class RandomIDGenerator {            
   public static int createRandomID() {
                    Random random = new Random();
                    return random.nextInt(999999999);
                 }

}