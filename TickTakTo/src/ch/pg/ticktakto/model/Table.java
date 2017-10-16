package ch.pg.ticktakto.model;

import ch.pg.ticktakto.model.Game;

public class Table {

	/**
	 * To check if there are 3 in an line
	 */
	public void checkforwin() {
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

		// Column
		if (Box1 == Box2 && Box2 == Box3 && Boxf1 == true && Boxf2 == true && Boxf3 == true) {
			if (Box1 == 1) {
				Game.end = 1;
			} else if (Box1 == 2) {
				Game.end = 2;
			}
		} else if (Box4 == Box5 && Box5 == Box6 && Boxf4 == true && Boxf5 == true && Boxf6 == true) {
			if (Box4 == 1) {
				Game.end = 1;
			} else if (Box4 == 2) {
				Game.end = 2;
			}
		} else if (Box7 == Box8 && Box8 == Box9 && Boxf7 == true && Boxf8 == true && Boxf9 == true) {
			if (Box7 == 1) {
				Game.end = 1;
			} else if (Box7 == 2) {
				Game.end = 2;
			}

			// Row
		} else if (Box1 == Box4 && Box4 == Box7 && Boxf1 == true && Boxf4 == true && Boxf7 == true) {
			if (Box1 == 1) {
				Game.end = 1;
			} else if (Box1 == 2) {
				Game.end = 2;
			}
		} else if (Box2 == Box5 && Box5 == Box8 && Boxf2 == true && Boxf5 == true && Boxf8 == true) {
			if (Box2 == 1) {
				Game.end = 1;
			} else if (Box2 == 2) {
				Game.end = 2;
			}
		} else if (Box3 == Box6 && Box6 == Box9 && Boxf3 == true && Boxf6 == true && Boxf9 == true) {
			if (Box3 == 1) {
				Game.end = 1;
			} else if (Box3 == 2) {
				Game.end = 2;
			}

			// diagonal
		} else if (Box1 == Box5 && Box5 == Box9 && Boxf1 == true && Boxf5 == true && Boxf9 == true) {
			if (Box1 == 1) {
				Game.end = 1;
			} else if (Box1 == 2) {
				Game.end = 2;
			}
		} else if (Box3 == Box5 && Box5 == Box7 && Boxf3 == true && Boxf5 == true && Boxf7 == true) {
			if (Box3 == 1) {
				Game.end = 1;
			} else if (Box3 == 2) {
				Game.end = 2;
			}
		}
	}
}