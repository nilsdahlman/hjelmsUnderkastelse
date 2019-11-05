package Miniräknare;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class numpad extends Application
{

    @Override
    public void start(Stage primaryStage)
    {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 180, 250);

        TextField display = new TextField();
        
        display.textProperty().set(display.textProperty().get());
        
        root.setTop(display);
        
        String[] keys =
        {
            "1", "2", "3", "+",
            "4", "5", "6", "-",
            "7", "8", "9", "/",
            "",  "0", "",  "*"
        };
        
        GridPane numPad = new GridPane();
        for (int i = 0; i < 16; i++){
        	
        	String keytext = keys [i];        	
            Button button = new Button(keytext);
            button.setOnAction(event -> {
            	display.textProperty().set(display.textProperty().get()+keytext);
            });
            button.getStyleClass().add("num-button");
            numPad.add(button, i % 4, (int) Math.ceil(i / 4));
        
        }
        root.setCenter(numPad);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}