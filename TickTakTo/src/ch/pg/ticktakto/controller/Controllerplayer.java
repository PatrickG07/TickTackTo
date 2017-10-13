package ch.pg.ticktakto.controller;

import ch.pg.ticktakto.model.Backgound;
import ch.pg.ticktakto.model.Game;
import ch.pg.ticktakto.view.Start;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * 
 * @author Patrick
 *
 *         Controller class for set player name.
 */
public class Controllerplayer {

	@FXML
	protected TextField player1, player2;

	@FXML
	protected RadioButton RBKI;

	/**
	 * @param e
	 * 
	 *            set a red border around the TextFilds when nothing are tiped.
	 *            and to set if you want to play against an AI / KI
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
			Game.play2.setName("KI / AI");

			Start.loadScene("/ch/pg/ticktakto/view/Playground");
		} else {
			player1.setStyle("-fx-text-box-border: red;");
			player2.setStyle("-fx-text-box-border: red;");
		}
	}

	/**
	 * @param e
	 * 
	 *            Returns to the main Controller.
	 */
	@FXML
	protected void Back(ActionEvent e) {
		Start.loadScene("/ch/pg/ticktakto/view/Main");
	}
}
