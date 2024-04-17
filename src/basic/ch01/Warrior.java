package basic.ch01;

public class Warrior {

	String name;
	int power;
	int hp;
	
	//생성자
	public Warrior(String myName, int myPower) {
		name = myName;
		power = myPower;
		hp = 100;
	}
	
	//Warrior  공격을 하다
	//Wizard  공격을 하다
	public void attackWizard(Wizard wizard) {
		System.out.println("마법사를 공격(" + this.power + ") 합니다");
		wizard.beAttacked(power);
	}
	
	//내가 공격을 받다
	public void beAttacked(int power) {
		//방어적 코드
		hp = hp -power;
		if(hp <= 0) {
			hp = 0;
			System.out.println("죽었다");
			return;
		}
		
	}
}
