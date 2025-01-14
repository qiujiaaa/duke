package duke;

import java.io.IOException;

import duke.ui.MainWindow;

import javafx.application.Application;
import javafx.application.Platform;

import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;

/**
 * A GUI for Duke using FXML.
 */
public class Main extends Application {

    private Duke duke = new Duke("data/duke.txt");

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
            AnchorPane ap = fxmlLoader.load();
            Scene scene = new Scene(ap);
            stage.setScene(scene);
            fxmlLoader.<MainWindow>getController().setDuke(duke);
            fxmlLoader.<MainWindow>getController().showWelcomeMessage();
            stage.setTitle("Duke");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void exit() {
        Platform.exit();
        System.exit(0);
    }
}