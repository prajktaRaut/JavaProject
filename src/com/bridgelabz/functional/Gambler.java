package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

/**
 * Purpose: Simulates a gambler who start with $stake and place fair $1 bets 
 *  until he/she goes broke (i.e. has no money) or reach $goal.
 *  Keeps track of the number of times he/she wins and the number of bets he/she makes.
 *  Run the experiment N times, averages the results, and prints them out.
 * @author Bridgelabz
 * @version 1.8
 */

public class Gambler {

	public static void main(String[] args) {
		
		    int stake  = Integer.parseInt(args[0]);    
	        int goal   = Integer.parseInt(args[1]);   
	        int trials = Integer.parseInt(args[2]);    

	        
	        Utility.findgambler(stake, goal, trials);
	        
	        
	    }


	}


