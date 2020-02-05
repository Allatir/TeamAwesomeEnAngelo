package Test;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public TextField txtGetal1;
    public TextField txtGetal2;
    public Label lblUitvoer;

    public void Clicked_Execute(MouseEvent mouseEvent) {
    }

    public void KlikPlus(MouseEvent mouseEvent) {
        //test
        double dGetal1 = Double.parseDouble(txtGetal1.getText());
        double dGetal2 = Double.parseDouble(txtGetal2.getText());
        double dSom = dGetal1 + dGetal2;
        lblUitvoer.setText(String.valueOf(dSom));
        System.out.println("test");
    }
}
