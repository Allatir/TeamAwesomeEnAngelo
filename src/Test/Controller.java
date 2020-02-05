package Test;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public TextField txtGetal1;
    public TextField txtGetal2;
    public Label lblUitvoer;

    public void Clicked_Execute(MouseEvent mouseEvent) {
        lblUitvoer.setText(String.valueOf(Multiply((Double.parseDouble(txtGetal1.getText())), (Double.parseDouble(txtGetal2.getText())))));
    }

    public double Multiply(double getal1, double getal2){
        return getal1 * getal2;
    }

    public void Clicked_Divide(MouseEvent mouseEvent) {
        final double dTeller = Double.parseDouble(txtGetal1.getText());
        final double dNoemer = Double.parseDouble(txtGetal2.getText());

        double dResult = dTeller / dNoemer;
        lblUitvoer.setText("" + dResult);
    }
}
