package Test;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public TextField txtGetal1;
    public TextField txtGetal2;
    public Label lblUitvoer;

    public void Clicked_Execute(MouseEvent mouseEvent) {
<<<<<<< HEAD
        double Getal1 = Double.parseDouble(txtGetal1.getText());
        double Getal2 = Double.parseDouble(txtGetal2.getText());

        double Uitvoer = Getal1 * Getal2;

        lblUitvoer.setText(String.valueOf(Uitvoer));
    }

<<<<<<< Updated upstream
    public void Clicked_Divide(MouseEvent mouseEvent) {
        final double dTeller = Double.parseDouble(txtGetal1.getText());
        final double dNoemer = Double.parseDouble(txtGetal2.getText());
=======
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
<<<<<<< HEAD

=======
=======
>>>>>>> Siebe
>>>>>>> Stashed changes
    public void KlikPlus(MouseEvent mouseEvent) {
        //test
        double dGetal1 = Double.parseDouble(txtGetal1.getText());
        double dGetal2 = Double.parseDouble(txtGetal2.getText());
        double dSom = dGetal1 + dGetal2;
        lblUitvoer.setText(String.valueOf(dSom));
        System.out.println("test");
=======
>>>>>>> Stashed changes

        double dResult = dTeller / dNoemer;
        lblUitvoer.setText("" + dResult);
=======
        //test
>>>>>>> Angelo_Test
    }
<<<<<<< HEAD
>>>>>>> Angelo
=======
>>>>>>> Siebe
}
