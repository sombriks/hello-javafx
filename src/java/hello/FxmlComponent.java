package hello;

import javafx.fxml.FXMLLoader;

import java.io.IOException;

public interface FxmlComponent {

    default void loadTemplate() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(getClass().getSimpleName() + ".fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
