package designPattern.factoryMethod;

import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		EnemyShip theEnemy = null;
		Scanner userImput = new Scanner(System.in);
		System.out.println("what type Ship? (U/R/B)");
		if (userImput.hasNextLine()) {
			String tipeOfShip = userImput.nextLine();
			theEnemy = EnemyShipFactory.makeEnemyShip(tipeOfShip);
		} 
		if (theEnemy != null) {
			doStuffEnemy(theEnemy);
		} else {
			System.out.println("U,R or B");
		}
	}
	public static void doStuffEnemy(EnemyShip enemy) {
		enemy.displayHeroShip();
		enemy.enemyShipShoots();
		enemy.followHeroShip();
	}
}
