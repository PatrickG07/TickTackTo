package ch.pg.ticktakto.controller;

import ch.pg.ticktakto.model.Backgound;
import ch.pg.ticktakto.model.Game;
import ch.pg.ticktakto.view.Start;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * Controller class for set player name.
 * 
 * @author Patrick
 */
public class Controllerplayer {

	@FXML
	protected TextField player1, player2;

	@FXML
	protected RadioButton RBKI;

	/**
	 * set a red border around the TextFilds when nothing are tipped. and to set if
	 * you want to play against a Bot
	 * 
	 * @param e
	 */
	@FXML
	protected void Play(ActionEvent e) {
		if (RBKI.isSelected() == true) {
			Backgound.setKI(true);
		} else {
			Backgound.setKI(false);
		}

		if (!player1.getText().equals("") && !player2.getText().equals("") && Backgound.getKI() == false) {
			Game.play1.setName(player1.getText());
			Game.play2.setName(player2.getText());

			Start.loadScene("/ch/pg/ticktakto/view/Playground");
		} else if (!player1.getText().equals("") && Backgound.getKI() == true) {
			Game.play1.setName(player1.getText());
			Game.play2.setName("Bot");

			Start.loadScene("/ch/pg/ticktakto/view/Playground");
		} else {
			player1.setStyle("-fx-text-box-border: red;");
			player2.setStyle("-fx-text-box-border: red;");
		}
	}

	/**
	 * Returns to the main Controller.
	 * 
	 * @param e
	 */
	@FXML
	protected void Back(ActionEvent e) {
		Start.loadScene("/ch/pg/ticktakto/view/Main");
	}
}
