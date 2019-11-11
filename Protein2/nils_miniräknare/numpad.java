package nils_miniräknare;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class numpad extends Application
{

    public static TextField display;

    @Override
    public void start(Stage primaryStage)
    {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 270, 170); // bestämmer miniräknarens storlek

        display = new TextField(); // skapar texfielden
        
        display.textProperty().set(display.textProperty().get()); //visar det som ska stå i textfältet
        display.setEditable(false); // så att man inte kan skriva på fri hand

        root.setTop(display); // sätter displayen på högst up

        GridPane numPad = new GridPane(); // skapar en ny gridpane för numpaden
        
        /*
         * skapar alla olika knapparna
         *  
         */

        CalcButton btn1 = new CalcNumberButton("1");
        CalcButton btn2 = new CalcNumberButton("2");
        CalcButton btn3 = new CalcNumberButton("3");
        CalcButton add = new CalcOperatorButton("+");
        CalcButton btn4 = new CalcNumberButton("4");
        CalcButton btn5 = new CalcNumberButton("5");
        CalcButton btn6 = new CalcNumberButton("6");
        CalcButton sub = new CalcOperatorButton("-");
        CalcButton btn7 = new CalcNumberButton("7");
        CalcButton btn8 = new CalcNumberButton("8");
        CalcButton btn9 = new CalcNumberButton("9");
        CalcButton div = new CalcOperatorButton("/");
        CalcButton btnC = new CalcActionButton("C");
        CalcButton btn0 = new CalcNumberButton("0");
        CalcButton equal = new CalcActionButton("=");
        CalcButton mul = new CalcOperatorButton("*");
        CalcButton pow = new CalcOperatorButton("^");
        CalcButton mod = new CalcOperatorButton("%");
        CalcButton dot = new CalcNumberButton(".");
        CalcButton sqrt = new CalcActionButton("√");
        CalcButton startP = new CalcOperatorButton("(");
        CalcButton endP = new CalcOperatorButton(")");
        CalcButton addMem = new CalcActionButton("M+");
        CalcButton mem = new CalcActionButton("Mr");

        /*
         * sätter knapparna i ordning
         */
        HBox row1 = new HBox( addMem , btn1 ,  btn2 , btn3 , add    , sub );
        HBox row2 = new HBox( mem    , btn4 ,  btn5 , btn6 , div    , mul );
        HBox row3 = new HBox( sqrt   , btn7 ,  btn8 , btn9 , pow    , mod );
        HBox row4 = new HBox( btnC   , dot  ,  btn0 , equal, startP , endP );
        
        /*
         * sätter knapparna i olika rader
         */

        numPad.add(row1,1,1);
        numPad.add(row2,1,2);
        numPad.add(row3,1,3);
        numPad.add(row4,1,4);

        /*
         * sätter numpaden i center
         */
        root.setCenter(numPad);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args){ launch(); } //startar hela jävla skiten
}