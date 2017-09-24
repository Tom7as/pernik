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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;

public class Main extends Application {
    TextArea textArea = new TextArea();
    @Override
    public void start(Stage primaryStage) throws Exception{
        TextField textField = new TextField("http://stackoverflow.com/questions/39898704");

        Button lepitkaBileButton = new Button("Bílé");
        Button lepitkaBarevneButton = new Button("Barevné");
        Button lepitkaPrirodniButton = new Button("Přírodní barvy");
        Button lepitkaBezPolevyButton = new Button("Bez polevy");


        lepitkaBileButton.setOnAction(e -> open(".\\lepitka\\Bile.doc"));
        lepitkaBarevneButton.setOnAction(d -> open(".\\lepitka\\Barevne.doc"));
        lepitkaPrirodniButton.setOnAction(d -> open(".\\lepitka\\Barevne_prirodni.doc"));
        lepitkaBezPolevyButton.setOnAction(d -> open(".\\lepitka\\bez_polevy.doc"));

        VBox root = new VBox(5,
                new HBox(new Label("Lepítka")),
                new HBox(lepitkaBileButton, lepitkaBarevneButton, lepitkaPrirodniButton, lepitkaBezPolevyButton)
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
