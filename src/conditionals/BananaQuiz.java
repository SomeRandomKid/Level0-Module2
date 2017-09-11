//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String g = JOptionPane.showInputDialog(null, "Do You Like Bananas?");
		
		//2. if they say no,
	 if (g.equals("no")) {
			JOptionPane.showMessageDialog(null, "You're a vegetable!");
		}
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
	 else if (g.equals("yes")) {
		String h = JOptionPane.showInputDialog(null, "What is your favarite hobby?");
		JOptionPane.showMessageDialog(null, h + " is better with bananas ");
		}
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than yes or no
	 else  if(!g.equals("yes")||!g.equals("no")) {
			JOptionPane.showMessageDialog(null, "You are insane!!!");
		}
		//	show a pop up that says â€œYou are bananas!â€�
	
	}

}
