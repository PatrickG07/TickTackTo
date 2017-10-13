package ch.pg.ticktakto.controller;

import ch.pg.ticktakto.view.Start;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * @author Patrick
 *
 * The start controller class.
 */
public class Controllerstart {

	/**
	 * @param e
	 * 
	 * Changes the stage to the Player name setter controller class.
	 */
	@FXML
	protected void Spielen(ActionEvent e) {
		Start.loadScene("/ch/pg/ticktakto/view/Playerchange");
	}

	/**
	 * @param e
	 * 
	 * Closes The Programm
	 */
	@FXML
	protected void Quit(ActionEvent e) {
		System.exit(0);
	}
}
