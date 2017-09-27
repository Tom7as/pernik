package app;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class UIElements {
    Label debugLabel = new Label();

    public Button createButton(String label, String fileUrl, String fileName){
        Button button = new Button(label);
        button.setOnAction(e -> openFile(fileUrl + fileName));
        button.setPrefSize(150,60);
        button.setStyle("-fx-font: 18 calibri; -fx-text-alignment: center;");
        button.setWrapText(true);
        return button;
    }

    public void openFile(String resource) {
        Application application = new Application() {
            @Override
            public void start(Stage primaryStage) throws Exception { }
        };
        application.getHostServices().showDocument(resource);
        setDebugLabel("Opening file: " + resource);
    }

    public Button createLabelButton(String label, String fileUrl) {
        Button button = new Button(label);
        button.setOnAction(e -> openDir(fileUrl));
        button.setMaxSize(120, 25);
        button.setStyle("-fx-font: 16 calibri; -fx-text-alignment: center;");
        button.setWrapText(false);
        return button;
    }

    public void openDir(String path) {
        try {
            Desktop desktop = Desktop.getDesktop();
            File dirToOpen = new File(path);
            desktop.open(dirToOpen);
        } catch (IllegalArgumentException iae) {
            setDebugLabel("Folder not found");
        } catch (IOException e) {
            setDebugLabel(e.getLocalizedMessage());
        }
        setDebugLabel("Opening file: " + path);
    }

    public Label createLabel(String lepitka) {
        Label label = new Label(lepitka);
        label.setStyle("-fx-font: 20 maiandragd; -fx-text-alignment: center; -fx-font-weight: bold;");
        label.setPrefWidth(200);
        return label;
    }

    public Label createEmptyLabel() {
        Label label = new Label();
        label.setPrefWidth(640);
        return label;
    }

    private void setDebugLabel(String text){
        debugLabel.setText(text);
    }

}
