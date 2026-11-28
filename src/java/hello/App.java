package hello;

import hello.examples.Counter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("App.fxml"));
        Button b1 = (Button) root.lookup("#b1");

        b1.setOnAction(e -> root.setCenter(new Counter()));

        Scene scene = new Scene(root, 720, 480);
        stage.setTitle("Hello JavaFX");
        stage.setScene(scene);
        stage.show();
        stage.centerOnScreen();
    }

    // fails due to missing module path configuration
    public static void main(String... args) {
        launch(args);
    }
}
