/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;
import java.io.Serializable;
import java.util.*;

public class Deck implements Serializable
{
	ArrayList<Card> deck = new ArrayList(52);
        int num = 0;
        int chips = 0;
        int call = 2;
        int played = 0;
	//constructor
	public Deck()
	{
		filldeck();
               Collections.shuffle(deck);
	}
	
	private void filldeck()
	{
		int position = 0;
		String fillsuit;
		for(int i = 1; i <= 4; i++)
		{
			if(i == 1)
			{
				fillsuit = "s";
			}
			else if(i == 2)
			{
				fillsuit = "h";
			}
			else if (i == 3)
			{
				fillsuit = "c";
			}
                        else
			{
				fillsuit = "d";
			}
			for(int j = 1; j <= 13; j++)
			{
				Card tempcard = new Card(j, fillsuit);
				deck.add(tempcard);   
				position++;
			}
		}
	}     
        
        public Card getCard()
        {
            if(num<52)
            return deck.get(num++);
  
            else
                return null;
        }
        
        public Card getCurrentCard()
        {
            if(call < 1)
                call = 2;
            int index = num-call;
            call--;
   
            return deck.get(index);
        }
            
        public void setChips(int c)
        {
            chips = c;
        }
        
        public int getChips()
        {
            return chips;
        }
        
        public void setPlayed(int p)
        {
            played = p;
        }
        
        public int getPlayed()
        {
            return played;
        }
}
