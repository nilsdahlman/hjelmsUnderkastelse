package nils_miniräknare;

import java.util.Scanner;

import javafx.scene.paint.Color;

public class CalcActionButton extends CalcButton {

	public CalcActionButton(String str) {
		super(str);
		this.setTextFill(Color.RED);
	}

	
	/*
	 *Skapar actionknapparna
	 */
	@Override
	public void onClick() {
		if (this.getText().equals("=")) {
			numpad.display.textProperty().set(calc(getInput()));
		} else if (this.getText().equals("C")) {
			numpad.display.textProperty().set("");
		} else if (this.getText().equals("M+")) {
			if (isNumeric(getInput())) {
				memory = getInput();
			}
		} else if (this.getText().equals("Mr")) {
			if (memory != null) {
				numpad.display.textProperty().set(getInput() + memory);
			}
		} else if (this.getText().equals("√")) {
			if (isNumeric(getInput())) {
				String root = Double.toString(Math.sqrt(Double.parseDouble(getInput())));
				numpad.display.textProperty().set(root);
			} else {
				numpad.display.textProperty().set(calc(getInput()));
				this.onClick();
			}
		}

	}

	private String calc(String str) {
		Scanner reader = new Scanner(str);

		String sum = null;
		String op = null;

		while (reader.hasNext()) { // för varje token

			String token = reader.next(); // hämta token

			if (isNumeric(token)) {
				if (sum == null) {
					sum = token;
				} else {
					sum = doOperation(op, sum, token);
				}

			} else if (isOperator(token)) {
				op = token;
			} else { // parantes
				if (token.equals("(")) {
					sum = doOperation(op, sum, calc(innerEquation(reader)));
				}
			}
		}
		return sum;
	}

	private String innerEquation(Scanner reader) {
		String eq = "";
		while (reader.hasNext()) {
			String token = reader.next();
			if (token.equals("(")) {
				eq += calc(innerEquation(reader));
			}
			if (token.equals(")")) {
				return eq;
			} else {
				if (isNumeric(token)) {
					eq += token;
				} else if (isOperator(token)) {
					eq += " " + token + " ";
				}
			}
		}
		return eq; // shouldn't happen :)
	}

			/*
			 * skapar operation knapparna
			 */
	private String doOperation(String op, String t1, String t2) {

		if (op.equals("+")) {
			double calc = Double.parseDouble(t1) + Double.parseDouble(t2);
			t1 = Double.toString(calc);
		}
		if (op.equals("-")) {
			double calc = Double.parseDouble(t1) - Double.parseDouble(t2);
			t1 = Double.toString(calc);
		}
		if (op.equals("*")) {
			double calc = Double.parseDouble(t1) * Double.parseDouble(t2);
			t1 = Double.toString(calc);
		}
		if (op.equals("/")) {
			double calc = Double.parseDouble(t1) / Double.parseDouble(t2);
			t1 = Double.toString(calc);
		}
		if (op.equals("^")) {
			double calc = Math.pow(Double.parseDouble(t1), Double.parseDouble(t2));
			t1 = Double.toString(calc);
		}
		if (op.equals("%")) {
			double calc = Double.parseDouble(t1) % Double.parseDouble(t2);
			t1 = Double.toString(calc);
		}

		return t1;

	}
	
	

	private boolean isOperator(String token) {
		return "+-*/^%".contains(token);
	}

	private boolean isNumeric(String str) {

		try {
			Double.parseDouble(str);
		} catch (Exception e) {
			return false;
		}

		return true;

	}

}