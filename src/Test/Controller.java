package Test;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public TextField txtGetal1;
    public TextField txtGetal2;
    public Label lblUitvoer;

    public void Clicked_Execute(MouseEvent mouseEvent) {
        double Getal1 = Double.parseDouble(txtGetal1.getText());
        double Getal2 = Double.parseDouble(txtGetal2.getText());

        double Uitvoer = Getal1 * Getal2;

        lblUitvoer.setText(String.valueOf(Uitvoer));
    }

    public void Clicked_Divide(MouseEvent mouseEvent) {
        final double dTeller = Double.parseDouble(txtGetal1.getText());
        final double dNoemer = Double.parseDouble(txtGetal2.getText());

        double dResult = dTeller / dNoemer;
        lblUitvoer.setText("" + dResult);
    }
}
