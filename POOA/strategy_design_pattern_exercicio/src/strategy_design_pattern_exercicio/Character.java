package strategy_design_pattern_exercicio;

public abstract class Character {
	WeaponBehavior weapon;
	public abstract void fight();
	public void setWeapon(WeaponBehavior w){
		this.weapon = w;
	}
}
