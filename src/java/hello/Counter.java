package hello;

import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class Counter extends StackPane implements FxmlComponent {

    private final IntegerProperty count = new SimpleIntegerProperty(0);

    @FXML
    private Button btn;

    public Counter() {
        loadTemplate();
    }

    @FXML
    public void increment() {
        count.set(count.get() + 1);
    }

    @FXML
    private void initialize() {
        btn.textProperty().bind(Bindings.concat("Counter: ", count));
    }
}
