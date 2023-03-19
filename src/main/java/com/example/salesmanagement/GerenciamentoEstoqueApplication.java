package com.example.salesmanagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;


public class GerenciamentoEstoqueApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GerenciamentoEstoqueApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

//    public void mostrarTelaEntradaEstoque() throws IOException {
//        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("tela_entrada_estoque.fxml")));
//        Scene scene = new Scene(root, 400, 300);
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.show();
//    }

    public static void main(String[] args) {
        launch();
    }
}