package hello;

import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Counter {

    private final IntegerProperty count = new SimpleIntegerProperty(0);

    @FXML Button btn;

    @FXML
    public void increment() {
        count.set(count.get() + 1);
    }

    @FXML
    private void initialize() {
        btn.textProperty().bind(Bindings.concat("Counter: ", count));
    }
}
