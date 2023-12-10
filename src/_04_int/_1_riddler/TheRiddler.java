package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
		int score =0;
		// 1. Make a variable to hold the score
		String input = JOptionPane.showInputDialog("Riddle me this Conejillo, how many times did I breathe this year");
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		if(input.equals("917236")) {
			JOptionPane.showMessageDialog(null, "Congrats you get one extra point");
			score +=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "wrong -100000000 points");
			score -= 100000000;
		}
		String input1 = JOptionPane.showInputDialog("Ok then, if you have parents that are to opresive what is your blood type?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(input1.equals("A+")) {
			JOptionPane.showMessageDialog(null, "You are right one extra point!");
			score+=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Failure--Steven He by the way minus one google points");
			score-=10^100;
		}
		String input2 = JOptionPane.showInputDialog("finally last question what am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(input2.equals("Batman")) {
			JOptionPane.showMessageDialog(null, "Uh no im actually Yuri");
			score-=2;
		}
		else {
			JOptionPane.showMessageDialog(null, "Though wrong I admire you trying 8 points....");
			score+=4;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
			JOptionPane.showMessageDialog(null, score);
			JOptionPane.showMessageDialog(null, "yeah this is your score I hoped you like it so if you have"
					+ " 1 point or above your okay 0 whats wrong anywhere below DO YOU WANT TO PLAY A GAME");
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

