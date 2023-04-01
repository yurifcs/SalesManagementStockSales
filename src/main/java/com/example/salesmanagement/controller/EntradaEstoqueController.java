package com.example.salesmanagement.controller;

import com.example.salesmanagement.EntradaEstoque;
import com.example.salesmanagement.GerenciamentoEstoqueApplication;
import com.example.salesmanagement.Produto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class EntradaEstoqueController {

    @FXML
    private TextField txtNomeProduto;

    @FXML
    private TextField txtQuantidade;

    @FXML
    private TextField txtData;

    @FXML
    public void salvarEntrada() {
        Produto produto = new Produto();
        produto.setNome(txtNomeProduto.getText());

        EntradaEstoque entrada = new EntradaEstoque();
        entrada.setProduto(produto);
        entrada.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
        entrada.setData(LocalDate.parse(txtData.getText()));

        entrada.registrarEntrada();
    }


}
