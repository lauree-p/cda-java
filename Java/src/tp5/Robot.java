package tp5;

public class Robot {
	String status;
	int speed;
	float temperature;

	/**
	 * Check temperature
	 */
	public void checkTemperature() {
		if (temperature > 660) {
			status = "retour au bercail";
			speed = 5;
		}
	}

	/**
	 * Show attributes status, speed & temperature
	 */
	public void showAttributes() {
		System.out.println("Statut : " + status);
		System.out.println("Vitesse : " + speed);
		System.out.println("Température : " + temperature);
	}

}
