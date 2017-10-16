package ch.pg.ticktakto.model;

import javafx.scene.image.Image;

public class Box {

	private int value;
	private boolean fixed = false; 
	private Image picture;

	/**
	 * for seting the corect image for each player cross or circle
	 */
	public void fix() {
		if (fixed == false) {
			if(Game.getActualTable() == "table1") {
				value = 1;
			}else if(Game.getActualTable() == "table2"){
				value = 2;
			}
			fixed = true;
			
			switch (value) {
			case 1:
				picture = new Image("/ch/pg/ticktakto/sources/cross.png");
				break;
			case 2:
				picture = new Image("/ch/pg/ticktakto/sources/circle.png");
				break;
			}
		}
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isFixed() {
		return fixed;
	}

	public void setFixed(boolean fixed) {
		this.fixed = fixed;
	}

	public Image getPicture() {
		return picture;
	}
}
