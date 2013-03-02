/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.io.Serializable;


public class Card implements Serializable
{
	private Integer value;
	private String suit;
	
	public Card(int initvalue, String initsuit)
	{
		value = initvalue;
		suit = initsuit;
	}
	
	
	public Integer getValue()
	{
		return value;
	}
	
	public String getSuit()
	{
		return suit;
	}
	
	
	public String toString()
	{
		String newvalue;
		String newstring;
                if(value == 11)
		{
			newvalue = "j";
		}
		else if(value == 12)
		{
			newvalue = "q";
		}
		else if(value == 13)
		{
			newvalue = "k";
		}
		else
		{
			newvalue = String.valueOf(value);
		}
		newstring = suit + newvalue;
		return newstring;
	}
}
	

