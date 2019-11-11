package nils_miniräknare;

import javafx.scene.paint.Color;

	/**
	 * skapar operation egenskaperna
	 *
	 */
public class CalcOperatorButton extends CalcButton {

    public CalcOperatorButton(String str) {
        super(str);
        this.setTextFill(Color.BLUE);

    }

    @Override
    public void onClick() {
        numpad.display.textProperty().set(getInput() + " " + this.getText() + " ");
    }

}
