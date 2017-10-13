package ch.pg.ticktakto.controller;

import java.sql.SQLException;
import java.util.Optional;
import java.util.Random;

import ch.pg.ticktakto.model.Game;
import ch.pg.ticktakto.model.KI;
import ch.pg.ticktakto.model.Backgound;
import ch.pg.ticktakto.view.Start;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

/**
 * 
 * @author Patrick
 * 
 *         The Controller where the Game is.
 */
public class Controllerplay {

	@FXML
	protected ImageView image1, image2, image3, image4, image5, image6, image7, image8, image9;

	@FXML
	protected Text names;

	int turns = 0;
	int value;

	String numbers;

	Game game = new Game();

	/**
	 * @throws SQLException
	 * 
	 *             for an randmom start who will start
	 */
	@FXML
	public void initialize() {
		game.Type();
		Random random = new Random();
		value = random.nextInt(2) + 1;

		if (Backgound.getKI() == true) {
			Game.actualTable = "table1";
			names.setText(Game.play1.getName());
		} else {
			if (value == 1) {
				Game.actualTable = "table1";
				names.setText(Game.play1.getName());
			} else if (value == 2) {
				Game.actualTable = "table2";
				names.setText(Game.play2.getName());
			}
		}
	}

	/**
	 * @param e
	 * 
	 *            Klick on a ImageVIew for an Cross or an sircle and changes the
	 *            table to the other person
	 */
	@FXML
	protected void Fix(MouseEvent e) {
		if (Backgound.getKI() == true) {
			Game.actualTable = "table1";
		}
		ImageView fixer = (ImageView) e.getSource();
		if (fixer.isDisable() == false) {
			fixer.setOpacity(0.90);

			numbers = fixer.getId();
			Case();
		}

		if (Game.getActualTable() == "table1") {
			if (Backgound.getKI() == true) {
				if (!(Game.Box1.getValue() == 0) || !(Game.Box2.getValue() == 0) || !(Game.Box3.getValue() == 0)
						|| !(Game.Box4.getValue() == 0) || !(Game.Box5.getValue() == 0) || !(Game.Box6.getValue() == 0)
						|| !(Game.Box7.getValue() == 0) || !(Game.Box8.getValue() == 0)
						|| !(Game.Box9.getValue() == 0)) {
					Game.actualTable = "table2";
					KI.inteligenz();

					numbers = "image" + KI.kinumber;

					Case();

					Game.actualTable = "table1";
					names.setText(Game.play1.getName());
				}

			} else if (Game.getActualTable() == "table1" && Backgound.getKI() == false) {
				Game.actualTable = "table2";
				names.setText(Game.play2.getName());
			}
		} else if (Game.getActualTable() == "table2" && Backgound.getKI() == false) {
			names.setText(Game.play1.getName());
			Game.actualTable = "table1";
		}
	}

	/**
	 * For placing the Cross or the Circles in each of the 9 Boxes
	 */
	public void Case() {
		switch (numbers) {
		case ("image1"):
			Game.Box1.fix();
			image1.setImage(Game.Box1.getPicture());
			Game.Box1.setFixed(true);
			image1.setDisable(true);
			break;
		case ("image2"):
			Game.Box2.fix();
			image2.setImage(Game.Box2.getPicture());
			Game.Box2.setFixed(true);
			image2.setDisable(true);
			break;
		case ("image3"):
			Game.Box3.fix();
			image3.setImage(Game.Box3.getPicture());
			Game.Box3.setFixed(true);
			image3.setDisable(true);
			break;
		case ("image4"):
			Game.Box4.fix();
			image4.setImage(Game.Box4.getPicture());
			Game.Box4.setFixed(true);
			image4.setDisable(true);
			break;
		case ("image5"):
			Game.Box5.fix();
			image5.setImage(Game.Box5.getPicture());
			Game.Box5.setFixed(true);
			image5.setDisable(true);
			break;
		case ("image6"):
			Game.Box6.fix();
			image6.setImage(Game.Box6.getPicture());
			Game.Box6.setFixed(true);
			image6.setDisable(true);
			break;
		case ("image7"):
			Game.Box7.fix();
			image7.setImage(Game.Box7.getPicture());
			Game.Box7.setFixed(true);
			image7.setDisable(true);
			break;
		case ("image8"):
			Game.Box8.fix();
			image8.setImage(Game.Box8.getPicture());
			Game.Box8.setFixed(true);
			image8.setDisable(true);
			break;
		case ("image9"):
			Game.Box9.fix();
			image9.setImage(Game.Box9.getPicture());
			Game.Box9.setFixed(true);
			image9.setDisable(true);
			break;
		}

		Game.table1.checkforwin();
		Game.table2.checkforwin();
		turns++;

		if (Game.getEnd() == 1 || Game.getEnd() == 2) {
			End();
		} else if (turns == 9) {
			Game.end = 3;
			End();
		}
	}

	/**
	 * @param e
	 * 
	 *            who will win and an screen for going back to the start (first
	 *            scene)
	 */
	@FXML
	public void End() {

		String text = null;
		if (Game.getEnd() == 1) {
			Backgound.streak1 = Backgound.getStreak1() + 1;
			text = "The Winnes is: " + Game.play1.getName() + " With a winnstreak of: " + Backgound.getStreak1();
		} else if (Game.getEnd() == 2) {
			Backgound.streak2 = Backgound.getStreak2() + 1;
			text = "The Winner is: " + Game.play2.getName() + " With a winnstreak of: " + Backgound.getStreak2();
		} else if (Game.getEnd() == 3) {
			text = "The Winners are: " + Game.play1.getName() + " and " + Game.play2.getName()
					+ " The WinnBackgound are: " + Backgound.getStreak1() + " and " + Backgound.getStreak2();
		}

		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Winner");
		alert.setHeaderText(text);
		alert.setContentText("Choose your option.");

		ButtonType buttonTypeOne = new ButtonType("Restart");
		ButtonType buttonTypeTwo = new ButtonType("Cancel");

		alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo);

		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == buttonTypeOne) {
			Start.loadScene("/ch/pg/ticktakto/view/Playground");
		} else if (result.get() == buttonTypeTwo) {
			Backgound.streak1 = 0;
			Backgound.streak2 = 0;
			Backgound.setKI(false);
			Start.loadScene("/ch/pg/ticktakto/view/Main");
		}
	}
}
