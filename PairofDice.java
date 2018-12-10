/**
 * @(#)PairofDice.java
 *
 *
 * @author 
 * @version 1.00 2018/12/7
 */




public class PairofDice
{
   
   public static void main (String[] args)
   {
   		final int ROLLS = 1000;
   		int boxCars = 0, num1, num2;
   		
   		Die die1 = new Die();
   		Die die2 = new Die();
   		
   		for (int roll = 1; roll <= ROLLS; roll++)
   		{
   			num1 = die1.roll();
   			num2 = die2.roll();
   		
   		if (num1 == 6 && num2 == 6)
   			boxCars++;
   		}
   		
   		System.out.println ("Number of rolls : " + ROLLS);
   		System.out.println ("Number of box cars : " + boxCars);
   		System.out.println ("Ratio :" + (double)boxCars/ROLLS);
   }
}
