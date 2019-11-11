package nils_miniräknare;

/**
 * skapar nummer egenskaperna
 *
 */
public class CalcNumberButton extends CalcButton {

    public CalcNumberButton(String str) {
        super(str);
    }

    @Override
    public void onClick() {
        numpad.display.textProperty().set(getInput() + this.getText());
    }

}
