import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import control.Control;
import hero.abs.Hero;

public class Dispather {
	

	public static void main(String[] args) {
		Hero myHero = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean exit = false;
		boolean createHero = false;
		//int numberOfLoop=0;
		String firstHello="Hello in my game! Now you mast chose you character!\n"
				+ "It is can be Arcane with magic power, and Varvar with phisical power!\n"
				+ "Press 1 for Arcane, and 2 for Varvar";
		String getname = "Pleas enter name of your hero";
		System.out.println(firstHello);
		
		while(!exit){
			
			while(!createHero){
				
				int temp=0;
				
					try {
						temp = Integer.parseInt(reader.readLine());
					} catch (NumberFormatException | IOException e) {
						System.err.println("\nBad value, try again");
						continue;
					}
					try{
						myHero=Control.createHero(temp);
					}catch (NumberFormatException e) {
						System.err.println("\nBad value, try again");
						continue;
					}
					System.out.println(getname);
					
					try {
						myHero.setName(reader.readLine());
					} catch (IOException e) {
						System.err.println("\nBad value, try again");
						continue;
					}
				if(myHero!=null && myHero.getName()!=null){
				createHero = true;
				}
			}
			
			if (myHero!=null) {
				System.out.println(myHero.getName());
			}
			
			
			exit = true;
			
		}

	}
}
