package com.example.salesmanagement.controller;

import com.example.salesmanagement.EntradaEstoque;
import com.example.salesmanagement.Produto;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

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
