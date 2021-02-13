import java.util.Scanner;


public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(c.getValue());
            c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        Scanner in = new Scanner (System.in);
        
        System.out.println("Pick a Suit - Hearts 0, Diamonds 1, Clubs 2, Spades 3");
        String suit = in.nextLine(); 
        System.out.println("Pick a value for the suit");
        int value = in.nextInt();
        
        // create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
