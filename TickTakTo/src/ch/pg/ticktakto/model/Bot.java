package ch.pg.ticktakto.model;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import ch.pg.ticktakto.model.Game;

public class Bot {

	public static int kinumber;
	public static int kirandom;

	/**
	 * the intelligence of the Bot to where set the Circle
	 */
	public static void intelligence() {
		int Box1 = Game.Box1.getValue();
		int Box2 = Game.Box2.getValue();
		int Box3 = Game.Box3.getValue();
		int Box4 = Game.Box4.getValue();
		int Box5 = Game.Box5.getValue();
		int Box6 = Game.Box6.getValue();
		int Box7 = Game.Box7.getValue();
		int Box8 = Game.Box8.getValue();
		int Box9 = Game.Box9.getValue();

		Boolean Boxf1 = Game.Box1.isFixed();
		Boolean Boxf2 = Game.Box2.isFixed();
		Boolean Boxf3 = Game.Box3.isFixed();
		Boolean Boxf4 = Game.Box4.isFixed();
		Boolean Boxf5 = Game.Box5.isFixed();
		Boolean Boxf6 = Game.Box6.isFixed();
		Boolean Boxf7 = Game.Box7.isFixed();
		Boolean Boxf8 = Game.Box8.isFixed();
		Boolean Boxf9 = Game.Box9.isFixed();

		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// for own line
		// Column
		// 1
		if (Box1 == Box2 && Boxf1 == true && Boxf2 == true && Boxf3 == false && Box1 == 2 && Box2 == 2) {
			kinumber = 3;
		} else if (Box2 == Box3 && Boxf2 == true && Boxf3 == true && Boxf1 == false && Box2 == 2 && Box3 == 2) {
			kinumber = 1;
		} else if (Box1 == Box3 && Boxf1 == true && Boxf3 == true && Boxf2 == false && Box1 == 2 && Box3 == 2) {
			kinumber = 2;
		}
		// 2
		else if (Box4 == Box5 && Boxf4 == true && Boxf5 == true && Boxf6 == false && Box4 == 2 && Box5 == 2) {
			kinumber = 6;
		} else if (Box5 == Box6 && Boxf5 == true && Boxf6 == true && Boxf4 == false && Box5 == 2 && Box6 == 2) {
			kinumber = 4;
		} else if (Box4 == Box6 && Boxf4 == true && Boxf6 == true && Boxf5 == false && Box4 == 2 && Box6 == 2) {
			kinumber = 5;
		}
		// 3
		else if (Box7 == Box8 && Boxf7 == true && Boxf8 == true && Boxf9 == false && Box7 == 2 && Box8 == 2) {
			kinumber = 9;
		} else if (Box8 == Box9 && Boxf8 == true && Boxf9 == true && Boxf7 == false && Box8 == 2 && Box9 == 2) {
			kinumber = 7;
		} else if (Box7 == Box9 && Boxf7 == true && Boxf9 == true && Boxf8 == false && Box7 == 2 && Box9 == 2) {
			kinumber = 8;
		}
		// Row
		// 1
		else if (Box1 == Box4 && Boxf1 == true && Boxf4 == true && Boxf7 == false && Box1 == 2 && Box4 == 2) {
			kinumber = 7;
		} else if (Box4 == Box7 && Boxf4 == true && Boxf7 == true && Boxf1 == false && Box4 == 2 && Box7 == 2) {
			kinumber = 1;
		} else if (Box1 == Box7 && Boxf1 == true && Boxf7 == true && Boxf4 == false && Box1 == 2 && Box7 == 2) {
			kinumber = 4;
		}
		// 2
		else if (Box2 == Box5 && Boxf2 == true && Boxf5 == true && Boxf8 == false && Box2 == 2 && Box5 == 2) {
			kinumber = 8;
		} else if (Box5 == Box8 && Boxf5 == true && Boxf8 == true && Boxf2 == false && Box5 == 2 && Box8 == 2) {
			kinumber = 2;
		} else if (Box2 == Box8 && Boxf2 == true && Boxf8 == true && Boxf5 == false && Box2 == 2 && Box8 == 2) {
			kinumber = 5;
		}
		// 3
		else if (Box3 == Box6 && Boxf3 == true && Boxf6 == true && Boxf9 == false && Box3 == 2 && Box6 == 2) {
			kinumber = 9;
		} else if (Box6 == Box9 && Boxf6 == true && Boxf9 == true && Boxf3 == false && Box6 == 2 && Box9 == 2) {
			kinumber = 3;
		} else if (Box3 == Box9 && Boxf3 == true && Boxf9 == true && Boxf6 == false && Box3 == 2 && Box9 == 2) {
			kinumber = 6;
		}

		// diagonal
		// 1
		else if (Box1 == Box5 && Boxf1 == true && Boxf5 == true && Boxf9 == false && Box1 == 1 && Box5 == 1) {
			kinumber = 9;
		} else if (Box5 == Box9 && Boxf5 == true && Boxf9 == true && Boxf1 == false && Box5 == 1 && Box9 == 1) {
			kinumber = 1;
		} else if (Box1 == Box9 && Boxf1 == true && Boxf9 == true && Boxf5 == false && Box1 == 1 && Box9 == 1) {
			kinumber = 5;
		}
		// 2
		else if (Box3 == Box5 && Boxf3 == true && Boxf5 == true && Boxf7 == false && Box3 == 1 && Box5 == 1) {
			kinumber = 7;
		} else if (Box5 == Box7 && Boxf5 == true && Boxf7 == true && Boxf3 == false && Box5 == 1 && Box7 == 1) {
			kinumber = 3;
		} else if (Box3 == Box7 && Boxf7 == true && Boxf7 == true && Boxf5 == false && Box3 == 1 && Box7 == 1) {
			kinumber = 5;
		}

		// for enemy line
		// Column
		// 1
		else if (Box1 == Box2 && Boxf1 == true && Boxf2 == true && Boxf3 == false && Box1 == 1 && Box2 == 1) {
			kinumber = 3;
		} else if (Box2 == Box3 && Boxf2 == true && Boxf3 == true && Boxf1 == false && Box2 == 1 && Box3 == 1) {
			kinumber = 1;
		} else if (Box1 == Box3 && Boxf1 == true && Boxf3 == true && Boxf2 == false && Box1 == 1 && Box3 == 1) {
			kinumber = 2;
		}
		// 2
		else if (Box4 == Box5 && Boxf4 == true && Boxf5 == true && Boxf6 == false && Box4 == 1 && Box5 == 1) {
			kinumber = 6;
		} else if (Box5 == Box6 && Boxf5 == true && Boxf6 == true && Boxf4 == false && Box5 == 1 && Box6 == 1) {
			kinumber = 4;
		} else if (Box4 == Box6 && Boxf4 == true && Boxf6 == true && Boxf5 == false && Box4 == 1 && Box6 == 1) {
			kinumber = 5;
		}
		// 3
		else if (Box7 == Box8 && Boxf7 == true && Boxf8 == true && Boxf9 == false && Box7 == 1 && Box8 == 1) {
			kinumber = 9;
		} else if (Box8 == Box9 && Boxf8 == true && Boxf9 == true && Boxf7 == false && Box8 == 1 && Box9 == 1) {
			kinumber = 7;
		} else if (Box7 == Box9 && Boxf7 == true && Boxf9 == true && Boxf8 == false && Box7 == 1 && Box9 == 1) {
			kinumber = 8;
		}
		// Row
		// 1
		else if (Box1 == Box4 && Boxf1 == true && Boxf4 == true && Boxf7 == false && Box1 == 1 && Box4 == 1) {
			kinumber = 7;
		} else if (Box4 == Box7 && Boxf4 == true && Boxf7 == true && Boxf1 == false && Box4 == 1 && Box7 == 1) {
			kinumber = 1;
		} else if (Box1 == Box7 && Boxf1 == true && Boxf7 == true && Boxf4 == false && Box1 == 1 && Box7 == 1) {
			kinumber = 4;
		}
		// 2
		else if (Box2 == Box5 && Boxf2 == true && Boxf5 == true && Boxf8 == false && Box2 == 1 && Box5 == 1) {
			kinumber = 8;
		} else if (Box5 == Box8 && Boxf5 == true && Boxf8 == true && Boxf2 == false && Box5 == 1 && Box8 == 1) {
			kinumber = 2;
		} else if (Box2 == Box8 && Boxf2 == true && Boxf8 == true && Boxf5 == false && Box2 == 1 && Box8 == 1) {
			kinumber = 5;
		}
		// 3
		else if (Box3 == Box6 && Boxf3 == true && Boxf6 == true && Boxf9 == false && Box3 == 1 && Box6 == 1) {
			kinumber = 9;
		} else if (Box6 == Box9 && Boxf6 == true && Boxf9 == true && Boxf3 == false && Box6 == 1 && Box9 == 1) {
			kinumber = 3;
		} else if (Box3 == Box9 && Boxf3 == true && Boxf9 == true && Boxf6 == false && Box3 == 1 && Box9 == 1) {
			kinumber = 6;
		}

		// diagonal
		// 1
		else if (Box1 == Box5 && Boxf1 == true && Boxf5 == true && Boxf9 == false && Box1 == 1 && Box5 == 1) {
			kinumber = 9;
		} else if (Box5 == Box9 && Boxf5 == true && Boxf9 == true && Boxf1 == false && Box5 == 1 && Box9 == 1) {
			kinumber = 1;
		} else if (Box1 == Box9 && Boxf1 == true && Boxf9 == true && Boxf5 == false && Box1 == 1 && Box9 == 1) {
			kinumber = 5;
		}
		// 2
		else if (Box3 == Box5 && Boxf3 == true && Boxf5 == true && Boxf7 == false && Box3 == 1 && Box5 == 1) {
			kinumber = 7;
		} else if (Box5 == Box7 && Boxf5 == true && Boxf7 == true && Boxf3 == false && Box5 == 1 && Box7 == 1) {
			kinumber = 3;
		} else if (Box3 == Box7 && Boxf7 == true && Boxf7 == true && Boxf5 == false && Box3 == 1 && Box7 == 1) {
			kinumber = 5;
		} else {
			rand();
		}
	}

	/**
	 * to set the circle to an random Position it also checks if the Box is not
	 * Fixed
	 */
	public static void rand() {
		kinumber = 0;
		Random random = new Random();
		kirandom = random.nextInt(9) + 1;

		switch (kirandom) {
		case (1):
			if (Game.Box1.isFixed() == false) {
				kinumber = 1;
			} else {
				rand();
			}
			break;
		case (2):
			if (Game.Box2.isFixed() == false) {
				kinumber = 2;
			} else {
				rand();
			}
			break;
		case (3):
			if (Game.Box3.isFixed() == false) {
				kinumber = 3;
			} else {
				rand();
			}
			break;
		case (4):
			if (Game.Box4.isFixed() == false) {
				kinumber = 4;
			} else {
				rand();
			}
			break;
		case (5):
			if (Game.Box5.isFixed() == false) {
				kinumber = 5;
			} else {
				rand();
			}
			break;
		case (6):
			if (Game.Box6.isFixed() == false) {
				kinumber = 6;
			} else {
				rand();
			}
			break;
		case (7):
			if (Game.Box7.isFixed() == false) {
				kinumber = 7;
			} else {
				rand();
			}
			break;
		case (8):
			if (Game.Box8.isFixed() == false) {
				kinumber = 8;
			} else {
				rand();
			}
			break;
		case (9):
			if (Game.Box9.isFixed() == false) {
				kinumber = 9;
			} else {
				rand();
			}
			break;
		}
		if (kinumber == 0) {
			rand();
		}
	}
}
