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

    public void clicked_Aftrekken(MouseEvent mouseEvent) {
        int iGetal = Integer.parseInt(txtGetal1.getText());
        int iGetal2 = Integer.parseInt(txtGetal2.getText());

        int iResultaat = iGetal - iGetal2;
        lblUitvoer.setText("" + iResultaat);
    }
}
