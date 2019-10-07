package com.bridgelabz.datastructure;

public class BalanceParentheses {

	public static void main(String[] args) {
		
		String str="([5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)]";// scanner 
		
		char[] cha=str.toCharArray();
		
		Stack<Character> s= new Stack<>();
		
		int counter=0;
		
		for(int i=0;i<cha.length;i++)
		{
			if(cha[i]=='(' || cha[i]=='[' || cha[i]=='{')
			{
				s.push('(');
				counter++;
			}
			else if(cha[i]==')' || cha[i]==']' || cha[i]=='}')
			{
				counter--;
				
				if(!s.isEmpty())
				{
					
				s.pop();
				
				}
				
			}
		}
		
		if (counter >=0) {
			System.out.println("Given Arithmatic expression is balanced");
		} else {
			System.out.println("Given Arithmatic expression is not balanced");
		}
		 
	}

}
