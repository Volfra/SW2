module co.edu.poli.wsoto {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens co.edu.poli.wsoto.vista to javafx.fxml;
    opens co.edu.poli.wsoto.controlador to javafx.fxml;
    exports co.edu.poli.wsoto.vista;
    exports co.edu.poli.wsoto.controlador;
}
