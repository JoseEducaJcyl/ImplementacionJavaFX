package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("ingrese su nombre");
        TextField textField = new TextField();
        Button button = new Button("Enviar");
        Label label2 = new Label("Texto de ejemplo");

        button.setOnAction(e -> {
            label2.setText(textField.getText());
            textField.clear();
        });

        VBox vBox = new VBox(label, textField, button, label2);
        Scene scene = new Scene(vBox, 300, 300);
        stage.setTitle("Implementacion Etiquetas");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
