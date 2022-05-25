package com.example.lab1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("laptopview.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("welcome to laptop store!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();

}}
