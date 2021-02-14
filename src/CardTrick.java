import java.util.Scanner;


public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(c.getValue());
            c.setSuit(Card.SUITS());
        }
        Scanner in = new Scanner (System.in);
        
        System.out.println("Pick a Suit - Hearts 0, Diamonds 1, Clubs 2, Spades 3");
        String suit = in.nextLine(); 
        System.out.println("Pick a value for the suit");
        int value = in.nextInt();
        
        System.out.println("Your card is the " + value + " of " + suit);
        
      
        System.out.println("the magic hand is..");
        System.out.println(magicHand);
        
  
    
    }
    
}
