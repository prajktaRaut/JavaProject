package com.bridgelabz.designpattern.Singletone;

public class StaticBlockInitializationSingaltone {

	static StaticBlockInitializationSingaltone instance;
	

		private StaticBlockInitializationSingaltone() {
		
		}	
		
		static
		{
			try {
				
				instance= new StaticBlockInitializationSingaltone();		
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
		public static StaticBlockInitializationSingaltone getInstance()
		{
			return instance;
			
		}
}
