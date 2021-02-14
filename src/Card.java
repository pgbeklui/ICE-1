// Prince Jr Gbeklui 991359591


public class Card 
{

   

   private String suit; 
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    
    public String getSuit() 
    {
        return suit;
    }

    
    public void setSuit(String suit) 
    {
        this.suit = suit;
       
    }

    
    public int getValue()
    {
        return value;
    }

    
    public void setValue(int value) 
    {
        this.value = value;
        
        value  = (int) Math.floor(Math.random() * 12);
    }
   
    
   
     public static void generateHand()
        {
                int countCards = 0;
		for(Card.suit s: Card.value.v())
                {
                    for(Card.value v: Card.value.values())
                    {
                        cards[countCards] = (new Card(s,v));
                        countCards++;
                    }
                }
        }        
}
