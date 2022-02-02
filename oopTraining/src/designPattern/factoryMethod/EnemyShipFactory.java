package designPattern.factoryMethod;

public final class EnemyShipFactory {
	private EnemyShipFactory() {
	}

	public static EnemyShip makeEnemyShip(String newShipType) {
		if (newShipType.equals("U")) {
			return new UFOEnemyShip();
		} else if (newShipType.equals("R")) {
			return new RocketEnemyShip();
		} else if (newShipType.equals("B")) {
			return new BigUFOEnemyShip();
		} else
			return null;

	}

}
