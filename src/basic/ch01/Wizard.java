package basic.ch01;

public class Wizard {
	String name;
	int power;
	int hp;
	public Wizard(String myName, int myPower) {

		this.name = myName;
		this.power = myPower;
		hp = 50;
	}
	
	// 전사를 공격하다
	public void attackWarrior(Warrior warrior) {
		warrior.beAttacked(this.power);
	}
	public void beAttacked(int power) {
		//방어적 코드
		hp = hp - power;
		if(hp <= 0) {
			hp = 0;
			System.out.println("죽었다");
			return;
		}
		
	}
}
