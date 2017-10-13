package ch.pg.ticktakto.model;

public class Backgound {

	public static int streak1;
	public static int streak2;
	
	public static Boolean KI = false;
	
	public static int getStreak1() {
		return streak1;
	}
	public static void setStreak1(int streak1) {
		Backgound.streak1 = streak1;
	}
	public static int getStreak2() {
		return streak2;
	}
	public static void setStreak2(int streak2) {
		Backgound.streak2 = streak2;
	}
	public static Boolean getKI() {
		return KI;
	}
	public static void setKI(Boolean kI) {
		KI = kI;
	}
	
}
