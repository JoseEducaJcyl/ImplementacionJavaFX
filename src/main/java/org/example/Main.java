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
        // Se crea una etiqueta (Label) con el texto de instrucción "ingrese su nombre"
        Label label = new Label("ingrese su nombre");
        // Se crea un campo de texto (TextField) donde el usuario podrá escribir
        TextField textField = new TextField();
        // Se crea un botón con el texto "Enviar"
        Button button = new Button("Enviar");
        // Se crea una segunda etiqueta que inicialmente muestra "Texto de ejemplo"
        Label label2 = new Label("Texto de ejemplo");

        // Se asigna una acción al botón cuando sea presionado (evento click)
        button.setOnAction(e -> {
            // Se cambia el texto de label2 al texto ingresado en el TextField
            label2.setText(textField.getText());
            // Se limpia el contenido del TextField después de enviarlo
            textField.clear();
        });

        // Se crea un panel vertical VBox que organiza los elementos en columna
        VBox vBox = new VBox(label, textField, button, label2);
        // Se crea la escena con el VBox como raíz, de 300x300 píxeles
        Scene scene = new Scene(vBox, 300, 300);
        // Se asigna el título "Implementacion Etiquetas" a la ventana
        stage.setTitle("Implementacion Etiquetas");
        // Se asigna la escena a la ventana
        stage.setScene(scene);
        // Se hace visible la ventana
        stage.show();
    }

    public static void main(String[] args) {
        // Lanza la aplicación JavaFX
        launch(args);
    }
}