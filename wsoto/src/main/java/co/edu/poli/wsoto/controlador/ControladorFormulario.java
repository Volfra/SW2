package co.edu.poli.wsoto.controlador;

import co.edu.poli.wsoto.modelo.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControladorFormulario {

    @FXML
    private Button btt1;

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    Cliente c;
    
    @FXML
    void click(ActionEvent event) {
    	
    	c = new Cliente (txt1.getText(), txt2.getText());
    	
    	Alert a = new Alert(AlertType.INFORMATION);
    	
    	a.setContentText(c.toString());
    	
    	a.show();

    }

}
