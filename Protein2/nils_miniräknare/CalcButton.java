package nils_minir�knare;

import javafx.scene.control.Button;

/**
 * 
 * Skapar memory knappen
 *
 */

public abstract class CalcButton extends Button {

    public static String memory;

    public CalcButton(String str){
        this.setText(str);
        this.setOnAction(event -> {
            onClick();
        });
        this.setMinSize(45,35);
    }

    public String getInput(){
        return numpad.display.textProperty().get();
    }

    public abstract void onClick();

}
