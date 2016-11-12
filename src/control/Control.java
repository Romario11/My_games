package control;

import hero.Arcane;
import hero.Varvar;
import hero.abs.Hero;

public class Control {
	public static Hero createHero(int i) {
		if(i==1){
			return new Arcane();
		}else if (i==2) {
			return new Varvar();
		}else {
			throw new NumberFormatException();
		}
	}

}
