package com.example.salesmanagement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class GerenciamentoEstoqueController {

    @FXML
    private TextField txtNomeProduto;

    @FXML
    private TextField txtQuantidade;

    @FXML
    private TextField txtData;

    @FXML
    public void salvarEntrada() {
        Produto produto = new Produto(txtNomeProduto.getText());
        produto.setNome(txtNomeProduto.getText());

        EntradaEstoque entrada = new EntradaEstoque();
        entrada.setProduto(produto);
        entrada.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
        entrada.setData(LocalDate.parse(txtData.getText()));

        entrada.registrarEntrada();
    }

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }




//    public void abrirTelaEntradaEstoque() throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("entradaEstoque.fxml"));
//        Scene scene = new Scene(root, 400, 300);
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.show();
//    }

//    @FXML
//    public void abrirTelaEntradaEstoque() throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("entradaEstoque.fxml"));
//        Parent root = fxmlLoader.load();
//        Scene scene = new Scene(root, 400, 300);
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.show();
//    }

//    @FXML
//    public void abrirTelaEntradaEstoque() throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(GerenciamentoEstoqueApplication.class.getResource("entradaEstoque.fxml"));
//        Parent root = fxmlLoader.load();
//        Scene scene = new Scene(root, 400, 300);
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.show();
//    }

    @FXML
    public void abrirTelaEntradaEstoque() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GerenciamentoEstoqueApplication.class.getResource("/com/example/salesmanagement/entradaEstoque.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 400, 300);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }




    @FXML
    private DatePicker datePickerData;


}