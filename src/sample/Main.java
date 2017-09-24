package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        TextField textField = new TextField("http://stackoverflow.com/questions/39898704");

        Button liepitkaBileButton = new Button("Bílé");
        Button liepitkaBarevneButton = new Button("Barevné");
        Button liepitkaPrirodniButton = new Button("Přírodní barvy");
        Button liepitkaBezPolevyButton = new Button("Bez polevy");


//        EventHandler<ActionEvent> handler = e -> open("Bíle.doc");
//        liepitkaBileButton.setOnAction(handler);

        liepitkaBileButton.setOnAction(e -> open("Bile.doc"));

        VBox root = new VBox(5,
                new HBox(new Label("Lepítka")),
                new HBox(liepitkaBileButton)
        );

        root.setPadding(new Insets(20));

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void open(String resource) {
        getHostServices().showDocument(resource);
    }

}
