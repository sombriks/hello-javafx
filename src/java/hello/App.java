package hello;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("App.fxml"));
        Scene scene = new Scene(root, 720, 480);
        stage.setTitle("Hello JavaFX");
        stage.setScene(scene);
        stage.show();
        stage.centerOnScreen();
    }

    public static void main(String... args) {
        launch(args);
    }
}
