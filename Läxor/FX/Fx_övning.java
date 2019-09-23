package FX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Fx_övning extends Application implements EventHandler<ActionEvent> {

	Button knappen;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}

	Group root = new Group();
	Scene scene = new Scene(root, 200, 300);
	boolean red = false;

	@Override
	public void start(Stage primaryStage) throws Exception {

		knappen = new Button("läxor?");
		knappen.setMinHeight(50);
		knappen.setMinWidth(60);
		knappen.setOnAction(this);

		root.setTranslateX(100);

		root.getChildren().add(knappen);

		primaryStage.setScene(scene);

		primaryStage.show();
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub

		if (event.getSource() == knappen) {
			if (red) {
				scene.setFill(Color.WHITE);
				red = false;
			} else {
				scene.setFill(Color.RED);
				red = true;
			}
			System.out.println("Nej tack!");
		}

	}

}