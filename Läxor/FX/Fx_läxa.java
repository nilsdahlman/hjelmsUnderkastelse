package FX;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Fx_l�xa {

	public static Rectangle Top() {

		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.BLUE);

		return bg;
	}
	

	public static void main(String[] args) {
		launch();
	}
}
