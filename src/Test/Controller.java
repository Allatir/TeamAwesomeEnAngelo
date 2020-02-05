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
<<<<<<< HEAD

        double Uitvoer = Getal1 * Getal2;

        lblUitvoer.setText(String.valueOf(Uitvoer));
    }

    public void KlikPlus(MouseEvent mouseEvent) {
        //test
        double dGetal1 = Double.parseDouble(txtGetal1.getText());
        double dGetal2 = Double.parseDouble(txtGetal2.getText());
        double dSom = dGetal1 + dGetal2;
        lblUitvoer.setText(String.valueOf(dSom));
        System.out.println("test");
=======

        double Uitvoer = Getal1 * Getal2;

        lblUitvoer.setText(String.valueOf(Uitvoer));
>>>>>>> Ilyas
    }
}
