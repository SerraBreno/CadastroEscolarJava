package br.com.escola.cadastro.cadastroescolarjava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class turmaApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(turmaApp.class.getResource("turmaCad.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Cadastro Escolar");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}