package ch.pg.ticktakto.model;

import ch.pg.ticktakto.model.Box;

/**
 * The Game class how creates the Boxs, tabels and the players.
 * 
 * @author Patrick
 */
public class Game {

	public static Box Box1 = new Box();
	public static Box Box2 = new Box();
	public static Box Box3 = new Box();
	public static Box Box4 = new Box();
	public static Box Box5 = new Box();
	public static Box Box6 = new Box();
	public static Box Box7 = new Box();
	public static Box Box8 = new Box();
	public static Box Box9 = new Box();

	public static Table table1 = new Table();
	public static Table table2 = new Table();

	public static Player play1 = new Player();
	public static Player play2 = new Player();

	public static String actualTable = "table1";

	public static int end = 0;

	/**
	 * it will reset the Box and the Bot
	 */
	public void Type() {
		Game.Box1.setFixed(false);
		Game.Box2.setFixed(false);
		Game.Box3.setFixed(false);
		Game.Box4.setFixed(false);
		Game.Box5.setFixed(false);
		Game.Box6.setFixed(false);
		Game.Box7.setFixed(false);
		Game.Box8.setFixed(false);
		Game.Box9.setFixed(false);

		Game.Box1.setValue(0);
		Game.Box2.setValue(0);
		Game.Box3.setValue(0);
		Game.Box4.setValue(0);
		Game.Box5.setValue(0);
		Game.Box6.setValue(0);
		Game.Box7.setValue(0);
		Game.Box8.setValue(0);
		Game.Box9.setValue(0);

		end = 0;

		Bot.kinumber = 0;
	}

	public static String getActualTable() {
		return actualTable;
	}

	public void setActualTable(String actualTable) {
		Game.actualTable = actualTable;
	}

	public static int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		Game.end = end;
	}

}
