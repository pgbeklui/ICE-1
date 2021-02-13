// Prince Jr Gbeklui 991359591



public class Card 
{

   private String suit; 
   private int value;

   
   
    public enum suit = {"Hearts", "Diamonds", "Spades", "Clubs"};
    
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
   
    
   
    
}
