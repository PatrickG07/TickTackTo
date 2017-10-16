package ch.pg.ticktakto.controller;

import ch.pg.ticktakto.view.Start;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * The start controller class.
 * 
 * @author Patrick
 */
public class Controllerstart {

	/**
	 * Changes the stage to the Player name setter controller class.
	 * 
	 * @param e
	 */
	@FXML
	protected void Spielen(ActionEvent e) {
		Start.loadScene("/ch/pg/ticktakto/view/Playerchange");
	}

	/**
	 * Closes The Programm
	 * 
	 * @param e
	 */
	@FXML
	protected void Quit(ActionEvent e) {
		System.exit(0);
	}
}
