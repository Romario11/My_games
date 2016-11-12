package hero.abs;

import iface.SpecialKick;

public abstract class Hero implements SpecialKick {
	private String name;
	private int HP;
	private int MP;
	private int power;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getMP() {
		return MP;
	}

	public void setMP(int mP) {
		MP = mP;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	
	
	public void kick() {
		
	}


}
